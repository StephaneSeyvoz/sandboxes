/**
 * Copyright (C) 2010 STMicroelectronics
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
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.adl.attribute;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;
import static org.ow2.mind.adl.parameter.ast.ParameterASTHelper.getInferredParameterType;
import static org.ow2.mind.adl.parameter.ast.ParameterASTHelper.setInferredParameterType;
import static org.ow2.mind.adl.parameter.ast.ParameterASTHelper.setUsedFormalParameter;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.AbstractLoader;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.NodeFactory;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.adl.ADLErrors;
import org.ow2.mind.adl.ast.Attribute;
import org.ow2.mind.adl.ast.AttributeContainer;
import org.ow2.mind.adl.parameter.ast.FormalParameter;
import org.ow2.mind.adl.parameter.ast.FormalParameterContainer;
import org.ow2.mind.adl.parameter.ast.ParameterASTHelper.ParameterType;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.value.ast.NullLiteral;
import org.ow2.mind.value.ast.NumberLiteral;
import org.ow2.mind.value.ast.Reference;
import org.ow2.mind.value.ast.StringLiteral;
import org.ow2.mind.value.ast.Value;
import org.ow2.mind.value.ast.ValueASTHelper;

public class AttributeCheckerLoader extends AbstractLoader {

  // ---------------------------------------------------------------------------
  // Client interfaces
  // ---------------------------------------------------------------------------

  /** The {@link ErrorManager} client interface used to log errors. */
  public ErrorManager errorManagerItf;

  /** The {@link NodeFactory} client interface. */
  public NodeFactory  nodeFactoryItf;

  // ---------------------------------------------------------------------------
  // Implementation of the Loader interface
  // ---------------------------------------------------------------------------

  public Definition load(final String name, final Map<Object, Object> context)
      throws ADLException {
    final Definition d = clientLoader.load(name, context);
    if (d instanceof AttributeContainer)
      checkAttributes((AttributeContainer) d, context);
    return d;
  }

  protected void checkAttributes(final AttributeContainer container,
      final Map<Object, Object> context) throws ADLException {

    Map<String, FormalParameter> formalParameters = null;

    for (final Attribute attr : container.getAttributes()) {
      ParameterType type = null;

      final String typeName = attr.getType();
      if (typeName == null) {
        errorManagerItf
            .logError(ADLErrors.INVALID_ATTRIBUTE_MISSING_TYPE, attr);
      } else {
        type = ParameterType.fromCType(typeName);
      }

      final Value value = attr.getValue();

      if (value != null) {
        if (type != null && (value instanceof NumberLiteral)) {
          if (!type.isCompatible(value))
            errorManagerItf.logError(
                ADLErrors.INVALID_ATTRIBUTE_VALUE_INCOMPATIBLE_TYPE, value);

          if (typeName != null && typeName.startsWith("u")
              && ((NumberLiteral) value).getValue().startsWith("-")) {
            errorManagerItf.logWarning(
                ADLErrors.WARNING_ATTRIBUTE_UNSIGNED_ASSIGNED_TO_NEGATIVE,
                value);
          }
        } else if (type != null
            && (value instanceof StringLiteral || value instanceof NullLiteral)) {
          if (!type.isCompatible(value))
            errorManagerItf.logError(
                ADLErrors.INVALID_ATTRIBUTE_VALUE_INCOMPATIBLE_TYPE, value);
        } else {
          assert value instanceof Reference;
          final String refParamName = ((Reference) value).getRef();

          if (formalParameters == null) {
            // init formalParameters lazily
            formalParameters = new HashMap<String, FormalParameter>();
            if (container instanceof FormalParameterContainer) {
              for (final FormalParameter parameter : ((FormalParameterContainer) container)
                  .getFormalParameters()) {
                formalParameters.put(parameter.getName(), parameter);
              }
            }
          }

          final FormalParameter refParam = formalParameters.get(refParamName);
          if (refParam == null) {
            errorManagerItf.logError(ADLErrors.UNDEFINED_PARAMETER, value,
                refParamName);
          } else {
            setUsedFormalParameter(refParam);
            final ParameterType referencedType = getInferredParameterType(refParam);
            if (referencedType == null) {
              setInferredParameterType(refParam, type);
            } else if (type != null && !type.isCompatible(referencedType)) {
              errorManagerItf.logError(ADLErrors.INCOMPATIBLE_ARGUMENT_TYPE,
                  value, refParamName);
            }
          }
        }
      } else {
        // value is null, set a default value
        if (type == ParameterType.STRING) {
          attr.setValue(ValueASTHelper.newNullLiteral(nodeFactoryItf));
        } else {
          attr.setValue(ValueASTHelper.newNumberLiteral(nodeFactoryItf, 0));
        }
      }
    }
  }

  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------

  @Override
  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(ErrorManager.ITF_NAME)) {
      errorManagerItf = (ErrorManager) value;
    } else if (itfName.equals(NodeFactory.ITF_NAME)) {
      this.nodeFactoryItf = (NodeFactory) value;
    } else {
      super.bindFc(itfName, value);
    }

  }

  @Override
  public String[] listFc() {
    return listFcHelper(super.listFc(), ErrorManager.ITF_NAME,
        NodeFactory.ITF_NAME);
  }

  @Override
  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (itfName.equals(ErrorManager.ITF_NAME)) {
      return errorManagerItf;
    } else if (itfName.equals(NodeFactory.ITF_NAME)) {
      return this.nodeFactoryItf;
    } else {
      return super.lookupFc(itfName);
    }
  }

  @Override
  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(ErrorManager.ITF_NAME)) {
      errorManagerItf = null;
    } else if (itfName.equals(NodeFactory.ITF_NAME)) {
      this.nodeFactoryItf = null;
    } else {
      super.unbindFc(itfName);
    }
  }

}
