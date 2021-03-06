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

package org.ow2.mind.annotation;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;
import static org.ow2.mind.annotation.AnnotationHelper.addAnnotation;
import static org.ow2.mind.annotation.AnnotationHelper.getAnnotation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.error.NodeErrorLocator;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.annotation.ast.AnnotationContainer;
import org.ow2.mind.annotation.ast.AnnotationNode;
import org.ow2.mind.error.ErrorManager;

public class BasicAnnotationChecker
    implements
      AnnotationChecker,
      BindingController {

  // ---------------------------------------------------------------------------
  // Client interfaces
  // ---------------------------------------------------------------------------

  /** The {@link ErrorManager} client interface used to log errors. */
  public ErrorManager      errorManagerItf;

  public AnnotationFactory annotationFactoryItf;

  // ---------------------------------------------------------------------------
  // Implementation of the AnnotationChecker interface
  // ---------------------------------------------------------------------------

  public void checkAnnotations(final Node container,
      final Map<Object, Object> context) throws ADLException {
    checkAnnotations(container, container, new HashSet<Node>(), context);
  }

  protected void checkAnnotations(final Node container, final Node def,
      final Set<Node> visitedNodes, final Map<Object, Object> context)
      throws ADLException {
    if (visitedNodes.add(container)) {
      if (container instanceof AnnotationContainer) {
        checkAnnotationContainer((AnnotationContainer) container, def, context);
      }

      for (final String nodeType : container.astGetNodeTypes()) {
        for (final Node subNode : container.astGetNodes(nodeType)) {
          if (subNode != null) {
            if (def instanceof Definition) {
              checkAnnotations(subNode, def, visitedNodes, context);
            } else {
              checkAnnotations(subNode, null, visitedNodes, context);
            }
          }
        }
      }
    }
  }

  protected void checkAnnotationContainer(final AnnotationContainer container,
      final Node def, final Map<Object, Object> context) throws ADLException {
    for (final AnnotationNode annotationNode : container.getAnnotations()) {
      // remove annotation node from AST.
      container.removeAnnotation(annotationNode);
      if (def != null) {
        annotationNode.astSetDecoration(AnnotationLocator.ANNOTATION_CONTEXT,
            def);
      }
      Annotation annotation;
      try {
        annotation = annotationFactoryItf
            .newAnnotation(annotationNode, context);
      } catch (final AnnotationInitializationException e) {
        errorManagerItf.logError(AnnotationErrors.INVALID_ANNOTATION,
            new NodeErrorLocator(e.getLocation()), e, e.getMessage());
        continue;
      }
      boolean isValidTarget = false;
      for (final AnnotationTarget target : annotation.getAnnotationTargets()) {
        if (target.isValidTarget(container)) {
          isValidTarget = true;
          break;
        }
      }

      if (!isValidTarget) {
        errorManagerItf.logError(AnnotationErrors.INVALID_ANNOTATION_TARGET,
            annotationNode);
        continue;
      }
      if (getAnnotation(container, annotation.getClass()) != null) {
        errorManagerItf.logError(AnnotationErrors.DUPLICATED_ANNOTATION,
            annotation);
      } else {
        addAnnotation(container, annotation);
      }
    }
  }

  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------

  public String[] listFc() {
    return listFcHelper(ErrorManager.ITF_NAME, AnnotationFactory.ITF_NAME);
  }

  public Object lookupFc(final String s) throws NoSuchInterfaceException {
    checkItfName(s);

    if (ErrorManager.ITF_NAME.equals(s)) {
      return errorManagerItf;
    } else if (AnnotationFactory.ITF_NAME.equals(s)) {
      return annotationFactoryItf;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "'");
    }
  }

  public void bindFc(final String s, final Object o)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(s);

    if (ErrorManager.ITF_NAME.equals(s)) {
      errorManagerItf = (ErrorManager) o;
    } else if (AnnotationFactory.ITF_NAME.equals(s)) {
      annotationFactoryItf = (AnnotationFactory) o;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "' for binding the interface");
    }
  }

  public void unbindFc(final String s) throws IllegalBindingException,
      NoSuchInterfaceException {
    checkItfName(s);

    if (ErrorManager.ITF_NAME.equals(s)) {
      errorManagerItf = null;
    } else if (AnnotationFactory.ITF_NAME.equals(s)) {
      annotationFactoryItf = null;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "'");
    }
  }

}
