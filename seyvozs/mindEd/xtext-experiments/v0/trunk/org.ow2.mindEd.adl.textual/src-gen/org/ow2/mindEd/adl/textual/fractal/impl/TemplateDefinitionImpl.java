/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.TemplateDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateDefinitionImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateDefinitionImpl#isAnyTypeReference <em>Any Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateDefinitionImpl extends MinimalEObjectImpl.Container implements TemplateDefinition
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected TemplateSpecifier name;

  /**
   * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeReference()
   * @generated
   * @ordered
   */
  protected TypeReference typeReference;

  /**
   * The default value of the '{@link #isAnyTypeReference() <em>Any Type Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyTypeReference()
   * @generated
   * @ordered
   */
  protected static final boolean ANY_TYPE_REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnyTypeReference() <em>Any Type Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyTypeReference()
   * @generated
   * @ordered
   */
  protected boolean anyTypeReference = ANY_TYPE_REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalPackage.Literals.TEMPLATE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifier getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(TemplateSpecifier newName, NotificationChain msgs)
  {
    TemplateSpecifier oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.TEMPLATE_DEFINITION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(TemplateSpecifier newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.TEMPLATE_DEFINITION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.TEMPLATE_DEFINITION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.TEMPLATE_DEFINITION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getTypeReference()
  {
    if (typeReference != null && typeReference.eIsProxy())
    {
      InternalEObject oldTypeReference = (InternalEObject)typeReference;
      typeReference = (TypeReference)eResolveProxy(oldTypeReference);
      if (typeReference != oldTypeReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE, oldTypeReference, typeReference));
      }
    }
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetTypeReference()
  {
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeReference(TypeReference newTypeReference)
  {
    TypeReference oldTypeReference = typeReference;
    typeReference = newTypeReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE, oldTypeReference, typeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnyTypeReference()
  {
    return anyTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyTypeReference(boolean newAnyTypeReference)
  {
    boolean oldAnyTypeReference = anyTypeReference;
    anyTypeReference = newAnyTypeReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.TEMPLATE_DEFINITION__ANY_TYPE_REFERENCE, oldAnyTypeReference, anyTypeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalPackage.TEMPLATE_DEFINITION__NAME:
        return basicSetName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalPackage.TEMPLATE_DEFINITION__NAME:
        return getName();
      case FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE:
        if (resolve) return getTypeReference();
        return basicGetTypeReference();
      case FractalPackage.TEMPLATE_DEFINITION__ANY_TYPE_REFERENCE:
        return isAnyTypeReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalPackage.TEMPLATE_DEFINITION__NAME:
        setName((TemplateSpecifier)newValue);
        return;
      case FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE:
        setTypeReference((TypeReference)newValue);
        return;
      case FractalPackage.TEMPLATE_DEFINITION__ANY_TYPE_REFERENCE:
        setAnyTypeReference((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalPackage.TEMPLATE_DEFINITION__NAME:
        setName((TemplateSpecifier)null);
        return;
      case FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE:
        setTypeReference((TypeReference)null);
        return;
      case FractalPackage.TEMPLATE_DEFINITION__ANY_TYPE_REFERENCE:
        setAnyTypeReference(ANY_TYPE_REFERENCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalPackage.TEMPLATE_DEFINITION__NAME:
        return name != null;
      case FractalPackage.TEMPLATE_DEFINITION__TYPE_REFERENCE:
        return typeReference != null;
      case FractalPackage.TEMPLATE_DEFINITION__ANY_TYPE_REFERENCE:
        return anyTypeReference != ANY_TYPE_REFERENCE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (anyTypeReference: ");
    result.append(anyTypeReference);
    result.append(')');
    return result.toString();
  }

} //TemplateDefinitionImpl
