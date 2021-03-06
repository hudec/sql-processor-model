/*
 * generated by Xtext
 */
package org.sqlproc.model;

import org.eclipse.xtext.resource.IResourceFactory;
import org.sqlproc.model.generator.ProcessorModelGenerator;
import org.sqlproc.model.property.ModelProperty;
import org.sqlproc.model.property.ModelPropertyBean;
import org.sqlproc.model.resolver.DbResolver;
import org.sqlproc.model.resolver.DbResolverBean;
import org.sqlproc.model.resolver.PojoResolverFactory;
import org.sqlproc.model.resolver.PojoResolverFactoryBean;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ProcessorModelRuntimeModule extends org.sqlproc.model.AbstractProcessorModelRuntimeModule {

    @Override
    public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
        return ProcessorModelGenerator.class;
    }

    public Class<? extends ModelProperty> bindModelProperty() {
        return ModelPropertyBean.class;
    }

    // @Override
    // public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
    // return ProcessorNameProvider.class;
    // }

    public Class<? extends PojoResolverFactory> bindPojoResolverFactory() {
        return PojoResolverFactoryBean.class;
    }

    public Class<? extends DbResolver> bindDbResolver() {
        return DbResolverBean.class;
    }

    @Override
    public Class<? extends IResourceFactory> bindIResourceFactory() {
        return ProcessorResourceFactory.class;
    }

    @Override
    public Class<? extends org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider> bindXbaseBatchScopeProvider() {
        return org.sqlproc.model.scoping.ProcessorModelScopeProvider.class;
    }
}
