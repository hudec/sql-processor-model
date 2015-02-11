package org.sqlproc.model.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.sqlproc.model.jvmmodel.ProcessorGeneratorUtils;
import org.sqlproc.model.jvmmodel.ProcessorTypesBuilder;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.DaoDirective;
import org.sqlproc.model.processorModel.DaoDirectiveCrud;
import org.sqlproc.model.processorModel.DaoDirectiveQuery;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoEntity;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class DaoJvmModelInferrer extends AbstractModelInferrer {
  @Extension
  public JvmAnnotationReferenceBuilder _annotationTypesBuilder;
  
  @Extension
  public JvmTypeReferenceBuilder _typeReferenceBuilder;
  
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private ProcessorTypesBuilder _processorTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private ProcessorGeneratorUtils _processorGeneratorUtils;
  
  private final String SERIALIZABLE = "java.io.Serializable";
  
  private final String ENGINE_FACTORY = "org.sqlproc.engine.SqlEngineFactory";
  
  private final String SESSION_FACTORY = "org.sqlproc.engine.SqlSessionFactory";
  
  private final String SQL_SESSION = "org.sqlproc.engine.SqlSession";
  
  private final String SQL_CONTROL = "org.sqlproc.engine.SqlControl";
  
  private final String LOGGER = "org.slf4j.Logger";
  
  private final String LOGGER_FACTORY = "org.slf4j.LoggerFactory";
  
  private final String CRUD_ENGINE = "org.sqlproc.engine.SqlCrudEngine";
  
  private final String QUERY_ENGINE = "org.sqlproc.engine.SqlQueryEngine";
  
  private final String PROCEDURE_ENGINE = "org.sqlproc.engine.SqlProcedureEngine";
  
  private final String MAP = "java.util.Map";
  
  private final String HASH_MAP = "java.util.HashMap";
  
  private final String LIST = "java.util.List";
  
  private final String SQL_STANDARD_CONTROL = "org.sqlproc.engine.impl.SqlStandardControl";
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  public void inferDao(final DaoEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final PojoEntity pojo = this._processorGeneratorUtils.getPojo(entity);
    boolean _equals = Objects.equal(pojo, null);
    if (_equals) {
      InputOutput.<String>println(("Missing POJO for " + entity));
      return;
    }
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    final JvmGenericType entityType = this._processorTypesBuilder.toClass(entity, _fullyQualifiedName);
    String _fullyQualifiedName_1 = this._processorGeneratorUtils.getFullyQualifiedName(pojo);
    final JvmGenericType pojoType = this._processorTypesBuilder.toClass(pojo, _fullyQualifiedName_1);
    final String simpleName = entity.getName();
    final Integer sernum = this._processorGeneratorUtils.getSernum(entity);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = DaoJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        DaoJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        List<Annotation> _standardAnnotations = DaoJvmModelInferrer.this._processorGeneratorUtils.standardAnnotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_standardAnnotations, _function);
        for (final XAnnotation an : _map) {
          JvmType _annotationType = an.getAnnotationType();
          String _identifier = _annotationType.getIdentifier();
          boolean _equals = Objects.equal(_identifier, DaoJvmModelInferrer.this.SERIALIZABLE);
          if (_equals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmType _annotationType_1 = an.getAnnotationType();
            JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(_annotationType_1);
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          } else {
            DaoJvmModelInferrer.this._processorTypesBuilder.addAnnotation(it, an);
          }
        }
        List<Implements> _implements = DaoJvmModelInferrer.this._processorGeneratorUtils.getImplements(entity);
        for (final Implements impl : _implements) {
          boolean _isGenerics = DaoJvmModelInferrer.this._processorGeneratorUtils.isGenerics(impl);
          if (_isGenerics) {
            JvmParameterizedTypeReference _implements_1 = impl.getImplements();
            JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
            final JvmTypeReference genericType = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(it, _implements_1, _typeRef_1);
            InputOutput.<JvmTypeReference>println(genericType);
            EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, genericType);
          } else {
            EList<JvmTypeReference> _superTypes_2 = it.getSuperTypes();
            JvmParameterizedTypeReference _implements_2 = impl.getImplements();
            JvmTypeReference _cloneWithProxies = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_implements_2);
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_2, _cloneWithProxies);
          }
        }
        final Extends ext = DaoJvmModelInferrer.this._processorGeneratorUtils.getExtends(entity);
        boolean _notEquals = (!Objects.equal(ext, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes_3 = it.getSuperTypes();
          JvmParameterizedTypeReference _extends = ext.getExtends();
          JvmTypeReference _cloneWithProxies_1 = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_extends);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_3, _cloneWithProxies_1);
        }
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals_1 = (!Objects.equal(_superType, null));
        if (_notEquals_1) {
          EList<JvmTypeReference> _superTypes_4 = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies_2 = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_superType_1);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_4, _cloneWithProxies_2);
        }
        boolean _notEquals_2 = (!Objects.equal(sernum, null));
        if (_notEquals_2) {
          EList<JvmTypeReference> _superTypes_5 = it.getSuperTypes();
          JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SERIALIZABLE);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_5, _typeRef_2);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _typeRef_3 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
          final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              it.setFinal(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append(sernum, "");
                  _builder.append("L");
                }
              };
              DaoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field = DaoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "serialVersionUID", _typeRef_3, _function_1);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeRef_4 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.LOGGER);
        final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setVisibility(JvmVisibility.PROTECTED);
            it.setFinal(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(DaoJvmModelInferrer.this.LOGGER_FACTORY, "");
                _builder.append(".getLogger(getClass())");
              }
            };
            DaoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "logger", _typeRef_4, _function_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        final Procedure1<JvmConstructor> _function_3 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            List<Annotation> _constructorAnnotations = DaoJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            DaoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
          }
        };
        JvmConstructor _constructor = DaoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_3);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function_4 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.ENGINE_FACTORY);
            JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlEngineFactory", _typeRef);
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            List<Annotation> _constructorAnnotations = DaoJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            DaoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.sqlEngineFactory = sqlEngineFactory;");
                _builder.newLine();
              }
            };
            DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_4);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor_1);
        EList<JvmMember> _members_4 = it.getMembers();
        final Procedure1<JvmConstructor> _function_5 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.ENGINE_FACTORY);
            JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlEngineFactory", _typeRef);
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SESSION_FACTORY);
            JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSessionFactory", _typeRef_1);
            DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            List<Annotation> _constructorAnnotations = DaoJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            DaoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.sqlEngineFactory = sqlEngineFactory;");
                _builder.newLine();
                _builder.append("this.sqlSessionFactory = sqlSessionFactory;");
                _builder.newLine();
              }
            };
            DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_5);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_4, _constructor_2);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeRef_5 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.ENGINE_FACTORY);
        final Procedure1<JvmField> _function_6 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setVisibility(JvmVisibility.PROTECTED);
          }
        };
        JvmField _field_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "sqlEngineFactory", _typeRef_5, _function_6);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_5, _field_2);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeRef_6 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SESSION_FACTORY);
        final Procedure1<JvmField> _function_7 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setVisibility(JvmVisibility.PROTECTED);
          }
        };
        JvmField _field_3 = DaoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "sqlSessionFactory", _typeRef_6, _function_7);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_6, _field_3);
        Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses = null;
        EList<DaoDirective> _directives = entity.getDirectives();
        for (final DaoDirective dir : _directives) {
          if ((dir instanceof DaoDirectiveCrud)) {
            boolean _equals_1 = Objects.equal(moreResultClasses, null);
            if (_equals_1) {
              Map<String, Map<String, JvmParameterizedTypeReference>> _moreResultClasses = DaoJvmModelInferrer.this._processorGeneratorUtils.getMoreResultClasses(entity);
              moreResultClasses = _moreResultClasses;
            }
            EList<JvmMember> _members_7 = it.getMembers();
            DaoJvmModelInferrer.this.inferInsert(entity, ((DaoDirectiveCrud) dir), entityType, simpleName, pojo, pojoType, _members_7);
            EList<JvmMember> _members_8 = it.getMembers();
            DaoJvmModelInferrer.this.inferGet(entity, ((DaoDirectiveCrud) dir), entityType, simpleName, pojo, pojoType, _members_8, moreResultClasses);
            EList<JvmMember> _members_9 = it.getMembers();
            DaoJvmModelInferrer.this.inferUpdate(entity, ((DaoDirectiveCrud) dir), entityType, simpleName, pojo, pojoType, _members_9);
            EList<JvmMember> _members_10 = it.getMembers();
            DaoJvmModelInferrer.this.inferDelete(entity, ((DaoDirectiveCrud) dir), entityType, simpleName, pojo, pojoType, _members_10);
          } else {
            if ((dir instanceof DaoDirectiveQuery)) {
              boolean _equals_2 = Objects.equal(moreResultClasses, null);
              if (_equals_2) {
                Map<String, Map<String, JvmParameterizedTypeReference>> _moreResultClasses_1 = DaoJvmModelInferrer.this._processorGeneratorUtils.getMoreResultClasses(entity);
                moreResultClasses = _moreResultClasses_1;
              }
              EList<JvmMember> _members_11 = it.getMembers();
              DaoJvmModelInferrer.this.inferList(entity, ((DaoDirectiveQuery) dir), entityType, simpleName, pojo, pojoType, _members_11, moreResultClasses);
              EList<JvmMember> _members_12 = it.getMembers();
              DaoJvmModelInferrer.this.inferCount(entity, ((DaoDirectiveQuery) dir), entityType, simpleName, pojo, pojoType, _members_12, moreResultClasses);
            }
          }
        }
        boolean _and = false;
        boolean _notEquals_3 = (!Objects.equal(moreResultClasses, null));
        if (!_notEquals_3) {
          _and = false;
        } else {
          boolean _isEmpty = moreResultClasses.isEmpty();
          boolean _not = (!_isEmpty);
          _and = _not;
        }
        if (_and) {
          EList<JvmMember> _members_13 = it.getMembers();
          DaoJvmModelInferrer.this.inferMoreResultClasses(entity, entityType, simpleName, pojo, pojoType, _members_13, moreResultClasses);
        }
      }
    };
    acceptor.<JvmGenericType>accept(entityType, _function);
  }
  
  public void inferInsert(final DaoEntity entity, final DaoDirectiveCrud dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    final PojoEntity parent = this._processorGeneratorUtils.getParent(pojo);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql insert ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(": \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
            _builder.append(" sqlInsert");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"INSERT_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            {
              boolean _notEquals = (!Objects.equal(parent, null));
              if (_notEquals) {
                _builder.newLineIfNotEmpty();
                _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
                _builder.append(" sqlInsert");
                String _name_2 = parent.getName();
                _builder.append(_name_2, "");
                _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"INSERT_");
                String _name_3 = parent.getName();
                String _dbName_1 = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_3);
                _builder.append(_dbName_1, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                _builder.append("int count = sqlInsert");
                String _name_4 = parent.getName();
                _builder.append(_name_4, "");
                _builder.append(".insert(sqlSession, ");
                _builder.append(pojoAttrName, "");
                _builder.append(", sqlControl);");
                _builder.newLineIfNotEmpty();
                _builder.append("if (count > 0) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("sqlInsert");
                String _name_5 = pojo.getName();
                _builder.append(_name_5, "\t");
                _builder.append(".insert(sqlSession, ");
                _builder.append(pojoAttrName, "\t");
                _builder.append(", sqlControl);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
              } else {
                _builder.newLineIfNotEmpty();
                _builder.append("int count = sqlInsert");
                String _name_6 = pojo.getName();
                _builder.append(_name_6, "");
                _builder.append(".insert(sqlSession, ");
                _builder.append(pojoAttrName, "");
                _builder.append(", sqlControl);");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql insert ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" result: \" + count + \" \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return (count > 0) ? ");
            _builder.append(pojoAttrName, "");
            _builder.append(" : null;");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "insert", _typeRef, _function);
    members.add(_method);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return insert(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "insert", _typeRef_1, _function_1);
    members.add(_method_1);
    JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return insert(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "insert", _typeRef_2, _function_2);
    members.add(_method_2);
    JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return insert(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "insert", _typeRef_3, _function_3);
    members.add(_method_3);
  }
  
  public void inferGet(final DaoEntity entity, final DaoDirectiveCrud dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members, final Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql get: \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
            _builder.append(" sqlGetEngine");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"GET_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            {
              boolean _isEmpty = moreResultClasses.isEmpty();
              if (_isEmpty) {
                _builder.append("//");
              }
            }
            _builder.append("sqlControl = getMoreResultClasses(");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            String _name_2 = pojo.getName();
            _builder.append(_name_2, "");
            _builder.append(" ");
            _builder.append(pojoAttrName, "");
            _builder.append("Got = sqlGetEngine");
            String _name_3 = pojo.getName();
            _builder.append(_name_3, "");
            _builder.append(".get(sqlSession, ");
            String _name_4 = pojo.getName();
            _builder.append(_name_4, "");
            _builder.append(".class, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql get ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" result: \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append("Got);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return ");
            _builder.append(pojoAttrName, "");
            _builder.append("Got;");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "get", _typeRef, _function);
    members.add(_method);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return get(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "get", _typeRef_1, _function_1);
    members.add(_method_1);
    JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return get(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "get", _typeRef_2, _function_2);
    members.add(_method_2);
    JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(pojoType);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return get(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "get", _typeRef_3, _function_3);
    members.add(_method_3);
  }
  
  public void inferUpdate(final DaoEntity entity, final DaoDirectiveCrud dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    final PojoEntity parent = this._processorGeneratorUtils.getParent(pojo);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql update ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(": \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
            _builder.append(" sqlUpdateEngine");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"UPDATE_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            {
              boolean _notEquals = (!Objects.equal(parent, null));
              if (_notEquals) {
                _builder.newLineIfNotEmpty();
                _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
                _builder.append(" sqlUpdate");
                String _name_2 = parent.getName();
                _builder.append(_name_2, "");
                _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"UPDATE_");
                String _name_3 = parent.getName();
                String _dbName_1 = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_3);
                _builder.append(_dbName_1, "");
                _builder.append("\");");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("int count = sqlUpdateEngine");
            String _name_4 = pojo.getName();
            _builder.append(_name_4, "");
            _builder.append(".update(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            {
              boolean _notEquals_1 = (!Objects.equal(parent, null));
              if (_notEquals_1) {
                _builder.newLineIfNotEmpty();
                _builder.append("if (count > 0) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("sqlUpdate");
                String _name_5 = parent.getName();
                _builder.append(_name_5, "\t");
                _builder.append(".update(sqlSession, ");
                _builder.append(pojoAttrName, "\t");
                _builder.append(", sqlControl);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
              }
            }
            final PojoAttribute f = DaoJvmModelInferrer.this._processorGeneratorUtils.getOptLock(pojo);
            {
              boolean _notEquals_2 = (!Objects.equal(f, null));
              if (_notEquals_2) {
                _builder.newLineIfNotEmpty();
                _builder.append("if (count > 0) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(pojoAttrName, "\t");
                _builder.append(".set");
                String _name_6 = f.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_6);
                _builder.append(_firstUpper, "\t");
                _builder.append("(");
                _builder.append(pojoAttrName, "\t");
                _builder.append(".get");
                String _name_7 = f.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_7);
                _builder.append(_firstUpper_1, "\t");
                _builder.append("() + 1);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql update ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" result count: \" + count);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return count;");
            _builder.newLine();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "update", _typeRef, _function);
    members.add(_method);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return update(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "update", _typeRef_1, _function_1);
    members.add(_method_1);
    JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return update(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "update", _typeRef_2, _function_2);
    members.add(_method_2);
    JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return update(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "update", _typeRef_3, _function_3);
    members.add(_method_3);
  }
  
  public void inferDelete(final DaoEntity entity, final DaoDirectiveCrud dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    final PojoEntity parent = this._processorGeneratorUtils.getParent(pojo);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql delete ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(": \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
            _builder.append(" sqlDeleteEngine");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"DELETE_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            {
              boolean _notEquals = (!Objects.equal(parent, null));
              if (_notEquals) {
                _builder.newLineIfNotEmpty();
                _builder.append(DaoJvmModelInferrer.this.CRUD_ENGINE, "");
                _builder.append(" sqlDelete");
                String _name_2 = parent.getName();
                _builder.append(_name_2, "");
                _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"DELETE_");
                String _name_3 = parent.getName();
                String _dbName_1 = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_3);
                _builder.append(_dbName_1, "");
                _builder.append("\");");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("int count = sqlDeleteEngine");
            String _name_4 = pojo.getName();
            _builder.append(_name_4, "");
            _builder.append(".delete(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            {
              boolean _notEquals_1 = (!Objects.equal(parent, null));
              if (_notEquals_1) {
                _builder.newLineIfNotEmpty();
                _builder.append("if (count > 0) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("sqlDelete");
                String _name_5 = parent.getName();
                _builder.append(_name_5, "\t");
                _builder.append(".delete(sqlSession, ");
                _builder.append(pojoAttrName, "\t");
                _builder.append(", sqlControl);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
              }
            }
            final PojoAttribute f = DaoJvmModelInferrer.this._processorGeneratorUtils.getOptLock(pojo);
            {
              boolean _notEquals_2 = (!Objects.equal(f, null));
              if (_notEquals_2) {
                _builder.newLineIfNotEmpty();
                _builder.append("if (count > 0) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append(pojoAttrName, "\t");
                _builder.append(".set");
                String _name_6 = f.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_6);
                _builder.append(_firstUpper, "\t");
                _builder.append("(");
                _builder.append(pojoAttrName, "\t");
                _builder.append(".get");
                String _name_7 = f.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_7);
                _builder.append(_firstUpper_1, "\t");
                _builder.append("() + 1);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql delete ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" result count: \" + count);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return count;");
            _builder.newLine();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "delete", _typeRef, _function);
    members.add(_method);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return delete(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "delete", _typeRef_1, _function_1);
    members.add(_method_1);
    JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return delete(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "delete", _typeRef_2, _function_2);
    members.add(_method_2);
    JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return delete(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "delete", _typeRef_3, _function_3);
    members.add(_method_3);
  }
  
  public void inferList(final DaoEntity entity, final DaoDirectiveQuery dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members, final Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(pojoType);
    final JvmTypeReference listType = this._typeReferenceBuilder.typeRef(List.class, _typeRef);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql list ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(": \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.QUERY_ENGINE, "");
            _builder.append(" sqlEngine");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedQueryEngine(\"SELECT_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            {
              boolean _isEmpty = moreResultClasses.isEmpty();
              if (_isEmpty) {
                _builder.append("//");
              }
            }
            _builder.append("sqlControl = getMoreResultClasses(");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("List<");
            String _name_2 = pojo.getName();
            _builder.append(_name_2, "");
            _builder.append("> ");
            _builder.append(pojoAttrName, "");
            _builder.append("List = sqlEngine");
            String _name_3 = pojo.getName();
            _builder.append(_name_3, "");
            _builder.append(".query(sqlSession, ");
            String _name_4 = pojo.getName();
            _builder.append(_name_4, "");
            _builder.append(".class, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"sql list ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" size: \" + ((");
            _builder.append(pojoAttrName, "\t");
            _builder.append("List != null) ? ");
            _builder.append(pojoAttrName, "\t");
            _builder.append("List.size() : \"null\"));");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return ");
            _builder.append(pojoAttrName, "");
            _builder.append("List;");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "list", listType, _function);
    members.add(_method);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return list(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "list", listType, _function_1);
    members.add(_method_1);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return list(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "list", listType, _function_2);
    members.add(_method_2);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return list(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "list", listType, _function_3);
    members.add(_method_3);
  }
  
  public void inferCount(final DaoEntity entity, final DaoDirectiveQuery dir, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members, final Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        EList<JvmFormalParameter> _parameters_2 = it.getParameters();
        JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_2 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"count ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(": \" + ");
            _builder.append(pojoAttrName, "\t");
            _builder.append(" + \" \" + sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(DaoJvmModelInferrer.this.QUERY_ENGINE, "");
            _builder.append(" sqlEngine");
            String _name = pojo.getName();
            _builder.append(_name, "");
            _builder.append(" = sqlEngineFactory.getCheckedQueryEngine(\"SELECT_");
            String _name_1 = pojo.getName();
            String _dbName = DaoJvmModelInferrer.this._processorGeneratorUtils.dbName(_name_1);
            _builder.append(_dbName, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            {
              boolean _isEmpty = moreResultClasses.isEmpty();
              if (_isEmpty) {
                _builder.append("//");
              }
            }
            _builder.append("sqlControl = getMoreResultClasses(");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("int count = sqlEngine");
            String _name_2 = pojo.getName();
            _builder.append(_name_2, "");
            _builder.append(".queryCount(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("if (logger.isTraceEnabled()) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("logger.trace(\"count: \" + count);");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return count;");
            _builder.newLine();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "count", _typeRef, _function);
    members.add(_method);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return count(sqlSessionFactory.getSqlSession(), ");
            _builder.append(pojoAttrName, "");
            _builder.append(", sqlControl);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_1 = this._processorTypesBuilder.toMethod(entity, "count", _typeRef_1, _function_1);
    members.add(_method_1);
    JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_SESSION);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlSession", _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return count(sqlSession, ");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_2 = this._processorTypesBuilder.toMethod(entity, "count", _typeRef_2, _function_2);
    members.add(_method_2);
    JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(int.class);
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return count(");
            _builder.append(pojoAttrName, "");
            _builder.append(", null);");
            _builder.newLineIfNotEmpty();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method_3 = this._processorTypesBuilder.toMethod(entity, "count", _typeRef_3, _function_3);
    members.add(_method_3);
  }
  
  public void inferMoreResultClasses(final DaoEntity entity, final JvmGenericType entityType, final String simpleName, final PojoEntity pojo, final JvmGenericType pojoType, final List<JvmMember> members, final Map<String, Map<String, JvmParameterizedTypeReference>> moreResultClasses) {
    String _name = pojo.getName();
    final String pojoAttrName = StringExtensions.toFirstLower(_name);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(this.SQL_CONTROL);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(pojoType);
        JvmFormalParameter _parameter = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, pojoAttrName, _typeRef);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(DaoJvmModelInferrer.this.SQL_CONTROL);
        JvmFormalParameter _parameter_1 = DaoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "sqlControl", _typeRef_1);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("\t");
            _builder.append("if (sqlControl != null && sqlControl.getMoreResultClasses() != null)");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("return sqlControl;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append(DaoJvmModelInferrer.this.MAP, "\t");
            _builder.append("<String, Class<?>> moreResultClasses = null;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            {
              Set<Map.Entry<String, Map<String, JvmParameterizedTypeReference>>> _entrySet = moreResultClasses.entrySet();
              boolean _hasElements = false;
              for(final Map.Entry<String, Map<String, JvmParameterizedTypeReference>> f : _entrySet) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate("\n\t", "\t");
                }
                _builder.append("\t\tif (");
                _builder.append(pojoAttrName, "\t");
                _builder.append(" != null && ");
                _builder.append(pojoAttrName, "\t");
                _builder.append(".toInit(");
                String _name = pojo.getName();
                _builder.append(_name, "\t");
                _builder.append(".Association.");
                String _key = f.getKey();
                _builder.append(_key, "\t");
                _builder.append(".name())) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (moreResultClasses == null)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("moreResultClasses = new HashMap<String, Class<?>>();");
                _builder.newLine();
                _builder.append("\t\t\t");
                {
                  Map<String, JvmParameterizedTypeReference> _value = f.getValue();
                  Set<Map.Entry<String, JvmParameterizedTypeReference>> _entrySet_1 = _value.entrySet();
                  boolean _hasElements_1 = false;
                  for(final Map.Entry<String, JvmParameterizedTypeReference> a : _entrySet_1) {
                    if (!_hasElements_1) {
                      _hasElements_1 = true;
                    } else {
                      _builder.appendImmediate("\n\t", "\t\t\t");
                    }
                    _builder.append("\t\tmoreResultClasses.put(\"");
                    String _key_1 = a.getKey();
                    _builder.append(_key_1, "\t\t\t");
                    _builder.append("\", ");
                    JvmParameterizedTypeReference _value_1 = a.getValue();
                    QualifiedName _fullyQualifiedName = DaoJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(_value_1);
                    _builder.append(_fullyQualifiedName, "\t\t\t");
                    _builder.append(".class);");
                  }
                }
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("if (moreResultClasses != null) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("sqlControl = new ");
            _builder.append(DaoJvmModelInferrer.this.SQL_STANDARD_CONTROL, "\t");
            _builder.append("(sqlControl);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("((");
            _builder.append(DaoJvmModelInferrer.this.SQL_STANDARD_CONTROL, "\t");
            _builder.append(") sqlControl).setMoreResultClasses(moreResultClasses);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("return sqlControl;");
            _builder.newLine();
          }
        };
        DaoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
      }
    };
    JvmOperation _method = this._processorTypesBuilder.toMethod(entity, "getMoreResultClasses", _typeRef, _function);
    members.add(_method);
  }
}
