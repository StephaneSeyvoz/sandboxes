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

package org.ow2.mind.idl.annotations;

import java.util.Map;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Node;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationErrors;
import org.ow2.mind.idl.annotation.IDLLoaderAnnotationProcessor;
import org.ow2.mind.idl.annotation.IDLLoaderPhase;
import org.ow2.mind.idl.ast.IDL;
import org.ow2.mind.idl.ast.Method;

public class VarArgsDualAnnotationProcessor implements
	IDLLoaderAnnotationProcessor {

    public void processAnnotation(Annotation annotation, Node node, IDL idl,
	    IDLLoaderPhase phase, Map<Object, Object> context)
	    throws ADLException {
	assert annotation instanceof VarArgsDual;
	if (((Method) node).getVaArgs() != null) {
	    if (((Method) node).getVaArgs().compareTo(Method.TRUE) == 0) {
		// TODO not really needed as getVaArgs() only return "true" or
		// null (cf org.ow2.mind.idl.parser.JTBProcessor)
		return;
	    }
	}

	throw new ADLException(
		AnnotationErrors.INVALID_ANNOTATION,
		node,
		"@VarArgsDual. Variadic's dual function can only be specified for variadic functions.");
    }
}
