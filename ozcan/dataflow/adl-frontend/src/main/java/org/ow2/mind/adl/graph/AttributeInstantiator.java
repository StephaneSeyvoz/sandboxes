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
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.adl.graph;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.CompilerError;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.error.GenericErrors;
import org.ow2.mind.adl.ADLErrors;
import org.ow2.mind.adl.ast.Attribute;
import org.ow2.mind.adl.ast.AttributeContainer;
import org.ow2.mind.adl.ast.Component;
import org.ow2.mind.adl.ast.ComponentContainer;
import org.ow2.mind.adl.ast.DefinitionReference;
import org.ow2.mind.adl.parameter.ast.Argument;
import org.ow2.mind.adl.parameter.ast.ArgumentContainer;
import org.ow2.mind.adl.parameter.ast.FormalParameterContainer;
import org.ow2.mind.value.ast.NullLiteral;
import org.ow2.mind.value.ast.NumberLiteral;
import org.ow2.mind.value.ast.Reference;
import org.ow2.mind.value.ast.StringLiteral;
import org.ow2.mind.value.ast.Value;

public class AttributeInstantiator extends AbstractInstantiator {

  private static final Map<String, Value> EMPTY_NAME_VALUE_MAP = new HashMap<String, Value>();

  // ---------------------------------------------------------------------------
  // Implementation of the Instantiator interface
  // ---------------------------------------------------------------------------

  public ComponentGraph instantiate(final Definition definition,
      final Map<Object, Object> context) throws ADLException {
    if (definition instanceof FormalParameterContainer) {
      if (((FormalParameterContainer) definition).getFormalParameters().length > 0) {
        errorManagerItf.logError(ADLErrors.INSTANTIATE_ARGUMENT_DEFINIITON,
            definition, definition.getName());
      }
    }

    final ComponentGraph graph = clientInstantiatorItf.instantiate(definition,
        context);

    initAttributes(graph, EMPTY_NAME_VALUE_MAP, context);
    return graph;
  }

  protected void initAttributes(final ComponentGraph graph,
      final Map<String, Value> argumentValues, final Map<Object, Object> context) {

    // Initialize map of attribute values.
    if (graph.getDefinition() instanceof AttributeContainer) {
      final Attribute[] attributes = ((AttributeContainer) graph
          .getDefinition()).getAttributes();
      if (attributes.length > 0) {
        final Map<String, String> attributeValues = new HashMap<String, String>();
        for (final Attribute attribute : attributes) {
          Value valueNode = attribute.getValue();
          String valueString;
          if (valueNode instanceof Reference) {
            final Value value = argumentValues.get(((Reference) valueNode)
                .getRef());
            assert value != null;
            valueNode = value;
          }

          if (valueNode instanceof StringLiteral) {
            valueString = ((StringLiteral) valueNode).getValue();
          } else if (valueNode instanceof NumberLiteral) {
            valueString = ((NumberLiteral) valueNode).getValue();
          } else if (valueNode instanceof NullLiteral) {
            valueString = "((void *) 0)";
          } else {
            throw new CompilerError(GenericErrors.INTERNAL_ERROR,
                "Unexpected value");
          }

          attributeValues.put(attribute.getName(), valueString);
        }

        graph.setDecoration("attribute-values", attributeValues);
      }
    }

    // Init attribute of sub components
    if (graph.getDefinition() instanceof ComponentContainer) {
      for (final Component subComponent : ((ComponentContainer) graph
          .getDefinition()).getComponents()) {
        final ComponentGraph subGraph = graph.getSubComponent(subComponent
            .getName());
        if (subComponent.getDefinitionReference() != null) {
          // sub component is defined by a definition reference, map its
          // argument values
          final DefinitionReference subCompDefRef = subComponent
              .getDefinitionReference();

          final Map<String, Value> refValues;
          final Argument[] refArguments = (subCompDefRef instanceof ArgumentContainer)
              ? ((ArgumentContainer) subCompDefRef).getArguments()
              : null;

          if (refArguments != null && refArguments.length > 0) {
            assert subGraph.getDefinition() instanceof FormalParameterContainer;
            assert ((FormalParameterContainer) subGraph.getDefinition())
                .getFormalParameters().length == refArguments.length;
            refValues = new HashMap<String, Value>();

            for (final Argument refArgument : refArguments) {
              assert refArgument.getName() != null;
              final Value refValue = refArgument.getValue();
              if (refValue instanceof Reference) {
                final Value value = argumentValues.get(((Reference) refValue)
                    .getRef());
                assert value != null;
                refValues.put(refArgument.getName(), value);
              } else {
                refValues.put(refArgument.getName(), refValue);
              }
            }
          } else {
            refValues = EMPTY_NAME_VALUE_MAP;
          }

          initAttributes(subGraph, refValues, context);
        }
      }
    }
  }
}
