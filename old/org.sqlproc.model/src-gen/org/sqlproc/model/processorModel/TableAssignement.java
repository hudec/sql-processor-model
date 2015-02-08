/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.TableAssignement#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.TableAssignement#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getTableAssignement()
 * @model
 * @generated
 */
public interface TableAssignement extends EObject
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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getTableAssignement_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.TableAssignement#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Name</em>' attribute.
   * @see #setNewName(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getTableAssignement_NewName()
   * @model
   * @generated
   */
  String getNewName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.TableAssignement#getNewName <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' attribute.
   * @see #getNewName()
   * @generated
   */
  void setNewName(String value);

} // TableAssignement
