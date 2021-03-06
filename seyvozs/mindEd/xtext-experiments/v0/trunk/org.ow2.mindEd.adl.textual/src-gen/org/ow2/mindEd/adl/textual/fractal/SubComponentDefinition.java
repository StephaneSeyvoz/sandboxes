/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBodyAnnotationsList <em>Body Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition()
 * @model
 * @generated
 */
public interface SubComponentDefinition extends CompositeElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(TypeReference)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_Type()
   * @model
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Templates List</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.TemplateReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates List</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_TemplatesList()
   * @model containment="true"
   * @generated
   */
  EList<TemplateReference> getTemplatesList();

  /**
   * Returns the value of the '<em><b>Arguments List</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments List</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_ArgumentsList()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentDefinition> getArgumentsList();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Annotations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Annotations List</em>' containment reference.
   * @see #setBodyAnnotationsList(AnnotationsList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_BodyAnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getBodyAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBodyAnnotationsList <em>Body Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body Annotations List</em>' containment reference.
   * @see #getBodyAnnotationsList()
   * @generated
   */
  void setBodyAnnotationsList(AnnotationsList value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ArchitectureDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentDefinition_Body()
   * @model containment="true"
   * @generated
   */
  ArchitectureDefinition getBody();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ArchitectureDefinition value);

} // SubComponentDefinition
