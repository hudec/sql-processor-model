package org.sqlproc.model.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.sqlproc.model.jvmmodel.ProcessorGeneratorUtils;
import org.sqlproc.model.jvmmodel.ProcessorTypesBuilder;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.DaoEntity;
import org.sqlproc.model.processorModel.Extends;
import org.sqlproc.model.processorModel.Implements;

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
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    final JvmGenericType entityType = this._processorTypesBuilder.toClass(entity, _fullyQualifiedName);
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
          boolean _equals = Objects.equal(_identifier, "java.io.Serializable");
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
          EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
          JvmParameterizedTypeReference _implements_1 = impl.getImplements();
          JvmTypeReference _cloneWithProxies = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_implements_1);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _cloneWithProxies);
        }
        final Extends ext = DaoJvmModelInferrer.this._processorGeneratorUtils.getExtends(entity);
        boolean _notEquals = (!Objects.equal(ext, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes_2 = it.getSuperTypes();
          JvmParameterizedTypeReference _extends = ext.getExtends();
          JvmTypeReference _cloneWithProxies_1 = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_extends);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_2, _cloneWithProxies_1);
        }
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals_1 = (!Objects.equal(_superType, null));
        if (_notEquals_1) {
          EList<JvmTypeReference> _superTypes_3 = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies_2 = DaoJvmModelInferrer.this._processorTypesBuilder.cloneWithProxies(_superType_1);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_3, _cloneWithProxies_2);
        }
        boolean _notEquals_2 = (!Objects.equal(sernum, null));
        if (_notEquals_2) {
          EList<JvmTypeReference> _superTypes_4 = it.getSuperTypes();
          JvmTypeReference _typeRef_1 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef("java.io.Serializable");
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmTypeReference>operator_add(_superTypes_4, _typeRef_1);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _typeRef_2 = DaoJvmModelInferrer.this._typeReferenceBuilder.typeRef(long.class);
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
          JvmField _field = DaoJvmModelInferrer.this._processorTypesBuilder.toField(entity, "serialVersionUID", _typeRef_2, _function_1);
          DaoJvmModelInferrer.this._processorTypesBuilder.<JvmField>operator_add(_members, _field);
        }
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmConstructor> _function_2 = new Procedure1<JvmConstructor>() {
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
        JvmConstructor _constructor = DaoJvmModelInferrer.this._processorTypesBuilder.toConstructor(entity, _function_2);
        DaoJvmModelInferrer.this._processorTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor);
      }
    };
    acceptor.<JvmGenericType>accept(entityType, _function);
  }
}
