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

import org.sqlproc.model.processorModel.DaogenProperty;
import org.sqlproc.model.processorModel.DebugLevelAssignement;
import org.sqlproc.model.processorModel.ExtendsAssignement;
import org.sqlproc.model.processorModel.ExtendsAssignementGenerics;
import org.sqlproc.model.processorModel.ImplementsAssignement;
import org.sqlproc.model.processorModel.ImplementsAssignementGenerics;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daogen Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getToImplements <em>To Implements</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getToExtends <em>To Extends</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getToImplementsGenerics <em>To Implements Generics</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getToExtendsGenerics <em>To Extends Generics</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getDbFunction <em>Db Function</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getActiveFilter <em>Active Filter</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.DaogenPropertyImpl#getPckg <em>Pckg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaogenPropertyImpl extends MinimalEObjectImpl.Container implements DaogenProperty
{
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
   * The cached value of the '{@link #getDbTables() <em>Db Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbTables;

  /**
   * The cached value of the '{@link #getToImplements() <em>To Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToImplements()
   * @generated
   * @ordered
   */
  protected ImplementsAssignement toImplements;

  /**
   * The cached value of the '{@link #getToExtends() <em>To Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExtends()
   * @generated
   * @ordered
   */
  protected ExtendsAssignement toExtends;

  /**
   * The cached value of the '{@link #getToImplementsGenerics() <em>To Implements Generics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToImplementsGenerics()
   * @generated
   * @ordered
   */
  protected ImplementsAssignementGenerics toImplementsGenerics;

  /**
   * The cached value of the '{@link #getToExtendsGenerics() <em>To Extends Generics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExtendsGenerics()
   * @generated
   * @ordered
   */
  protected ExtendsAssignementGenerics toExtendsGenerics;

  /**
   * The default value of the '{@link #getDbFunction() <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbFunction()
   * @generated
   * @ordered
   */
  protected static final String DB_FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbFunction() <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbFunction()
   * @generated
   * @ordered
   */
  protected String dbFunction = DB_FUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getResultType() <em>Result Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultType()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference resultType;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected DebugLevelAssignement debug;

  /**
   * The cached value of the '{@link #getActiveFilter() <em>Active Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiveFilter()
   * @generated
   * @ordered
   */
  protected ValueType activeFilter;

  /**
   * The default value of the '{@link #getPckg() <em>Pckg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPckg()
   * @generated
   * @ordered
   */
  protected static final String PCKG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPckg() <em>Pckg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPckg()
   * @generated
   * @ordered
   */
  protected String pckg = PCKG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaogenPropertyImpl()
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
    return ProcessorModelPackage.Literals.DAOGEN_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__NAME, oldName, name));
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
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorModelPackage.DAOGEN_PROPERTY__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignement getToImplements()
  {
    return toImplements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToImplements(ImplementsAssignement newToImplements, NotificationChain msgs)
  {
    ImplementsAssignement oldToImplements = toImplements;
    toImplements = newToImplements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS, oldToImplements, newToImplements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToImplements(ImplementsAssignement newToImplements)
  {
    if (newToImplements != toImplements)
    {
      NotificationChain msgs = null;
      if (toImplements != null)
        msgs = ((InternalEObject)toImplements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS, null, msgs);
      if (newToImplements != null)
        msgs = ((InternalEObject)newToImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS, null, msgs);
      msgs = basicSetToImplements(newToImplements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS, newToImplements, newToImplements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignement getToExtends()
  {
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToExtends(ExtendsAssignement newToExtends, NotificationChain msgs)
  {
    ExtendsAssignement oldToExtends = toExtends;
    toExtends = newToExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS, oldToExtends, newToExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExtends(ExtendsAssignement newToExtends)
  {
    if (newToExtends != toExtends)
    {
      NotificationChain msgs = null;
      if (toExtends != null)
        msgs = ((InternalEObject)toExtends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS, null, msgs);
      if (newToExtends != null)
        msgs = ((InternalEObject)newToExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS, null, msgs);
      msgs = basicSetToExtends(newToExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS, newToExtends, newToExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignementGenerics getToImplementsGenerics()
  {
    return toImplementsGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToImplementsGenerics(ImplementsAssignementGenerics newToImplementsGenerics, NotificationChain msgs)
  {
    ImplementsAssignementGenerics oldToImplementsGenerics = toImplementsGenerics;
    toImplementsGenerics = newToImplementsGenerics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS, oldToImplementsGenerics, newToImplementsGenerics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToImplementsGenerics(ImplementsAssignementGenerics newToImplementsGenerics)
  {
    if (newToImplementsGenerics != toImplementsGenerics)
    {
      NotificationChain msgs = null;
      if (toImplementsGenerics != null)
        msgs = ((InternalEObject)toImplementsGenerics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS, null, msgs);
      if (newToImplementsGenerics != null)
        msgs = ((InternalEObject)newToImplementsGenerics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS, null, msgs);
      msgs = basicSetToImplementsGenerics(newToImplementsGenerics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS, newToImplementsGenerics, newToImplementsGenerics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignementGenerics getToExtendsGenerics()
  {
    return toExtendsGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToExtendsGenerics(ExtendsAssignementGenerics newToExtendsGenerics, NotificationChain msgs)
  {
    ExtendsAssignementGenerics oldToExtendsGenerics = toExtendsGenerics;
    toExtendsGenerics = newToExtendsGenerics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS, oldToExtendsGenerics, newToExtendsGenerics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExtendsGenerics(ExtendsAssignementGenerics newToExtendsGenerics)
  {
    if (newToExtendsGenerics != toExtendsGenerics)
    {
      NotificationChain msgs = null;
      if (toExtendsGenerics != null)
        msgs = ((InternalEObject)toExtendsGenerics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS, null, msgs);
      if (newToExtendsGenerics != null)
        msgs = ((InternalEObject)newToExtendsGenerics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS, null, msgs);
      msgs = basicSetToExtendsGenerics(newToExtendsGenerics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS, newToExtendsGenerics, newToExtendsGenerics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbFunction()
  {
    return dbFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbFunction(String newDbFunction)
  {
    String oldDbFunction = dbFunction;
    dbFunction = newDbFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__DB_FUNCTION, oldDbFunction, dbFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getResultType()
  {
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultType(JvmParameterizedTypeReference newResultType, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldResultType = resultType;
    resultType = newResultType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE, oldResultType, newResultType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultType(JvmParameterizedTypeReference newResultType)
  {
    if (newResultType != resultType)
    {
      NotificationChain msgs = null;
      if (resultType != null)
        msgs = ((InternalEObject)resultType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE, null, msgs);
      if (newResultType != null)
        msgs = ((InternalEObject)newResultType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE, null, msgs);
      msgs = basicSetResultType(newResultType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE, newResultType, newResultType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugLevelAssignement getDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDebug(DebugLevelAssignement newDebug, NotificationChain msgs)
  {
    DebugLevelAssignement oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG, oldDebug, newDebug);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(DebugLevelAssignement newDebug)
  {
    if (newDebug != debug)
    {
      NotificationChain msgs = null;
      if (debug != null)
        msgs = ((InternalEObject)debug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG, null, msgs);
      if (newDebug != null)
        msgs = ((InternalEObject)newDebug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG, null, msgs);
      msgs = basicSetDebug(newDebug, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG, newDebug, newDebug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getActiveFilter()
  {
    return activeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActiveFilter(ValueType newActiveFilter, NotificationChain msgs)
  {
    ValueType oldActiveFilter = activeFilter;
    activeFilter = newActiveFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER, oldActiveFilter, newActiveFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiveFilter(ValueType newActiveFilter)
  {
    if (newActiveFilter != activeFilter)
    {
      NotificationChain msgs = null;
      if (activeFilter != null)
        msgs = ((InternalEObject)activeFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER, null, msgs);
      if (newActiveFilter != null)
        msgs = ((InternalEObject)newActiveFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER, null, msgs);
      msgs = basicSetActiveFilter(newActiveFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER, newActiveFilter, newActiveFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPckg()
  {
    return pckg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPckg(String newPckg)
  {
    String oldPckg = pckg;
    pckg = newPckg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorModelPackage.DAOGEN_PROPERTY__PCKG, oldPckg, pckg));
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
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        return basicSetToImplements(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        return basicSetToExtends(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS:
        return basicSetToImplementsGenerics(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS:
        return basicSetToExtendsGenerics(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE:
        return basicSetResultType(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG:
        return basicSetDebug(null, msgs);
      case ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER:
        return basicSetActiveFilter(null, msgs);
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
      case ProcessorModelPackage.DAOGEN_PROPERTY__NAME:
        return getName();
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_TABLES:
        return getDbTables();
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        return getToImplements();
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        return getToExtends();
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS:
        return getToImplementsGenerics();
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS:
        return getToExtendsGenerics();
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_FUNCTION:
        return getDbFunction();
      case ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE:
        return getResultType();
      case ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG:
        return getDebug();
      case ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER:
        return getActiveFilter();
      case ProcessorModelPackage.DAOGEN_PROPERTY__PCKG:
        return getPckg();
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
      case ProcessorModelPackage.DAOGEN_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        setToImplements((ImplementsAssignement)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((ExtendsAssignement)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS:
        setToImplementsGenerics((ImplementsAssignementGenerics)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS:
        setToExtendsGenerics((ExtendsAssignementGenerics)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_FUNCTION:
        setDbFunction((String)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE:
        setResultType((JvmParameterizedTypeReference)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER:
        setActiveFilter((ValueType)newValue);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__PCKG:
        setPckg((String)newValue);
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
      case ProcessorModelPackage.DAOGEN_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        setToImplements((ImplementsAssignement)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((ExtendsAssignement)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS:
        setToImplementsGenerics((ImplementsAssignementGenerics)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS:
        setToExtendsGenerics((ExtendsAssignementGenerics)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_FUNCTION:
        setDbFunction(DB_FUNCTION_EDEFAULT);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE:
        setResultType((JvmParameterizedTypeReference)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER:
        setActiveFilter((ValueType)null);
        return;
      case ProcessorModelPackage.DAOGEN_PROPERTY__PCKG:
        setPckg(PCKG_EDEFAULT);
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
      case ProcessorModelPackage.DAOGEN_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        return toImplements != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        return toExtends != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS_GENERICS:
        return toImplementsGenerics != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__TO_EXTENDS_GENERICS:
        return toExtendsGenerics != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DB_FUNCTION:
        return DB_FUNCTION_EDEFAULT == null ? dbFunction != null : !DB_FUNCTION_EDEFAULT.equals(dbFunction);
      case ProcessorModelPackage.DAOGEN_PROPERTY__RESULT_TYPE:
        return resultType != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__DEBUG:
        return debug != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__ACTIVE_FILTER:
        return activeFilter != null;
      case ProcessorModelPackage.DAOGEN_PROPERTY__PCKG:
        return PCKG_EDEFAULT == null ? pckg != null : !PCKG_EDEFAULT.equals(pckg);
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
    result.append(", dbTables: ");
    result.append(dbTables);
    result.append(", dbFunction: ");
    result.append(dbFunction);
    result.append(", pckg: ");
    result.append(pckg);
    result.append(')');
    return result.toString();
  }

} //DaogenPropertyImpl
