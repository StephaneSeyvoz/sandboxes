/**
 */
package org.ow2.mindEd.adl.textual.fractal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceParent <em>Source Parent</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsSrcParentThis <em>Is Src Parent This</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceInterface <em>Source Interface</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceIndex <em>Source Index</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetParent <em>Target Parent</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsTgtParentThis <em>Is Tgt Parent This</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetInterface <em>Target Interface</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetIndex <em>Target Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition()
 * @model
 * @generated
 */
public interface BindingDefinition extends CompositeElement
{
  /**
   * Returns the value of the '<em><b>Source Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Parent</em>' reference.
   * @see #setSourceParent(SubComponentDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_SourceParent()
   * @model
   * @generated
   */
  SubComponentDefinition getSourceParent();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceParent <em>Source Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Parent</em>' reference.
   * @see #getSourceParent()
   * @generated
   */
  void setSourceParent(SubComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Is Src Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Src Parent This</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Src Parent This</em>' attribute.
   * @see #setIsSrcParentThis(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_IsSrcParentThis()
   * @model
   * @generated
   */
  boolean isIsSrcParentThis();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsSrcParentThis <em>Is Src Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Src Parent This</em>' attribute.
   * @see #isIsSrcParentThis()
   * @generated
   */
  void setIsSrcParentThis(boolean value);

  /**
   * Returns the value of the '<em><b>Source Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Interface</em>' reference.
   * @see #setSourceInterface(HostedInterfaceDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_SourceInterface()
   * @model
   * @generated
   */
  HostedInterfaceDefinition getSourceInterface();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceInterface <em>Source Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Interface</em>' reference.
   * @see #getSourceInterface()
   * @generated
   */
  void setSourceInterface(HostedInterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Source Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Index</em>' attribute.
   * @see #setSourceIndex(int)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_SourceIndex()
   * @model
   * @generated
   */
  int getSourceIndex();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceIndex <em>Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Index</em>' attribute.
   * @see #getSourceIndex()
   * @generated
   */
  void setSourceIndex(int value);

  /**
   * Returns the value of the '<em><b>Target Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Parent</em>' reference.
   * @see #setTargetParent(SubComponentDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_TargetParent()
   * @model
   * @generated
   */
  SubComponentDefinition getTargetParent();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetParent <em>Target Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Parent</em>' reference.
   * @see #getTargetParent()
   * @generated
   */
  void setTargetParent(SubComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Is Tgt Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Tgt Parent This</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Tgt Parent This</em>' attribute.
   * @see #setIsTgtParentThis(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_IsTgtParentThis()
   * @model
   * @generated
   */
  boolean isIsTgtParentThis();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsTgtParentThis <em>Is Tgt Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Tgt Parent This</em>' attribute.
   * @see #isIsTgtParentThis()
   * @generated
   */
  void setIsTgtParentThis(boolean value);

  /**
   * Returns the value of the '<em><b>Target Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Interface</em>' reference.
   * @see #setTargetInterface(HostedInterfaceDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_TargetInterface()
   * @model
   * @generated
   */
  HostedInterfaceDefinition getTargetInterface();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetInterface <em>Target Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Interface</em>' reference.
   * @see #getTargetInterface()
   * @generated
   */
  void setTargetInterface(HostedInterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Target Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Index</em>' attribute.
   * @see #setTargetIndex(int)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_TargetIndex()
   * @model
   * @generated
   */
  int getTargetIndex();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetIndex <em>Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Index</em>' attribute.
   * @see #getTargetIndex()
   * @generated
   */
  void setTargetIndex(int value);

} // BindingDefinition
