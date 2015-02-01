/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojogen Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getSqlTypes <em>Sql Types</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getColumnTypes <em>Column Types</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbProcedure <em>Db Procedure</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbFunction <em>Db Function</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getJoinTables <em>Join Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getExports <em>Exports</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getMany2s <em>Many2s</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getOperatorsSuffix <em>Operators Suffix</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplements <em>To Implements</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtends <em>To Extends</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplementsGenerics <em>To Implements Generics</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtendsGenerics <em>To Extends Generics</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbNotTables <em>Db Not Tables</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getProcPojos <em>Proc Pojos</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getFunPojos <em>Fun Pojos</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getActiveFilter <em>Active Filter</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getPckg <em>Pckg</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.PojogenProperty#getDbCheckConstraints <em>Db Check Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty()
 * @model
 * @generated
 */
public interface PojogenProperty extends EObject
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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sql Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.SqlTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Types</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_SqlTypes()
   * @model containment="true"
   * @generated
   */
  EList<SqlTypeAssignement> getSqlTypes();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>Column Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ColumnTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Types</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ColumnTypes()
   * @model containment="true"
   * @generated
   */
  EList<ColumnTypeAssignement> getColumnTypes();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbProcedure()
   * @model
   * @generated
   */
  String getDbProcedure();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbProcedure <em>Db Procedure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Procedure</em>' attribute.
   * @see #getDbProcedure()
   * @generated
   */
  void setDbProcedure(String value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbFunction()
   * @model
   * @generated
   */
  String getDbFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbFunction <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Function</em>' attribute.
   * @see #getDbFunction()
   * @generated
   */
  void setDbFunction(String value);

  /**
   * Returns the value of the '<em><b>Column Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Type</em>' containment reference.
   * @see #setColumnType(ShowColumnTypeAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ColumnType()
   * @model containment="true"
   * @generated
   */
  ShowColumnTypeAssignement getColumnType();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getColumnType <em>Column Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Type</em>' containment reference.
   * @see #getColumnType()
   * @generated
   */
  void setColumnType(ShowColumnTypeAssignement value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbTables();

  /**
   * Returns the value of the '<em><b>Join Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.JoinTableAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Tables</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_JoinTables()
   * @model containment="true"
   * @generated
   */
  EList<JoinTableAssignement> getJoinTables();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbColumns();

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.TableAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TableAssignement> getTables();

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ColumnAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Columns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnAssignement> getColumns();

  /**
   * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ExportAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Exports()
   * @model containment="true"
   * @generated
   */
  EList<ExportAssignement> getExports();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ImportAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportAssignement> getImports();

  /**
   * Returns the value of the '<em><b>Many2s</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ManyToManyAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many2s</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many2s</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Many2s()
   * @model containment="true"
   * @generated
   */
  EList<ManyToManyAssignement> getMany2s();

  /**
   * Returns the value of the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Column</em>' attribute.
   * @see #setDbColumn(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.InheritanceAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Inheritance()
   * @model containment="true"
   * @generated
   */
  EList<InheritanceAssignement> getInheritance();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Methods()
   * @model unique="false"
   * @generated
   */
  EList<String> getMethods();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_OperatorsSuffix()
   * @model
   * @generated
   */
  String getOperatorsSuffix();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getOperatorsSuffix <em>Operators Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operators Suffix</em>' attribute.
   * @see #getOperatorsSuffix()
   * @generated
   */
  void setOperatorsSuffix(String value);

  /**
   * Returns the value of the '<em><b>To Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Implements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Implements</em>' containment reference.
   * @see #setToImplements(ImplementsAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ToImplements()
   * @model containment="true"
   * @generated
   */
  ImplementsAssignement getToImplements();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplements <em>To Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Implements</em>' containment reference.
   * @see #getToImplements()
   * @generated
   */
  void setToImplements(ImplementsAssignement value);

  /**
   * Returns the value of the '<em><b>To Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Extends</em>' containment reference.
   * @see #setToExtends(ExtendsAssignement)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ToExtends()
   * @model containment="true"
   * @generated
   */
  ExtendsAssignement getToExtends();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtends <em>To Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Extends</em>' containment reference.
   * @see #getToExtends()
   * @generated
   */
  void setToExtends(ExtendsAssignement value);

  /**
   * Returns the value of the '<em><b>To Implements Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Implements Generics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Implements Generics</em>' containment reference.
   * @see #setToImplementsGenerics(ImplementsAssignementGenerics)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ToImplementsGenerics()
   * @model containment="true"
   * @generated
   */
  ImplementsAssignementGenerics getToImplementsGenerics();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getToImplementsGenerics <em>To Implements Generics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Implements Generics</em>' containment reference.
   * @see #getToImplementsGenerics()
   * @generated
   */
  void setToImplementsGenerics(ImplementsAssignementGenerics value);

  /**
   * Returns the value of the '<em><b>To Extends Generics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Extends Generics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Extends Generics</em>' containment reference.
   * @see #setToExtendsGenerics(ExtendsAssignementGenerics)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ToExtendsGenerics()
   * @model containment="true"
   * @generated
   */
  ExtendsAssignementGenerics getToExtendsGenerics();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getToExtendsGenerics <em>To Extends Generics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Extends Generics</em>' containment reference.
   * @see #getToExtendsGenerics()
   * @generated
   */
  void setToExtendsGenerics(ExtendsAssignementGenerics value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbNotTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbNotTables();

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
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Debug()
   * @model containment="true"
   * @generated
   */
  DebugLevelAssignement getDebug();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getDebug <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' containment reference.
   * @see #getDebug()
   * @generated
   */
  void setDebug(DebugLevelAssignement value);

  /**
   * Returns the value of the '<em><b>Proc Pojos</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.ProcedurePojoAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc Pojos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc Pojos</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ProcPojos()
   * @model containment="true"
   * @generated
   */
  EList<ProcedurePojoAssignement> getProcPojos();

  /**
   * Returns the value of the '<em><b>Fun Pojos</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.model.processorModel.FunctionPojoAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun Pojos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun Pojos</em>' containment reference list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_FunPojos()
   * @model containment="true"
   * @generated
   */
  EList<FunctionPojoAssignement> getFunPojos();

  /**
   * Returns the value of the '<em><b>Active Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active Filter</em>' containment reference.
   * @see #setActiveFilter(PropertyValue)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_ActiveFilter()
   * @model containment="true"
   * @generated
   */
  PropertyValue getActiveFilter();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getActiveFilter <em>Active Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active Filter</em>' containment reference.
   * @see #getActiveFilter()
   * @generated
   */
  void setActiveFilter(PropertyValue value);

  /**
   * Returns the value of the '<em><b>Pckg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pckg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pckg</em>' containment reference.
   * @see #setPckg(PropertyValue)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_Pckg()
   * @model containment="true"
   * @generated
   */
  PropertyValue getPckg();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getPckg <em>Pckg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pckg</em>' containment reference.
   * @see #getPckg()
   * @generated
   */
  void setPckg(PropertyValue value);

  /**
   * Returns the value of the '<em><b>Enum Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Name</em>' attribute.
   * @see #setEnumName(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_EnumName()
   * @model
   * @generated
   */
  String getEnumName();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.PojogenProperty#getEnumName <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Name</em>' attribute.
   * @see #getEnumName()
   * @generated
   */
  void setEnumName(String value);

  /**
   * Returns the value of the '<em><b>Db Check Constraints</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Check Constraints</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Check Constraints</em>' attribute list.
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getPojogenProperty_DbCheckConstraints()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbCheckConstraints();

} // PojogenProperty
