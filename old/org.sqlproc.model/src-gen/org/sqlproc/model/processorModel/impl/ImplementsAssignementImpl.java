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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.sqlproc.model.processorModel.ImplementsAssignement;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl#getToImplement <em>To Implement</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ImplementsAssignementImpl#getDbNotTables <em>Db Not Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementsAssignementImpl extends MinimalEObjectImpl.Container implements ImplementsAssignement
{
  /**
   * The cached value of the '{@link #getToImplement() <em>To Implement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToImplement()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference toImplement;

  /**
   * The cached value of the '{@link #getDbTables() <em>Db Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbTables;

  /**
   * The cached value of the '{@link #getDbNotTables() <em>Db Not Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbNotTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbNotTables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementsAssignementImpl()
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
    return ProcessorModelPackage.Literals.IMPLEMENTS_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getToImplement()
  {
    return toImplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToImplement(JvmParameterizedTypeReference newToImplement, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldToImplement = toImplement;
    toImplement = newToImplement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT, oldToImplement, newToImplement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToImplement(JvmParameterizedTypeReference newToImplement)
  {
    if (newToImplement != toImplement)
    {
      NotificationChain msgs = null;
      if (toImplement != null)
        msgs = ((InternalEObject)toImplement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT, null, msgs);
      if (newToImplement != null)
        msgs = ((InternalEObject)newToImplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT, null, msgs);
      msgs = basicSetToImplement(newToImplement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT, newToImplement, newToImplement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbTables()
  {
    if (dbTables == null)
    {
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbNotTables()
  {
    if (dbNotTables == null)
    {
      dbNotTables = new EDataTypeEList<String>(String.class, this, ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES);
    }
    return dbNotTables;
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
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT:
        return basicSetToImplement(null, msgs);
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
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT:
        return getToImplement();
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_TABLES:
        return getDbTables();
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES:
        return getDbNotTables();
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
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT:
        setToImplement((JvmParameterizedTypeReference)newValue);
        return;
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES:
        getDbNotTables().clear();
        getDbNotTables().addAll((Collection<? extends String>)newValue);
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
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT:
        setToImplement((JvmParameterizedTypeReference)null);
        return;
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES:
        getDbNotTables().clear();
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
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__TO_IMPLEMENT:
        return toImplement != null;
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorModelPackage.IMPLEMENTS_ASSIGNEMENT__DB_NOT_TABLES:
        return dbNotTables != null && !dbNotTables.isEmpty();
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
    result.append(" (dbTables: ");
    result.append(dbTables);
    result.append(", dbNotTables: ");
    result.append(dbNotTables);
    result.append(')');
    return result.toString();
  }

} //ImplementsAssignementImpl
