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
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#isPojoGenerics <em>Pojo Generics</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getPojo <em>Pojo</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getModifiers2 <em>Modifiers2</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoDao#getToInits <em>To Inits</em>}</li>
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
   * Returns the value of the '<em><b>Pojo Generics</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo Generics</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo Generics</em>' attribute.
   * @see #setPojoGenerics(boolean)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_PojoGenerics()
   * @model
   * @generated
   */
  boolean isPojoGenerics();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoDao#isPojoGenerics <em>Pojo Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojo Generics</em>' attribute.
   * @see #isPojoGenerics()
   * @generated
   */
  void setPojoGenerics(boolean value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Pojo()
   * @model
   * @generated
   */
  PojoEntity getPojo();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoDao#getPojo <em>Pojo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojo</em>' reference.
   * @see #getPojo()
   * @generated
   */
  void setPojo(PojoEntity value);

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

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.PojoMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_Methods()
   * @model containment="true"
   * @generated
   */
  EList<PojoMethod> getMethods();

  /**
   * Returns the value of the '<em><b>To Inits</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ToInitMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Inits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Inits</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoDao_ToInits()
   * @model containment="true"
   * @generated
   */
  EList<ToInitMethod> getToInits();

} // PojoDao
