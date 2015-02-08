/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Table Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.JoinTableAssignement#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.JoinTableAssignement#getDbTables <em>Db Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getJoinTableAssignement()
 * @model
 * @generated
 */
public interface JoinTableAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Table</em>' attribute.
   * @see #setDbTable(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getJoinTableAssignement_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.JoinTableAssignement#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>Db Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Tables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Tables</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getJoinTableAssignement_DbTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbTables();

} // JoinTableAssignement
