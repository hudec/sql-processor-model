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
import org.sqlproc.model.jvmmodel.ProcessorGeneratorUtils;
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
    final Integer sernum = this._processorGeneratorUtils.getSernum(entity);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
        boolean _isAbstract = entity.isAbstract();
        if (_isAbstract) {
          it.setAbstract(true);
        }
        List<Annotation> _standardAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.standardAnnotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_standardAnnotations, _function);
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
        boolean _notEquals_2 = (!Objects.equal(sernum, null));
        if (_notEquals_2) {
          EList<JvmTypeReference> _superTypes_4 = it.getSuperTypes();
          JvmTypeReference _typeRef_1 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef("java.io.Serializable");
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_4, _typeRef_1);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _typeRef_2 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, "serialVersionUID", _typeRef_2, _function_1);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        EList<PojoAttribute> _attributes = entity.getAttributes();
        final Function1<PojoAttribute, Boolean> _function_2 = new Function1<PojoAttribute, Boolean>() {
          public Boolean apply(final PojoAttribute x) {
            Integer _index = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getIndex(x);
            return Boolean.valueOf((!Objects.equal(_index, null)));
          }
        };
        Iterable<PojoAttribute> _filter = IterableExtensions.<PojoAttribute>filter(_attributes, _function_2);
        for (final PojoAttribute attr : _filter) {
          EList<JvmMember> _members_1 = it.getMembers();
          String _constName = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constName(attr);
          String _plus = ("ORDER_BY_" + _constName);
          JvmTypeReference _typeRef_3 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
          final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setStatic(true);
              it.setFinal(true);
              it.setVisibility(JvmVisibility.PUBLIC);
              List<Annotation> _staticAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.staticAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_staticAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
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
          JvmField _field_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus, _typeRef_3, _function_3);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        }
        Map<Integer, List<PojoAttribute>> _index = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getIndex(entity);
        Set<Map.Entry<Integer, List<PojoAttribute>>> _entrySet = _index.entrySet();
        for (final Map.Entry<Integer, List<PojoAttribute>> entry : _entrySet) {
          EList<JvmMember> _members_2 = it.getMembers();
          List<PojoAttribute> _value = entry.getValue();
          String _constName_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constName(_value);
          String _plus_1 = ("ORDER_BY_" + _constName_1);
          JvmTypeReference _typeRef_4 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(int.class);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
              List<Annotation> _staticAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.staticAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_staticAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
            }
          };
          JvmField _field_2 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus_1, _typeRef_4, _function_4);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        }
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function_5 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            List<Annotation> _constructorAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
          }
        };
        JvmConstructor _constructor = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_5);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        EList<JvmMember> _members_4 = it.getMembers();
        final Procedure1<JvmConstructor> _function_6 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            List<PojoAttribute> _requiredAttributes = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.requiredAttributes(entity);
            for (final PojoAttribute attr : _requiredAttributes) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              String _name = attr.getName();
              JvmTypeReference _type = attr.getType();
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, _name, _type);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            List<Annotation> _constructorAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.constructorAnnotations(entity);
            final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
              public XAnnotation apply(final Annotation a) {
                return a.getAnnotation();
              }
            };
            List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_constructorAnnotations, _function);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                {
                  List<PojoAttribute> _requiredAttributes = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.requiredAttributes(entity);
                  for(final PojoAttribute attr : _requiredAttributes) {
                    _builder.newLineIfNotEmpty();
                    _builder.append("this.");
                    String _name = attr.getName();
                    _builder.append(_name, "");
                    _builder.append(" = ");
                    String _name_1 = attr.getName();
                    _builder.append(_name_1, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                  }
                }
              }
            };
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_6);
        ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_4, _constructor_1);
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
              JvmTypeReference _typeRef_5 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef_5;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members_5 = it.getMembers();
            String _name = attr_1.getName();
            final Procedure1<JvmField> _function_7 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                String _documentation = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.getDocumentation(attr_1);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setDocumentation(it, _documentation);
                List<Annotation> _attributeAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.attributeAnnotations(attr_1);
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_attributeAnnotations, _function);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
                XExpression _initExpr = attr_1.getInitExpr();
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _initExpr);
              }
            };
            JvmField _field_3 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _name, type, _function_7);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_5, _field_3);
            String _createColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
            final PojoAttribute createColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getAttribute(entity, _createColumn1);
            String _xifexpression = null;
            boolean _notEquals_3 = (!Objects.equal(createColumn1, null));
            if (_notEquals_3) {
              JvmTypeReference _type_1 = createColumn1.getType();
              _xifexpression = _type_1.getQualifiedName();
            }
            final String typeCreateColumn1 = _xifexpression;
            EList<JvmMember> _members_6 = it.getMembers();
            String _name_1 = attr_1.getName();
            String _name_2 = attr_1.getName();
            final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                List<Annotation> _terAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getterAnnotations(attr_1);
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_terAnnotations, _function);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              }
            };
            JvmOperation _getter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toGetter(attr_1, _name_1, _name_2, type, _function_8);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_6, _getter);
            EList<JvmMember> _members_7 = it.getMembers();
            String _name_3 = attr_1.getName();
            String _name_4 = attr_1.getName();
            JvmTypeReference _typeRef_6 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
            String _updateColumn1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn1(attr_1);
            String _updateColumn2 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn2(attr_1);
            String _createColumn1_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
            String _createColumn2 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn2(attr_1);
            final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                List<Annotation> _setterAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.setterAnnotations(attr_1);
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_setterAnnotations, _function);
                ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              }
            };
            JvmOperation _setterExt = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toSetterExt(attr_1, _name_3, _name_4, type, _typeRef_6, _updateColumn1, _updateColumn2, _createColumn1_1, typeCreateColumn1, _createColumn2, _function_9);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_7, _setterExt);
            EList<JvmMember> _members_8 = it.getMembers();
            String _name_5 = attr_1.getName();
            String _name_6 = attr_1.getName();
            JvmTypeReference _typeRef_7 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
            String _updateColumn1_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn1(attr_1);
            String _updateColumn2_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getUpdateColumn2(attr_1);
            String _createColumn1_2 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn1(attr_1);
            String _createColumn2_1 = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getCreateColumn2(attr_1);
            JvmOperation __toSetterExt = ProcessorModelJvmModelInferrer.this._processorTypesBuilder._toSetterExt(attr_1, _name_5, _name_6, type, _typeRef_7, _updateColumn1_1, _updateColumn2_1, _createColumn1_2, typeCreateColumn1, _createColumn2_1);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_8, __toSetterExt);
            boolean _hasOperators = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.hasOperators(entity);
            if (_hasOperators) {
              String _elvis_2 = null;
              String _operatorsSuffix = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.getOperatorsSuffix(entity);
              if (_operatorsSuffix != null) {
                _elvis_2 = _operatorsSuffix;
              } else {
                _elvis_2 = "Op";
              }
              final String operSuffix = _elvis_2;
              EList<JvmMember> _members_9 = it.getMembers();
              String _name_7 = attr_1.getName();
              String _plus_2 = (_name_7 + operSuffix);
              JvmTypeReference _typeRef_8 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              final Procedure1<JvmField> _function_10 = new Procedure1<JvmField>() {
                public void apply(final JvmField it) {
                }
              };
              JvmField _field_4 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, _plus_2, _typeRef_8, _function_10);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_9, _field_4);
              EList<JvmMember> _members_10 = it.getMembers();
              String _name_8 = attr_1.getName();
              String _plus_3 = (_name_8 + operSuffix);
              JvmTypeReference _typeRef_9 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmOperation _getter_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toGetter(attr_1, _plus_3, _typeRef_9);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_10, _getter_1);
              EList<JvmMember> _members_11 = it.getMembers();
              String _name_9 = attr_1.getName();
              String _plus_4 = (_name_9 + operSuffix);
              String _name_10 = attr_1.getName();
              String _plus_5 = (_name_10 + operSuffix);
              JvmTypeReference _typeRef_10 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmOperation _setter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toSetter(attr_1, _plus_4, _plus_5, _typeRef_10);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_11, _setter);
              EList<JvmMember> _members_12 = it.getMembers();
              String _name_11 = attr_1.getName();
              String _plus_6 = (_name_11 + operSuffix);
              String _name_12 = attr_1.getName();
              String _plus_7 = (_name_12 + operSuffix);
              JvmTypeReference _typeRef_11 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _typeRef_12 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
              JvmOperation __toSetter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder._toSetter(attr_1, _plus_6, _plus_7, _typeRef_11, _typeRef_12);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_12, __toSetter);
            }
          }
        }
        final List<PojoAttribute> isDefList = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.isDefAttributes(entity);
        boolean _isEmpty = isDefList.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final Procedure1<JvmEnumerationType> _function_7 = new Procedure1<JvmEnumerationType>() {
            public void apply(final JvmEnumerationType it) {
            }
          };
          final JvmEnumerationType isDefType = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toEnumerationType(entity, "Attribute", _function_7);
          EList<JvmMember> _members_5 = it.getMembers();
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationType>operator_add(_members_5, isDefType);
          for (final PojoAttribute attr_2 : isDefList) {
            EList<JvmMember> _members_6 = isDefType.getMembers();
            String _name = attr_2.getName();
            JvmEnumerationLiteral _enumerationLiteral = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toEnumerationLiteral(entity, _name);
            ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmEnumerationLiteral>operator_add(_members_6, _enumerationLiteral);
          }
          JvmTypeReference _typeRef_5 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
          final JvmTypeReference identifierSetType = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Set.class, _typeRef_5);
          EList<JvmMember> _members_7 = it.getMembers();
          final Procedure1<JvmField> _function_8 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append(" ");
                  _builder.append("new java.util.HashSet<String>()");
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setInitializer(it, _client);
            }
          };
          JvmField _field_3 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toField(entity, "nullValues", identifierSetType, _function_8);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members_7, _field_3);
          EList<JvmMember> _members_8 = it.getMembers();
          JvmTypeReference _typeRef_6 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNull", _typeRef_6, _function_9);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_8, _method);
          EList<JvmMember> _members_9 = it.getMembers();
          JvmTypeReference _typeRef_7 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_3 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_7);
          final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("setNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_1 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNull", _cloneWithProxies_3, _function_10);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_9, _method_1);
          EList<JvmMember> _members_10 = it.getMembers();
          JvmTypeReference _typeRef_8 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_11 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_2 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearNull", _typeRef_8, _function_11);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_10, _method_2);
          EList<JvmMember> _members_11 = it.getMembers();
          JvmTypeReference _typeRef_9 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_4 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_9);
          final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_addArrayTypeDimension);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _cloneWithProxies);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setVarArgs(true);
              List<Annotation> _conflictAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("clearNull(attributes);");
                  _builder.newLine();
                  _builder.append("return this;");
                  _builder.newLine();
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_3 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearNull", _cloneWithProxies_4, _function_12);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_11, _method_3);
          EList<JvmMember> _members_12 = it.getMembers();
          JvmTypeReference _typeRef_10 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_4 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "setNull", _typeRef_10, _function_13);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_12, _method_4);
          EList<JvmMember> _members_13 = it.getMembers();
          JvmTypeReference _typeRef_11 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_5 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_11);
          final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_5 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_setNull", _cloneWithProxies_5, _function_14);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_13, _method_5);
          EList<JvmMember> _members_14 = it.getMembers();
          JvmTypeReference _typeRef_12 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_6 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearNull", _typeRef_12, _function_15);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_14, _method_6);
          EList<JvmMember> _members_15 = it.getMembers();
          JvmTypeReference _typeRef_13 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(entityType);
          JvmTypeReference _cloneWithProxies_6 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef_13);
          final Procedure1<JvmOperation> _function_16 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attributes", _addArrayTypeDimension);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_7 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "_clearNull", _cloneWithProxies_6, _function_16);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_15, _method_7);
          EList<JvmMember> _members_16 = it.getMembers();
          JvmTypeReference _typeRef_14 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_17 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(isDefType);
              JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_typeRef);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attribute", _cloneWithProxies);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              List<Annotation> _conflictAnnotations = ProcessorModelJvmModelInferrer.this._processorGeneratorUtils.conflictAnnotations(entity);
              final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                public XAnnotation apply(final Annotation a) {
                  return a.getAnnotation();
                }
              };
              List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_conflictAnnotations, _function);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.addAnnotations(it, _map);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_8 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isNull", _typeRef_14, _function_17);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_16, _method_8);
          EList<JvmMember> _members_17 = it.getMembers();
          JvmTypeReference _typeRef_15 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_18 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attrName", _typeRef);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_9 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isNull", _typeRef_15, _function_18);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_17, _method_9);
          EList<JvmMember> _members_18 = it.getMembers();
          JvmTypeReference _typeRef_16 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.class);
          final Procedure1<JvmOperation> _function_19 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmFormalParameter _parameter = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toParameter(entity, "attrName", _typeRef);
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
                  _builder.append("Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, \"get\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
                  _builder.newLine();
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
                  _builder.append("} catch (java.lang.reflect.InvocationTargetException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, \"is\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
                  _builder.newLine();
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
                  _builder.append("} catch (java.lang.reflect.InvocationTargetException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("throw new RuntimeException(e);");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("return false;");
                  _builder.newLine();
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_10 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "isDef", _typeRef_16, _function_19);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_18, _method_10);
          EList<JvmMember> _members_19 = it.getMembers();
          JvmTypeReference _typeRef_17 = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
          final Procedure1<JvmOperation> _function_20 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("nullValues = new java.util.HashSet<String>();");
                  _builder.newLine();
                }
              };
              ProcessorModelJvmModelInferrer.this._processorTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_11 = ProcessorModelJvmModelInferrer.this._processorTypesBuilder.toMethod(entity, "clearAllNull", _typeRef_17, _function_20);
          ProcessorModelJvmModelInferrer.this._processorTypesBuilder.<JvmOperation>operator_add(_members_19, _method_11);
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
