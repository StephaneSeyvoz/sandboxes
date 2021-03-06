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

import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;

public abstract class AbstractInstantiator
    implements
      Instantiator,
      BindingController {

  // ---------------------------------------------------------------------------
  // Client interfaces
  // ---------------------------------------------------------------------------

  public static final String CLIENT_INSTANTIATOR_ITF_NAME = "client-instantiator";

  public Instantiator        clientInstantiatorItf;

  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------

  public String[] listFc() {
    return new String[]{CLIENT_INSTANTIATOR_ITF_NAME};
  }

  public Object lookupFc(final String s) throws NoSuchInterfaceException {

    if (s == null) {
      throw new IllegalArgumentException("Interface name can't be null");
    }

    if (CLIENT_INSTANTIATOR_ITF_NAME.equals(s)) {
      return clientInstantiatorItf;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "'");
    }
  }

  public void bindFc(final String s, final Object o)
      throws NoSuchInterfaceException, IllegalBindingException {

    if (s == null) {
      throw new IllegalArgumentException("Interface name can't be null");
    }

    if (CLIENT_INSTANTIATOR_ITF_NAME.equals(s)) {
      clientInstantiatorItf = (Instantiator) o;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "' for binding the interface");
    }
  }

  public void unbindFc(final String s) throws IllegalBindingException,
      NoSuchInterfaceException {

    if (s == null) {
      throw new IllegalArgumentException("Interface name can't be null");
    }

    if (CLIENT_INSTANTIATOR_ITF_NAME.equals(s)) {
      clientInstantiatorItf = null;
    } else {
      throw new NoSuchInterfaceException("No client interface named '" + s
          + "'");
    }
  }
}
