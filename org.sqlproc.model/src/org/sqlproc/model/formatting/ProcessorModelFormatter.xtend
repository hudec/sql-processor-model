/*
 * generated by Xtext
 */
package org.sqlproc.model.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
 import com.google.inject.Inject;
 import org.sqlproc.model.services.ProcessorModelGrammarAccess
import org.eclipse.xtext.xbase.formatting.XbaseFormatter

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class ProcessorModelFormatter extends XbaseFormatter {

	@Inject extension ProcessorModelGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		c.setAutoLinewrap(120)
		
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)

		c.setLinewrap(2).after(packageAccess.leftCurlyBracketKeyword_3)
		c.setLinewrap().before(packageAccess.rightCurlyBracketKeyword_6)
		c.setIndentationIncrement.after(packageAccess.leftCurlyBracketKeyword_3)
		c.setIndentationDecrement.before(packageAccess.rightCurlyBracketKeyword_6)
				
		c.setLinewrap().before(XImportSectionAccess.rule)

		c.setLinewrap().before(implementsAccess.rule)
		c.setLinewrap().before(implementsAccess.implementsKeyword_1)
		c.setLinewrap().before(extendsAccess.rule)
		c.setLinewrap().before(extendsAccess.extendsKeyword_1)
		
		c.setLinewrap(2).before(enumEntityAccess.rule)
		c.setLinewrap().before(enumEntityAccess.enumKeyword_2)
		c.setLinewrap().after(enumEntityAccess.leftCurlyBracketKeyword_4)
		c.setLinewrap().before(enumEntityAccess.rightCurlyBracketKeyword_7)
		c.setIndentationIncrement.after(enumEntityAccess.leftCurlyBracketKeyword_4)
		c.setIndentationDecrement.before(enumEntityAccess.rightCurlyBracketKeyword_7)

		c.setLinewrap().before(enumAttributeAccess.rule)
		c.setLinewrap().before(enumAttributeAccess.attrKeyword_3)

		c.setLinewrap(2).before(pojoEntityAccess.rule)
		c.setLinewrap().before(pojoEntityAccess.pojoKeyword_3)
		c.setLinewrap().after(pojoEntityAccess.leftCurlyBracketKeyword_6)
		c.setLinewrap().before(pojoEntityAccess.rightCurlyBracketKeyword_9)
		c.setIndentationIncrement.after(pojoEntityAccess.leftCurlyBracketKeyword_6)
		c.setIndentationDecrement.before(pojoEntityAccess.rightCurlyBracketKeyword_9)

		c.setLinewrap().before(pojoAttributeAccess.rule)
		c.setLinewrap().before(pojoAttributeAccess.kindAttrKeyword_4_0_0);
		c.setLinewrap().before(pojoAttributeAccess.kindSimpleKeyword_4_0_1);
		c.setLinewrap().before(pojoProcedureAccess.procKeyword_3)

		c.setLinewrap(2).before(daoEntityAccess.rule)
		c.setLinewrap().before(daoEntityAccess.daoKeyword_3)
		c.setLinewrap().after(daoEntityAccess.leftCurlyBracketKeyword_6)
		c.setLinewrap().before(daoEntityAccess.rightCurlyBracketKeyword_9)
		c.setIndentationIncrement.after(daoEntityAccess.leftCurlyBracketKeyword_6)
		c.setIndentationDecrement.before(daoEntityAccess.rightCurlyBracketKeyword_9)
		
		c.setNoSpace().before(LPARENRule)
		c.setNoSpace().after(LPARENRule)
		c.setNoSpace().before(RPARENRule)
		c.setNoSpace().before(COMMARule)

		c.setLinewrap().after(annotationAccess.rule)
		c.setNoSpace().after(XAnnotationAccess.commercialAtKeyword_1)
		c.setNoSpace().before(XAnnotationAccess.leftParenthesisKeyword_3_0)
		c.setNoSpace().after(XAnnotationAccess.leftParenthesisKeyword_3_0)
		c.setNoSpace().before(XAnnotationAccess.rightParenthesisKeyword_3_2)
		c.setNoSpace().before(XAnnotationAccess.commaKeyword_3_1_0_1_0)
	}
}
