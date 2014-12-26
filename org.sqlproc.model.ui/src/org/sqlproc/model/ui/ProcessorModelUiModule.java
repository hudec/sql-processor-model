/*
 * generated by Xtext
 */
package org.sqlproc.model.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.sqlproc.model.resolver.PojoResolver;
import org.sqlproc.model.resolver.PojoResolverFactory;
import org.sqlproc.model.resolver.PojoResolverFactoryBean;
import org.sqlproc.model.ui.outline.FilterMappingRulesContribution;
import org.sqlproc.model.ui.outline.FilterMetaStatementsContribution;
import org.sqlproc.model.ui.outline.FilterOptionalFeaturesContribution;
import org.sqlproc.model.ui.outline.FixedOutlineFilterAndSorter;
import org.sqlproc.model.ui.resolver.WorkspacePojoResolverImpl;
import org.sqlproc.model.ui.syntaxcoloring.HighlightingConfiguration;
import org.sqlproc.model.ui.syntaxcoloring.SemanticHighlightingCalculator;
import org.sqlproc.model.ui.syntaxcoloring.TokenToIdMapper;
import org.sqlproc.model.ui.templates.ProcessorModelTemplateContextType;
import org.sqlproc.model.ui.templates.ProcessorTemplateProposalProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ProcessorModelUiModule extends org.sqlproc.model.ui.AbstractProcessorModelUiModule {
    public ProcessorModelUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }

    public Class<? extends PojoResolverFactory> bindPojoResolverFactory() {
        return PojoResolverFactoryBean.class;
    }

    public Class<? extends PojoResolver> bindPojoResolver() {
        return WorkspacePojoResolverImpl.class;
    }

    public Class<? extends IHighlightingConfiguration> bindISemanticHighlightingConfiguration() {
        return HighlightingConfiguration.class;
    }

    public Class<? extends DefaultAntlrTokenToAttributeIdMapper> bindDefaultAntlrTokenToAttributeIdMapper() {
        return TokenToIdMapper.class;
    }

    public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
        return SemanticHighlightingCalculator.class;
    }

    public Class<? extends OutlineFilterAndSorter> bindOutlineFilterAndSorter() {
        return FixedOutlineFilterAndSorter.class;
    }

    public void configureFilterOptionalFeaturesOutlineContribution(Binder binder) {
        binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterOptionalFeaturesContribution"))
                .to(FilterOptionalFeaturesContribution.class);
    }

    public void configureFilterMetaStatementsOutlineContribution(Binder binder) {
        binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterMetaStatementsContribution"))
                .to((Class<? extends IOutlineContribution>) FilterMetaStatementsContribution.class);
    }

    public void configureFilterMappingRulesOutlineContribution(Binder binder) {
        binder.bind(IOutlineContribution.class).annotatedWith(Names.named("FilterMappingRulesContribution"))
                .to(FilterMappingRulesContribution.class);
    }

    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(XtextTemplateContextType.class).to(ProcessorModelTemplateContextType.class);
    }

    @Override
    public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
        return ProcessorTemplateProposalProvider.class;
    }
}