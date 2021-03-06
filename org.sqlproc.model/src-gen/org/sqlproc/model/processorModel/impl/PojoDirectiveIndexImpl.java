/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sqlproc.model.processorModel.DirectiveProperties;
import org.sqlproc.model.processorModel.PojoDirectiveIndex;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Directive Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDirectiveIndexImpl#getProplist <em>Proplist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoDirectiveIndexImpl extends PojoDirectiveImpl implements PojoDirectiveIndex
{
  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getProplist() <em>Proplist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProplist()
   * @generated
   * @ordered
   */
  protected DirectiveProperties proplist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoDirectiveIndexImpl()
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
    return ProcessorModelPackage.Literals.POJO_DIRECTIVE_INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_DIRECTIVE_INDEX__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectiveProperties getProplist()
  {
    return proplist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProplist(DirectiveProperties newProplist, NotificationChain msgs)
  {
    DirectiveProperties oldProplist = proplist;
    proplist = newProplist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST, oldProplist, newProplist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProplist(DirectiveProperties newProplist)
  {
    if (newProplist != proplist)
    {
      NotificationChain msgs = null;
      if (proplist != null)
        msgs = ((InternalEObject)proplist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST, null, msgs);
      if (newProplist != null)
        msgs = ((InternalEObject)newProplist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST, null, msgs);
      msgs = basicSetProplist(newProplist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST, newProplist, newProplist));
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
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST:
        return basicSetProplist(null, msgs);
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
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__INDEX:
        return getIndex();
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST:
        return getProplist();
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
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__INDEX:
        setIndex((Integer)newValue);
        return;
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST:
        setProplist((DirectiveProperties)newValue);
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
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST:
        setProplist((DirectiveProperties)null);
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
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__INDEX:
        return index != INDEX_EDEFAULT;
      case ProcessorModelPackage.POJO_DIRECTIVE_INDEX__PROPLIST:
        return proplist != null;
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
    result.append(" (index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //PojoDirectiveIndexImpl
