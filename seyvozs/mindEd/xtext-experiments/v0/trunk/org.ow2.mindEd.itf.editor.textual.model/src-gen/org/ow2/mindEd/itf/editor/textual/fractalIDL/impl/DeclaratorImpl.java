/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl#getDc <em>Dc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaratorImpl extends MinimalEObjectImpl.Container implements Declarator
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected EList<QualifiedPointerSpecification> pointer;

  /**
   * The cached value of the '{@link #getDc() <em>Dc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDc()
   * @generated
   * @ordered
   */
  protected DirectDeclarator dc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclaratorImpl()
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
    return FractalIDLPackage.Literals.DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualifiedPointerSpecification> getPointer()
  {
    if (pointer == null)
    {
      pointer = new EObjectContainmentEList<QualifiedPointerSpecification>(QualifiedPointerSpecification.class, this, FractalIDLPackage.DECLARATOR__POINTER);
    }
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectDeclarator getDc()
  {
    return dc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDc(DirectDeclarator newDc, NotificationChain msgs)
  {
    DirectDeclarator oldDc = dc;
    dc = newDc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.DECLARATOR__DC, oldDc, newDc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDc(DirectDeclarator newDc)
  {
    if (newDc != dc)
    {
      NotificationChain msgs = null;
      if (dc != null)
        msgs = ((InternalEObject)dc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.DECLARATOR__DC, null, msgs);
      if (newDc != null)
        msgs = ((InternalEObject)newDc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.DECLARATOR__DC, null, msgs);
      msgs = basicSetDc(newDc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.DECLARATOR__DC, newDc, newDc));
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
      case FractalIDLPackage.DECLARATOR__POINTER:
        return ((InternalEList<?>)getPointer()).basicRemove(otherEnd, msgs);
      case FractalIDLPackage.DECLARATOR__DC:
        return basicSetDc(null, msgs);
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
      case FractalIDLPackage.DECLARATOR__POINTER:
        return getPointer();
      case FractalIDLPackage.DECLARATOR__DC:
        return getDc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.DECLARATOR__POINTER:
        getPointer().clear();
        getPointer().addAll((Collection<? extends QualifiedPointerSpecification>)newValue);
        return;
      case FractalIDLPackage.DECLARATOR__DC:
        setDc((DirectDeclarator)newValue);
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
      case FractalIDLPackage.DECLARATOR__POINTER:
        getPointer().clear();
        return;
      case FractalIDLPackage.DECLARATOR__DC:
        setDc((DirectDeclarator)null);
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
      case FractalIDLPackage.DECLARATOR__POINTER:
        return pointer != null && !pointer.isEmpty();
      case FractalIDLPackage.DECLARATOR__DC:
        return dc != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclaratorImpl
