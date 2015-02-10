package org.sqlproc.model.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
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
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.sqlproc.model.generator.ProcessorGeneratorUtils;
import org.sqlproc.model.jvmmodel.ProcessorTypesBuilder;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.EnumAttribute;
import org.sqlproc.model.processorModel.EnumAttributeDirective;
import org.sqlproc.model.processorModel.EnumAttributeDirectiveValues;
import org.sqlproc.model.processorModel.EnumAttributeValue;
import org.sqlproc.model.processorModel.EnumEntity;
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
public class ProcessorModelJvmModelInferrer extends AbstractModelInferrer {
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
  protected void _infer(final PojoEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _fullyQualifiedName = this._processorGeneratorUtils.getFullyQualifiedName(entity);
    final JvmGenericType entityType = this._processorTypesBuilder.toClass(entity, _fullyQualifiedName);
    final String simpleName = entity.getName();
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        boolean _isAbstract = entity.isAbstract();
        if (_isAbstract) {
          it.setAbstract(true);
        }
        EList<Annotation> _annotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.annotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
        for (final XAnnotation an : _map) {
          JvmType _annotationType = an.getAnnotationType();
          String _identifier = _annotationType.getIdentifier();
          boolean _equals = Objects.equal(_identifier, "java.io.Serializable");
          if (_equals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmType _annotationType_1 = an.getAnnotationType();
            JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(_annotationType_1);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          } else {
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotation(it, an);
          }
        }
        List<Implements> _implements = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getImplements(entity);
        for (final Implements impl : _implements) {
          EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
          JvmParameterizedTypeReference _implements_1 = impl.getImplements();
          JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_implements_1);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _cloneWithProxies);
        }
        final Extends ext = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getExtends(entity);
        boolean _notEquals = (!Objects.equal(ext, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes_2 = it.getSuperTypes();
          JvmParameterizedTypeReference _extends = ext.getExtends();
          JvmTypeReference _cloneWithProxies_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_extends);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_2, _cloneWithProxies_1);
        }
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals_1 = (!Objects.equal(_superType, null));
        if (_notEquals_1) {
          EList<JvmTypeReference> _superTypes_3 = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies_2 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_superType_1);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_3, _cloneWithProxies_2);
        }
        EList<PojoAttribute> _attributes = entity.getAttributes();
        final Function1<PojoAttribute, Boolean> _function_1 = new Function1<PojoAttribute, Boolean>() {
          public Boolean apply(final PojoAttribute x) {
            Integer _index = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getIndex(x);
            return Boolean.valueOf((!Objects.equal(_index, null)));
          }
        };
        Iterable<PojoAttribute> _filter = IterableExtensions.<PojoAttribute>filter(_attributes, _function_1);
        for (final PojoAttribute attr : _filter) {
          EList<JvmMember> _members = it.getMembers();
          String _constName = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constName(attr);
          String _plus = ("ORDER_BY_" + _constName);
          JvmTypeReference _typeRef_1 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  Integer _index = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getIndex(attr);
                  _builder.append(_index, "");
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus, _typeRef_1, _function_2);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        Map<Integer, List<PojoAttribute>> _index = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getIndex(entity);
        Set<Map.Entry<Integer, List<PojoAttribute>>> _entrySet = _index.entrySet();
        for (final Map.Entry<Integer, List<PojoAttribute>> entry : _entrySet) {
          EList<JvmMember> _members_1 = it.getMembers();
          List<PojoAttribute> _value = entry.getValue();
          String _constName_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constName(_value);
          String _plus_1 = ("ORDER_BY_" + _constName_1);
          JvmTypeReference _typeRef_2 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  Integer _key = entry.getKey();
                  _builder.append(_key, "");
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus_1, _typeRef_2, _function_3);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
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
                _inferredType=ProcessorModelJvmModelInferrer.this._processorTypesBuilder.inferredType(_initExpr);
              }
              _elvis_1 = _inferredType;
            }
            if (_elvis_1 != null) {
              _elvis = _elvis_1;
            } else {
              JvmTypeReference _typeRef_3 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef_3;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members_2 = it.getMembers();
            String _name = attr_1.getName();
            final Procedure1<JvmField> _function_4 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(attr_1);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
                EList<Annotation> _annotations = attr_1.getAnnotations();
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
                XExpression _initExpr = attr_1.getInitExpr();
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _initExpr);
              }
            };
            JvmField _field_2 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(attr_1, _name, type, _function_4);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
            String _createColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
            final PojoAttribute createColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getAttribute(entity, _createColumn1);
            String _xifexpression = null;
            boolean _notEquals_2 = (!Objects.equal(createColumn1, null));
            if (_notEquals_2) {
              JvmTypeReference _type_1 = createColumn1.getType();
              _xifexpression = _type_1.getQualifiedName();
            }
            final String typeCreateColumn1 = _xifexpression;
            EList<JvmMember> _members_3 = it.getMembers();
            String _name_1 = attr_1.getName();
            JvmOperation _getter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toGetter(attr_1, _name_1, type);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_3, _getter);
            EList<JvmMember> _members_4 = it.getMembers();
            String _name_2 = attr_1.getName();
            JvmOperation _setter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toSetter(attr_1, _name_2, type);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_4, _setter);
            EList<JvmMember> _members_5 = it.getMembers();
            String _name_3 = attr_1.getName();
            JvmTypeReference _typeRef_4 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
            String _updateColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn1(attr_1);
            String _updateColumn2 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn2(attr_1);
            String _createColumn1_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
            String _createColumn2 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn2(attr_1);
            JvmOperation __toSetter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder._toSetter(attr_1, _name_3, type, _typeRef_4, _updateColumn1, _updateColumn2, _createColumn1_1, typeCreateColumn1, _createColumn2);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_5, __toSetter);
          }
        }
      }
    };
    acceptor.<JvmGenericType>accept(entityType, _function);
  }
  
  protected void _infer(final EnumEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _fullyQualifiedName = this._processorGeneratorUtils.getFullyQualifiedName(entity);
    final Procedure1<JvmEnumerationType> _function = new Procedure1<JvmEnumerationType>() {
      public void apply(final JvmEnumerationType it) {
      }
    };
    final JvmEnumerationType entityType = this._processorTypesBuilder.toEnumerationType(entity, _fullyQualifiedName, _function);
    final String simpleName = entity.getName();
    final Procedure1<JvmEnumerationType> _function_1 = new Procedure1<JvmEnumerationType>() {
      public void apply(final JvmEnumerationType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        EList<Annotation> _annotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.annotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
        for (final XAnnotation a : _map) {
          JvmType _annotationType = a.getAnnotationType();
          String _identifier = _annotationType.getIdentifier();
          boolean _equals = Objects.equal(_identifier, "java.io.Serializable");
          if (_equals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmType _annotationType_1 = a.getAnnotationType();
            JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(_annotationType_1);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          } else {
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotation(it, a);
          }
        }
        final List<EnumAttributeValue> values = CollectionLiterals.<EnumAttributeValue>newArrayList();
        EnumAttribute _attribute = entity.getAttribute();
        EList<EnumAttributeDirective> _directives = _attribute.getDirectives();
        for (final EnumAttributeDirective dir : _directives) {
          if ((dir instanceof EnumAttributeDirectiveValues)) {
            final EnumAttributeDirectiveValues dv = ((EnumAttributeDirectiveValues) dir);
            EList<EnumAttributeValue> _values = dv.getValues();
            for (final EnumAttributeValue epv : _values) {
              {
                String _switchResult = null;
                XExpression _value = epv.getValue();
                boolean _matched = false;
                if (!_matched) {
                  if (_value instanceof XStringLiteral) {
                    _matched=true;
                    XExpression _value_1 = epv.getValue();
                    String _value_2 = ((XStringLiteral) _value_1).getValue();
                    String _plus = ("\"" + _value_2);
                    _switchResult = (_plus + "\"");
                  }
                }
                if (!_matched) {
                  if (_value instanceof XNumberLiteral) {
                    _matched=true;
                    XExpression _value_1 = epv.getValue();
                    _switchResult = ((XNumberLiteral) _value_1).getValue();
                  }
                }
                final String value = _switchResult;
                EList<JvmMember> _members = it.getMembers();
                String _name = epv.getName();
                final Procedure1<JvmEnumerationLiteral> _function_1 = new Procedure1<JvmEnumerationLiteral>() {
                  public void apply(final JvmEnumerationLiteral it) {
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        it.append((("(" + value) + ")"));
                      }
                    };
                    ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _function);
                  }
                };
                JvmEnumerationLiteral _enumerationLiteral = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name, _function_1);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members, _enumerationLiteral);
                values.add(epv);
              }
            }
          }
        }
        EnumAttribute _attribute_1 = entity.getAttribute();
        JvmTypeReference _type = _attribute_1.getType();
        JvmTypeReference _typeRef_1 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
        JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_1);
        final JvmTypeReference identifierMapType = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Map.class, _type, _cloneWithProxies);
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setStatic(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(" ");
                _builder.append("identifierMapBuild()");
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, "identifierMap", identifierMapType, _function_1);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("Map<");
                EnumAttribute _attribute = entity.getAttribute();
                JvmTypeReference _type = _attribute.getType();
                _builder.append(_type, "");
                _builder.append(", ");
                _builder.append(simpleName, "");
                _builder.append("> _identifierMap = new java.util.HashMap<");
                EnumAttribute _attribute_1 = entity.getAttribute();
                JvmTypeReference _type_1 = _attribute_1.getType();
                _builder.append(_type_1, "");
                _builder.append(", ");
                _builder.append(simpleName, "");
                _builder.append(">();");
                _builder.newLineIfNotEmpty();
                _builder.append("for (");
                _builder.append(simpleName, "");
                _builder.append(" value : ");
                _builder.append(simpleName, "");
                _builder.append(".values()) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("_identifierMap.put(value.getValue(), value);");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return _identifierMap;");
                _builder.newLine();
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "identifierMapBuild", identifierMapType, _function_2);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
        EList<JvmMember> _members_2 = it.getMembers();
        EnumAttribute _attribute_2 = entity.getAttribute();
        JvmTypeReference _type_1 = _attribute_2.getType();
        JvmField _field_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, "value", _type_1);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_2, _field_1);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function_3 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            EnumAttribute _attribute = entity.getAttribute();
            JvmTypeReference _type = _attribute.getType();
            JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "value", _type);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            it.setVisibility(JvmVisibility.PRIVATE);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.value = value;");
                _builder.newLine();
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_3);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _typeRef_2 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
        JvmTypeReference _cloneWithProxies_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_2);
        final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            EnumAttribute _attribute = entity.getAttribute();
            JvmTypeReference _type = _attribute.getType();
            JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "value", _type);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(simpleName, "");
                _builder.append(" result = identifierMap.get(value);");
                _builder.newLineIfNotEmpty();
                _builder.append("if (result == null) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("throw new IllegalArgumentException(\"No ");
                _builder.append(simpleName, "\t");
                _builder.append(" for value: \" + value);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return result;");
                _builder.newLine();
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "fromValue", _cloneWithProxies_1, _function_4);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_4, _method_1);
        EList<JvmMember> _members_5 = it.getMembers();
        EnumAttribute _attribute_3 = entity.getAttribute();
        JvmTypeReference _type_2 = _attribute_3.getType();
        final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return value;");
                _builder.newLine();
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_2 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "getValue", _type_2, _function_5);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_5, _method_2);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeRef_3 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return name();");
                _builder.newLine();
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_3 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "getName", _typeRef_3, _function_6);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_6, _method_3);
      }
    };
    acceptor.<JvmEnumerationType>accept(entityType, _function_1);
  }
  
  protected void _infer(final DaoEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    JvmGenericType _class = this._processorTypesBuilder.toClass(entity, _fullyQualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        EList<Annotation> _annotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.annotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals = (!Objects.equal(_superType, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_superType_1);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public void infer(final EObject entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (entity instanceof DaoEntity) {
      _infer((DaoEntity)entity, acceptor, isPreIndexingPhase);
      return;
    } else if (entity instanceof EnumEntity) {
      _infer((EnumEntity)entity, acceptor, isPreIndexingPhase);
      return;
    } else if (entity instanceof PojoEntity) {
      _infer((PojoEntity)entity, acceptor, isPreIndexingPhase);
      return;
    } else if (entity != null) {
      _infer(entity, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity, acceptor, isPreIndexingPhase).toString());
    }
  }
}
