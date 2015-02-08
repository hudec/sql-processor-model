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

import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDaoModifier;
import org.sqlproc.model.processorModel.PojoEntityModifier1;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Dao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDaoImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDaoImpl#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDaoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoDaoImpl#getModifiers2 <em>Modifiers2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoDaoImpl extends AbstractPojoEntityImpl implements PojoDao
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
   * The cached value of the '{@link #getModifiers1() <em>Modifiers1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers1()
   * @generated
   * @ordered
   */
  protected EList<PojoEntityModifier1> modifiers1;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getModifiers2() <em>Modifiers2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers2()
   * @generated
   * @ordered
   */
  protected EList<PojoDaoModifier> modifiers2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoDaoImpl()
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
    return ProcessorModelPackage.Literals.POJO_DAO;
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
      directives = new EObjectContainmentEList<DaoDirective>(DaoDirective.class, this, ProcessorModelPackage.POJO_DAO__DIRECTIVES);
    }
    return directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntityModifier1> getModifiers1()
  {
    if (modifiers1 == null)
    {
      modifiers1 = new EObjectContainmentEList<PojoEntityModifier1>(PojoEntityModifier1.class, this, ProcessorModelPackage.POJO_DAO__MODIFIERS1);
    }
    return modifiers1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_DAO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoDaoModifier> getModifiers2()
  {
    if (modifiers2 == null)
    {
      modifiers2 = new EObjectContainmentEList<PojoDaoModifier>(PojoDaoModifier.class, this, ProcessorModelPackage.POJO_DAO__MODIFIERS2);
    }
    return modifiers2;
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
      case ProcessorModelPackage.POJO_DAO__DIRECTIVES:
        return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.POJO_DAO__MODIFIERS1:
        return ((InternalEList<?>)getModifiers1()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.POJO_DAO__MODIFIERS2:
        return ((InternalEList<?>)getModifiers2()).basicRemove(otherEnd, msgs);
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
      case ProcessorModelPackage.POJO_DAO__DIRECTIVES:
        return getDirectives();
      case ProcessorModelPackage.POJO_DAO__MODIFIERS1:
        return getModifiers1();
      case ProcessorModelPackage.POJO_DAO__NAME:
        return getName();
      case ProcessorModelPackage.POJO_DAO__MODIFIERS2:
        return getModifiers2();
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
      case ProcessorModelPackage.POJO_DAO__DIRECTIVES:
        getDirectives().clear();
        getDirectives().addAll((Collection<? extends DaoDirective>)newValue);
        return;
      case ProcessorModelPackage.POJO_DAO__MODIFIERS1:
        getModifiers1().clear();
        getModifiers1().addAll((Collection<? extends PojoEntityModifier1>)newValue);
        return;
      case ProcessorModelPackage.POJO_DAO__NAME:
        setName((String)newValue);
        return;
      case ProcessorModelPackage.POJO_DAO__MODIFIERS2:
        getModifiers2().clear();
        getModifiers2().addAll((Collection<? extends PojoDaoModifier>)newValue);
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
      case ProcessorModelPackage.POJO_DAO__DIRECTIVES:
        getDirectives().clear();
        return;
      case ProcessorModelPackage.POJO_DAO__MODIFIERS1:
        getModifiers1().clear();
        return;
      case ProcessorModelPackage.POJO_DAO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_DAO__MODIFIERS2:
        getModifiers2().clear();
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
      case ProcessorModelPackage.POJO_DAO__DIRECTIVES:
        return directives != null && !directives.isEmpty();
      case ProcessorModelPackage.POJO_DAO__MODIFIERS1:
        return modifiers1 != null && !modifiers1.isEmpty();
      case ProcessorModelPackage.POJO_DAO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorModelPackage.POJO_DAO__MODIFIERS2:
        return modifiers2 != null && !modifiers2.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PojoDaoImpl
