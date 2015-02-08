package org.sqlproc.model.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.sqlproc.model.processorModel.AnnotatedEntity;
import org.sqlproc.model.processorModel.Annotation;
import org.sqlproc.model.processorModel.EnumEntity;
import org.sqlproc.model.processorModel.EnumProperty;
import org.sqlproc.model.processorModel.EnumPropertyDirective;
import org.sqlproc.model.processorModel.EnumPropertyDirectiveValues;
import org.sqlproc.model.processorModel.EnumPropertyValue;
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
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
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
    String _fullyQualifiedName = this.getFullyQualifiedName(entity);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(entity, _fullyQualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        EList<Annotation> _annotations = ProcessorModelJvmModelInferrer.this.annotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
        ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.addAnnotations(it, _map);
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals = (!Objects.equal(_superType, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superType_1);
          ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
        }
        EList<PojoAttribute> _attributes = entity.getAttributes();
        for (final PojoAttribute attr : _attributes) {
          {
            JvmTypeReference _elvis = null;
            JvmTypeReference _elvis_1 = null;
            JvmTypeReference _type = attr.getType();
            if (_type != null) {
              _elvis_1 = _type;
            } else {
              XExpression _initExpr = attr.getInitExpr();
              JvmTypeReference _inferredType = null;
              if (_initExpr!=null) {
                _inferredType=ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.inferredType(_initExpr);
              }
              _elvis_1 = _inferredType;
            }
            if (_elvis_1 != null) {
              _elvis = _elvis_1;
            } else {
              JvmTypeReference _typeRef = ProcessorModelJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members = it.getMembers();
            String _name = attr.getName();
            final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                String _documentation = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(attr);
                ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                EList<Annotation> _annotations = attr.getAnnotations();
                final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
                  public XAnnotation apply(final Annotation a) {
                    return a.getAnnotation();
                  }
                };
                List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
                ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.addAnnotations(it, _map);
                XExpression _initExpr = attr.getInitExpr();
                ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _initExpr);
              }
            };
            JvmField _field = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.toField(attr, _name, type, _function_1);
            ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          }
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  protected void _infer(final EnumEntity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _fullyQualifiedName = this.getFullyQualifiedName(entity);
    final Procedure1<JvmEnumerationType> _function = new Procedure1<JvmEnumerationType>() {
      public void apply(final JvmEnumerationType it) {
      }
    };
    JvmEnumerationType _enumerationType = this._jvmTypesBuilder.toEnumerationType(entity, _fullyQualifiedName, _function);
    final Procedure1<JvmEnumerationType> _function_1 = new Procedure1<JvmEnumerationType>() {
      public void apply(final JvmEnumerationType it) {
        String _documentation = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(entity);
        ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        EList<Annotation> _annotations = ProcessorModelJvmModelInferrer.this.annotations(entity);
        final Function1<Annotation, XAnnotation> _function = new Function1<Annotation, XAnnotation>() {
          public XAnnotation apply(final Annotation a) {
            return a.getAnnotation();
          }
        };
        List<XAnnotation> _map = ListExtensions.<Annotation, XAnnotation>map(_annotations, _function);
        ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.addAnnotations(it, _map);
        EnumProperty _attribute = entity.getAttribute();
        EList<EnumPropertyDirective> _directives = _attribute.getDirectives();
        for (final EnumPropertyDirective dir : _directives) {
          if ((dir instanceof EnumPropertyDirectiveValues)) {
            final EnumPropertyDirectiveValues dv = ((EnumPropertyDirectiveValues) dir);
            EList<EnumPropertyValue> _values = dv.getValues();
            for (final EnumPropertyValue epv : _values) {
              EList<JvmMember> _members = it.getMembers();
              String _name = epv.getName();
              JvmEnumerationLiteral _enumerationLiteral = ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.toEnumerationLiteral(entity, _name);
              ProcessorModelJvmModelInferrer.this._jvmTypesBuilder.<JvmEnumerationLiteral>operator_add(_members, _enumerationLiteral);
            }
          }
        }
      }
    };
    acceptor.<JvmEnumerationType>accept(_enumerationType, _function_1);
  }
  
  public String getFullyQualifiedName(final PojoEntity it) {
    String _xblockexpression = null;
    {
      final org.sqlproc.model.processorModel.Package pkg = EcoreUtil2.<org.sqlproc.model.processorModel.Package>getContainerOfType(it, org.sqlproc.model.processorModel.Package.class);
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(pkg);
      String _plus = (_fullyQualifiedName + ".");
      String _name = it.getName();
      _xblockexpression = (_plus + _name);
    }
    return _xblockexpression;
  }
  
  public String getFullyQualifiedName(final EnumEntity it) {
    String _xblockexpression = null;
    {
      final org.sqlproc.model.processorModel.Package pkg = EcoreUtil2.<org.sqlproc.model.processorModel.Package>getContainerOfType(it, org.sqlproc.model.processorModel.Package.class);
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(pkg);
      String _plus = (_fullyQualifiedName + ".");
      String _name = it.getName();
      _xblockexpression = (_plus + _name);
    }
    return _xblockexpression;
  }
  
  public EList<Annotation> annotations(final PojoEntity it) {
    EList<Annotation> _xblockexpression = null;
    {
      final AnnotatedEntity an = EcoreUtil2.<AnnotatedEntity>getContainerOfType(it, AnnotatedEntity.class);
      _xblockexpression = an.getAnnotations();
    }
    return _xblockexpression;
  }
  
  public EList<Annotation> annotations(final EnumEntity it) {
    EList<Annotation> _xblockexpression = null;
    {
      final AnnotatedEntity an = EcoreUtil2.<AnnotatedEntity>getContainerOfType(it, AnnotatedEntity.class);
      _xblockexpression = an.getAnnotations();
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (entity instanceof EnumEntity) {
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
