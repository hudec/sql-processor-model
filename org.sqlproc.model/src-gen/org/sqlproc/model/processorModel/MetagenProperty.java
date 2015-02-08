/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metagen Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbNotTables <em>Db Not Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getMetaTypes <em>Meta Types</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbStatement <em>Db Statement</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbFunction <em>Db Function</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDbProcedure <em>Db Procedure</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getOptionalFeatures <em>Optional Features</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.MetagenProperty#getActiveFilter <em>Active Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty()
 * @model
 * @generated
 */
public interface MetagenProperty extends EObject
{
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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' attribute.
   * @see #setSequence(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_Sequence()
   * @model
   * @generated
   */
  String getSequence();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getSequence <em>Sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' attribute.
   * @see #getSequence()
   * @generated
   */
  void setSequence(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbTables();

  /**
   * Returns the value of the '<em><b>Db Not Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Not Tables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Not Tables</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbNotTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbNotTables();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identity</em>' attribute.
   * @see #setIdentity(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_Identity()
   * @model
   * @generated
   */
  String getIdentity();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getIdentity <em>Identity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identity</em>' attribute.
   * @see #getIdentity()
   * @generated
   */
  void setIdentity(String value);

  /**
   * Returns the value of the '<em><b>Meta Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.MetaTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Types</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_MetaTypes()
   * @model containment="true"
   * @generated
   */
  EList<MetaTypeAssignement> getMetaTypes();

  /**
   * Returns the value of the '<em><b>Db Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Statement</em>' attribute.
   * @see #setDbStatement(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbStatement()
   * @model
   * @generated
   */
  String getDbStatement();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbStatement <em>Db Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Statement</em>' attribute.
   * @see #getDbStatement()
   * @generated
   */
  void setDbStatement(String value);

  /**
   * Returns the value of the '<em><b>Db Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Columns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Columns</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbColumns();

  /**
   * Returns the value of the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Function</em>' attribute.
   * @see #setDbFunction(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbFunction()
   * @model
   * @generated
   */
  String getDbFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbFunction <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Function</em>' attribute.
   * @see #getDbFunction()
   * @generated
   */
  void setDbFunction(String value);

  /**
   * Returns the value of the '<em><b>Db Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Procedure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Procedure</em>' attribute.
   * @see #setDbProcedure(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_DbProcedure()
   * @model
   * @generated
   */
  String getDbProcedure();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getDbProcedure <em>Db Procedure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Procedure</em>' attribute.
   * @see #getDbProcedure()
   * @generated
   */
  void setDbProcedure(String value);

  /**
   * Returns the value of the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' containment reference.
   * @see #setDebug(DebugLevelAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_Debug()
   * @model containment="true"
   * @generated
   */
  DebugLevelAssignement getDebug();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getDebug <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' containment reference.
   * @see #getDebug()
   * @generated
   */
  void setDebug(DebugLevelAssignement value);

  /**
   * Returns the value of the '<em><b>Optional Features</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional Features</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional Features</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_OptionalFeatures()
   * @model unique="false"
   * @generated
   */
  EList<String> getOptionalFeatures();

  /**
   * Returns the value of the '<em><b>Active Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active Filter</em>' containment reference.
   * @see #setActiveFilter(ValueType)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getMetagenProperty_ActiveFilter()
   * @model containment="true"
   * @generated
   */
  ValueType getActiveFilter();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.MetagenProperty#getActiveFilter <em>Active Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active Filter</em>' containment reference.
   * @see #getActiveFilter()
   * @generated
   */
  void setActiveFilter(ValueType value);

} // MetagenProperty
