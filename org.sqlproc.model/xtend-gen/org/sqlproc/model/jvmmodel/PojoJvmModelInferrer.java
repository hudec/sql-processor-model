package org.sqlproc.model.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
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
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.sqlproc.model.jvmmodel.ProcessorGeneratorUtils;
import org.sqlproc.model.jvmmodel.ProcessorTypesBuilder;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.Implements;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.PojoProcedure;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class PojoJvmModelInferrer {
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
  
  private final String HASH_MAP = "java.util.HashMap";
  
  private final String HASH_SET = "java.util.HashSet";
  
  private final String METHOD_UTILS = "org.apache.commons.beanutils.MethodUtils";
  
  private final String INVOCATION_TARGET_EXCEPTION = "java.lang.reflect.InvocationTargetException";
  
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
  public void inferPojo(final PojoEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _fullyQualifiedName = this._processorGeneratorUtils.getFullyQualifiedName(entity);
    final JvmGenericType entityType = this._processorTypesBuilder.toClass(entity, _fullyQualifiedName);
    final String simpleName = entity.getName();
    final Integer sernum = this._processorGeneratorUtils.getSernum(entity);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = PojoJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        PojoJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        boolean _isAbstract = entity.isAbstract();
        if (_isAbstract) {
          it.setAbstract(true);
        }
        List<Annotation> _standardAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.standardAnnotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_standardAnnotations, _function);
        for (final XAnnotation an : _map) {
          JvmType _annotationType = an.getAnnotationType();
          String _identifier = _annotationType.getIdentifier();
          boolean _equals = Objects.equal(_identifier, PojoJvmModelInferrer.this.SERIALIZABLE);
          if (_equals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmType _annotationType_1 = an.getAnnotationType();
            JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(_annotationType_1);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          } else {
            PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotation(it, an);
          }
        }
        List<Implements> _implements = PojoJvmModelInferrer.this._processorGeneratorUtils.getImplements(entity);
        for (final Implements impl : _implements) {
          EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
          JvmParameterizedTypeReference _implements_1 = impl.getImplements();
          JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_implements_1);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _cloneWithProxies);
        }
        final Extends ext = PojoJvmModelInferrer.this._processorGeneratorUtils.getExtends(entity);
        boolean _notEquals = (!Objects.equal(ext, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes_2 = it.getSuperTypes();
          JvmParameterizedTypeReference _extends = ext.getExtends();
          JvmTypeReference _cloneWithProxies_1 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_extends);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_2, _cloneWithProxies_1);
        }
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals_1 = (!Objects.equal(_superType, null));
        if (_notEquals_1) {
          EList<JvmTypeReference> _superTypes_3 = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies_2 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_superType_1);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_3, _cloneWithProxies_2);
        }
        boolean _notEquals_2 = (!Objects.equal(sernum, null));
        if (_notEquals_2) {
          EList<JvmTypeReference> _superTypes_4 = it.getSuperTypes();
          JvmTypeReference _typeRef_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(PojoJvmModelInferrer.this.SERIALIZABLE);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_4, _typeRef_1);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _typeRef_2 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
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
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "serialVersionUID", _typeRef_2, _function_1);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        EList<PojoAttribute> _attributes = entity.getAttributes();
        final Function1<PojoAttribute, Boolean> _function_2 = new Function1<PojoAttribute, Boolean>() {
          public Boolean apply(final PojoAttribute x) {
            Integer _index = PojoJvmModelInferrer.this._processorGeneratorUtils.getIndex(x);
            return Boolean.valueOf((!Objects.equal(_index, null)));
          }
        };
        Iterable<PojoAttribute> _filter = IterableExtensions.<PojoAttribute>filter(_attributes, _function_2);
        for (final PojoAttribute attr : _filter) {
          EList<JvmMember> _members_1 = it.getMembers();
          String _constName = PojoJvmModelInferrer.this._processorGeneratorUtils.constName(attr);
          String _plus = ("ORDER_BY_" + _constName);
          JvmTypeReference _typeRef_3 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              it.setFinal(true);
              it.setVisibility(JvmVisibility.PUBLIC);
              List<Annotation> _staticAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.staticAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_staticAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  Integer _index = PojoJvmModelInferrer.this._processorGeneratorUtils.getIndex(attr);
                  _builder.append(_index, "");
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus, _typeRef_3, _function_3);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        }
        Map<Integer, List<PojoAttribute>> _index = PojoJvmModelInferrer.this._processorGeneratorUtils.getIndex(entity);
        Set<Map.Entry<Integer, List<PojoAttribute>>> _entrySet = _index.entrySet();
        for (final Map.Entry<Integer, List<PojoAttribute>> entry : _entrySet) {
          EList<JvmMember> _members_2 = it.getMembers();
          List<PojoAttribute> _value = entry.getValue();
          String _constName_1 = PojoJvmModelInferrer.this._processorGeneratorUtils.constName(_value);
          String _plus_1 = ("ORDER_BY_" + _constName_1);
          JvmTypeReference _typeRef_4 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmField> _function_4 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              it.setFinal(true);
              it.setVisibility(JvmVisibility.PUBLIC);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  Integer _key = entry.getKey();
                  _builder.append(_key, "");
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
              List<Annotation> _staticAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.staticAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_staticAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
            }
          };
          JvmField _field_2 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus_1, _typeRef_4, _function_4);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        }
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function_5 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            List<Annotation> _constructorAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
          }
        };
        JvmConstructor _constructor = PojoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_5);
        PojoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        final List<PojoAttribute> requiredAttributes = PojoJvmModelInferrer.this._processorGeneratorUtils.requiredAttributes(entity);
        boolean _isEmpty = requiredAttributes.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          EList<JvmMember> _members_4 = it.getMembers();
          final Procedure1<JvmConstructor> _function_6 = new Procedure1<JvmConstructor>() {
            public void apply(final JvmConstructor it) {
              for (final PojoAttribute attr : requiredAttributes) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                String _name = attr.getName();
                JvmTypeReference _type = attr.getType();
                JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, _name, _type);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              }
              List<Annotation> _constructorAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  {
                    for(final PojoAttribute attr : requiredAttributes) {
                      _builder.newLineIfNotEmpty();
                      _builder.append("this.");
                      String _name = attr.getName();
                      _builder.append(_name, "");
                      _builder.append(" = ");
                      String _name_1 = attr.getName();
                      _builder.append(_name_1, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t\t\t");
                    }
                  }
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmConstructor _constructor_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_6);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_4, _constructor_1);
        }
        EList<PojoAttribute> _attributes_1 = entity.getAttributes();
        for (final PojoAttribute attr_1 : _attributes_1) {
          {
            JvmTypeReference _elvis = null;
            JvmTypeReference _elvis_1 = null;
            JvmTypeReference _type = attr_1.getType();
            if (_type != null) {
              _elvis_1 = _type;
            } else {
              XExpression _initExpr = attr_1.getInitExpr();
              JvmTypeReference _inferredType = null;
              if (_initExpr!=null) {
                _inferredType=PojoJvmModelInferrer.this._processorTypesBuilder.inferredType(_initExpr);
              }
              _elvis_1 = _inferredType;
            }
            if (_elvis_1 != null) {
              _elvis = _elvis_1;
            } else {
              JvmTypeReference _typeRef_5 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef_5;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members_5 = it.getMembers();
            String _name = attr_1.getName();
            final Procedure1<JvmField> _function_7 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                String _documentation = PojoJvmModelInferrer.this._processorTypesBuilder.getDocumentation(attr_1);
                PojoJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
                List<Annotation> _attributeAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.attributeAnnotations(attr_1);
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_attributeAnnotations, _function);
                PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
                boolean _isStatic = attr_1.isStatic();
                it.setStatic(_isStatic);
                boolean _isFinal = attr_1.isFinal();
                it.setFinal(_isFinal);
                boolean _isStatic_1 = attr_1.isStatic();
                if (_isStatic_1) {
                  it.setVisibility(JvmVisibility.PUBLIC);
                }
                XExpression _initExpr = attr_1.getInitExpr();
                boolean _notEquals = (!Objects.equal(_initExpr, null));
                if (_notEquals) {
                  XExpression _initExpr_1 = attr_1.getInitExpr();
                  PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _initExpr_1);
                } else {
                  boolean _isList = PojoJvmModelInferrer.this._processorGeneratorUtils.isList(attr_1);
                  if (_isList) {
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        _builder.append("new java.util.Array");
                        String _simpleName = type.getSimpleName();
                        _builder.append(_simpleName, "");
                        _builder.append("()");
                      }
                    };
                    PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
                  } else {
                    boolean _isOptLock = PojoJvmModelInferrer.this._processorGeneratorUtils.isOptLock(attr_1);
                    if (_isOptLock) {
                      StringConcatenationClient _client_1 = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("0");
                        }
                      };
                      PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client_1);
                    }
                  }
                }
              }
            };
            JvmField _field_3 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, _name, type, _function_7);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_5, _field_3);
            boolean _isStatic = attr_1.isStatic();
            boolean _not_1 = (!_isStatic);
            if (_not_1) {
              EList<JvmMember> _members_6 = it.getMembers();
              String _name_1 = attr_1.getName();
              String _name_2 = attr_1.getName();
              final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  List<Annotation> _terAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.getterAnnotations(attr_1);
                  final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                    public XAnnotation apply(final Annotation a) {
                      return a.getAnnotation();
                    }
                  };
                  List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_terAnnotations, _function);
                  PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
                }
              };
              JvmOperation _getter = PojoJvmModelInferrer.this._processorTypesBuilder.toGetter(attr_1, _name_1, _name_2, type, _function_8);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_6, _getter);
              EList<JvmMember> _members_7 = it.getMembers();
              String _name_3 = attr_1.getName();
              String _name_4 = attr_1.getName();
              JvmTypeReference _typeRef_6 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
              PojoAttribute _updateColumn1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn1(attr_1);
              PojoAttribute _updateColumn2 = PojoJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn2(attr_1);
              PojoAttribute _createColumn1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
              PojoAttribute _createColumn2 = PojoJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn2(attr_1);
              final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  List<Annotation> _setterAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.setterAnnotations(attr_1);
                  final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                    public XAnnotation apply(final Annotation a) {
                      return a.getAnnotation();
                    }
                  };
                  List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_setterAnnotations, _function);
                  PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
                }
              };
              JvmOperation _setterExt = PojoJvmModelInferrer.this._processorTypesBuilder.toSetterExt(attr_1, _name_3, _name_4, type, _typeRef_6, _updateColumn1, _updateColumn2, _createColumn1, _createColumn2, _function_9);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_7, _setterExt);
              EList<JvmMember> _members_8 = it.getMembers();
              String _name_5 = attr_1.getName();
              String _name_6 = attr_1.getName();
              JvmTypeReference _typeRef_7 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
              PojoAttribute _updateColumn1_1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn1(attr_1);
              PojoAttribute _updateColumn2_1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn2(attr_1);
              PojoAttribute _createColumn1_1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
              PojoAttribute _createColumn2_1 = PojoJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn2(attr_1);
              JvmOperation __toSetterExt = PojoJvmModelInferrer.this._processorTypesBuilder._toSetterExt(attr_1, _name_5, _name_6, type, _typeRef_7, _updateColumn1_1, _updateColumn2_1, _createColumn1_1, _createColumn2_1);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_8, __toSetterExt);
              boolean _hasOperators = PojoJvmModelInferrer.this._processorGeneratorUtils.hasOperators(entity);
              if (_hasOperators) {
                String _elvis_2 = null;
                String _operatorsSuffix = PojoJvmModelInferrer.this._processorGeneratorUtils.getOperatorsSuffix(entity);
                if (_operatorsSuffix != null) {
                  _elvis_2 = _operatorsSuffix;
                } else {
                  _elvis_2 = "Op";
                }
                final String operSuffix = _elvis_2;
                EList<JvmMember> _members_9 = it.getMembers();
                String _name_7 = attr_1.getName();
                String _plus_2 = (_name_7 + operSuffix);
                JvmTypeReference _typeRef_8 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                final Procedure1<JvmField> _function_10 = new Procedure1<JvmField>() {
                  public void apply(final JvmField it) {
                  }
                };
                JvmField _field_4 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus_2, _typeRef_8, _function_10);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_9, _field_4);
                EList<JvmMember> _members_10 = it.getMembers();
                String _name_8 = attr_1.getName();
                String _plus_3 = (_name_8 + operSuffix);
                JvmTypeReference _typeRef_9 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                JvmOperation _getter_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toGetter(attr_1, _plus_3, _typeRef_9);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_10, _getter_1);
                EList<JvmMember> _members_11 = it.getMembers();
                String _name_9 = attr_1.getName();
                String _plus_4 = (_name_9 + operSuffix);
                String _name_10 = attr_1.getName();
                String _plus_5 = (_name_10 + operSuffix);
                JvmTypeReference _typeRef_10 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                JvmOperation _setter = PojoJvmModelInferrer.this._processorTypesBuilder.toSetter(attr_1, _plus_4, _plus_5, _typeRef_10);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_11, _setter);
                EList<JvmMember> _members_12 = it.getMembers();
                String _name_11 = attr_1.getName();
                String _plus_6 = (_name_11 + operSuffix);
                String _name_12 = attr_1.getName();
                String _plus_7 = (_name_12 + operSuffix);
                JvmTypeReference _typeRef_11 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                JvmTypeReference _typeRef_12 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
                JvmOperation __toSetter = PojoJvmModelInferrer.this._processorTypesBuilder._toSetter(attr_1, _plus_6, _plus_7, _typeRef_11, _typeRef_12);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_12, __toSetter);
              }
            }
          }
        }
        EList<PojoProcedure> _procedures = entity.getProcedures();
        for (final PojoProcedure proc : _procedures) {
          EList<JvmMember> _members_5 = it.getMembers();
          String _name = proc.getName();
          JvmTypeReference _elvis = null;
          JvmTypeReference _type = proc.getType();
          if (_type != null) {
            _elvis = _type;
          } else {
            JvmTypeReference _inferredType = PojoJvmModelInferrer.this._processorTypesBuilder.inferredType();
            _elvis = _inferredType;
          }
          final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              String _documentation = PojoJvmModelInferrer.this._processorTypesBuilder.getDocumentation(proc);
              PojoJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
              EList<Annotation> _annotations = proc.getAnnotations();
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              boolean _isStatic = proc.isStatic();
              it.setStatic(_isStatic);
              boolean _isFinal = proc.isFinal();
              it.setFinal(_isFinal);
              EList<JvmFormalParameter> _params = proc.getParams();
              for (final JvmFormalParameter param : _params) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                String _name = param.getName();
                JvmTypeReference _parameterType = param.getParameterType();
                JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(param, _name, _parameterType);
                PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              }
              XExpression _body = proc.getBody();
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _body);
            }
          };
          JvmOperation _method = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(proc, _name, _elvis, _function_7);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_5, _method);
        }
        final List<PojoAttribute> equalsList = PojoJvmModelInferrer.this._processorGeneratorUtils.equalsAttributes(entity);
        boolean _isEmpty_1 = equalsList.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          JvmTypeReference _typeRef_5 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
          final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "obj", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (this == obj)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("return true;");
                  _builder.newLine();
                  _builder.append("if (obj == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("return false;");
                  _builder.newLine();
                  _builder.append("if (getClass() != obj.getClass())");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("return false;");
                  _builder.newLine();
                  _builder.append(simpleName, "");
                  _builder.append(" other = (");
                  _builder.append(simpleName, "");
                  _builder.append(") obj;");
                  _builder.newLineIfNotEmpty();
                  {
                    for(final PojoAttribute f2 : equalsList) {
                      {
                        boolean _isNative = PojoJvmModelInferrer.this._processorGeneratorUtils.isNative(f2);
                        if (_isNative) {
                          _builder.append("if (");
                          String _name = f2.getName();
                          _builder.append(_name, "");
                          _builder.append(" != other.");
                          String _name_1 = f2.getName();
                          _builder.append(_name_1, "");
                          _builder.append(")");
                        } else {
                          _builder.append("if (");
                          String _name_2 = f2.getName();
                          _builder.append(_name_2, "");
                          _builder.append(" == null || !");
                          String _name_3 = f2.getName();
                          _builder.append(_name_3, "");
                          _builder.append(".equals(other.");
                          String _name_4 = f2.getName();
                          _builder.append(_name_4, "");
                          _builder.append("))");
                        }
                      }
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("return false;");
                      _builder.newLine();
                    }
                  }
                  _builder.append("return true;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          final JvmOperation method = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "equals", _typeRef_5, _function_8);
          EList<JvmAnnotationReference> _annotations = method.getAnnotations();
          JvmAnnotationReference _annotation = PojoJvmModelInferrer.this._processorTypesBuilder.toAnnotation(entity, Override.class);
          _annotations.add(_annotation);
          EList<JvmMember> _members_6 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_6, method);
        }
        final List<PojoAttribute> hashCodeList = PojoJvmModelInferrer.this._processorGeneratorUtils.hashCodeAttributes(entity);
        boolean _isEmpty_2 = hashCodeList.isEmpty();
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          JvmTypeReference _typeRef_6 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("final int prime = 31;");
                  _builder.newLine();
                  _builder.append("int result = 1;");
                  _builder.newLine();
                  {
                    for(final PojoAttribute f2 : hashCodeList) {
                      _builder.append("result = prime * result + ");
                      {
                        boolean _isNative = PojoJvmModelInferrer.this._processorGeneratorUtils.isNative(f2);
                        if (_isNative) {
                          _builder.append("(int) (");
                          String _name = f2.getName();
                          _builder.append(_name, "");
                          _builder.append(" ^ (");
                          String _name_1 = f2.getName();
                          _builder.append(_name_1, "");
                          _builder.append(" >>> 32))");
                        } else {
                          _builder.append("((");
                          String _name_2 = f2.getName();
                          _builder.append(_name_2, "");
                          _builder.append(" != null) ? ");
                          String _name_3 = f2.getName();
                          _builder.append(_name_3, "");
                          _builder.append(".hashCode() : 0)");
                        }
                      }
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("return result;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          final JvmOperation method_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "hashCode", _typeRef_6, _function_9);
          EList<JvmAnnotationReference> _annotations_1 = method_1.getAnnotations();
          JvmAnnotationReference _annotation_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toAnnotation(entity, Override.class);
          _annotations_1.add(_annotation_1);
          EList<JvmMember> _members_7 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_7, method_1);
        }
        final List<PojoAttribute> toStringList = PojoJvmModelInferrer.this._processorGeneratorUtils.toStringAttributes(entity);
        boolean _isEmpty_3 = toStringList.isEmpty();
        boolean _not_3 = (!_isEmpty_3);
        if (_not_3) {
          JvmTypeReference _typeRef_7 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("return \"");
                  _builder.append(simpleName, "");
                  _builder.append(" [");
                  {
                    boolean _hasElements = false;
                    for(final PojoAttribute f2 : toStringList) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate(" + \", ", "");
                      }
                      String _name = f2.getName();
                      _builder.append(_name, "");
                      _builder.append("=\" + ");
                      String _name_1 = f2.getName();
                      _builder.append(_name_1, "");
                    }
                  }
                  {
                    boolean _and = false;
                    JvmParameterizedTypeReference _superType = entity.getSuperType();
                    boolean _notEquals = (!Objects.equal(_superType, null));
                    if (!_notEquals) {
                      _and = false;
                    } else {
                      JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
                      _and = (_superType_1 instanceof PojoEntity);
                    }
                    if (_and) {
                      _builder.append(" + super.toString()");
                    }
                  }
                  _builder.append(" + \"]\";");
                  _builder.newLineIfNotEmpty();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          final JvmOperation method_2 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "toString", _typeRef_7, _function_10);
          EList<JvmAnnotationReference> _annotations_2 = method_2.getAnnotations();
          JvmAnnotationReference _annotation_2 = PojoJvmModelInferrer.this._processorTypesBuilder.toAnnotation(entity, Override.class);
          _annotations_2.add(_annotation_2);
          EList<JvmMember> _members_8 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_8, method_2);
        }
        EList<PojoAttribute> _attributes_2 = entity.getAttributes();
        boolean _isEmpty_4 = _attributes_2.isEmpty();
        boolean _not_4 = (!_isEmpty_4);
        if (_not_4) {
          EList<JvmMember> _members_9 = it.getMembers();
          JvmTypeReference _typeRef_8 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final Procedure1<JvmOperation> _function_11 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("return \"");
                  _builder.append(simpleName, "");
                  _builder.append(" [");
                  {
                    EList<PojoAttribute> _attributes = entity.getAttributes();
                    boolean _hasElements = false;
                    for(final PojoAttribute f2 : _attributes) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate(" + \", ", "");
                      }
                      String _name = f2.getName();
                      _builder.append(_name, "");
                      _builder.append("=\" + ");
                      String _name_1 = f2.getName();
                      _builder.append(_name_1, "");
                    }
                  }
                  {
                    boolean _and = false;
                    JvmParameterizedTypeReference _superType = entity.getSuperType();
                    boolean _notEquals = (!Objects.equal(_superType, null));
                    if (!_notEquals) {
                      _and = false;
                    } else {
                      JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
                      _and = (_superType_1 instanceof PojoEntity);
                    }
                    if (_and) {
                      _builder.append(" + super.toString()");
                    }
                  }
                  _builder.append(" + \"]\";");
                  _builder.newLineIfNotEmpty();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "toStringFull", _typeRef_8, _function_11);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_9, _method_1);
        }
        final List<PojoAttribute> isDefList = PojoJvmModelInferrer.this._processorGeneratorUtils.isDefAttributes(entity);
        boolean _isEmpty_5 = isDefList.isEmpty();
        boolean _not_5 = (!_isEmpty_5);
        if (_not_5) {
          final Procedure1<JvmEnumerationType> _function_12 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType isDefType = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "Attribute", _function_12);
          EList<JvmMember> _members_10 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_10, isDefType);
          for (final PojoAttribute attr_2 : isDefList) {
            EList<JvmMember> _members_11 = isDefType.getMembers();
            String _name_1 = attr_2.getName();
            JvmEnumerationLiteral _enumerationLiteral = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name_1);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_11, _enumerationLiteral);
          }
          JvmTypeReference _typeRef_9 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final JvmTypeReference identifierSetType = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Set.class, _typeRef_9);
          EList<JvmMember> _members_12 = it.getMembers();
          final Procedure1<JvmField> _function_13 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append(" ");
                  _builder.append("new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_SET, " ");
                  _builder.append("<String>()");
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_3 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "nullValues", identifierSetType, _function_13);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_12, _field_3);
          EList<JvmMember> _members_13 = it.getMembers();
          JvmTypeReference _typeRef_10 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (Attribute attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("nullValues.add(attribute.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_2 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNull", _typeRef_10, _function_14);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_13, _method_2);
          EList<JvmMember> _members_14 = it.getMembers();
          JvmTypeReference _typeRef_11 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_3 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_11);
          final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_3 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNull", _cloneWithProxies_3, _function_15);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_14, _method_3);
          EList<JvmMember> _members_15 = it.getMembers();
          JvmTypeReference _typeRef_12 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_16 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (Attribute attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("nullValues.remove(attribute.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_4 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearNull", _typeRef_12, _function_16);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_15, _method_4);
          EList<JvmMember> _members_16 = it.getMembers();
          JvmTypeReference _typeRef_13 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_4 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_13);
          final Procedure1<JvmOperation> _function_17 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_5 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearNull", _cloneWithProxies_4, _function_17);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_16, _method_5);
          EList<JvmMember> _members_17 = it.getMembers();
          JvmTypeReference _typeRef_14 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_18 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("nullValues.add(attribute);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_6 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNull", _typeRef_14, _function_18);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_17, _method_6);
          EList<JvmMember> _members_18 = it.getMembers();
          JvmTypeReference _typeRef_15 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_5 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_15);
          final Procedure1<JvmOperation> _function_19 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_7 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNull", _cloneWithProxies_5, _function_19);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_18, _method_7);
          EList<JvmMember> _members_19 = it.getMembers();
          JvmTypeReference _typeRef_16 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_20 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("nullValues.remove(attribute);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_8 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearNull", _typeRef_16, _function_20);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_19, _method_8);
          EList<JvmMember> _members_20 = it.getMembers();
          JvmTypeReference _typeRef_17 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_6 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_17);
          final Procedure1<JvmOperation> _function_21 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_9 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearNull", _cloneWithProxies_6, _function_21);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_20, _method_9);
          EList<JvmMember> _members_21 = it.getMembers();
          JvmTypeReference _typeRef_18 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_22 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attribute", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attribute == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("return nullValues.contains(attribute.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_10 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isNull", _typeRef_18, _function_22);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_21, _method_10);
          EList<JvmMember> _members_22 = it.getMembers();
          JvmTypeReference _typeRef_19 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_23 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attrName", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attrName == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("return nullValues.contains(attrName);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_11 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isNull", _typeRef_19, _function_23);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_22, _method_11);
          EList<JvmMember> _members_23 = it.getMembers();
          JvmTypeReference _typeRef_20 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_24 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attrName", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attrName == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("if (nullValues.contains(attrName))");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("return true;");
                  _builder.newLine();
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("Object result = ");
                  _builder.append(PojoJvmModelInferrer.this.METHOD_UTILS, "\t");
                  _builder.append(".invokeMethod(this, \"get\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return (result != null) ? true : false;");
                  _builder.newLine();
                  _builder.append("} catch (NoSuchMethodException e) {");
                  _builder.newLine();
                  _builder.append("} catch (IllegalAccessException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("} catch (");
                  _builder.append(PojoJvmModelInferrer.this.INVOCATION_TARGET_EXCEPTION, "");
                  _builder.append(" e) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("Object result = ");
                  _builder.append(PojoJvmModelInferrer.this.METHOD_UTILS, "\t");
                  _builder.append(".invokeMethod(this, \"is\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return (result != null) ? true : false;");
                  _builder.newLine();
                  _builder.append("} catch (NoSuchMethodException e) {");
                  _builder.newLine();
                  _builder.append("} catch (IllegalAccessException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("} catch (");
                  _builder.append(PojoJvmModelInferrer.this.INVOCATION_TARGET_EXCEPTION, "");
                  _builder.append(" e) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("return false;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_12 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isDef", _typeRef_20, _function_24);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_23, _method_12);
          EList<JvmMember> _members_24 = it.getMembers();
          JvmTypeReference _typeRef_21 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_25 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("nullValues = new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_SET, "");
                  _builder.append("<String>();");
                  _builder.newLineIfNotEmpty();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_13 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearAllNull", _typeRef_21, _function_25);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_24, _method_13);
        }
        final List<PojoAttribute> enumDefList = PojoJvmModelInferrer.this._processorGeneratorUtils.enumDefAttributes(entity);
        boolean _isEmpty_6 = enumDefList.isEmpty();
        boolean _not_6 = (!_isEmpty_6);
        if (_not_6) {
          final Procedure1<JvmEnumerationType> _function_26 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType isDefType_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "Attribute", _function_26);
          EList<JvmMember> _members_25 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_25, isDefType_1);
          for (final PojoAttribute attr_3 : enumDefList) {
            EList<JvmMember> _members_26 = isDefType_1.getMembers();
            String _name_2 = attr_3.getName();
            JvmEnumerationLiteral _enumerationLiteral_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name_2);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_26, _enumerationLiteral_1);
          }
        }
        final List<PojoAttribute> toInitList = PojoJvmModelInferrer.this._processorGeneratorUtils.toInitAttributes(entity);
        boolean _isEmpty_7 = toInitList.isEmpty();
        boolean _not_7 = (!_isEmpty_7);
        if (_not_7) {
          final Procedure1<JvmEnumerationType> _function_27 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType toInitType = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "Association", _function_27);
          EList<JvmMember> _members_27 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_27, toInitType);
          for (final PojoAttribute attr_4 : toInitList) {
            EList<JvmMember> _members_28 = toInitType.getMembers();
            String _name_3 = attr_4.getName();
            JvmEnumerationLiteral _enumerationLiteral_2 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name_3);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_28, _enumerationLiteral_2);
          }
          JvmTypeReference _typeRef_22 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final JvmTypeReference identifierSetType_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Set.class, _typeRef_22);
          EList<JvmMember> _members_29 = it.getMembers();
          final Procedure1<JvmField> _function_28 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append(" ");
                  _builder.append("new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_SET, " ");
                  _builder.append("<String>()");
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_4 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "initAssociations", identifierSetType_1, _function_28);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_29, _field_4);
          EList<JvmMember> _members_30 = it.getMembers();
          JvmTypeReference _typeRef_23 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_29 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(toInitType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (associations == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (Association association : associations)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("initAssociations.add(association.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_14 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setInit", _typeRef_23, _function_29);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_30, _method_14);
          EList<JvmMember> _members_31 = it.getMembers();
          JvmTypeReference _typeRef_24 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_7 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_24);
          final Procedure1<JvmOperation> _function_30 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(toInitType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setInit(associations);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_15 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setInit", _cloneWithProxies_7, _function_30);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_31, _method_15);
          EList<JvmMember> _members_32 = it.getMembers();
          JvmTypeReference _typeRef_25 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_31 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(toInitType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (associations == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (Association association : associations)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("initAssociations.remove(association.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_16 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearInit", _typeRef_25, _function_31);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_32, _method_16);
          EList<JvmMember> _members_33 = it.getMembers();
          JvmTypeReference _typeRef_26 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_8 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_26);
          final Procedure1<JvmOperation> _function_32 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(toInitType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearInit(associations);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_17 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearInit", _cloneWithProxies_8, _function_32);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_33, _method_17);
          EList<JvmMember> _members_34 = it.getMembers();
          JvmTypeReference _typeRef_27 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_33 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (associations == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String association : associations)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("initAssociations.add(association);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_18 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setInit", _typeRef_27, _function_33);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_34, _method_18);
          EList<JvmMember> _members_35 = it.getMembers();
          JvmTypeReference _typeRef_28 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_9 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_28);
          final Procedure1<JvmOperation> _function_34 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setInit(associations);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_19 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setInit", _cloneWithProxies_9, _function_34);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_35, _method_19);
          EList<JvmMember> _members_36 = it.getMembers();
          JvmTypeReference _typeRef_29 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_35 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (associations == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String association : associations)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("initAssociations.remove(association);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_20 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearInit", _typeRef_29, _function_35);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_36, _method_20);
          EList<JvmMember> _members_37 = it.getMembers();
          JvmTypeReference _typeRef_30 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_10 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_30);
          final Procedure1<JvmOperation> _function_36 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "associations", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearInit(associations);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_21 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearInit", _cloneWithProxies_10, _function_36);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_37, _method_21);
          EList<JvmMember> _members_38 = it.getMembers();
          JvmTypeReference _typeRef_31 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_37 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(toInitType);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "association", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (association == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("return initAssociations.contains(association.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_22 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "toInit", _typeRef_31, _function_37);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_38, _method_22);
          EList<JvmMember> _members_39 = it.getMembers();
          JvmTypeReference _typeRef_32 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_38 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "association", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (association == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("return initAssociations.contains(association);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_23 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "toInit", _typeRef_32, _function_38);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_39, _method_23);
          EList<JvmMember> _members_40 = it.getMembers();
          JvmTypeReference _typeRef_33 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_39 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("initAssociations = new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_SET, "");
                  _builder.append("<String>();");
                  _builder.newLineIfNotEmpty();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_24 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearAllInit", _typeRef_33, _function_39);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_40, _method_24);
        }
        final List<PojoAttribute> enumInitList = PojoJvmModelInferrer.this._processorGeneratorUtils.enumInitAttributes(entity);
        boolean _isEmpty_8 = enumInitList.isEmpty();
        boolean _not_8 = (!_isEmpty_8);
        if (_not_8) {
          final Procedure1<JvmEnumerationType> _function_40 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType toInitType_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "Association", _function_40);
          EList<JvmMember> _members_41 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_41, toInitType_1);
          for (final PojoAttribute attr_5 : enumInitList) {
            EList<JvmMember> _members_42 = toInitType_1.getMembers();
            String _name_4 = attr_5.getName();
            JvmEnumerationLiteral _enumerationLiteral_3 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name_4);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_42, _enumerationLiteral_3);
          }
        }
        boolean _hasOperators = PojoJvmModelInferrer.this._processorGeneratorUtils.hasOperators(entity);
        if (_hasOperators) {
          final Procedure1<JvmEnumerationType> _function_41 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType opAttrType = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "OpAttribute", _function_41);
          EList<JvmMember> _members_43 = it.getMembers();
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_43, opAttrType);
          EList<PojoAttribute> _attributes_3 = entity.getAttributes();
          for (final PojoAttribute attr_6 : _attributes_3) {
            EList<JvmMember> _members_44 = opAttrType.getMembers();
            String _name_5 = attr_6.getName();
            JvmEnumerationLiteral _enumerationLiteral_4 = PojoJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name_5);
            PojoJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_44, _enumerationLiteral_4);
          }
          JvmTypeReference _typeRef_34 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          JvmTypeReference _typeRef_35 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final JvmTypeReference identifierMapType = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Map.class, _typeRef_34, _typeRef_35);
          EList<JvmMember> _members_45 = it.getMembers();
          final Procedure1<JvmField> _function_42 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append(" ");
                  _builder.append("new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_MAP, " ");
                  _builder.append("<String, String>()");
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_5 = PojoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "operators", identifierMapType, _function_42);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_45, _field_5);
          EList<JvmMember> _members_46 = it.getMembers();
          final Procedure1<JvmOperation> _function_43 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("return operators;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_25 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "getOperators", identifierMapType, _function_43);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_46, _method_25);
          EList<JvmMember> _members_47 = it.getMembers();
          JvmTypeReference _typeRef_36 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_44 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "operator", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              JvmTypeReference _typeRef_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef_1);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (OpAttribute attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.put(attribute.name(), operator);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_26 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setOp", _typeRef_36, _function_44);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_47, _method_26);
          EList<JvmMember> _members_48 = it.getMembers();
          JvmTypeReference _typeRef_37 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_11 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_37);
          final Procedure1<JvmOperation> _function_45 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "operator", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              JvmTypeReference _typeRef_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef_1);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setOp(operator, attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_27 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setOp", _cloneWithProxies_11, _function_45);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_48, _method_27);
          EList<JvmMember> _members_49 = it.getMembers();
          JvmTypeReference _typeRef_38 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_46 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (OpAttribute attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.remove(attribute.name());");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_28 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearOp", _typeRef_38, _function_46);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_49, _method_28);
          EList<JvmMember> _members_50 = it.getMembers();
          JvmTypeReference _typeRef_39 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_12 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_39);
          final Procedure1<JvmOperation> _function_47 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearOp(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_29 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearOp", _cloneWithProxies_12, _function_47);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_50, _method_29);
          EList<JvmMember> _members_51 = it.getMembers();
          JvmTypeReference _typeRef_40 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_48 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "operator", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              JvmTypeReference _typeRef_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef_1);
              JvmFormalParameter _parameter_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.put(attribute, operator);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_30 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setOp", _typeRef_40, _function_48);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_51, _method_30);
          EList<JvmMember> _members_52 = it.getMembers();
          JvmTypeReference _typeRef_41 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_13 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_41);
          final Procedure1<JvmOperation> _function_49 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "operator", _typeRef);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              JvmTypeReference _typeRef_1 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef_1);
              JvmFormalParameter _parameter_1 = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setOp(operator, attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_31 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setOp", _cloneWithProxies_13, _function_49);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_52, _method_31);
          EList<JvmMember> _members_53 = it.getMembers();
          JvmTypeReference _typeRef_42 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_50 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.remove(attribute);");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_32 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearOp", _typeRef_42, _function_50);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_53, _method_32);
          EList<JvmMember> _members_54 = it.getMembers();
          JvmTypeReference _typeRef_43 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_14 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_43);
          final Procedure1<JvmOperation> _function_51 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearOp(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_33 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearOp", _cloneWithProxies_14, _function_51);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_54, _method_33);
          EList<JvmMember> _members_55 = it.getMembers();
          JvmTypeReference _typeRef_44 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_52 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (OpAttribute attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.put(attribute.name(), \"is null\");");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_34 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNullOp", _typeRef_44, _function_52);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_55, _method_34);
          EList<JvmMember> _members_56 = it.getMembers();
          JvmTypeReference _typeRef_45 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_15 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_45);
          final Procedure1<JvmOperation> _function_53 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(opAttrType);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = PojoJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              PojoJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setNullOp(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_35 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNullOp", _cloneWithProxies_15, _function_53);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_56, _method_35);
          EList<JvmMember> _members_57 = it.getMembers();
          JvmTypeReference _typeRef_46 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_54 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if (attributes == null)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new IllegalArgumentException();");
                  _builder.newLine();
                  _builder.append("for (String attribute : attributes)");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("operators.put(attribute, \"is null\");");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_36 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNullOp", _typeRef_46, _function_54);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_57, _method_36);
          EList<JvmMember> _members_58 = it.getMembers();
          JvmTypeReference _typeRef_47 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_16 = PojoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_47);
          final Procedure1<JvmOperation> _function_55 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = PojoJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = PojoJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              PojoJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setNullOp(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_37 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNullOp", _cloneWithProxies_16, _function_55);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_58, _method_37);
          EList<JvmMember> _members_59 = it.getMembers();
          JvmTypeReference _typeRef_48 = PojoJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_56 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("operators = new ");
                  _builder.append(PojoJvmModelInferrer.this.HASH_MAP, "");
                  _builder.append("<String, String>();");
                  _builder.newLineIfNotEmpty();
                }
              };
              PojoJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_38 = PojoJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearAllOps", _typeRef_48, _function_56);
          PojoJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_59, _method_38);
        }
      }
    };
    acceptor.<JvmGenericType>accept(entityType, _function);
  }
}
