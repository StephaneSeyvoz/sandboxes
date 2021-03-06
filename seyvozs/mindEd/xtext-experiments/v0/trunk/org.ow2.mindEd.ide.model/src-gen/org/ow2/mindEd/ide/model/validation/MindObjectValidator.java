/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.validation;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.ide.model.MindPathEntry;

/**
 * A sample validator interface for {@link org.ow2.mindEd.ide.model.MindObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MindObjectValidator {
	boolean validate();

	boolean validateMindId(String value);
	boolean validateName(String value);
	boolean validateResolvedMindPathEntries(EList<MindPathEntry> value);
}
