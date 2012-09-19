/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDc <em>Dc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getDeclarator()
 * @model
 * @generated
 */
public interface Declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getDeclarator_Pointer()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedPointerSpecification> getPointer();

  /**
   * Returns the value of the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dc</em>' containment reference.
   * @see #setDc(DirectDeclarator)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getDeclarator_Dc()
   * @model containment="true"
   * @generated
   */
  DirectDeclarator getDc();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDc <em>Dc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dc</em>' containment reference.
   * @see #getDc()
   * @generated
   */
  void setDc(DirectDeclarator value);

} // Declarator
