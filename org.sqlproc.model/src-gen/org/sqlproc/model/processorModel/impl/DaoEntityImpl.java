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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoProcedure;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dao Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaoEntityImpl#getProcedures <em>Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaoEntityImpl extends EntityImpl implements DaoEntity
{
  /**
   * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectives()
   * @generated
   * @ordered
   */
  protected EList<DaoDirective> directives;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference superType;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<PojoAttribute> attributes;

  /**
   * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedures()
   * @generated
   * @ordered
   */
  protected EList<PojoProcedure> procedures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaoEntityImpl()
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
    return ProcessorModelPackage.Literals.DAO_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DaoDirective> getDirectives()
  {
    if (directives == null)
    {
      directives = new EObjectContainmentEList<DaoDirective>(DaoDirective.class, this, ProcessorModelPackage.DAO_ENTITY__DIRECTIVES);
    }
    return directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(JvmParameterizedTypeReference newSuperType, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(JvmParameterizedTypeReference newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE, newSuperType, newSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<PojoAttribute>(PojoAttribute.class, this, ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoProcedure> getProcedures()
  {
    if (procedures == null)
    {
      procedures = new EObjectContainmentEList<PojoProcedure>(PojoProcedure.class, this, ProcessorModelPackage.DAO_ENTITY__PROCEDURES);
    }
    return procedures;
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
      case ProcessorModelPackage.DAO_ENTITY__DIRECTIVES:
        return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.DAO_ENTITY__PROCEDURES:
        return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
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
      case ProcessorModelPackage.DAO_ENTITY__DIRECTIVES:
        return getDirectives();
      case ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE:
        return getSuperType();
      case ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES:
        return getAttributes();
      case ProcessorModelPackage.DAO_ENTITY__PROCEDURES:
        return getProcedures();
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
      case ProcessorModelPackage.DAO_ENTITY__DIRECTIVES:
        getDirectives().clear();
        getDirectives().addAll((Collection<? extends DaoDirective>)newValue);
        return;
      case ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE:
        setSuperType((JvmParameterizedTypeReference)newValue);
        return;
      case ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends PojoAttribute>)newValue);
        return;
      case ProcessorModelPackage.DAO_ENTITY__PROCEDURES:
        getProcedures().clear();
        getProcedures().addAll((Collection<? extends PojoProcedure>)newValue);
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
      case ProcessorModelPackage.DAO_ENTITY__DIRECTIVES:
        getDirectives().clear();
        return;
      case ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE:
        setSuperType((JvmParameterizedTypeReference)null);
        return;
      case ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case ProcessorModelPackage.DAO_ENTITY__PROCEDURES:
        getProcedures().clear();
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
      case ProcessorModelPackage.DAO_ENTITY__DIRECTIVES:
        return directives != null && !directives.isEmpty();
      case ProcessorModelPackage.DAO_ENTITY__SUPER_TYPE:
        return superType != null;
      case ProcessorModelPackage.DAO_ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case ProcessorModelPackage.DAO_ENTITY__PROCEDURES:
        return procedures != null && !procedures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DaoEntityImpl
