/**
 */
package org.sqlproc.model.processorModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.TableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.impl.ArtifactsImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactsImpl extends MinimalEObjectImpl.Container implements Artifacts
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getPojos() <em>Pojos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojos()
   * @generated
   * @ordered
   */
  protected EList<PojoDefinition> pojos;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<TableDefinition> tables;

  /**
   * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedures()
   * @generated
   * @ordered
   */
  protected EList<ProcedureDefinition> procedures;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinition> functions;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<org.sqlproc.model.processorModel.Package> packages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactsImpl()
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
    return ProcessorModelPackage.Literals.ARTIFACTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ProcessorModelPackage.ARTIFACTS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoDefinition> getPojos()
  {
    if (pojos == null)
    {
      pojos = new EObjectContainmentEList<PojoDefinition>(PojoDefinition.class, this, ProcessorModelPackage.ARTIFACTS__POJOS);
    }
    return pojos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableDefinition> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<TableDefinition>(TableDefinition.class, this, ProcessorModelPackage.ARTIFACTS__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcedureDefinition> getProcedures()
  {
    if (procedures == null)
    {
      procedures = new EObjectContainmentEList<ProcedureDefinition>(ProcedureDefinition.class, this, ProcessorModelPackage.ARTIFACTS__PROCEDURES);
    }
    return procedures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDefinition> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, ProcessorModelPackage.ARTIFACTS__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.sqlproc.model.processorModel.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<org.sqlproc.model.processorModel.Package>(org.sqlproc.model.processorModel.Package.class, this, ProcessorModelPackage.ARTIFACTS__PACKAGES);
    }
    return packages;
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
      case ProcessorModelPackage.ARTIFACTS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.ARTIFACTS__POJOS:
        return ((InternalEList<?>)getPojos()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.ARTIFACTS__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.ARTIFACTS__PROCEDURES:
        return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.ARTIFACTS__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case ProcessorModelPackage.ARTIFACTS__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
      case ProcessorModelPackage.ARTIFACTS__PROPERTIES:
        return getProperties();
      case ProcessorModelPackage.ARTIFACTS__POJOS:
        return getPojos();
      case ProcessorModelPackage.ARTIFACTS__TABLES:
        return getTables();
      case ProcessorModelPackage.ARTIFACTS__PROCEDURES:
        return getProcedures();
      case ProcessorModelPackage.ARTIFACTS__FUNCTIONS:
        return getFunctions();
      case ProcessorModelPackage.ARTIFACTS__PACKAGES:
        return getPackages();
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
      case ProcessorModelPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ProcessorModelPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        getPojos().addAll((Collection<? extends PojoDefinition>)newValue);
        return;
      case ProcessorModelPackage.ARTIFACTS__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends TableDefinition>)newValue);
        return;
      case ProcessorModelPackage.ARTIFACTS__PROCEDURES:
        getProcedures().clear();
        getProcedures().addAll((Collection<? extends ProcedureDefinition>)newValue);
        return;
      case ProcessorModelPackage.ARTIFACTS__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends FunctionDefinition>)newValue);
        return;
      case ProcessorModelPackage.ARTIFACTS__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends org.sqlproc.model.processorModel.Package>)newValue);
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
      case ProcessorModelPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        return;
      case ProcessorModelPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        return;
      case ProcessorModelPackage.ARTIFACTS__TABLES:
        getTables().clear();
        return;
      case ProcessorModelPackage.ARTIFACTS__PROCEDURES:
        getProcedures().clear();
        return;
      case ProcessorModelPackage.ARTIFACTS__FUNCTIONS:
        getFunctions().clear();
        return;
      case ProcessorModelPackage.ARTIFACTS__PACKAGES:
        getPackages().clear();
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
      case ProcessorModelPackage.ARTIFACTS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ProcessorModelPackage.ARTIFACTS__POJOS:
        return pojos != null && !pojos.isEmpty();
      case ProcessorModelPackage.ARTIFACTS__TABLES:
        return tables != null && !tables.isEmpty();
      case ProcessorModelPackage.ARTIFACTS__PROCEDURES:
        return procedures != null && !procedures.isEmpty();
      case ProcessorModelPackage.ARTIFACTS__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case ProcessorModelPackage.ARTIFACTS__PACKAGES:
        return packages != null && !packages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArtifactsImpl
