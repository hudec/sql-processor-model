/**
 */
package org.sqlproc.model.processorModel.impl;

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

import org.sqlproc.model.processorModel.IfSql;
import org.sqlproc.model.processorModel.IfSqlCond;
import org.sqlproc.model.processorModel.MetaSql;
import org.sqlproc.model.processorModel.OrdSql;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Sql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MetaSqlImpl#getIfs <em>Ifs</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MetaSqlImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MetaSqlImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MetaSqlImpl#getFtype <em>Ftype</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.MetaSqlImpl#getOrd <em>Ord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaSqlImpl extends MinimalEObjectImpl.Container implements MetaSql
{
  /**
   * The cached value of the '{@link #getIfs() <em>Ifs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfs()
   * @generated
   * @ordered
   */
  protected EList<IfSql> ifs;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected IfSqlCond cond;

  /**
   * The default value of the '{@link #getFtype() <em>Ftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFtype()
   * @generated
   * @ordered
   */
  protected static final String FTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFtype() <em>Ftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFtype()
   * @generated
   * @ordered
   */
  protected String ftype = FTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrd() <em>Ord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrd()
   * @generated
   * @ordered
   */
  protected OrdSql ord;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaSqlImpl()
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
    return ProcessorModelPackage.Literals.META_SQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfSql> getIfs()
  {
    if (ifs == null)
    {
      ifs = new EObjectContainmentEList<IfSql>(IfSql.class, this, ProcessorModelPackage.META_SQL__IFS);
    }
    return ifs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlCond getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(IfSqlCond newCond, NotificationChain msgs)
  {
    IfSqlCond oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(IfSqlCond newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.META_SQL__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.META_SQL__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFtype()
  {
    return ftype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFtype(String newFtype)
  {
    String oldFtype = ftype;
    ftype = newFtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__FTYPE, oldFtype, ftype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql getOrd()
  {
    return ord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrd(OrdSql newOrd, NotificationChain msgs)
  {
    OrdSql oldOrd = ord;
    ord = newOrd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__ORD, oldOrd, newOrd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrd(OrdSql newOrd)
  {
    if (newOrd != ord)
    {
      NotificationChain msgs = null;
      if (ord != null)
        msgs = ((InternalEObject)ord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.META_SQL__ORD, null, msgs);
      if (newOrd != null)
        msgs = ((InternalEObject)newOrd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.META_SQL__ORD, null, msgs);
      msgs = basicSetOrd(newOrd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.META_SQL__ORD, newOrd, newOrd));
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
      case ProcessorModelPackage.META_SQL__IFS:
        return ((InternalEList<?>)getIfs()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.META_SQL__COND:
        return basicSetCond(null, msgs);
      case ProcessorModelPackage.META_SQL__ORD:
        return basicSetOrd(null, msgs);
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
      case ProcessorModelPackage.META_SQL__IFS:
        return getIfs();
      case ProcessorModelPackage.META_SQL__TYPE:
        return getType();
      case ProcessorModelPackage.META_SQL__COND:
        return getCond();
      case ProcessorModelPackage.META_SQL__FTYPE:
        return getFtype();
      case ProcessorModelPackage.META_SQL__ORD:
        return getOrd();
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
      case ProcessorModelPackage.META_SQL__IFS:
        getIfs().clear();
        getIfs().addAll((Collection<? extends IfSql>)newValue);
        return;
      case ProcessorModelPackage.META_SQL__TYPE:
        setType((String)newValue);
        return;
      case ProcessorModelPackage.META_SQL__COND:
        setCond((IfSqlCond)newValue);
        return;
      case ProcessorModelPackage.META_SQL__FTYPE:
        setFtype((String)newValue);
        return;
      case ProcessorModelPackage.META_SQL__ORD:
        setOrd((OrdSql)newValue);
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
      case ProcessorModelPackage.META_SQL__IFS:
        getIfs().clear();
        return;
      case ProcessorModelPackage.META_SQL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProcessorModelPackage.META_SQL__COND:
        setCond((IfSqlCond)null);
        return;
      case ProcessorModelPackage.META_SQL__FTYPE:
        setFtype(FTYPE_EDEFAULT);
        return;
      case ProcessorModelPackage.META_SQL__ORD:
        setOrd((OrdSql)null);
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
      case ProcessorModelPackage.META_SQL__IFS:
        return ifs != null && !ifs.isEmpty();
      case ProcessorModelPackage.META_SQL__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ProcessorModelPackage.META_SQL__COND:
        return cond != null;
      case ProcessorModelPackage.META_SQL__FTYPE:
        return FTYPE_EDEFAULT == null ? ftype != null : !FTYPE_EDEFAULT.equals(ftype);
      case ProcessorModelPackage.META_SQL__ORD:
        return ord != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", ftype: ");
    result.append(ftype);
    result.append(')');
    return result.toString();
  }

} //MetaSqlImpl
