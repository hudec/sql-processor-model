package org.sqlproc.model.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ProcessorModelGenerator extends JvmModelGenerator {
  public void generateEnumLiteral(final JvmEnumerationLiteral it, final ITreeAppendable appendable, final GeneratorConfig config) {
    super.generateEnumLiteral(it, appendable, config);
    Procedure1<? super ITreeAppendable> _compilationStrategy = this._jvmTypeExtensions.getCompilationStrategy(it);
    if (_compilationStrategy!=null) {
      _compilationStrategy.apply(appendable);
    }
  }
  
  public void generateParameter(final JvmFormalParameter it, final ITreeAppendable appendable, final boolean vararg, final GeneratorConfig config) {
    String _name = it.getName();
    boolean _notEquals = (!Objects.equal(_name, "sqlControl"));
    if (_notEquals) {
      super.generateParameter(it, appendable, vararg, config);
    } else {
      final ITreeAppendable tracedAppendable = appendable.trace(it);
      EList<JvmAnnotationReference> _annotations = it.getAnnotations();
      this.generateAnnotations(_annotations, tracedAppendable, false, config);
      JvmTypeReference _parameterType = it.getParameterType();
      this._errorSafeExtensions.serializeSafely(_parameterType, "Object", tracedAppendable);
      tracedAppendable.append(" ");
      String _simpleName = it.getSimpleName();
      String _makeJavaIdentifier = this.makeJavaIdentifier(_simpleName);
      final String name = tracedAppendable.declareVariable(it, _makeJavaIdentifier);
      ITreeAppendable _traceSignificant = this._treeAppendableUtil.traceSignificant(tracedAppendable, it);
      _traceSignificant.append(name);
    }
  }
}
