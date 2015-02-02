/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseMetaInfoAssignement()
 * @model
 * @generated
 */
public interface DatabaseMetaInfoAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Meta Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Meta Info</em>' containment reference.
   * @see #setDbMetaInfo(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDatabaseMetaInfoAssignement_DbMetaInfo()
   * @model containment="true"
   * @generated
   */
  ValueType getDbMetaInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Meta Info</em>' containment reference.
   * @see #getDbMetaInfo()
   * @generated
   */
  void setDbMetaInfo(ValueType value);

} // DatabaseMetaInfoAssignement
