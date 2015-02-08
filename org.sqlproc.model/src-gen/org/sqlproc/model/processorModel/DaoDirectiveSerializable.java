/**
 */
package org.sqlproc.model.processorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dao Directive Serializable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DaoDirectiveSerializable#getSernum <em>Sernum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoDirectiveSerializable()
 * @model
 * @generated
 */
public interface DaoDirectiveSerializable extends DaoDirective
{
  /**
   * Returns the value of the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sernum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sernum</em>' attribute.
   * @see #setSernum(int)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoDirectiveSerializable_Sernum()
   * @model
   * @generated
   */
  int getSernum();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DaoDirectiveSerializable#getSernum <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sernum</em>' attribute.
   * @see #getSernum()
   * @generated
   */
  void setSernum(int value);

} // DaoDirectiveSerializable
