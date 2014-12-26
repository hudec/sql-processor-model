/**
 */
package org.sqlproc.model.processorModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoEntityModifier2;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Entity Modifier2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoEntityModifier2Impl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoEntityModifier2Impl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoEntityModifier2Impl#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoEntityModifier2Impl#getOperatorsSuffix <em>Operators Suffix</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoEntityModifier2Impl#getSernum <em>Sernum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoEntityModifier2Impl extends MinimalEObjectImpl.Container implements PojoEntityModifier2
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected PojoEntity superType;

  /**
   * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected static final String DISCRIMINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected String discriminator = DISCRIMINATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getOperators() <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected static final String OPERATORS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected String operators = OPERATORS_EDEFAULT;

  /**
   * The default value of the '{@link #getOperatorsSuffix() <em>Operators Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatorsSuffix()
   * @generated
   * @ordered
   */
  protected static final String OPERATORS_SUFFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperatorsSuffix() <em>Operators Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatorsSuffix()
   * @generated
   * @ordered
   */
  protected String operatorsSuffix = OPERATORS_SUFFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getSernum() <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSernum()
   * @generated
   * @ordered
   */
  protected static final String SERNUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSernum() <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSernum()
   * @generated
   * @ordered
   */
  protected String sernum = SERNUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoEntityModifier2Impl()
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
    return ProcessorModelPackage.Literals.POJO_ENTITY_MODIFIER2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (PojoEntity)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(PojoEntity newSuperType)
  {
    PojoEntity oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDiscriminator()
  {
    return discriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminator(String newDiscriminator)
  {
    String oldDiscriminator = discriminator;
    discriminator = newDiscriminator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__DISCRIMINATOR, oldDiscriminator, discriminator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperators()
  {
    return operators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperators(String newOperators)
  {
    String oldOperators = operators;
    operators = newOperators;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS, oldOperators, operators));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperatorsSuffix()
  {
    return operatorsSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperatorsSuffix(String newOperatorsSuffix)
  {
    String oldOperatorsSuffix = operatorsSuffix;
    operatorsSuffix = newOperatorsSuffix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX, oldOperatorsSuffix, operatorsSuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSernum()
  {
    return sernum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSernum(String newSernum)
  {
    String oldSernum = sernum;
    sernum = newSernum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SERNUM, oldSernum, sernum));
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
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__DISCRIMINATOR:
        return getDiscriminator();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS:
        return getOperators();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX:
        return getOperatorsSuffix();
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SERNUM:
        return getSernum();
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
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE:
        setSuperType((PojoEntity)newValue);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__DISCRIMINATOR:
        setDiscriminator((String)newValue);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS:
        setOperators((String)newValue);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX:
        setOperatorsSuffix((String)newValue);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SERNUM:
        setSernum((String)newValue);
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
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE:
        setSuperType((PojoEntity)null);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__DISCRIMINATOR:
        setDiscriminator(DISCRIMINATOR_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS:
        setOperators(OPERATORS_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX:
        setOperatorsSuffix(OPERATORS_SUFFIX_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SERNUM:
        setSernum(SERNUM_EDEFAULT);
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
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SUPER_TYPE:
        return superType != null;
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__DISCRIMINATOR:
        return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS:
        return OPERATORS_EDEFAULT == null ? operators != null : !OPERATORS_EDEFAULT.equals(operators);
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__OPERATORS_SUFFIX:
        return OPERATORS_SUFFIX_EDEFAULT == null ? operatorsSuffix != null : !OPERATORS_SUFFIX_EDEFAULT.equals(operatorsSuffix);
      case ProcessorModelPackage.POJO_ENTITY_MODIFIER2__SERNUM:
        return SERNUM_EDEFAULT == null ? sernum != null : !SERNUM_EDEFAULT.equals(sernum);
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
    result.append(" (discriminator: ");
    result.append(discriminator);
    result.append(", operators: ");
    result.append(operators);
    result.append(", operatorsSuffix: ");
    result.append(operatorsSuffix);
    result.append(", sernum: ");
    result.append(sernum);
    result.append(')');
    return result.toString();
  }

} //PojoEntityModifier2Impl
