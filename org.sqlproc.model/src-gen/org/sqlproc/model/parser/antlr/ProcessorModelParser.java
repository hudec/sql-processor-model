/*
* generated by Xtext
*/
package org.sqlproc.model.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.sqlproc.model.services.ProcessorModelGrammarAccess;

public class ProcessorModelParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ProcessorModelGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.sqlproc.model.parser.antlr.internal.InternalProcessorModelParser createParser(XtextTokenStream stream) {
		return new org.sqlproc.model.parser.antlr.internal.InternalProcessorModelParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Artifacts";
	}
	
	public ProcessorModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProcessorModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}