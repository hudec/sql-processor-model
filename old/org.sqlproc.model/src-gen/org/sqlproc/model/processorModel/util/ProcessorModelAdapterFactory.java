/**
 */
package org.sqlproc.model.processorModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sqlproc.model.processorModel.AbstractPojoEntity;
import org.sqlproc.model.processorModel.AnnotatedEntity;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.AnnotationDirective;
import org.sqlproc.model.processorModel.AnnotationDirectiveAttribute;
import org.sqlproc.model.processorModel.AnnotationDirectiveConflict;
import org.sqlproc.model.processorModel.AnnotationDirectiveConstructor;
import org.sqlproc.model.processorModel.AnnotationDirectiveGetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveSetter;
import org.sqlproc.model.processorModel.AnnotationDirectiveStandard;
import org.sqlproc.model.processorModel.AnnotationDirectiveStatic;
import org.sqlproc.model.processorModel.AnnotationProperty;
import org.sqlproc.model.processorModel.Artifacts;
import org.sqlproc.model.processorModel.ColumnAssignement;
import org.sqlproc.model.processorModel.ColumnTypeAssignement;
import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoDirectiveCrud;
import org.sqlproc.model.processorModel.DaoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.DaoDirectiveParameters;
import org.sqlproc.model.processorModel.DaoDirectiveQuery;
import org.sqlproc.model.processorModel.DaoDirectiveSerializable;
import org.sqlproc.model.processorModel.DaogenProperty;
import org.sqlproc.model.processorModel.DatabaseCatalogAssignement;
import org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement;
import org.sqlproc.model.processorModel.DatabaseProperty;
import org.sqlproc.model.processorModel.DatabaseSchemaAssignement;
import org.sqlproc.model.processorModel.DatabaseTypeAssignement;
import org.sqlproc.model.processorModel.DebugLevelAssignement;
import org.sqlproc.model.processorModel.DescendantAssignment;
import org.sqlproc.model.processorModel.DirectiveProperties;
import org.sqlproc.model.processorModel.DriverMetaInfoAssignement;
import org.sqlproc.model.processorModel.DriverMethodOutputAssignement;
import org.sqlproc.model.processorModel.Entity;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumEntityModifier1;
import org.sqlproc.model.processorModel.EnumEntityModifier2;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.EnumPropertyDirective;
import org.sqlproc.model.processorModel.EnumPropertyDirectiveValues;
import org.sqlproc.model.processorModel.EnumPropertyValue;
import org.sqlproc.model.processorModel.ExportAssignement;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.ExtendsAssignement;
import org.sqlproc.model.processorModel.ExtendsAssignementGenerics;
import org.sqlproc.model.processorModel.FunProcDirective;
import org.sqlproc.model.processorModel.FunProcType;
import org.sqlproc.model.processorModel.FunctionCall;
import org.sqlproc.model.processorModel.FunctionCallQuery;
import org.sqlproc.model.processorModel.FunctionDefinition;
import org.sqlproc.model.processorModel.FunctionPojoAssignement;
import org.sqlproc.model.processorModel.FunctionQuery;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.ImplementsAssignement;
import org.sqlproc.model.processorModel.ImplementsAssignementGenerics;
import org.sqlproc.model.processorModel.ImplementsExtendsDirective;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos;
import org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos;
import org.sqlproc.model.processorModel.Import;
import org.sqlproc.model.processorModel.ImportAssignement;
import org.sqlproc.model.processorModel.InheritanceAssignement;
import org.sqlproc.model.processorModel.JoinTableAssignement;
import org.sqlproc.model.processorModel.ManyToManyAssignement;
import org.sqlproc.model.processorModel.MetaTypeAssignement;
import org.sqlproc.model.processorModel.MetagenProperty;
import org.sqlproc.model.processorModel.PackageDirective;
import org.sqlproc.model.processorModel.PackageDirectiveImplementation;
import org.sqlproc.model.processorModel.PackageDirectiveSuffix;
import org.sqlproc.model.processorModel.PojoAnnotatedProperty;
import org.sqlproc.model.processorModel.PojoDao;
import org.sqlproc.model.processorModel.PojoDaoModifier;
import org.sqlproc.model.processorModel.PojoDefinition;
import org.sqlproc.model.processorModel.PojoDirective;
import org.sqlproc.model.processorModel.PojoDirectiveDiscriminator;
import org.sqlproc.model.processorModel.PojoDirectiveEquals;
import org.sqlproc.model.processorModel.PojoDirectiveHashCode;
import org.sqlproc.model.processorModel.PojoDirectiveIndex;
import org.sqlproc.model.processorModel.PojoDirectiveOperators;
import org.sqlproc.model.processorModel.PojoDirectiveSerializable;
import org.sqlproc.model.processorModel.PojoDirectiveToString;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoEntityModifier1;
import org.sqlproc.model.processorModel.PojoEntityModifier2;
import org.sqlproc.model.processorModel.PojoProperty;
import org.sqlproc.model.processorModel.PojoPropertyDirective;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveCreateCol;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveDiscriminator;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumDef;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumInit;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveIndex;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveIsDef;
import org.sqlproc.model.processorModel.PojoPropertyDirectivePrimaryKey;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveRequired;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveToInit;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveUpdateCol;
import org.sqlproc.model.processorModel.PojoPropertyDirectiveVersion;
import org.sqlproc.model.processorModel.PojoType;
import org.sqlproc.model.processorModel.PojogenProperty;
import org.sqlproc.model.processorModel.ProcedureCallQuery;
import org.sqlproc.model.processorModel.ProcedureDefinition;
import org.sqlproc.model.processorModel.ProcedurePojoAssignement;
import org.sqlproc.model.processorModel.ProcedureUpdate;
import org.sqlproc.model.processorModel.ProcessorModelPackage;
import org.sqlproc.model.processorModel.Property;
import org.sqlproc.model.processorModel.PropertyCondition;
import org.sqlproc.model.processorModel.ShowColumnTypeAssignement;
import org.sqlproc.model.processorModel.SqlTypeAssignement;
import org.sqlproc.model.processorModel.TableAssignement;
import org.sqlproc.model.processorModel.TableDefinition;
import org.sqlproc.model.processorModel.ValueType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sqlproc.model.processorModel.ProcessorModelPackage
 * @generated
 */
