/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Schema Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseSchemaAssignement#getDbSchema <em>Db Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseSchemaAssignement()
 * @model
 * @generated
 */
public interface DatabaseSchemaAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' containment reference.
   * @see #setDbSchema(PropertyValue)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseSchemaAssignement_DbSchema()
   * @model containment="true"
   * @generated
   */
  PropertyValue getDbSchema();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseSchemaAssignement#getDbSchema <em>Db Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' containment reference.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(PropertyValue value);

} // DatabaseSchemaAssignement
