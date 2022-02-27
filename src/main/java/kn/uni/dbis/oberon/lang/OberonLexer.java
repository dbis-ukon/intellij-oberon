package kn.uni.dbis.oberon.lang;

import com.intellij.lexer.LexerBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.text.CharArrayUtil;
import kn.uni.dbis.oberon.lang.psi.OberonTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static kn.uni.dbis.oberon.lang.OberonKeyword.*;

public class OberonLexer extends LexerBase {

    private static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(ARRAY, AND, BEGIN, BY, CONST, DIV, DO,
            ELSE, ELSIF,  END, EXIT, EXTERN, FALSE, FOR, FUNCTION, IF, LOOP, MOD, MODULE, NEW, OF, OR, PROCEDURE,
            RECORD, REPEAT, RETURN, THEN, TO, TRUE, TYPE, UNTIL, VAR, WITH, WHILE));

    public static boolean isKeyword(String id) {
        return KEYWORDS.contains(id);
    }

    private _OberonLexer lexer;
    private CharSequence buffer;
    private char @Nullable [] bufferArray;
    private IElementType tokenType;
    private int tokenStart;
    private int tokenEnd;
    private int bufferEnd;

    public OberonLexer() {
        this.lexer = new _OberonLexer();
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        this.buffer = buffer;
        this.bufferArray = CharArrayUtil.fromSequenceWithoutCopying(buffer);
        this.tokenType = null;
        this.tokenStart = startOffset;
        this.tokenEnd = startOffset;
        this.bufferEnd = endOffset;
    }

    @Override
    public int getState() {
        return 0;
    }

    @Override
    public IElementType getTokenType() {
        scanToken();
        return this.tokenType;
    }

    @Override
    public int getTokenStart() {
        return tokenStart;
    }

    @Override
    public int getTokenEnd() {
        scanToken();
        return tokenEnd;
    }

    @Override
    public void advance() {
        scanToken();
        this.tokenType = null;
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return this.buffer;
    }

    @Override
    public int getBufferEnd() {
        return this.bufferEnd;
    }

    private void scanToken() {
        if (this.tokenType == null) {
            return;
        }
        if (this.tokenEnd == this.bufferEnd) {
            this.tokenStart = this.bufferEnd;
            return;
        }
        this.tokenStart = this.tokenEnd;
        final char c = charAt(this.tokenStart);
        switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
            case '\f':
                this.tokenType = TokenType.WHITE_SPACE;
                this.tokenEnd = scanWhitespace(this.tokenStart + 1);
                break;
            case '(':
                if (this.tokenStart + 1 >= this.bufferEnd) {
                    this.tokenType = OberonTypes.LPAREN;
                    this.tokenEnd = this.bufferEnd;
                } else {
                    char next = charAt(this.tokenStart + 1);
                    if (next == '*') {
                        this.tokenType = OberonTypes.COMMENT;
                        this.tokenEnd = this.scanComment(this.tokenStart + 2);
                    }
                }
            default:
                _scanToken();
        }
        if (this.tokenEnd > this.bufferEnd) {
            this.tokenEnd = this.bufferEnd;
        }
    }

    private void _scanToken() {
        try {
            this.lexer.goTo(this.tokenStart);
            this.tokenType = this.lexer.advance();
            this.tokenEnd = this.lexer.getTokenEnd();
        } catch (IOException e) {
            // Impossible
        }
    }

    private int scanComment(int offset) {
        int pos = offset;
        while (pos < this.bufferEnd - 1) {
            char c = charAt(pos);
            if (c == '*' && (charAt(pos + 1)) == ')') {
                break;
            }
            pos++;
        }
        return pos + 2;
    }

    private int scanWhitespace(int offset) {
        if (offset >= this.bufferEnd) {
            return this.bufferEnd;
        }
        int pos = offset;
        char c = charAt(pos);
        while (c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '\f') {
            pos++;
            if (pos == this.bufferEnd) {
                return pos;
            }
            c = charAt(pos);
        }
        return pos;
    }

    private char charAt(int position) {
        return this.bufferArray != null ? this.bufferArray[position] : this.buffer.charAt(position);
    }
}
