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

package org.ow2.mind.idl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;
import static org.ow2.mind.PathHelper.toAbsolute;
import static org.ow2.mind.idl.ast.IDLASTHelper.getIncludedPath;

import java.net.URL;
import java.util.Map;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.NodeFactory;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.PathHelper;
import org.ow2.mind.PathHelper.InvalidRelativPathException;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.idl.ast.IDL;
import org.ow2.mind.idl.ast.IDLASTHelper;
import org.ow2.mind.idl.ast.Include;

public class BasicIncludeResolver implements IncludeResolver, BindingController {

  // ---------------------------------------------------------------------------
  // Client interfaces
  // ---------------------------------------------------------------------------

  /** The {@link ErrorManager} client interface used to log errors. */
  public ErrorManager       errorManagerItf;

  /** The {@link NodeFactory} client interface used by this component. */
  public NodeFactory        nodeFactoryItf;

  /** The {@link RecursiveIDLLoader} interface used to load referenced IDLs. */
  public RecursiveIDLLoader recursiveIdlLoaderItf;

  /** The {@link IDLLoader} interface used to load referenced IDLs. */
  public IDLLoader          idlLoaderItf;

  /** The {@link IDLLocator} client interface used by this component. */
  public IDLLocator         idlLocatorItf;

  // ---------------------------------------------------------------------------
  // Implementation of the IncludeResolver interface
  // ---------------------------------------------------------------------------

  public IDL resolve(final Include include, final IDL encapsulatingIDL,
      final String encapsulatingName, final Map<Object, Object> context)
      throws ADLException {
    final String encapsulatingIDLName;
    if (encapsulatingName == null) {
      if (encapsulatingIDL == null) {
        throw new IllegalArgumentException(
            "encapsulatingIDL and encapsulatingName cannot be both null");
      }
      encapsulatingIDLName = encapsulatingIDL.getName();
    } else {
      encapsulatingIDLName = encapsulatingName;
    }

    String path = getIncludedPath(include);
    if (!PathHelper.isValid(path)) {
      errorManagerItf.logError(IDLErrors.INVALID_INCLUDE, include, path);
      return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
    }

    final String encapsulatingDir;
    if (encapsulatingIDLName.startsWith("/")) {
      encapsulatingDir = PathHelper.getParent(encapsulatingIDLName);
    } else {
      encapsulatingDir = PathHelper
          .fullyQualifiedNameToDirName(encapsulatingIDLName);
    }

    if (path.startsWith("/")) {
      // absolute path.
      final URL url = idlLocatorItf.findSourceHeader(path, context);
      if (url == null) {
        errorManagerItf.logError(IDLErrors.IDL_NOT_FOUND, include, path);
        return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
      }
    } else {
      // look-for header relatively to encapsulatingDir
      String relPath = null;
      try {
        relPath = toAbsolute(encapsulatingDir, path);
      } catch (final InvalidRelativPathException e) {
        errorManagerItf.logError(IDLErrors.INVALID_INCLUDE, include, path);
        return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
      }
      URL url = idlLocatorItf.findSourceHeader(relPath, context);
      if (url != null) {
        // IDL found with relPath
        path = relPath;
      } else if (path.startsWith("./") || path.startsWith("../")) {
        // the path starts with "./" or "../" which force a resolution
        // relatively to encapsulatingDir. the file has not been found.
        errorManagerItf.logError(IDLErrors.IDL_NOT_FOUND, include, path);
        return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
      } else {
        // look-for header relatively to source-path
        path = "/" + path;
        url = idlLocatorItf.findSourceHeader(path, context);
        if (url == null) {
          errorManagerItf.logError(IDLErrors.IDL_NOT_FOUND, include, path);
          return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
        }
      }
    }

    IDLASTHelper.setIncludePathPreserveDelimiter(include, path);

    try {
      if (encapsulatingIDL != null) {
        return recursiveIdlLoaderItf.load(encapsulatingIDL, path, context);
      } else {
        return idlLoaderItf.load(path, context);
      }
    } catch (final ADLException e) {
      // Log an error only if the exception is IDL_NOT_FOUND
      if (e.getError().getTemplate() == IDLErrors.IDL_NOT_FOUND) {
        errorManagerItf.logError(IDLErrors.IDL_NOT_FOUND, include, path);
      }
      return IDLASTHelper.newUnresolvedIDLNode(nodeFactoryItf, path);
    }
  }

  // ---------------------------------------------------------------------------
  // Overridden BindingController methods
  // ---------------------------------------------------------------------------

  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (ErrorManager.ITF_NAME.equals(itfName)) {
      errorManagerItf = (ErrorManager) value;
    } else if (NodeFactory.ITF_NAME.equals(itfName)) {
      nodeFactoryItf = (NodeFactory) value;
    } else if (itfName.equals(RecursiveIDLLoader.ITF_NAME)) {
      recursiveIdlLoaderItf = (RecursiveIDLLoader) value;
    } else if (itfName.equals(IDLLoader.ITF_NAME)) {
      idlLoaderItf = (IDLLoader) value;
    } else if (itfName.equals(IDLLocator.ITF_NAME)) {
      idlLocatorItf = (IDLLocator) value;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }

  }

  public String[] listFc() {
    return listFcHelper(ErrorManager.ITF_NAME, NodeFactory.ITF_NAME,
        RecursiveIDLLoader.ITF_NAME, IDLLoader.ITF_NAME, IDLLocator.ITF_NAME);
  }

  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (ErrorManager.ITF_NAME.equals(itfName)) {
      return errorManagerItf;
    } else if (NodeFactory.ITF_NAME.equals(itfName)) {
      return nodeFactoryItf;
    } else if (itfName.equals(RecursiveIDLLoader.ITF_NAME)) {
      return recursiveIdlLoaderItf;
    } else if (itfName.equals(IDLLoader.ITF_NAME)) {
      return idlLoaderItf;
    } else if (itfName.equals(IDLLocator.ITF_NAME)) {
      return idlLocatorItf;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }
  }

  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (ErrorManager.ITF_NAME.equals(itfName)) {
      errorManagerItf = null;
    } else if (NodeFactory.ITF_NAME.equals(itfName)) {
      nodeFactoryItf = null;
    } else if (itfName.equals(RecursiveIDLLoader.ITF_NAME)) {
      recursiveIdlLoaderItf = null;
    } else if (itfName.equals(IDLLoader.ITF_NAME)) {
      idlLoaderItf = null;
    } else if (itfName.equals(IDLLocator.ITF_NAME)) {
      idlLocatorItf = null;
    } else {
      throw new NoSuchInterfaceException("No client interface named '"
          + itfName + "'");
    }
  }
}
