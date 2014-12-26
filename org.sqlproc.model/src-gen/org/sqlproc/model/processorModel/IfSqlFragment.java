/**
 */
package org.sqlproc.model.processorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sql Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getCol <em>Col</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getCnstOper <em>Cnst Oper</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getIdentOper <em>Ident Oper</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getDbtab <em>Dbtab</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getDbcol <em>Dbcol</em>}</li>
 *   <li>{@link org.sqlproc.model.processorModel.IfSqlFragment#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment()
 * @model
 * @generated
 */
public interface IfSqlFragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' containment reference.
   * @see #setCol(Column)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Col()
   * @model containment="true"
   * @generated
   */
  Column getCol();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getCol <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' containment reference.
   * @see #getCol()
   * @generated
   */
  void setCol(Column value);

  /**
   * Returns the value of the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnst</em>' containment reference.
   * @see #setCnst(Constant)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Cnst()
   * @model containment="true"
   * @generated
   */
  Constant getCnst();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getCnst <em>Cnst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnst</em>' containment reference.
   * @see #getCnst()
   * @generated
   */
  void setCnst(Constant value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' containment reference.
   * @see #setIdent(Identifier)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Ident()
   * @model containment="true"
   * @generated
   */
  Identifier getIdent();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getIdent <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' containment reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(Identifier value);

  /**
   * Returns the value of the '<em><b>Cnst Oper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnst Oper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnst Oper</em>' containment reference.
   * @see #setCnstOper(ConstantOperator)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_CnstOper()
   * @model containment="true"
   * @generated
   */
  ConstantOperator getCnstOper();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getCnstOper <em>Cnst Oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnst Oper</em>' containment reference.
   * @see #getCnstOper()
   * @generated
   */
  void setCnstOper(ConstantOperator value);

  /**
   * Returns the value of the '<em><b>Ident Oper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident Oper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident Oper</em>' containment reference.
   * @see #setIdentOper(IdentifierOperator)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_IdentOper()
   * @model containment="true"
   * @generated
   */
  IdentifierOperator getIdentOper();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getIdentOper <em>Ident Oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident Oper</em>' containment reference.
   * @see #getIdentOper()
   * @generated
   */
  void setIdentOper(IdentifierOperator value);

  /**
   * Returns the value of the '<em><b>Dbtab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dbtab</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dbtab</em>' containment reference.
   * @see #setDbtab(DatabaseTable)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Dbtab()
   * @model containment="true"
   * @generated
   */
  DatabaseTable getDbtab();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getDbtab <em>Dbtab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbtab</em>' containment reference.
   * @see #getDbtab()
   * @generated
   */
  void setDbtab(DatabaseTable value);

  /**
   * Returns the value of the '<em><b>Dbcol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dbcol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dbcol</em>' containment reference.
   * @see #setDbcol(DatabaseColumn)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Dbcol()
   * @model containment="true"
   * @generated
   */
  DatabaseColumn getDbcol();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getDbcol <em>Dbcol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dbcol</em>' containment reference.
   * @see #getDbcol()
   * @generated
   */
  void setDbcol(DatabaseColumn value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference.
   * @see #setMeta(IfMetaSql)
   * @see org.sqlproc.model.processorModel.ProcessorModelPackage#getIfSqlFragment_Meta()
   * @model containment="true"
   * @generated
   */
  IfMetaSql getMeta();

  /**
   * Sets the value of the '{@link org.sqlproc.model.processorModel.IfSqlFragment#getMeta <em>Meta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' containment reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(IfMetaSql value);

} // IfSqlFragment
