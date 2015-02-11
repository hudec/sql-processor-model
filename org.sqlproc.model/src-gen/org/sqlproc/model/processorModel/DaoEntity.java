/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dao Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.DaoEntity#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DaoEntity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DaoEntity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.DaoEntity#getProcedures <em>Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoEntity()
 * @model
 * @generated
 */
public interface DaoEntity extends Entity
{
  /**
   * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.DaoDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directives</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoEntity_Directives()
   * @model containment="true"
   * @generated
   */
  EList<DaoDirective> getDirectives();

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(JvmParameterizedTypeReference)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoEntity_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getSuperType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.DaoEntity#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<PojoAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoProcedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getDaoEntity_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<PojoProcedure> getProcedures();

} // DaoEntity
