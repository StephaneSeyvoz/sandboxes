/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#isAnyTypeReference <em>Any Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateDefinition()
 * @model
 * @generated
 */
public interface TemplateDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(TemplateSpecifier)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateDefinition_Name()
   * @model containment="true"
   * @generated
   */
  TemplateSpecifier getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(TemplateSpecifier value);

  /**
   * Returns the value of the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Reference</em>' reference.
   * @see #setTypeReference(TypeReference)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateDefinition_TypeReference()
   * @model
   * @generated
   */
  TypeReference getTypeReference();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#getTypeReference <em>Type Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Reference</em>' reference.
   * @see #getTypeReference()
   * @generated
   */
  void setTypeReference(TypeReference value);

  /**
   * Returns the value of the '<em><b>Any Type Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Type Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Type Reference</em>' attribute.
   * @see #setAnyTypeReference(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateDefinition_AnyTypeReference()
   * @model
   * @generated
   */
  boolean isAnyTypeReference();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition#isAnyTypeReference <em>Any Type Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any Type Reference</em>' attribute.
   * @see #isAnyTypeReference()
   * @generated
   */
  void setAnyTypeReference(boolean value);

} // TemplateDefinition
