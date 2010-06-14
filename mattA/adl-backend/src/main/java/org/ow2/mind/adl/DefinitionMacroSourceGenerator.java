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

import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.st.StringTemplateComponentLoader;

/**
 * {@link DefinitionSourceGenerator} component that generated {@value #FILE_EXT}
 * files using the {@value #MACRO_TEMPLATE_NAME} template.
 */
public class DefinitionMacroSourceGenerator
    extends
      DefinitionIncSourceGenerator {

  protected static final String MACRO_TEMPLATE_NAME = "st.definitions.implementations.Macro";
  protected static final String FILE_EXT            = ".macro";

  // ---------------------------------------------------------------------------
  // Constructors
  // ---------------------------------------------------------------------------

  /**
   * Public constructor.
   */
  public DefinitionMacroSourceGenerator() {
    super(MACRO_TEMPLATE_NAME);
  }

  /**
   * Protected constructor can be used by sub-class.
   */
  protected DefinitionMacroSourceGenerator(final String templateGroupName) {
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
  public static String getMacroFileName(final Definition definition) {
    return fullyQualifiedNameToPath(definition.getName(), FILE_EXT);
  }

  // ---------------------------------------------------------------------------
  // Overridden method
  // ---------------------------------------------------------------------------

  @Override
  protected String getOutputFileName(final Definition definition) {
    return getMacroFileName(definition);
  }

  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------
  @Override
  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(StringTemplateComponentLoader.ITF_NAME)) {
      templateGroupLoaderItf = (StringTemplateGroupLoader) value;
    } else {
      super.bindFc(itfName, value);
    }

  }

  @Override
  public String[] listFc() {
    return listFcHelper(super.listFc(), StringTemplateComponentLoader.ITF_NAME);
  }

  @Override
  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (itfName.equals(StringTemplateComponentLoader.ITF_NAME)) {
      return templateGroupLoaderItf;
    } else {
      return super.lookupFc(itfName);
    }
  }

  @Override
  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(StringTemplateComponentLoader.ITF_NAME)) {
      templateGroupLoaderItf = null;
    } else {
      super.unbindFc(itfName);
    }
  }

}