package kn.uni.dbis.oberon.lang;

import b.f.O;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import kn.uni.dbis.oberon.lang.psi.OberonTokenType;
import kn.uni.dbis.oberon.lang.psi.OberonTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.EMPTY_ARRAY;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class OberonSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("OBERON_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TYPE =
            createTextAttributesKey("OBERON_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("OBERON_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("OBERON_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey SYMBOL =
            createTextAttributesKey("OBERON_SYMBOL", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("OBERON_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey PERIOD =
            createTextAttributesKey("OBERON_PERIOD", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("OBERON_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey BRACES =
            createTextAttributesKey("OBERON_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("OBERON_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("OBERON_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("OBERON_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey CONSTANT =
            createTextAttributesKey("OBERON_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey BOOLEAN =
            createTextAttributesKey("OBERON_BOOLEAN", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey NIL =
            createTextAttributesKey("OBERON_NIL", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey INTEGER =
            createTextAttributesKey("OBERON_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey REAL =
            createTextAttributesKey("OBERON_REAL", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("OBERON_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("OBERON_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final Map<IElementType, TextAttributesKey> keys;

    private static void keysPutEach(Iterable<IElementType> tokenTypes, TextAttributesKey value) {
        for (IElementType tokenType : tokenTypes) {
            keys.put(tokenType, value);
        }
    }

    static {
        keys = new HashMap<>(0);

        // Keywords
        keysPutEach(
            Arrays.asList(
                OberonTypes.KW_AND,
                OberonTypes.KW_ARRAY,
                OberonTypes.KW_BEGIN,
                OberonTypes.KW_BY,
                OberonTypes.KW_CASE,
                OberonTypes.KW_CONST,
                OberonTypes.KW_DO,
                OberonTypes.KW_ELSE,
                OberonTypes.KW_ELSIF,
                OberonTypes.KW_END,
                OberonTypes.KW_EXIT,
                OberonTypes.KW_EXTERN,
                OberonTypes.KW_FOR,
                OberonTypes.KW_FUNCTION,
                OberonTypes.KW_IF,
                OberonTypes.KW_IMPORT,
                OberonTypes.KW_LOOP,
                OberonTypes.KW_MODULE,
                OberonTypes.KW_NEW,
                OberonTypes.KW_OF,
                OberonTypes.KW_POINTER,
                OberonTypes.KW_PROCEDURE,
                OberonTypes.KW_RECORD,
                OberonTypes.KW_REPEAT,
                OberonTypes.KW_RETURN,
                OberonTypes.KW_THEN,
                OberonTypes.KW_TO,
                OberonTypes.KW_TYPE,
                OberonTypes.KW_UNTIL,
                OberonTypes.KW_VAR,
                OberonTypes.KW_WHILE,
                OberonTypes.KW_WITH
            ),
            KEYWORD
        );

        // Built-in Types
        keysPutEach(
            Arrays.asList(
                OberonTypes.KW_BOOLEAN,
                OberonTypes.KW_INTEGER,
                OberonTypes.KW_LONGINT,
                OberonTypes.KW_LONGREAL,
                OberonTypes.KW_REAL,
                OberonTypes.KW_STRING
            ),
            TYPE
        );

        // Operators
        keysPutEach(
            Arrays.asList(
                OberonTypes.OP_AND,
                OberonTypes.OP_BECOMES,
                OberonTypes.OP_DEREF,
                OberonTypes.OP_DIV,
                OberonTypes.OP_DIVIDE,
                OberonTypes.OP_EQ,
                OberonTypes.OP_GEQ,
                OberonTypes.OP_GT,
                OberonTypes.OP_IN,
                OberonTypes.OP_IS,
                OberonTypes.OP_LEQ,
                OberonTypes.OP_LT,
                OberonTypes.OP_MINUS,
                OberonTypes.OP_MOD,
                OberonTypes.OP_NEQ,
                OberonTypes.OP_NOT,
                OberonTypes.OP_OR,
                OberonTypes.OP_PLUS,
                OberonTypes.OP_TIMES
            ),
            OPERATOR
        );

        // Braces, brackets, and parentheses
        keysPutEach(Arrays.asList(OberonTypes.LBRACE, OberonTypes.RBRACE), BRACES);
        keysPutEach(Arrays.asList(OberonTypes.LBRACK, OberonTypes.RBRACK), BRACKETS);
        keysPutEach(Arrays.asList(OberonTypes.LPAREN, OberonTypes.RPAREN), PARENTHESES);

        // Values
        keysPutEach(Arrays.asList(OberonTypes.KW_FALSE, OberonTypes.KW_TRUE), BOOLEAN);
        keys.put(OberonTypes.KW_NIL, NIL);
        keys.put(OberonTypes.INTEGER_LITERAL, INTEGER);
        keys.put(OberonTypes.REAL_LITERAL, REAL);
        keys.put(OberonTypes.STRING_LITERAL, STRING);

        // Punctuation
        keys.put(OberonTypes.COMMA, COMMA);
        keys.put(OberonTypes.COMMENT, COMMENT);
        keys.put(OberonTypes.IDENTIFIER, IDENTIFIER);
        keys.put(OberonTypes.PERIOD, PERIOD);
        keys.put(OberonTypes.SEMICOLON, SEMICOLON);

        // Catch all
        keysPutEach(
            Arrays.asList(
                OberonTypes.COLON,
                OberonTypes.PIPE,
                OberonTypes.RANGE,
                OberonTypes.VARARGS
            ),
            SYMBOL
        );

    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new OberonLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey [] getTokenHighlights(IElementType tokenType) {
        return pack(keys.get(tokenType), EMPTY_ARRAY);
    }

}