public class ProcessorModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProcessorModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProcessorModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessorModelSwitch<Adapter> modelSwitch =
    new ProcessorModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseArtifacts(Artifacts object)
      {
        return createArtifactsAdapter();
      }
      @Override
      public Adapter caseValueType(ValueType object)
      {
        return createValueTypeAdapter();
      }
      @Override
      public Adapter caseDatabaseCatalogAssignement(DatabaseCatalogAssignement object)
      {
        return createDatabaseCatalogAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseSchemaAssignement(DatabaseSchemaAssignement object)
      {
        return createDatabaseSchemaAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseTypeAssignement(DatabaseTypeAssignement object)
      {
        return createDatabaseTypeAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseMetaInfoAssignement(DatabaseMetaInfoAssignement object)
      {
        return createDatabaseMetaInfoAssignementAdapter();
      }
      @Override
      public Adapter caseDriverMetaInfoAssignement(DriverMetaInfoAssignement object)
      {
        return createDriverMetaInfoAssignementAdapter();
      }
      @Override
      public Adapter caseDriverMethodOutputAssignement(DriverMethodOutputAssignement object)
      {
        return createDriverMethodOutputAssignementAdapter();
      }
      @Override
      public Adapter caseSqlTypeAssignement(SqlTypeAssignement object)
      {
        return createSqlTypeAssignementAdapter();
      }
      @Override
      public Adapter caseColumnTypeAssignement(ColumnTypeAssignement object)
      {
        return createColumnTypeAssignementAdapter();
      }
      @Override
      public Adapter caseShowColumnTypeAssignement(ShowColumnTypeAssignement object)
      {
        return createShowColumnTypeAssignementAdapter();
      }
      @Override
      public Adapter caseTableAssignement(TableAssignement object)
      {
        return createTableAssignementAdapter();
      }
      @Override
      public Adapter caseJoinTableAssignement(JoinTableAssignement object)
      {
        return createJoinTableAssignementAdapter();
      }
      @Override
      public Adapter caseColumnAssignement(ColumnAssignement object)
      {
        return createColumnAssignementAdapter();
      }
      @Override
      public Adapter caseImportAssignement(ImportAssignement object)
      {
        return createImportAssignementAdapter();
      }
      @Override
      public Adapter caseExportAssignement(ExportAssignement object)
      {
        return createExportAssignementAdapter();
      }
      @Override
      public Adapter caseInheritanceAssignement(InheritanceAssignement object)
      {
        return createInheritanceAssignementAdapter();
      }
      @Override
      public Adapter caseManyToManyAssignement(ManyToManyAssignement object)
      {
        return createManyToManyAssignementAdapter();
      }
      @Override
      public Adapter caseDebugLevelAssignement(DebugLevelAssignement object)
      {
        return createDebugLevelAssignementAdapter();
      }
      @Override
      public Adapter caseProcedurePojoAssignement(ProcedurePojoAssignement object)
      {
        return createProcedurePojoAssignementAdapter();
      }
      @Override
      public Adapter caseFunctionPojoAssignement(FunctionPojoAssignement object)
      {
        return createFunctionPojoAssignementAdapter();
      }
      @Override
      public Adapter caseImplementsAssignement(ImplementsAssignement object)
      {
        return createImplementsAssignementAdapter();
      }
      @Override
      public Adapter caseExtendsAssignement(ExtendsAssignement object)
      {
        return createExtendsAssignementAdapter();
      }
      @Override
      public Adapter caseImplementsAssignementGenerics(ImplementsAssignementGenerics object)
      {
        return createImplementsAssignementGenericsAdapter();
      }
      @Override
      public Adapter caseExtendsAssignementGenerics(ExtendsAssignementGenerics object)
      {
        return createExtendsAssignementGenericsAdapter();
      }
      @Override
      public Adapter casePropertyCondition(PropertyCondition object)
      {
        return createPropertyConditionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseDatabaseProperty(DatabaseProperty object)
      {
        return createDatabasePropertyAdapter();
      }
      @Override
      public Adapter casePojogenProperty(PojogenProperty object)
      {
        return createPojogenPropertyAdapter();
      }
      @Override
      public Adapter caseMetaTypeAssignement(MetaTypeAssignement object)
      {
        return createMetaTypeAssignementAdapter();
      }
      @Override
      public Adapter caseMetagenProperty(MetagenProperty object)
      {
        return createMetagenPropertyAdapter();
      }
      @Override
      public Adapter caseDaogenProperty(DaogenProperty object)
      {
        return createDaogenPropertyAdapter();
      }
      @Override
      public Adapter casePojoDefinition(PojoDefinition object)
      {
        return createPojoDefinitionAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseProcedureDefinition(ProcedureDefinition object)
      {
        return createProcedureDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter casePojoType(PojoType object)
      {
        return createPojoTypeAdapter();
      }
      @Override
      public Adapter casePackageDirective(PackageDirective object)
      {
        return createPackageDirectiveAdapter();
      }
      @Override
      public Adapter casePackage(org.sqlproc.model.processorModel.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseAnnotationDirective(AnnotationDirective object)
      {
        return createAnnotationDirectiveAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationProperty(AnnotationProperty object)
      {
        return createAnnotationPropertyAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAnnotatedEntity(AnnotatedEntity object)
      {
        return createAnnotatedEntityAdapter();
      }
      @Override
      public Adapter caseAbstractPojoEntity(AbstractPojoEntity object)
      {
        return createAbstractPojoEntityAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirective(ImplementsExtendsDirective object)
      {
        return createImplementsExtendsDirectiveAdapter();
      }
      @Override
      public Adapter caseImplements(Implements object)
      {
        return createImplementsAdapter();
      }
      @Override
      public Adapter caseExtends(Extends object)
      {
        return createExtendsAdapter();
      }
      @Override
      public Adapter casePojoEntityModifier1(PojoEntityModifier1 object)
      {
        return createPojoEntityModifier1Adapter();
      }
      @Override
      public Adapter caseDirectiveProperties(DirectiveProperties object)
      {
        return createDirectivePropertiesAdapter();
      }
      @Override
      public Adapter casePojoDirective(PojoDirective object)
      {
        return createPojoDirectiveAdapter();
      }
      @Override
      public Adapter casePojoEntityModifier2(PojoEntityModifier2 object)
      {
        return createPojoEntityModifier2Adapter();
      }
      @Override
      public Adapter casePojoEntity(PojoEntity object)
      {
        return createPojoEntityAdapter();
      }
      @Override
      public Adapter casePojoAnnotatedProperty(PojoAnnotatedProperty object)
      {
        return createPojoAnnotatedPropertyAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirective(PojoPropertyDirective object)
      {
        return createPojoPropertyDirectiveAdapter();
      }
      @Override
      public Adapter casePojoProperty(PojoProperty object)
      {
        return createPojoPropertyAdapter();
      }
      @Override
      public Adapter caseEnumEntityModifier1(EnumEntityModifier1 object)
      {
        return createEnumEntityModifier1Adapter();
      }
      @Override
      public Adapter caseEnumEntityModifier2(EnumEntityModifier2 object)
      {
        return createEnumEntityModifier2Adapter();
      }
      @Override
      public Adapter caseEnumEntity(EnumEntity object)
      {
        return createEnumEntityAdapter();
      }
      @Override
      public Adapter caseEnumPropertyValue(EnumPropertyValue object)
      {
        return createEnumPropertyValueAdapter();
      }
      @Override
      public Adapter caseEnumPropertyDirective(EnumPropertyDirective object)
      {
        return createEnumPropertyDirectiveAdapter();
      }
      @Override
      public Adapter caseEnumProperty(EnumProperty object)
      {
        return createEnumPropertyAdapter();
      }
      @Override
      public Adapter caseDaoDirectiveParameters(DaoDirectiveParameters object)
      {
        return createDaoDirectiveParametersAdapter();
      }
      @Override
      public Adapter caseDescendantAssignment(DescendantAssignment object)
      {
        return createDescendantAssignmentAdapter();
      }
      @Override
      public Adapter caseFunProcType(FunProcType object)
      {
        return createFunProcTypeAdapter();
      }
      @Override
      public Adapter caseDaoDirective(DaoDirective object)
      {
        return createDaoDirectiveAdapter();
      }
      @Override
      public Adapter casePojoDaoModifier(PojoDaoModifier object)
      {
        return createPojoDaoModifierAdapter();
      }
      @Override
      public Adapter casePojoDao(PojoDao object)
      {
        return createPojoDaoAdapter();
      }
      @Override
      public Adapter casePackageDirectiveSuffix(PackageDirectiveSuffix object)
      {
        return createPackageDirectiveSuffixAdapter();
      }
      @Override
      public Adapter casePackageDirectiveImplementation(PackageDirectiveImplementation object)
      {
        return createPackageDirectiveImplementationAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveConflict(AnnotationDirectiveConflict object)
      {
        return createAnnotationDirectiveConflictAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveStatic(AnnotationDirectiveStatic object)
      {
        return createAnnotationDirectiveStaticAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveConstructor(AnnotationDirectiveConstructor object)
      {
        return createAnnotationDirectiveConstructorAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveStandard(AnnotationDirectiveStandard object)
      {
        return createAnnotationDirectiveStandardAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveSetter(AnnotationDirectiveSetter object)
      {
        return createAnnotationDirectiveSetterAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveGetter(AnnotationDirectiveGetter object)
      {
        return createAnnotationDirectiveGetterAdapter();
      }
      @Override
      public Adapter caseAnnotationDirectiveAttribute(AnnotationDirectiveAttribute object)
      {
        return createAnnotationDirectiveAttributeAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirectiveGenerics(ImplementsExtendsDirectiveGenerics object)
      {
        return createImplementsExtendsDirectiveGenericsAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirectiveOnlyPojos(ImplementsExtendsDirectiveOnlyPojos object)
      {
        return createImplementsExtendsDirectiveOnlyPojosAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirectiveOnlyDaos(ImplementsExtendsDirectiveOnlyDaos object)
      {
        return createImplementsExtendsDirectiveOnlyDaosAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirectiveExceptPojos(ImplementsExtendsDirectiveExceptPojos object)
      {
        return createImplementsExtendsDirectiveExceptPojosAdapter();
      }
      @Override
      public Adapter caseImplementsExtendsDirectiveExceptDaos(ImplementsExtendsDirectiveExceptDaos object)
      {
        return createImplementsExtendsDirectiveExceptDaosAdapter();
      }
      @Override
      public Adapter casePojoDirectiveToString(PojoDirectiveToString object)
      {
        return createPojoDirectiveToStringAdapter();
      }
      @Override
      public Adapter casePojoDirectiveIndex(PojoDirectiveIndex object)
      {
        return createPojoDirectiveIndexAdapter();
      }
      @Override
      public Adapter casePojoDirectiveOperators(PojoDirectiveOperators object)
      {
        return createPojoDirectiveOperatorsAdapter();
      }
      @Override
      public Adapter casePojoDirectiveSerializable(PojoDirectiveSerializable object)
      {
        return createPojoDirectiveSerializableAdapter();
      }
      @Override
      public Adapter casePojoDirectiveDiscriminator(PojoDirectiveDiscriminator object)
      {
        return createPojoDirectiveDiscriminatorAdapter();
      }
      @Override
      public Adapter casePojoDirectiveEquals(PojoDirectiveEquals object)
      {
        return createPojoDirectiveEqualsAdapter();
      }
      @Override
      public Adapter casePojoDirectiveHashCode(PojoDirectiveHashCode object)
      {
        return createPojoDirectiveHashCodeAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveRequired(PojoPropertyDirectiveRequired object)
      {
        return createPojoPropertyDirectiveRequiredAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectivePrimaryKey(PojoPropertyDirectivePrimaryKey object)
      {
        return createPojoPropertyDirectivePrimaryKeyAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveDiscriminator(PojoPropertyDirectiveDiscriminator object)
      {
        return createPojoPropertyDirectiveDiscriminatorAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveIndex(PojoPropertyDirectiveIndex object)
      {
        return createPojoPropertyDirectiveIndexAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveVersion(PojoPropertyDirectiveVersion object)
      {
        return createPojoPropertyDirectiveVersionAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveUpdateCol(PojoPropertyDirectiveUpdateCol object)
      {
        return createPojoPropertyDirectiveUpdateColAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveCreateCol(PojoPropertyDirectiveCreateCol object)
      {
        return createPojoPropertyDirectiveCreateColAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveToInit(PojoPropertyDirectiveToInit object)
      {
        return createPojoPropertyDirectiveToInitAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveEnumInit(PojoPropertyDirectiveEnumInit object)
      {
        return createPojoPropertyDirectiveEnumInitAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveIsDef(PojoPropertyDirectiveIsDef object)
      {
        return createPojoPropertyDirectiveIsDefAdapter();
      }
      @Override
      public Adapter casePojoPropertyDirectiveEnumDef(PojoPropertyDirectiveEnumDef object)
      {
        return createPojoPropertyDirectiveEnumDefAdapter();
      }
      @Override
      public Adapter caseEnumPropertyDirectiveValues(EnumPropertyDirectiveValues object)
      {
        return createEnumPropertyDirectiveValuesAdapter();
      }
      @Override
      public Adapter caseFunctionCallQuery(FunctionCallQuery object)
      {
        return createFunctionCallQueryAdapter();
      }
      @Override
      public Adapter caseProcedureCallQuery(ProcedureCallQuery object)
      {
        return createProcedureCallQueryAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseProcedureUpdate(ProcedureUpdate object)
      {
        return createProcedureUpdateAdapter();
      }
      @Override
      public Adapter caseFunctionQuery(FunctionQuery object)
      {
        return createFunctionQueryAdapter();
      }
      @Override
      public Adapter caseDaoDirectiveSerializable(DaoDirectiveSerializable object)
      {
        return createDaoDirectiveSerializableAdapter();
      }
      @Override
      public Adapter caseDaoDirectiveDiscriminator(DaoDirectiveDiscriminator object)
      {
        return createDaoDirectiveDiscriminatorAdapter();
      }
      @Override
      public Adapter caseDaoDirectiveCrud(DaoDirectiveCrud object)
      {
        return createDaoDirectiveCrudAdapter();
      }
      @Override
      public Adapter caseDaoDirectiveQuery(DaoDirectiveQuery object)
      {
        return createDaoDirectiveQueryAdapter();
      }
      @Override
      public Adapter caseFunProcDirective(FunProcDirective object)
      {
        return createFunProcDirectiveAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Artifacts
   * @generated
   */
  public Adapter createArtifactsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ValueType
   * @generated
   */
  public Adapter createValueTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DatabaseCatalogAssignement <em>Database Catalog Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DatabaseCatalogAssignement
   * @generated
   */
  public Adapter createDatabaseCatalogAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DatabaseSchemaAssignement <em>Database Schema Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DatabaseSchemaAssignement
   * @generated
   */
  public Adapter createDatabaseSchemaAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DatabaseTypeAssignement <em>Database Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DatabaseTypeAssignement
   * @generated
   */
  public Adapter createDatabaseTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement <em>Database Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DatabaseMetaInfoAssignement
   * @generated
   */
  public Adapter createDatabaseMetaInfoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DriverMetaInfoAssignement <em>Driver Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DriverMetaInfoAssignement
   * @generated
   */
  public Adapter createDriverMetaInfoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DriverMethodOutputAssignement <em>Driver Method Output Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DriverMethodOutputAssignement
   * @generated
   */
  public Adapter createDriverMethodOutputAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.SqlTypeAssignement <em>Sql Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.SqlTypeAssignement
   * @generated
   */
  public Adapter createSqlTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ColumnTypeAssignement <em>Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ColumnTypeAssignement
   * @generated
   */
  public Adapter createColumnTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ShowColumnTypeAssignement <em>Show Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ShowColumnTypeAssignement
   * @generated
   */
  public Adapter createShowColumnTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.TableAssignement <em>Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.TableAssignement
   * @generated
   */
  public Adapter createTableAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.JoinTableAssignement <em>Join Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.JoinTableAssignement
   * @generated
   */
  public Adapter createJoinTableAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ColumnAssignement <em>Column Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ColumnAssignement
   * @generated
   */
  public Adapter createColumnAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImportAssignement <em>Import Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImportAssignement
   * @generated
   */
  public Adapter createImportAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ExportAssignement <em>Export Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ExportAssignement
   * @generated
   */
  public Adapter createExportAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.InheritanceAssignement <em>Inheritance Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.InheritanceAssignement
   * @generated
   */
  public Adapter createInheritanceAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ManyToManyAssignement <em>Many To Many Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ManyToManyAssignement
   * @generated
   */
  public Adapter createManyToManyAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DebugLevelAssignement <em>Debug Level Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DebugLevelAssignement
   * @generated
   */
  public Adapter createDebugLevelAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ProcedurePojoAssignement <em>Procedure Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ProcedurePojoAssignement
   * @generated
   */
  public Adapter createProcedurePojoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunctionPojoAssignement <em>Function Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunctionPojoAssignement
   * @generated
   */
  public Adapter createFunctionPojoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsAssignement <em>Implements Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsAssignement
   * @generated
   */
  public Adapter createImplementsAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ExtendsAssignement <em>Extends Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ExtendsAssignement
   * @generated
   */
  public Adapter createExtendsAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsAssignementGenerics <em>Implements Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsAssignementGenerics
   * @generated
   */
  public Adapter createImplementsAssignementGenericsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ExtendsAssignementGenerics <em>Extends Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ExtendsAssignementGenerics
   * @generated
   */
  public Adapter createExtendsAssignementGenericsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PropertyCondition <em>Property Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PropertyCondition
   * @generated
   */
  public Adapter createPropertyConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DatabaseProperty <em>Database Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DatabaseProperty
   * @generated
   */
  public Adapter createDatabasePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojogenProperty <em>Pojogen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojogenProperty
   * @generated
   */
  public Adapter createPojogenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.MetaTypeAssignement <em>Meta Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.MetaTypeAssignement
   * @generated
   */
  public Adapter createMetaTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.MetagenProperty <em>Metagen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.MetagenProperty
   * @generated
   */
  public Adapter createMetagenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaogenProperty <em>Daogen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaogenProperty
   * @generated
   */
  public Adapter createDaogenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDefinition <em>Pojo Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDefinition
   * @generated
   */
  public Adapter createPojoDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ProcedureDefinition
   * @generated
   */
  public Adapter createProcedureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoType <em>Pojo Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoType
   * @generated
   */
  public Adapter createPojoTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PackageDirective <em>Package Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PackageDirective
   * @generated
   */
  public Adapter createPackageDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirective <em>Annotation Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirective
   * @generated
   */
  public Adapter createAnnotationDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationProperty
   * @generated
   */
  public Adapter createAnnotationPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotatedEntity <em>Annotated Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotatedEntity
   * @generated
   */
  public Adapter createAnnotatedEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AbstractPojoEntity <em>Abstract Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AbstractPojoEntity
   * @generated
   */
  public Adapter createAbstractPojoEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirective <em>Implements Extends Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirective
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Implements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Implements
   * @generated
   */
  public Adapter createImplementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.Extends
   * @generated
   */
  public Adapter createExtendsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoEntityModifier1 <em>Pojo Entity Modifier1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoEntityModifier1
   * @generated
   */
  public Adapter createPojoEntityModifier1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DirectiveProperties <em>Directive Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DirectiveProperties
   * @generated
   */
  public Adapter createDirectivePropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirective <em>Pojo Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirective
   * @generated
   */
  public Adapter createPojoDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoEntityModifier2 <em>Pojo Entity Modifier2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoEntityModifier2
   * @generated
   */
  public Adapter createPojoEntityModifier2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoEntity <em>Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoEntity
   * @generated
   */
  public Adapter createPojoEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoAnnotatedProperty <em>Pojo Annotated Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoAnnotatedProperty
   * @generated
   */
  public Adapter createPojoAnnotatedPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirective <em>Pojo Property Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirective
   * @generated
   */
  public Adapter createPojoPropertyDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoProperty <em>Pojo Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoProperty
   * @generated
   */
  public Adapter createPojoPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumEntityModifier1 <em>Enum Entity Modifier1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumEntityModifier1
   * @generated
   */
  public Adapter createEnumEntityModifier1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumEntityModifier2 <em>Enum Entity Modifier2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumEntityModifier2
   * @generated
   */
  public Adapter createEnumEntityModifier2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumEntity <em>Enum Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumEntity
   * @generated
   */
  public Adapter createEnumEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumPropertyValue <em>Enum Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumPropertyValue
   * @generated
   */
  public Adapter createEnumPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumPropertyDirective <em>Enum Property Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumPropertyDirective
   * @generated
   */
  public Adapter createEnumPropertyDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumProperty <em>Enum Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumProperty
   * @generated
   */
  public Adapter createEnumPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirectiveParameters <em>Dao Directive Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirectiveParameters
   * @generated
   */
  public Adapter createDaoDirectiveParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DescendantAssignment <em>Descendant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DescendantAssignment
   * @generated
   */
  public Adapter createDescendantAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunProcType <em>Fun Proc Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunProcType
   * @generated
   */
  public Adapter createFunProcTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirective <em>Dao Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirective
   * @generated
   */
  public Adapter createDaoDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDaoModifier <em>Pojo Dao Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDaoModifier
   * @generated
   */
  public Adapter createPojoDaoModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDao <em>Pojo Dao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDao
   * @generated
   */
  public Adapter createPojoDaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PackageDirectiveSuffix <em>Package Directive Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PackageDirectiveSuffix
   * @generated
   */
  public Adapter createPackageDirectiveSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PackageDirectiveImplementation <em>Package Directive Implementation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PackageDirectiveImplementation
   * @generated
   */
  public Adapter createPackageDirectiveImplementationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveConflict <em>Annotation Directive Conflict</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveConflict
   * @generated
   */
  public Adapter createAnnotationDirectiveConflictAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveStatic <em>Annotation Directive Static</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveStatic
   * @generated
   */
  public Adapter createAnnotationDirectiveStaticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveConstructor <em>Annotation Directive Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveConstructor
   * @generated
   */
  public Adapter createAnnotationDirectiveConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveStandard <em>Annotation Directive Standard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveStandard
   * @generated
   */
  public Adapter createAnnotationDirectiveStandardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveSetter <em>Annotation Directive Setter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveSetter
   * @generated
   */
  public Adapter createAnnotationDirectiveSetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveGetter <em>Annotation Directive Getter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveGetter
   * @generated
   */
  public Adapter createAnnotationDirectiveGetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.AnnotationDirectiveAttribute <em>Annotation Directive Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.AnnotationDirectiveAttribute
   * @generated
   */
  public Adapter createAnnotationDirectiveAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics <em>Implements Extends Directive Generics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveGenerics
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveGenericsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos <em>Implements Extends Directive Only Pojos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyPojos
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveOnlyPojosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos <em>Implements Extends Directive Only Daos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveOnlyDaos
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveOnlyDaosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos <em>Implements Extends Directive Except Pojos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptPojos
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveExceptPojosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos <em>Implements Extends Directive Except Daos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ImplementsExtendsDirectiveExceptDaos
   * @generated
   */
  public Adapter createImplementsExtendsDirectiveExceptDaosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveToString <em>Pojo Directive To String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveToString
   * @generated
   */
  public Adapter createPojoDirectiveToStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveIndex <em>Pojo Directive Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveIndex
   * @generated
   */
  public Adapter createPojoDirectiveIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveOperators <em>Pojo Directive Operators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveOperators
   * @generated
   */
  public Adapter createPojoDirectiveOperatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveSerializable <em>Pojo Directive Serializable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveSerializable
   * @generated
   */
  public Adapter createPojoDirectiveSerializableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveDiscriminator <em>Pojo Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveDiscriminator
   * @generated
   */
  public Adapter createPojoDirectiveDiscriminatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveEquals <em>Pojo Directive Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveEquals
   * @generated
   */
  public Adapter createPojoDirectiveEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoDirectiveHashCode <em>Pojo Directive Hash Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoDirectiveHashCode
   * @generated
   */
  public Adapter createPojoDirectiveHashCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveRequired <em>Pojo Property Directive Required</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveRequired
   * @generated
   */
  public Adapter createPojoPropertyDirectiveRequiredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectivePrimaryKey <em>Pojo Property Directive Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectivePrimaryKey
   * @generated
   */
  public Adapter createPojoPropertyDirectivePrimaryKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveDiscriminator <em>Pojo Property Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveDiscriminator
   * @generated
   */
  public Adapter createPojoPropertyDirectiveDiscriminatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveIndex <em>Pojo Property Directive Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveIndex
   * @generated
   */
  public Adapter createPojoPropertyDirectiveIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveVersion <em>Pojo Property Directive Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveVersion
   * @generated
   */
  public Adapter createPojoPropertyDirectiveVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveUpdateCol <em>Pojo Property Directive Update Col</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveUpdateCol
   * @generated
   */
  public Adapter createPojoPropertyDirectiveUpdateColAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveCreateCol <em>Pojo Property Directive Create Col</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveCreateCol
   * @generated
   */
  public Adapter createPojoPropertyDirectiveCreateColAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveToInit <em>Pojo Property Directive To Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveToInit
   * @generated
   */
  public Adapter createPojoPropertyDirectiveToInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumInit <em>Pojo Property Directive Enum Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumInit
   * @generated
   */
  public Adapter createPojoPropertyDirectiveEnumInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveIsDef <em>Pojo Property Directive Is Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveIsDef
   * @generated
   */
  public Adapter createPojoPropertyDirectiveIsDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumDef <em>Pojo Property Directive Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.PojoPropertyDirectiveEnumDef
   * @generated
   */
  public Adapter createPojoPropertyDirectiveEnumDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.EnumPropertyDirectiveValues <em>Enum Property Directive Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.EnumPropertyDirectiveValues
   * @generated
   */
  public Adapter createEnumPropertyDirectiveValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunctionCallQuery <em>Function Call Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunctionCallQuery
   * @generated
   */
  public Adapter createFunctionCallQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ProcedureCallQuery <em>Procedure Call Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ProcedureCallQuery
   * @generated
   */
  public Adapter createProcedureCallQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.ProcedureUpdate <em>Procedure Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.ProcedureUpdate
   * @generated
   */
  public Adapter createProcedureUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunctionQuery <em>Function Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunctionQuery
   * @generated
   */
  public Adapter createFunctionQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirectiveSerializable <em>Dao Directive Serializable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirectiveSerializable
   * @generated
   */
  public Adapter createDaoDirectiveSerializableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirectiveDiscriminator <em>Dao Directive Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirectiveDiscriminator
   * @generated
   */
  public Adapter createDaoDirectiveDiscriminatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirectiveCrud <em>Dao Directive Crud</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirectiveCrud
   * @generated
   */
  public Adapter createDaoDirectiveCrudAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.DaoDirectiveQuery <em>Dao Directive Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.DaoDirectiveQuery
   * @generated
   */
  public Adapter createDaoDirectiveQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.model.processorModel.FunProcDirective <em>Fun Proc Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.model.processorModel.FunProcDirective
   * @generated
   */
  public Adapter createFunProcDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProcessorModelAdapterFactory
