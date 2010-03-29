/**
 * Copyright (C) 2009 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Ali Erdem Ozcan
 * Contributors: 
 */

package org.ow2.mind.adl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;
import static org.ow2.mind.PathHelper.fullyQualifiedNameToPath;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplate;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.CompilerError;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.SourceFileWriter;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.idl.IDLLoader;
import org.ow2.mind.idl.ast.InterfaceDefinition;
import org.ow2.mind.io.IOErrors;

/**
 * {@link DefinitionSourceGenerator} component that generated {@value #FILE_EXT}
 * files using the {@value #INC_HEADER_TEMPLATE_NAME} template.
 */
public class DefinitionIncSourceGenerator extends AbstractSourceGenerator
    implements
      DefinitionSourceGenerator {

  protected static final String INC_HEADER_TEMPLATE_NAME = "st.definitions.implementations.Component";
  protected final static String FILE_EXT                 = ".inc";

  // ---------------------------------------------------------------------------
  // Client Interfaces
  // ---------------------------------------------------------------------------

  /** Client interface used to load IDL files if needed. */
  public IDLLoader              idlLoaderItf;

  // ---------------------------------------------------------------------------
  // Constructors
  // ---------------------------------------------------------------------------

  /**
   * Public constructor.
   */
  public DefinitionIncSourceGenerator() {
    super(INC_HEADER_TEMPLATE_NAME);
  }

  /**
   * Protected constructor can be used by sub-class.
   */
  protected DefinitionIncSourceGenerator(final String templateGroupName) {
    super(templateGroupName);
  }

  // ---------------------------------------------------------------------------
  // public static methods
  // ---------------------------------------------------------------------------

  /**
   * A static method that returns the name of the file that is generated by this
   * component for the given {@link Definition};
   * 
   * @param definition a {@link Definition} node.
   * @return the name of the file that is generated by this component for the
   *         given {@link Definition};
   */
  public static String getIncFileName(final Definition definition) {
    return fullyQualifiedNameToPath(definition.getName(), FILE_EXT);
  }

  // ---------------------------------------------------------------------------
  // Implementation of the DefinitionSourceGenerator interface
  // ---------------------------------------------------------------------------

  public void visit(final Definition definition,
      final Map<Object, Object> context) throws ADLException {

    final File outputFile = outputFileLocatorItf.getCSourceOutputFile(
        getOutputFileName(definition), context);

    if (regenerate(outputFile, definition, context)) {

      final StringTemplate st = getInstanceOf("ComponentDefinition");

      st.setAttribute("definition", definition);

      if (definition instanceof InterfaceContainer) {
        final Interface[] itfs = ((InterfaceContainer) definition)
            .getInterfaces();
        final Map<String, InterfaceDefinition> itfDefs = new LinkedHashMap<String, InterfaceDefinition>(
            itfs.length);
        for (final Interface itf : itfs) {
          if (itf instanceof TypeInterface) {
            final TypeInterface tItf = (TypeInterface) itf;
            itfDefs
                .put(tItf.getSignature(),
                    InterfaceDefinitionDecorationHelper
                        .getResolvedInterfaceDefinition(tItf, idlLoaderItf,
                            context));
          }
        }
        st.setAttribute("interfaceDefinitions", itfDefs);
      } else {
        st.setAttribute("interfaceDefinitions", Collections.emptyMap());
      }

      try {
        SourceFileWriter.writeToFile(outputFile, st.toString());
      } catch (final IOException e) {
        throw new CompilerError(IOErrors.WRITE_ERROR, e, outputFile
            .getAbsolutePath());
      }
    }
  }

  protected String getOutputFileName(final Definition definition) {
    return getIncFileName(definition);
  }

  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------

  @Override
  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(IDLLoader.ITF_NAME)) {
      idlLoaderItf = (IDLLoader) value;
    } else {
      super.bindFc(itfName, value);
    }

  }

  @Override
  public String[] listFc() {
    return listFcHelper(super.listFc(), IDLLoader.ITF_NAME);
  }

  @Override
  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (itfName.equals(IDLLoader.ITF_NAME)) {
      return idlLoaderItf;
    } else {
      return super.lookupFc(itfName);
    }
  }

  @Override
  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(IDLLoader.ITF_NAME)) {
      idlLoaderItf = null;
    } else {
      super.unbindFc(itfName);
    }
  }
}
