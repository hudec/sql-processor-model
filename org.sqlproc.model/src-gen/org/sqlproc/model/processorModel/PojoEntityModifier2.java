/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Entity Modifier2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getOperatorsSuffix <em>Operators Suffix</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getSernum <em>Sernum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2()
 * @model
 * @generated
 */
public interface PojoEntityModifier2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(PojoEntity)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2_SuperType()
   * @model
   * @generated
   */
  PojoEntity getSuperType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(PojoEntity value);

  /**
   * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator</em>' attribute.
   * @see #setDiscriminator(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2_Discriminator()
   * @model
   * @generated
   */
  String getDiscriminator();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getDiscriminator <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator</em>' attribute.
   * @see #getDiscriminator()
   * @generated
   */
  void setDiscriminator(String value);

  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute.
   * @see #setOperators(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2_Operators()
   * @model
   * @generated
   */
  String getOperators();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getOperators <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operators</em>' attribute.
   * @see #getOperators()
   * @generated
   */
  void setOperators(String value);

  /**
   * Returns the value of the '<em><b>Operators Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators Suffix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators Suffix</em>' attribute.
   * @see #setOperatorsSuffix(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2_OperatorsSuffix()
   * @model
   * @generated
   */
  String getOperatorsSuffix();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getOperatorsSuffix <em>Operators Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operators Suffix</em>' attribute.
   * @see #getOperatorsSuffix()
   * @generated
   */
  void setOperatorsSuffix(String value);

  /**
   * Returns the value of the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sernum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sernum</em>' attribute.
   * @see #setSernum(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojoEntityModifier2_Sernum()
   * @model
   * @generated
   */
  String getSernum();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojoEntityModifier2#getSernum <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sernum</em>' attribute.
   * @see #getSernum()
   * @generated
   */
  void setSernum(String value);

} // PojoEntityModifier2
