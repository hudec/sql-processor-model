/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Entity Modifier2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.EnumEntityModifier2#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.EnumEntityModifier2#getSernum <em>Sernum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntityModifier2()
 * @model
 * @generated
 */
public interface EnumEntityModifier2 extends EObject
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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntityModifier2_SuperType()
   * @model
   * @generated
   */
  PojoEntity getSuperType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.EnumEntityModifier2#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(PojoEntity value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getEnumEntityModifier2_Sernum()
   * @model
   * @generated
   */
  String getSernum();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.EnumEntityModifier2#getSernum <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sernum</em>' attribute.
   * @see #getSernum()
   * @generated
   */
  void setSernum(String value);

} // EnumEntityModifier2
