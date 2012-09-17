/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Or Union Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructOrUnionSpecification()
 * @model
 * @generated
 */
public interface StructOrUnionSpecification extends TypeDefinition, TypeSpecification
{
  /**
   * Returns the value of the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' attribute.
   * @see #setStruct(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructOrUnionSpecification_Struct()
   * @model
   * @generated
   */
  String getStruct();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' attribute.
   * @see #getStruct()
   * @generated
   */
  void setStruct(String value);

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructOrUnionSpecification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StructOrUnionSpecification
