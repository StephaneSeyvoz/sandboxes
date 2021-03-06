/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.AnnotationContainer#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getAnnotationContainer()
 * @model
 * @generated
 */
public interface AnnotationContainer extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getAnnotationContainer_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

} // AnnotationContainer
