package org.sqlproc.model.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.sqlproc.model.parser.antlr.internal.InternalProcessorModelLexer;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        if (tokenType == InternalProcessorModelLexer.RULE_BAND || tokenType == InternalProcessorModelLexer.RULE_RBRACE
                || tokenType == InternalProcessorModelLexer.RULE_CARET
                || tokenType == InternalProcessorModelLexer.RULE_MORE_THAN
                || tokenType == InternalProcessorModelLexer.RULE_SEMICOLON
                || tokenType == InternalProcessorModelLexer.RULE_PLUS
                || tokenType == InternalProcessorModelLexer.RULE_OR
                || tokenType == InternalProcessorModelLexer.RULE_HASH
                || tokenType == InternalProcessorModelLexer.RULE_COMMA
                || tokenType == InternalProcessorModelLexer.RULE_AND
                || tokenType == InternalProcessorModelLexer.RULE_QUESTI
                || tokenType == InternalProcessorModelLexer.RULE_NOT
                || tokenType == InternalProcessorModelLexer.RULE_MINUS
                || tokenType == InternalProcessorModelLexer.RULE_COLON
                || tokenType == InternalProcessorModelLexer.RULE_STRING
                || tokenType == InternalProcessorModelLexer.RULE_REST
                || tokenType == InternalProcessorModelLexer.RULE_ESC_CHAR
                || tokenType == InternalProcessorModelLexer.RULE_NUMBER
                || tokenType == InternalProcessorModelLexer.RULE_IDENT
                || tokenType == InternalProcessorModelLexer.RULE_LPAREN
                || tokenType == InternalProcessorModelLexer.RULE_EQUALS
                || tokenType == InternalProcessorModelLexer.RULE_LBRACE
                || tokenType == InternalProcessorModelLexer.RULE_RPAREN
                || tokenType == InternalProcessorModelLexer.RULE_BOR
                || tokenType == InternalProcessorModelLexer.RULE_LESS_THAN
                || tokenType == InternalProcessorModelLexer.RULE_PERCENT
                || tokenType == InternalProcessorModelLexer.RULE_IDENT_DOT
                || tokenType == InternalProcessorModelLexer.RULE_AT)
            return HighlightingConfiguration.PUNCTATION;

        if (tokenType == InternalProcessorModelLexer.RULE_ML_COMMENT
                || tokenType == InternalProcessorModelLexer.RULE_SL_COMMENT)
            return HighlightingConfiguration.COMMENT;

        if (tokenName.equals("'BOPT'") || tokenName.equals("'OUT'") || tokenName.equals("'SOPT'")
                || tokenName.equals("'OPT'") || tokenName.equals("'QRY'") || tokenName.equals("'IOPT'")
                || tokenName.equals("'LOPT'") || tokenName.equals("'MOPT'") || tokenName.equals("'CRUD'")
                || tokenName.equals("'CALL'") || tokenName.equals("'pojo'") || tokenName.equals("'out'")
                || tokenName.equals("'in'") || tokenName.equals("'const'") || tokenName.equals("'table'")
                || tokenName.equals("'col'") || tokenName.equals("'prefix'") || tokenName.startsWith("'database")
                || tokenName.startsWith("'resolve") || tokenName.equals("'abstract'") || tokenName.equals("'package'")
                || tokenName.startsWith("'equals") || tokenName.equals("'outx'") || tokenName.equals("'inx'")
                || tokenName.equals("'constx'") || tokenName.equals("'colx'") || tokenName.equals("'final'")
                || tokenName.equals("'discriminator'") || tokenName.equals("'required'")
                || tokenName.equals("'primaryKey'") || tokenName.equals("'dao'") || tokenName.equals("'procedure'")
                || tokenName.equals("'function'"))
            return HighlightingConfiguration.TYPE;

        return HighlightingConfiguration.DEFAULT;
    }
}
