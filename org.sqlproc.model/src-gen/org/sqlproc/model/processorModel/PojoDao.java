/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Dao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getModifiers2 <em>Modifiers2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao()
 * @model
 * @generated
 */
public interface PojoDao extends AbstractPojoEntity
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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Directives()
   * @model containment="true"
   * @generated
   */
  EList<DaoDirective> getDirectives();

  /**
   * Returns the value of the '<em><b>Modifiers1</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoEntityModifier1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers1</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Modifiers1()
   * @model containment="true"
   * @generated
   */
  EList<PojoEntityModifier1> getModifiers1();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoDao#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modifiers2</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoDaoModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers2</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Modifiers2()
   * @model containment="true"
   * @generated
   */
  EList<PojoDaoModifier> getModifiers2();

} // PojoDao
