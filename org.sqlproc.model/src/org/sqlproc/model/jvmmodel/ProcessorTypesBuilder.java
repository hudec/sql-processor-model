package org.sqlproc.model.jvmmodel;

import static com.google.common.collect.Iterables.*;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.impl.URIHelperConstants;
import org.eclipse.xtext.common.types.util.AnnotationLookup;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter;
import org.eclipse.xtext.xbase.compiler.CompilationTemplateAdapter;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;
import org.eclipse.xtext.xbase.compiler.FileHeaderAdapter;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.XtypeFactory;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

public class ProcessorTypesBuilder extends JvmTypesBuilder {

	//private static Logger LOG = Logger.getLogger(ProcessorTypesBuilder.class);

	@Inject
	private TypeReferences references;
	
	@Inject
	private TypesFactory typesFactory;
	
	@Inject(optional = true)
	private XtypeFactory xtypesFactory = XtypeFactory.eINSTANCE;
	
	/**
	 * Creates a setter method for the given properties name with the standard implementation assigning the passed
	 * parameter to a similarly named field.
	 * 
	 * Example: <code>
	 * public void setFoo(String foo) {
	 *   this.foo = foo;
	 * }
	 * </code>
	 *
	 * @return a setter method for a JavaBeans property with the given name, <code>null</code> if sourceElement or name are <code>null</code>.
	 */
	/* @Nullable */ 
	public JvmOperation _toSetter(/* @Nullable */ final EObject sourceElement, /* @Nullable */ final String propertyName, 
		/* @Nullable */ final String fieldName, /* @Nullable */ JvmTypeReference typeRef, /* @Nullable */ JvmTypeReference typeEntityRef,
		/* @Nullable */ final String updateColumn1, /* @Nullable */ final String updateColumn2,
		/* @Nullable */ final String createColumn1, /* @Nullable */ final String typeCreateColumn1, /* @Nullable */ final String createColumn2) {
		if(sourceElement == null || propertyName == null || fieldName == null) 
			return null;
		JvmOperation result = typesFactory.createJvmOperation();
		result.setVisibility(JvmVisibility.PUBLIC);
		result.setReturnType(cloneWithProxies(typeEntityRef));
		result.setSimpleName("_set" + Strings.toFirstUpper(propertyName));
		result.getParameters().add(toParameter(sourceElement, propertyName, cloneWithProxies(typeRef)));
		setBody(result, new Procedures.Procedure1<ITreeAppendable>() {
			public void apply(/* @Nullable */ ITreeAppendable p) {
				if(p != null) {
					p = p.trace(sourceElement);
					p.append("this.").append(fieldName).append(" = ").append(propertyName).append(";");
					if (updateColumn1 != null && updateColumn2 != null) {
						p.newLine().append("if (this.").append(fieldName).append(" != null)");
						p.increaseIndentation();
						p.newLine().append("this.").append(updateColumn2).append(" = this.").append(fieldName).append(".get").append(toFirstUpper(updateColumn1)).append("();");
						p.decreaseIndentation();
					}
					if (createColumn1 != null && createColumn2 != null) {
						p.newLine().append("if (this.").append(createColumn1).append(" == null)");
						p.increaseIndentation();
						p.newLine().append("this.").append(createColumn1).append(" = new ").append(typeCreateColumn1).append("();");
						p.decreaseIndentation();
						p.newLine().append("this.").append(createColumn1).append(".set").append(toFirstUpper(createColumn2)).append("(").append(propertyName).append(");");
					}
					p.newLine().append("return this;");
				}
			}
		});
		return associate(sourceElement, result);
	}

	public static String toFirstUpper(String s) {
		if (s == null || s.length() == 0)
			return s;
		if (Character.isUpperCase(s.charAt(0)))
			return s;
		if (s.length() == 1)
			return s.toUpperCase();
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}