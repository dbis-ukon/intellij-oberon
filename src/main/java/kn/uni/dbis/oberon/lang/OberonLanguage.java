package kn.uni.dbis.oberon.lang;

import com.intellij.lang.Language;

public class OberonLanguage extends Language {

    public static final OberonLanguage INSTANCE = new OberonLanguage();

    private OberonLanguage() {
        super("Oberon");
    }

}
