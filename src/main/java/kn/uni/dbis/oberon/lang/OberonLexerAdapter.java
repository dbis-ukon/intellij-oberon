package kn.uni.dbis.oberon.lang;

import com.intellij.lexer.FlexAdapter;

public class OberonLexerAdapter extends FlexAdapter {

    public OberonLexerAdapter() {
        super(new _OberonLexer(null));
    }

}
