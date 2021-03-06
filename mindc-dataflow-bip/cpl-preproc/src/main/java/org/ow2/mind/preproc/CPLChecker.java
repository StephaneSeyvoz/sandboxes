/**
 * Copyright (C) 2010 France Telecom
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
 * Authors: Matthieu ANNE
 * Contributors: 
 */

package org.ow2.mind.preproc;

import org.antlr.runtime.Token;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.error.BasicErrorLocator;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.types.TypeInterfaceUtil;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Data;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.idl.ast.IDLASTHelper;
import org.ow2.mind.idl.ast.InterfaceDefinition;

public class CPLChecker {
  protected final Definition   definition;
  protected final ErrorManager errorManager;

  protected final Data         data;
  protected boolean            prvDeclared = false;

  public CPLChecker(final ErrorManager errorManager, final Definition definition) {
    this.errorManager = errorManager;
    this.definition = definition;
    this.data = (definition instanceof ImplementationContainer)
        ? ((ImplementationContainer) definition).getData()
        : null;
  }

  public void prvDecl(final String structContent, final String sourceFile,
      final int lineNumberShift) {
    prvDeclared = true;
  }

  public void serverMethDef(final Token itfName, final Token methName,
      final String sourceFile, final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    if (data != null && !prvDeclared) {
      errorManager.logError(MPPErrors.MISSING_PRIVATE_DECLARATION,
          new BasicErrorLocator(data.getPath(), -1, -1), data.getPath());
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }
    if (!TypeInterfaceUtil.isServer(itf)) {
      errorManager.logError(MPPErrors.INVALID_CLIENT_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText(),
          methName.getText());
      return;
    }

    // assume that itfDef is already loaded
    final InterfaceDefinition itfDef = InterfaceDefinitionDecorationHelper
        .getResolvedInterfaceDefinition((TypeInterface) itf, null, null);
    if (IDLASTHelper.getMethod(itfDef, methName.getText()) == null) {
      errorManager.logError(MPPErrors.UNKNOWN_METHOD,
          locator(methName, sourceFile, lineNumberShift), itfName.getText(),
          methName.getText());
    }

  }

  public void itfMethCall(final Token itfName, final Token methName,
      final String sourceFile, final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }

    // assume that itfDef is already loaded
    final InterfaceDefinition itfDef = InterfaceDefinitionDecorationHelper
        .getResolvedInterfaceDefinition((TypeInterface) itf, null, null);
    if (IDLASTHelper.getMethod(itfDef, methName.getText()) == null) {
      errorManager.logError(MPPErrors.UNKNOWN_METHOD,
          locator(methName, sourceFile, lineNumberShift), itfName.getText(),
          methName.getText());
    }
  }

  public void attAccess(final Token attributeName, final String sourceFile,
      final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    if (ASTHelper.getAttribute(definition, attributeName.getText()) == null) {
      errorManager.logError(MPPErrors.UNKNOWN_ATTRIBUTE,
          locator(attributeName, sourceFile, lineNumberShift),
          attributeName.getText());
    }
  }

  public void collItfMethCall(final Token itfName, final Token methName,
      final StringBuilder idx, final String sourceFile,
      final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }

    // assume that itfDef is already loaded
    final InterfaceDefinition itfDef = InterfaceDefinitionDecorationHelper
        .getResolvedInterfaceDefinition((TypeInterface) itf, null, null);
    if (IDLASTHelper.getMethod(itfDef, methName.getText()) == null) {
      errorManager.logError(MPPErrors.UNKNOWN_METHOD,
          locator(methName, sourceFile, lineNumberShift), itfName.getText(),
          methName.getText());
    }

    checkIdx(itf, itfName, idx, sourceFile, lineNumberShift);
  }

  public void getMyItf(final Token itfName, final StringBuilder idx,
      final String sourceFile, final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }

    checkIdx(itf, itfName, idx, sourceFile, lineNumberShift);
  }

  public void bindMyItf(final Token itfName, final StringBuilder idx,
      final String sourceFile, final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }

    checkIdx(itf, itfName, idx, sourceFile, lineNumberShift);
  }

  public void isBound(final Token itfName, final StringBuilder idx,
      final String sourceFile, final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }

    checkIdx(itf, itfName, idx, sourceFile, lineNumberShift);
  }

  public void getCollectionSize(final Token itfName, final String sourceFile,
      final int lineNumberShift) throws ADLException {
    if (definition == null) {
      // Add this condition so that the testNG will not throw exceptions
      // (stand-alone node)
      return;
    }

    final Interface itf = ASTHelper.getInterface(definition, itfName.getText());
    if (itf == null) {
      errorManager.logError(MPPErrors.UNKNOWN_INTERFACE,
          locator(itfName, sourceFile, lineNumberShift), itfName.getText());
      return;
    }
  }

  protected void checkIdx(final Interface itf, final Token itfToken,
      final StringBuilder idx, final String sourceFile,
      final int sourceLineShift) throws ADLException {
    if (idx == null) {
      if (TypeInterfaceUtil.isCollection(itf)) {
        errorManager.logError(MPPErrors.INVALID_INTERFACE_MISSING_INDEX,
            locator(itfToken, sourceFile, sourceLineShift), itf.getName());
      }
    } else {
      if (!TypeInterfaceUtil.isCollection(itf)) {
        errorManager.logError(MPPErrors.INVALID_INTERFACE_NOT_A_COLLECTION,
            locator(itfToken, sourceFile, sourceLineShift), itf.getName());
      }

      if (idx.length() <= 2) {
        return;
      }
      final String index = idx.substring(1, idx.length() - 1).trim();
      try {
        final int i = Integer.parseInt(index);
        if (i < 0 || i >= ASTHelper.getNumberOfElement(itf)) {
          errorManager.logError(MPPErrors.INVALID_INDEX,
              locator(itfToken, sourceFile, sourceLineShift), itf.getName(),
              index);
        }
      } catch (final NumberFormatException e) {
        // ignore, idx is not a number literal
      }
    }
  }

  protected BasicErrorLocator locator(final Token token,
      final String sourceFile, final int lineNumberShift) {
    return new BasicErrorLocator(sourceFile, token.getLine() + lineNumberShift,
        token.getCharPositionInLine());
  }

}
