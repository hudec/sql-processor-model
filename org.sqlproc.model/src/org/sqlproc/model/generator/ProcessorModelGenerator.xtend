package org.sqlproc.model.generator

import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.common.types.JvmEnumerationLiteral
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.compiler.GeneratorConfig

class ProcessorModelGenerator extends JvmModelGenerator {
	
	override generateEnumLiteral(JvmEnumerationLiteral it, ITreeAppendable appendable, GeneratorConfig config) {
      super.generateEnumLiteral(it, appendable, config)
      compilationStrategy?.apply(appendable)
    }
}