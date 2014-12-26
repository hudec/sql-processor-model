/*
 * generated by Xtext
 */
package org.sqlproc.model.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.sqlproc.model.processorModel.AnnotatedEntity
import org.sqlproc.model.processorModel.PojoDao
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ProcessorModelGenerator2 implements IGenerator2 {

	@Inject extension IQualifiedNameProvider
	@Inject extension ProcessorPojoGenerator
	@Inject extension ProcessorDaoGenerator

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(typeof(AnnotatedEntity))) {
			fsa.generateFile(e.eContainer.fullyQualifiedName.toString("/") + "/"+
				e.fullyQualifiedName + ".java",e.compile
			)
		}
		for(d: resource.allContents.toIterable.filter(typeof(PojoDao))) {
			if (d.implPackage != null) {
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
		      		d.fullyQualifiedName + ".java",d.compileIfx
			    )
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+ 
		      		d.implPackage + "/" + d.fullyQualifiedName + "Impl.java",d.compile
			    )
			}
			else {
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
		      		d.fullyQualifiedName + ".java",d.compile
			    )
			}
		}
	}

	override void doGenerate(ResourceSet resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(typeof(AnnotatedEntity))) {
			fsa.generateFile(e.eContainer.fullyQualifiedName.toString("/") + "/"+
				e.fullyQualifiedName + ".java",e.compile
			)
		}
		for(d: resource.allContents.toIterable.filter(typeof(PojoDao))) {
			if (d.implPackage != null) {
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
		      		d.fullyQualifiedName + ".java",d.compileIfx
			    )
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+ 
		      		d.implPackage + "/" + d.fullyQualifiedName + "Impl.java",d.compile
			    )
			}
			else {
	    		fsa.generateFile(d.eContainer.fullyQualifiedName.toString("/") + "/"+
		      		d.fullyQualifiedName + ".java",d.compile
			    )
			}
		}
	}
}
