package org.sqlproc.model.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sqlproc.model.services.ProcessorModelGrammarAccess;

@SuppressWarnings("all")
public class ProcessorModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProcessorModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_0_1_0_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_10_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_1_1_0_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_2_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_3_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_4_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_5_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_7_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_7_3_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_8_1_p;
	protected AbstractElementAlias match_DaogenProperty_WSTerminalRuleCall_9_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_10_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_14_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_15_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_16_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_17_1_0_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_18_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_2_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_3_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_4_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_5_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_6_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_7_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_8_1_p;
	protected AbstractElementAlias match_DatabaseProperty_WSTerminalRuleCall_9_1_p;
	protected AbstractElementAlias match_DebugLevelAssignement_WSTerminalRuleCall_1_0_p;
	protected AbstractElementAlias match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_2_0_p;
	protected AbstractElementAlias match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_0_p;
	protected AbstractElementAlias match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_2_0_p;
	protected AbstractElementAlias match_ExtendsAssignement_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_ExtendsAssignement_WSTerminalRuleCall_2_2_0_p;
	protected AbstractElementAlias match_ExtendsAssignement_WSTerminalRuleCall_3_0_p;
	protected AbstractElementAlias match_ExtendsAssignement_WSTerminalRuleCall_3_2_0_p;
	protected AbstractElementAlias match_Extends_ExceptDaosKeyword_7_0_q;
	protected AbstractElementAlias match_Extends_ExceptPojosKeyword_6_0_q;
	protected AbstractElementAlias match_Extends_OnlyDaosKeyword_5_0_q;
	protected AbstractElementAlias match_Extends_OnlyPojosKeyword_4_0_q;
	protected AbstractElementAlias match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_2_0_p;
	protected AbstractElementAlias match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_0_p;
	protected AbstractElementAlias match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_2_0_p;
	protected AbstractElementAlias match_ImplementsAssignement_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_ImplementsAssignement_WSTerminalRuleCall_2_2_0_p;
	protected AbstractElementAlias match_ImplementsAssignement_WSTerminalRuleCall_3_0_p;
	protected AbstractElementAlias match_ImplementsAssignement_WSTerminalRuleCall_3_2_0_p;
	protected AbstractElementAlias match_Implements_ExceptDaosKeyword_7_0_q;
	protected AbstractElementAlias match_Implements_ExceptPojosKeyword_6_0_q;
	protected AbstractElementAlias match_Implements_OnlyDaosKeyword_5_0_q;
	protected AbstractElementAlias match_Implements_OnlyPojosKeyword_4_0_q;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_0_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_0_4_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_0_4_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_0_5_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_0_5_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_13_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_13_3_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_14_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_14_3_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_15_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_15_3_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_16_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_18_1_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_19_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_19_3_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_1_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_1_3_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_1_5_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_20_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_2_1_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_2_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_2_2_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_2_3_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_2_3_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_3_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_3_3_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_3_5_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_4_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_4_3_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_5_1_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_5_3_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_7_1_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_7_1_2_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_8_1_0_p;
	protected AbstractElementAlias match_MetagenProperty_WSTerminalRuleCall_8_1_2_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_0_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_10_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_11_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_12_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_12_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_13_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_13_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_14_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_14_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_15_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_15_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_16_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_17_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_17_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_18_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_18_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_19_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_19_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_1_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_1_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_20_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_20_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_21_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_21_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_22_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_22_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_23_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_23_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_24_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_24_3_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_24_5_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_25_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_26_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_27_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_28_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_29_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_2_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_2_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_30_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_33_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_35_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_35_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_35_3_2_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_35_4_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_35_4_2_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_36_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_37_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_38_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_39_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_3_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_3_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_40_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_41_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_41_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_4_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_4_3_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_5_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_5_3_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_6_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_6_3_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_7_1_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_7_3_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_8_1_0_p;
	protected AbstractElementAlias match_PojogenProperty_WSTerminalRuleCall_9_1_0_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_6_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_6_3_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_7_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_7_3_p;
	protected AbstractElementAlias match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProcessorModelGrammarAccess) access;
		match_DaogenProperty_WSTerminalRuleCall_0_1_0_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_0_1_0());
		match_DaogenProperty_WSTerminalRuleCall_10_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_10_1());
		match_DaogenProperty_WSTerminalRuleCall_1_1_0_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_1_1_0());
		match_DaogenProperty_WSTerminalRuleCall_2_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_2_1());
		match_DaogenProperty_WSTerminalRuleCall_3_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_3_1());
		match_DaogenProperty_WSTerminalRuleCall_4_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_4_1());
		match_DaogenProperty_WSTerminalRuleCall_5_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_5_1());
		match_DaogenProperty_WSTerminalRuleCall_7_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_7_1());
		match_DaogenProperty_WSTerminalRuleCall_7_3_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_7_3());
		match_DaogenProperty_WSTerminalRuleCall_8_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_8_1());
		match_DaogenProperty_WSTerminalRuleCall_9_1_p = new TokenAlias(true, false, grammarAccess.getDaogenPropertyAccess().getWSTerminalRuleCall_9_1());
		match_DatabaseProperty_WSTerminalRuleCall_10_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_10_1());
		match_DatabaseProperty_WSTerminalRuleCall_14_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_14_1());
		match_DatabaseProperty_WSTerminalRuleCall_15_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_15_1());
		match_DatabaseProperty_WSTerminalRuleCall_16_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_16_1());
		match_DatabaseProperty_WSTerminalRuleCall_17_1_0_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_17_1_0());
		match_DatabaseProperty_WSTerminalRuleCall_18_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_18_1());
		match_DatabaseProperty_WSTerminalRuleCall_2_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_2_1());
		match_DatabaseProperty_WSTerminalRuleCall_3_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_3_1());
		match_DatabaseProperty_WSTerminalRuleCall_4_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_4_1());
		match_DatabaseProperty_WSTerminalRuleCall_5_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_5_1());
		match_DatabaseProperty_WSTerminalRuleCall_6_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_6_1());
		match_DatabaseProperty_WSTerminalRuleCall_7_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_7_1());
		match_DatabaseProperty_WSTerminalRuleCall_8_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_8_1());
		match_DatabaseProperty_WSTerminalRuleCall_9_1_p = new TokenAlias(true, false, grammarAccess.getDatabasePropertyAccess().getWSTerminalRuleCall_9_1());
		match_DebugLevelAssignement_WSTerminalRuleCall_1_0_p = new TokenAlias(true, false, grammarAccess.getDebugLevelAssignementAccess().getWSTerminalRuleCall_1_0());
		match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementGenericsAccess().getWSTerminalRuleCall_2_0());
		match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementGenericsAccess().getWSTerminalRuleCall_2_2_0());
		match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementGenericsAccess().getWSTerminalRuleCall_3_0());
		match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementGenericsAccess().getWSTerminalRuleCall_3_2_0());
		match_ExtendsAssignement_WSTerminalRuleCall_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementAccess().getWSTerminalRuleCall_2_0());
		match_ExtendsAssignement_WSTerminalRuleCall_2_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementAccess().getWSTerminalRuleCall_2_2_0());
		match_ExtendsAssignement_WSTerminalRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementAccess().getWSTerminalRuleCall_3_0());
		match_ExtendsAssignement_WSTerminalRuleCall_3_2_0_p = new TokenAlias(true, false, grammarAccess.getExtendsAssignementAccess().getWSTerminalRuleCall_3_2_0());
		match_Extends_ExceptDaosKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getExtendsAccess().getExceptDaosKeyword_7_0());
		match_Extends_ExceptPojosKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getExtendsAccess().getExceptPojosKeyword_6_0());
		match_Extends_OnlyDaosKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getExtendsAccess().getOnlyDaosKeyword_5_0());
		match_Extends_OnlyPojosKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getExtendsAccess().getOnlyPojosKeyword_4_0());
		match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementGenericsAccess().getWSTerminalRuleCall_2_0());
		match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementGenericsAccess().getWSTerminalRuleCall_2_2_0());
		match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementGenericsAccess().getWSTerminalRuleCall_3_0());
		match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementGenericsAccess().getWSTerminalRuleCall_3_2_0());
		match_ImplementsAssignement_WSTerminalRuleCall_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementAccess().getWSTerminalRuleCall_2_0());
		match_ImplementsAssignement_WSTerminalRuleCall_2_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementAccess().getWSTerminalRuleCall_2_2_0());
		match_ImplementsAssignement_WSTerminalRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementAccess().getWSTerminalRuleCall_3_0());
		match_ImplementsAssignement_WSTerminalRuleCall_3_2_0_p = new TokenAlias(true, false, grammarAccess.getImplementsAssignementAccess().getWSTerminalRuleCall_3_2_0());
		match_Implements_ExceptDaosKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getImplementsAccess().getExceptDaosKeyword_7_0());
		match_Implements_ExceptPojosKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getImplementsAccess().getExceptPojosKeyword_6_0());
		match_Implements_OnlyDaosKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getImplementsAccess().getOnlyDaosKeyword_5_0());
		match_Implements_OnlyPojosKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getImplementsAccess().getOnlyPojosKeyword_4_0());
		match_MetagenProperty_WSTerminalRuleCall_0_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_0_1());
		match_MetagenProperty_WSTerminalRuleCall_0_4_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_0_4_0());
		match_MetagenProperty_WSTerminalRuleCall_0_4_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_0_4_2_0());
		match_MetagenProperty_WSTerminalRuleCall_0_5_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_0_5_0());
		match_MetagenProperty_WSTerminalRuleCall_0_5_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_0_5_2_0());
		match_MetagenProperty_WSTerminalRuleCall_13_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_13_1());
		match_MetagenProperty_WSTerminalRuleCall_13_3_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_13_3());
		match_MetagenProperty_WSTerminalRuleCall_14_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_14_1());
		match_MetagenProperty_WSTerminalRuleCall_14_3_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_14_3());
		match_MetagenProperty_WSTerminalRuleCall_15_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_15_1());
		match_MetagenProperty_WSTerminalRuleCall_15_3_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_15_3());
		match_MetagenProperty_WSTerminalRuleCall_16_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_16_1());
		match_MetagenProperty_WSTerminalRuleCall_18_1_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_18_1_0());
		match_MetagenProperty_WSTerminalRuleCall_19_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_19_1());
		match_MetagenProperty_WSTerminalRuleCall_19_3_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_19_3_0());
		match_MetagenProperty_WSTerminalRuleCall_1_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_1_1());
		match_MetagenProperty_WSTerminalRuleCall_1_3_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_1_3());
		match_MetagenProperty_WSTerminalRuleCall_1_5_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_1_5_0());
		match_MetagenProperty_WSTerminalRuleCall_20_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_20_1());
		match_MetagenProperty_WSTerminalRuleCall_2_1_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_2_1_0());
		match_MetagenProperty_WSTerminalRuleCall_2_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_2_2_0());
		match_MetagenProperty_WSTerminalRuleCall_2_2_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_2_2_2_0());
		match_MetagenProperty_WSTerminalRuleCall_2_3_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_2_3_0());
		match_MetagenProperty_WSTerminalRuleCall_2_3_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_2_3_2_0());
		match_MetagenProperty_WSTerminalRuleCall_3_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_3_1());
		match_MetagenProperty_WSTerminalRuleCall_3_3_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_3_3());
		match_MetagenProperty_WSTerminalRuleCall_3_5_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_3_5_0());
		match_MetagenProperty_WSTerminalRuleCall_4_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_4_1());
		match_MetagenProperty_WSTerminalRuleCall_4_3_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_4_3_0());
		match_MetagenProperty_WSTerminalRuleCall_5_1_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_5_1());
		match_MetagenProperty_WSTerminalRuleCall_5_3_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_5_3_0());
		match_MetagenProperty_WSTerminalRuleCall_7_1_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_7_1_0());
		match_MetagenProperty_WSTerminalRuleCall_7_1_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_7_1_2_0());
		match_MetagenProperty_WSTerminalRuleCall_8_1_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_8_1_0());
		match_MetagenProperty_WSTerminalRuleCall_8_1_2_0_p = new TokenAlias(true, false, grammarAccess.getMetagenPropertyAccess().getWSTerminalRuleCall_8_1_2_0());
		match_PojogenProperty_WSTerminalRuleCall_0_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_0_1_0());
		match_PojogenProperty_WSTerminalRuleCall_10_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_10_1_0());
		match_PojogenProperty_WSTerminalRuleCall_11_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_11_1_0());
		match_PojogenProperty_WSTerminalRuleCall_12_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_12_1());
		match_PojogenProperty_WSTerminalRuleCall_12_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_12_3_0());
		match_PojogenProperty_WSTerminalRuleCall_13_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_13_1());
		match_PojogenProperty_WSTerminalRuleCall_13_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_13_3_0());
		match_PojogenProperty_WSTerminalRuleCall_14_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_14_1());
		match_PojogenProperty_WSTerminalRuleCall_14_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_14_3_0());
		match_PojogenProperty_WSTerminalRuleCall_15_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_15_1());
		match_PojogenProperty_WSTerminalRuleCall_15_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_15_3_0());
		match_PojogenProperty_WSTerminalRuleCall_16_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_16_1_0());
		match_PojogenProperty_WSTerminalRuleCall_17_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_17_1());
		match_PojogenProperty_WSTerminalRuleCall_17_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_17_3_0());
		match_PojogenProperty_WSTerminalRuleCall_18_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_18_1());
		match_PojogenProperty_WSTerminalRuleCall_18_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_18_3_0());
		match_PojogenProperty_WSTerminalRuleCall_19_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_19_1());
		match_PojogenProperty_WSTerminalRuleCall_19_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_19_3_0());
		match_PojogenProperty_WSTerminalRuleCall_1_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_1_1());
		match_PojogenProperty_WSTerminalRuleCall_1_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_1_3_0());
		match_PojogenProperty_WSTerminalRuleCall_20_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_20_1());
		match_PojogenProperty_WSTerminalRuleCall_20_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_20_3_0());
		match_PojogenProperty_WSTerminalRuleCall_21_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_21_1());
		match_PojogenProperty_WSTerminalRuleCall_21_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_21_3_0());
		match_PojogenProperty_WSTerminalRuleCall_22_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_22_1());
		match_PojogenProperty_WSTerminalRuleCall_22_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_22_3_0());
		match_PojogenProperty_WSTerminalRuleCall_23_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_23_1());
		match_PojogenProperty_WSTerminalRuleCall_23_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_23_3_0());
		match_PojogenProperty_WSTerminalRuleCall_24_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_24_1());
		match_PojogenProperty_WSTerminalRuleCall_24_3_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_24_3());
		match_PojogenProperty_WSTerminalRuleCall_24_5_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_24_5_0());
		match_PojogenProperty_WSTerminalRuleCall_25_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_25_1_0());
		match_PojogenProperty_WSTerminalRuleCall_26_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_26_1_0());
		match_PojogenProperty_WSTerminalRuleCall_27_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_27_1());
		match_PojogenProperty_WSTerminalRuleCall_28_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_28_1());
		match_PojogenProperty_WSTerminalRuleCall_29_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_29_1());
		match_PojogenProperty_WSTerminalRuleCall_2_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_2_1());
		match_PojogenProperty_WSTerminalRuleCall_2_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_2_3_0());
		match_PojogenProperty_WSTerminalRuleCall_30_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_30_1());
		match_PojogenProperty_WSTerminalRuleCall_33_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_33_1_0());
		match_PojogenProperty_WSTerminalRuleCall_35_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_35_1());
		match_PojogenProperty_WSTerminalRuleCall_35_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_35_3_0());
		match_PojogenProperty_WSTerminalRuleCall_35_3_2_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_35_3_2_0());
		match_PojogenProperty_WSTerminalRuleCall_35_4_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_35_4_0());
		match_PojogenProperty_WSTerminalRuleCall_35_4_2_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_35_4_2_0());
		match_PojogenProperty_WSTerminalRuleCall_36_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_36_1());
		match_PojogenProperty_WSTerminalRuleCall_37_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_37_1_0());
		match_PojogenProperty_WSTerminalRuleCall_38_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_38_1_0());
		match_PojogenProperty_WSTerminalRuleCall_39_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_39_1());
		match_PojogenProperty_WSTerminalRuleCall_3_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_3_1());
		match_PojogenProperty_WSTerminalRuleCall_3_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_3_3_0());
		match_PojogenProperty_WSTerminalRuleCall_40_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_40_1());
		match_PojogenProperty_WSTerminalRuleCall_41_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_41_1());
		match_PojogenProperty_WSTerminalRuleCall_41_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_41_3_0());
		match_PojogenProperty_WSTerminalRuleCall_4_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_4_1());
		match_PojogenProperty_WSTerminalRuleCall_4_3_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_4_3_0());
		match_PojogenProperty_WSTerminalRuleCall_5_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_5_1());
		match_PojogenProperty_WSTerminalRuleCall_5_3_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_5_3());
		match_PojogenProperty_WSTerminalRuleCall_6_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_6_1());
		match_PojogenProperty_WSTerminalRuleCall_6_3_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_6_3());
		match_PojogenProperty_WSTerminalRuleCall_7_1_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_7_1());
		match_PojogenProperty_WSTerminalRuleCall_7_3_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_7_3());
		match_PojogenProperty_WSTerminalRuleCall_8_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_8_1_0());
		match_PojogenProperty_WSTerminalRuleCall_9_1_0_p = new TokenAlias(true, false, grammarAccess.getPojogenPropertyAccess().getWSTerminalRuleCall_9_1_0());
		match_Property_WSTerminalRuleCall_0_6_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1());
		match_Property_WSTerminalRuleCall_0_6_3_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_3());
		match_Property_WSTerminalRuleCall_0_7_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_7_1());
		match_Property_WSTerminalRuleCall_0_7_3_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_7_3());
		match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal WS: (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DaogenProperty_WSTerminalRuleCall_0_1_0_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_0_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_10_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_10_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_1_1_0_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_1_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_2_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_3_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_4_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_5_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_7_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_7_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_7_3_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_7_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_8_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_8_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DaogenProperty_WSTerminalRuleCall_9_1_p.equals(syntax))
				emit_DaogenProperty_WSTerminalRuleCall_9_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_10_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_10_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_14_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_14_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_15_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_15_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_16_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_16_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_17_1_0_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_17_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_18_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_18_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_2_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_3_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_4_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_5_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_6_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_6_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_7_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_7_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_8_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_8_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DatabaseProperty_WSTerminalRuleCall_9_1_p.equals(syntax))
				emit_DatabaseProperty_WSTerminalRuleCall_9_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DebugLevelAssignement_WSTerminalRuleCall_1_0_p.equals(syntax))
				emit_DebugLevelAssignement_WSTerminalRuleCall_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_0_p.equals(syntax))
				emit_ExtendsAssignementGenerics_WSTerminalRuleCall_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignementGenerics_WSTerminalRuleCall_2_2_0_p.equals(syntax))
				emit_ExtendsAssignementGenerics_WSTerminalRuleCall_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_0_p.equals(syntax))
				emit_ExtendsAssignementGenerics_WSTerminalRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignementGenerics_WSTerminalRuleCall_3_2_0_p.equals(syntax))
				emit_ExtendsAssignementGenerics_WSTerminalRuleCall_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignement_WSTerminalRuleCall_2_0_p.equals(syntax))
				emit_ExtendsAssignement_WSTerminalRuleCall_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignement_WSTerminalRuleCall_2_2_0_p.equals(syntax))
				emit_ExtendsAssignement_WSTerminalRuleCall_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignement_WSTerminalRuleCall_3_0_p.equals(syntax))
				emit_ExtendsAssignement_WSTerminalRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendsAssignement_WSTerminalRuleCall_3_2_0_p.equals(syntax))
				emit_ExtendsAssignement_WSTerminalRuleCall_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extends_ExceptDaosKeyword_7_0_q.equals(syntax))
				emit_Extends_ExceptDaosKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extends_ExceptPojosKeyword_6_0_q.equals(syntax))
				emit_Extends_ExceptPojosKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extends_OnlyDaosKeyword_5_0_q.equals(syntax))
				emit_Extends_OnlyDaosKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extends_OnlyPojosKeyword_4_0_q.equals(syntax))
				emit_Extends_OnlyPojosKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_0_p.equals(syntax))
				emit_ImplementsAssignementGenerics_WSTerminalRuleCall_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignementGenerics_WSTerminalRuleCall_2_2_0_p.equals(syntax))
				emit_ImplementsAssignementGenerics_WSTerminalRuleCall_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_0_p.equals(syntax))
				emit_ImplementsAssignementGenerics_WSTerminalRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignementGenerics_WSTerminalRuleCall_3_2_0_p.equals(syntax))
				emit_ImplementsAssignementGenerics_WSTerminalRuleCall_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignement_WSTerminalRuleCall_2_0_p.equals(syntax))
				emit_ImplementsAssignement_WSTerminalRuleCall_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignement_WSTerminalRuleCall_2_2_0_p.equals(syntax))
				emit_ImplementsAssignement_WSTerminalRuleCall_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignement_WSTerminalRuleCall_3_0_p.equals(syntax))
				emit_ImplementsAssignement_WSTerminalRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplementsAssignement_WSTerminalRuleCall_3_2_0_p.equals(syntax))
				emit_ImplementsAssignement_WSTerminalRuleCall_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Implements_ExceptDaosKeyword_7_0_q.equals(syntax))
				emit_Implements_ExceptDaosKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Implements_ExceptPojosKeyword_6_0_q.equals(syntax))
				emit_Implements_ExceptPojosKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Implements_OnlyDaosKeyword_5_0_q.equals(syntax))
				emit_Implements_OnlyDaosKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Implements_OnlyPojosKeyword_4_0_q.equals(syntax))
				emit_Implements_OnlyPojosKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_0_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_0_4_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_0_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_0_4_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_0_4_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_0_5_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_0_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_0_5_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_0_5_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_13_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_13_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_13_3_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_13_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_14_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_14_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_14_3_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_14_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_15_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_15_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_15_3_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_15_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_16_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_16_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_18_1_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_18_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_19_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_19_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_19_3_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_19_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_1_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_1_3_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_1_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_1_5_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_1_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_20_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_20_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_2_1_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_2_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_2_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_2_2_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_2_2_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_2_3_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_2_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_2_3_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_2_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_3_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_3_3_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_3_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_3_5_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_3_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_4_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_4_3_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_4_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_5_1_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_5_3_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_5_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_7_1_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_7_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_7_1_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_7_1_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_8_1_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_8_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetagenProperty_WSTerminalRuleCall_8_1_2_0_p.equals(syntax))
				emit_MetagenProperty_WSTerminalRuleCall_8_1_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_0_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_0_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_10_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_10_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_11_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_11_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_12_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_12_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_12_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_12_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_13_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_13_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_13_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_13_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_14_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_14_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_14_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_14_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_15_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_15_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_15_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_15_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_16_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_16_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_17_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_17_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_17_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_17_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_18_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_18_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_18_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_18_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_19_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_19_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_19_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_19_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_1_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_1_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_1_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_20_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_20_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_20_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_20_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_21_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_21_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_21_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_21_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_22_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_22_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_22_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_22_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_23_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_23_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_23_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_23_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_24_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_24_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_24_3_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_24_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_24_5_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_24_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_25_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_25_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_26_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_26_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_27_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_27_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_28_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_28_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_29_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_29_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_2_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_2_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_2_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_30_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_30_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_33_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_33_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_35_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_35_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_35_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_35_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_35_3_2_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_35_3_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_35_4_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_35_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_35_4_2_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_35_4_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_36_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_36_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_37_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_37_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_38_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_38_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_39_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_39_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_3_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_3_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_3_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_40_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_40_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_41_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_41_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_41_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_41_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_4_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_4_3_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_4_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_5_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_5_3_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_5_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_6_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_6_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_6_3_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_6_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_7_1_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_7_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_7_3_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_7_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_8_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_8_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PojogenProperty_WSTerminalRuleCall_9_1_0_p.equals(syntax))
				emit_PojogenProperty_WSTerminalRuleCall_9_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_6_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_6_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_6_3_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_6_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_7_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_7_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_7_3_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_7_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_0_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_10_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_1_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_7_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_7_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_8_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DaogenProperty_WSTerminalRuleCall_9_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_10_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_14_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_15_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_16_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_17_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_18_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_6_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_7_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_8_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DatabaseProperty_WSTerminalRuleCall_9_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_DebugLevelAssignement_WSTerminalRuleCall_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignementGenerics_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignementGenerics_WSTerminalRuleCall_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignementGenerics_WSTerminalRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignementGenerics_WSTerminalRuleCall_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignement_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignement_WSTerminalRuleCall_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignement_WSTerminalRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ExtendsAssignement_WSTerminalRuleCall_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exceptDaos'?
	 */
	protected void emit_Extends_ExceptDaosKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exceptPojos'?
	 */
	protected void emit_Extends_ExceptPojosKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'onlyDaos'?
	 */
	protected void emit_Extends_OnlyDaosKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'onlyPojos'?
	 */
	protected void emit_Extends_OnlyPojosKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignementGenerics_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignementGenerics_WSTerminalRuleCall_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignementGenerics_WSTerminalRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignementGenerics_WSTerminalRuleCall_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignement_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignement_WSTerminalRuleCall_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignement_WSTerminalRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ImplementsAssignement_WSTerminalRuleCall_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exceptDaos'?
	 */
	protected void emit_Implements_ExceptDaosKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'exceptPojos'?
	 */
	protected void emit_Implements_ExceptPojosKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'onlyDaos'?
	 */
	protected void emit_Implements_OnlyDaosKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'onlyPojos'?
	 */
	protected void emit_Implements_OnlyPojosKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_0_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_0_4_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_0_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_0_5_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_13_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_13_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_14_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_14_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_15_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_15_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_16_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_18_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_19_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_19_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_1_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_1_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_20_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_2_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_2_2_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_2_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_2_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_3_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_3_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_4_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_5_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_7_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_7_1_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_8_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_MetagenProperty_WSTerminalRuleCall_8_1_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_0_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_10_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_11_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_12_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_12_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_13_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_13_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_14_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_14_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_15_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_15_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_16_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_17_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_17_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_18_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_18_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_19_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_19_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_1_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_20_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_20_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_21_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_21_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_22_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_22_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_23_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_23_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_24_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_24_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_24_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_25_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_26_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_27_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_28_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_29_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_2_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_30_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_33_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_35_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_35_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_35_3_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_35_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_35_4_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_36_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_37_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_38_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_39_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_3_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_40_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_41_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_41_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_4_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_5_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_6_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_6_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_7_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_7_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_8_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_PojogenProperty_WSTerminalRuleCall_9_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_6_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_6_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_7_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_7_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
