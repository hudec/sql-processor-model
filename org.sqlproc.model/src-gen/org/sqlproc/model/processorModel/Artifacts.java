/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.Artifacts#getPojoPackages <em>Pojo Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Pojos</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojos</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_Pojos()
   * @model containment="true"
   * @generated
   */
  EList<PojoDefinition> getPojos();

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.TableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TableDefinition> getTables();

  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ProcedureDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDefinition> getProcedures();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFunctions();

  /**
   * Returns the value of the '<em><b>Pojo Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo Packages</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getArtifacts_PojoPackages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDeclaration> getPojoPackages();

} // Artifacts
