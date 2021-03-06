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

package org.ow2.mind.adl.anonymous;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.fractal.adl.ContextLocal;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.NodeFactory;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.adl.anonymous.ast.AnonymousDefinitionContainer;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Component;
import org.ow2.mind.adl.ast.DefinitionReference;

/**
 * Basic implementation of the {@link AnonymousDefinitionExtractor} interface.
 * This component extract the anonymous definition of the given sub-component,
 * give it a new unique name and replace it by a {@link DefinitionReference}.
 */
public class AnonymousDefinitionExtractorImpl
    implements
      AnonymousDefinitionExtractor,
      BindingController {

  protected ContextLocal<Map<String, Integer>> contextualCounters = new ContextLocal<Map<String, Integer>>();

  // ---------------------------------------------------------------------------
  // Client interfaces
  // ---------------------------------------------------------------------------

  /** The node factory interface */
  public NodeFactory                           nodeFactoryItf;

  // ---------------------------------------------------------------------------
  // Implementation of the AnonymousDefinitionResolver interface
  // ---------------------------------------------------------------------------

  public Definition extractAnonymousDefinition(final Component component,
      final Definition encapsulatingDefinition,
      final Map<Object, Object> context) {

    // get the anonymous definition.
    final Definition anonymousDefinition = ((AnonymousDefinitionContainer) component)
        .getAnonymousDefinition();

    // remove it and replace it by a definition reference.
    ((AnonymousDefinitionContainer) component).setAnonymousDefinition(null);

    // get a name for this definition
    Map<String, Integer> counters = contextualCounters.get(context);
    if (counters == null) {
      counters = new HashMap<String, Integer>();
      contextualCounters.set(context, counters);
    }
    final String topLevelName = encapsulatingDefinition.getName();
    Integer counter = counters.get(topLevelName);
    if (counter == null) {
      counter = 0;
    }
    counters.put(topLevelName, counter + 1);
    final String defName = topLevelName + "$" + counter;

    anonymousDefinition.setName(defName);

    // then, replace it in subComp by a DefinitionReference
    final DefinitionReference defRef = ASTHelper.newDefinitionReference(
        nodeFactoryItf, defName);
    component.setDefinitionReference(defRef);

    return anonymousDefinition;
  }

  // ---------------------------------------------------------------------------
  // Overridden BindingController methods
  // ---------------------------------------------------------------------------

  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(NodeFactory.ITF_NAME)) {
      nodeFactoryItf = (NodeFactory) value;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }

  }

  public String[] listFc() {
    return listFcHelper(NodeFactory.ITF_NAME);
  }

  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (itfName.equals(NodeFactory.ITF_NAME)) {
      return nodeFactoryItf;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }
  }

  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(NodeFactory.ITF_NAME)) {
      nodeFactoryItf = null;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }
  }
}
