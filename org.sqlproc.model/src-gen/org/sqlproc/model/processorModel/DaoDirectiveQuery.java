/**
 */
package org.sqlproc.model.processorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dao Directive Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DaoDirectiveQuery#getPojo <em>Pojo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoDirectiveQuery()
 * @model
 * @generated
 */
public interface DaoDirectiveQuery extends DaoDirective
{
  /**
   * Returns the value of the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo</em>' reference.
   * @see #setPojo(PojoEntity)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoDirectiveQuery_Pojo()
   * @model
   * @generated
   */
  PojoEntity getPojo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DaoDirectiveQuery#getPojo <em>Pojo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojo</em>' reference.
   * @see #getPojo()
   * @generated
   */
  void setPojo(PojoEntity value);

} // DaoDirectiveQuery
