/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition()
 * @model
 * @generated
 */
public interface ArchitectureDefinition extends TypeReference
{
  /**
   * Returns the value of the '<em><b>Super Types</b></em>' reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition_SuperTypes()
   * @model
   * @generated
   */
  EList<ArchitectureDefinition> getSuperTypes();

} // ArchitectureDefinition
