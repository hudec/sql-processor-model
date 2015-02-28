package org.sqlproc.model.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider;
import org.sqlproc.model.processorModel.PojoAttribute;
import org.sqlproc.model.processorModel.PojoEntity;
import org.sqlproc.model.processorModel.ProcessorModelPackage;

public class ProcessorModel2ScopeProvider extends XbaseWithAnnotationsBatchScopeProvider {

    @Override
    public IScope getScope(EObject context, EReference reference) {

        if (reference == ProcessorModelPackage.Literals.DIRECTIVE_PROPERTIES__FEATURES) {
            PojoEntity pojo = EcoreUtil2.getContainerOfType(context, PojoEntity.class);
            if (pojo.getSuperType() != null) {
                // System.out.println("XXXXXXXXXXXXX " + pojo.getName() + " -> " + context + " -> " + reference);
                // IScope _scope = super.getScope(context, reference);
                // if (_scope instanceof ImportScope) {
                // ImportScope iscope = (ImportScope) _scope;
                // if (iscope.getParent() instanceof SelectableBasedScope) {
                // SelectableBasedScope sscope = (SelectableBasedScope) iscope.getParent();
                // for (IEObjectDescription idesc : sscope.getAllElements()) {
                // System.out.println("ZZZZZZZZZ " + idesc.getName() + " " + idesc.getQualifiedName() + " "
                // + idesc);
                // }
                // }
                // }
                IScope scope = Scopes.scopeFor(getAllAttributes(pojo));
                // System.out.println("YYYYYYYYYYYYY " + scope);
                return scope;
            }
        }
        return super.getScope(context, reference);
    }

    private List<PojoAttribute> getAllAttributes(PojoEntity pojo) {
        List<PojoAttribute> list = new ArrayList<PojoAttribute>();
        if (pojo == null)
            return list;
        list.addAll(pojo.getAttributes());
        JvmParameterizedTypeReference se = pojo.getSuperType();
        if (se == null || !(se instanceof PojoEntity))
            return list;
        list.addAll(getAllAttributes((PojoEntity) se));
        return list;
    }
}
