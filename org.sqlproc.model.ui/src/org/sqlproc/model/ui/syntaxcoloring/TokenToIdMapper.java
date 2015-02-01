package org.sqlproc.model.ui.syntaxcoloring;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.sqlproc.model.parser.antlr.internal.InternalProcessorModelLexer;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    private static final Set<Integer> punctations = new HashSet<Integer>();
    static {
        // punctations.add(InternalProcessorModelLexer.RULE_IDENT_DOT);
        // punctations.add(InternalProcessorModelLexer.RULE_IDENT);
        // punctations.add(InternalProcessorModelLexer.RULE_NUMBER);
        // punctations.add(InternalProcessorModelLexer.RULE_ESC_CHAR);
        // punctations.add(InternalProcessorModelLexer.RULE_AND);
        // punctations.add(InternalProcessorModelLexer.RULE_OR);
        // punctations.add(InternalProcessorModelLexer.RULE_COLON);
        // punctations.add(InternalProcessorModelLexer.RULE_SEMICOLON);
        punctations.add(InternalProcessorModelLexer.RULE_STRING);
        // punctations.add(InternalProcessorModelLexer.RULE_COMMA);
        // punctations.add(InternalProcessorModelLexer.RULE_MINUS);
        // punctations.add(InternalProcessorModelLexer.RULE_PLUS);
        // punctations.add(InternalProcessorModelLexer.RULE_LPAREN);
        // punctations.add(InternalProcessorModelLexer.RULE_RPAREN);
        // punctations.add(InternalProcessorModelLexer.RULE_LBRACE);
        // punctations.add(InternalProcessorModelLexer.RULE_RBRACE);
        // punctations.add(InternalProcessorModelLexer.RULE_QUESTI);
        // punctations.add(InternalProcessorModelLexer.RULE_NOT);
        // punctations.add(InternalProcessorModelLexer.RULE_BAND);
        // punctations.add(InternalProcessorModelLexer.RULE_BOR);
        // punctations.add(InternalProcessorModelLexer.RULE_HASH);
        // punctations.add(InternalProcessorModelLexer.RULE_AT);
        // punctations.add(InternalProcessorModelLexer.RULE_CARET);
        // punctations.add(InternalProcessorModelLexer.RULE_EQUALS);
        // punctations.add(InternalProcessorModelLexer.RULE_LESS_THAN);
        // punctations.add(InternalProcessorModelLexer.RULE_MORE_THAN);
        // punctations.add(InternalProcessorModelLexer.RULE_PERCENT);
        // punctations.add(InternalProcessorModelLexer.RULE_DOT);
        //
        // punctations.add(InternalProcessorModelLexer.RULE_REST);
    }

    private static final Set<String> types = new HashSet<String>();
    static {
        types.add("'QRY'");
        types.add("'CRUD'");
        types.add("'CALL'");
        types.add("'OUT'");
        types.add("'OPT'");
        types.add("'LOPT'");
        types.add("'IOPT'");
        types.add("'SOPT'");
        types.add("'BOPT'");
        types.add("'MOPT'");
    }

    private static final Set<String> keywords = new HashSet<String>();
    static {
        keywords.add("'pojo'");
        keywords.add("'table'");
        keywords.add("'procedure'");
        keywords.add("'function'");
        keywords.add("'package'");
        keywords.add("'import'");
        keywords.add("'implements'");
        keywords.add("'extends'");
        keywords.add("'onlyPojos'");
        keywords.add("'onlyDaos'");
        keywords.add("'exceptPojos'");
        keywords.add("'exceptDaos'");
        keywords.add("'final'");
        keywords.add("'abstract'");
        keywords.add("'enum'");
        keywords.add("'dao'");
    }

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        if (punctations.contains(tokenType))
            return HighlightingConfiguration.PUNCTATION;

        if (tokenType == InternalProcessorModelLexer.RULE_ML_COMMENT
                || tokenType == InternalProcessorModelLexer.RULE_SL_COMMENT)
            return HighlightingConfiguration.COMMENT;

        if (types.contains(tokenName))
            return HighlightingConfiguration.TYPE;

        if (keywords.contains(tokenName))
            return HighlightingConfiguration.KEYWORD;

        return HighlightingConfiguration.DEFAULT;
    }
}
