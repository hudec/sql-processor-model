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

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.PojoPropertyDirective;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getGtype <em>Gtype</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#getGref <em>Gref</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.PojoPropertyImpl#isArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoPropertyImpl extends MinimalEObjectImpl.Container implements PojoProperty
{
  /**
   * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectives()
   * @generated
   * @ordered
   */
  protected EList<PojoPropertyDirective> directives;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmType type;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Entity ref;

  /**
   * The cached value of the '{@link #getGtype() <em>Gtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGtype()
   * @generated
   * @ordered
   */
  protected JvmType gtype;

  /**
   * The cached value of the '{@link #getGref() <em>Gref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGref()
   * @generated
   * @ordered
   */
  protected PojoEntity gref;

  /**
   * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected static final boolean ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected boolean array = ARRAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoPropertyImpl()
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
    return ProcessorModelPackage.Literals.POJO_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoPropertyDirective> getDirectives()
  {
    if (directives == null)
    {
      directives = new EObjectContainmentEList<PojoPropertyDirective>(PojoPropertyDirective.class, this, ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES);
    }
    return directives;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (JvmType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_PROPERTY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmType newType)
  {
    JvmType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Entity)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_PROPERTY__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Entity newRef)
  {
    Entity oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getGtype()
  {
    if (gtype != null && gtype.eIsProxy())
    {
      InternalEObject oldGtype = (InternalEObject)gtype;
      gtype = (JvmType)eResolveProxy(oldGtype);
      if (gtype != oldGtype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_PROPERTY__GTYPE, oldGtype, gtype));
      }
    }
    return gtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetGtype()
  {
    return gtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGtype(JvmType newGtype)
  {
    JvmType oldGtype = gtype;
    gtype = newGtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__GTYPE, oldGtype, gtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity getGref()
  {
    if (gref != null && gref.eIsProxy())
    {
      InternalEObject oldGref = (InternalEObject)gref;
      gref = (PojoEntity)eResolveProxy(oldGref);
      if (gref != oldGref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorModelPackage.POJO_PROPERTY__GREF, oldGref, gref));
      }
    }
    return gref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity basicGetGref()
  {
    return gref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGref(PojoEntity newGref)
  {
    PojoEntity oldGref = gref;
    gref = newGref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__GREF, oldGref, gref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(boolean newArray)
  {
    boolean oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.POJO_PROPERTY__ARRAY, oldArray, array));
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
      case ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES:
        return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
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
      case ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES:
        return getDirectives();
      case ProcessorModelPackage.POJO_PROPERTY__NAME:
        return getName();
      case ProcessorModelPackage.POJO_PROPERTY__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ProcessorModelPackage.POJO_PROPERTY__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case ProcessorModelPackage.POJO_PROPERTY__GTYPE:
        if (resolve) return getGtype();
        return basicGetGtype();
      case ProcessorModelPackage.POJO_PROPERTY__GREF:
        if (resolve) return getGref();
        return basicGetGref();
      case ProcessorModelPackage.POJO_PROPERTY__ARRAY:
        return isArray();
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
      case ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES:
        getDirectives().clear();
        getDirectives().addAll((Collection<? extends PojoPropertyDirective>)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__TYPE:
        setType((JvmType)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__REF:
        setRef((Entity)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__GTYPE:
        setGtype((JvmType)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__GREF:
        setGref((PojoEntity)newValue);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__ARRAY:
        setArray((Boolean)newValue);
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
      case ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES:
        getDirectives().clear();
        return;
      case ProcessorModelPackage.POJO_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__TYPE:
        setType((JvmType)null);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__REF:
        setRef((Entity)null);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__GTYPE:
        setGtype((JvmType)null);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__GREF:
        setGref((PojoEntity)null);
        return;
      case ProcessorModelPackage.POJO_PROPERTY__ARRAY:
        setArray(ARRAY_EDEFAULT);
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
      case ProcessorModelPackage.POJO_PROPERTY__DIRECTIVES:
        return directives != null && !directives.isEmpty();
      case ProcessorModelPackage.POJO_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorModelPackage.POJO_PROPERTY__TYPE:
        return type != null;
      case ProcessorModelPackage.POJO_PROPERTY__REF:
        return ref != null;
      case ProcessorModelPackage.POJO_PROPERTY__GTYPE:
        return gtype != null;
      case ProcessorModelPackage.POJO_PROPERTY__GREF:
        return gref != null;
      case ProcessorModelPackage.POJO_PROPERTY__ARRAY:
        return array != ARRAY_EDEFAULT;
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
    result.append(", array: ");
    result.append(array);
    result.append(')');
    return result.toString();
  }

} //PojoPropertyImpl
