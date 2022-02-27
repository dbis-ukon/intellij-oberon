package kn.uni.dbis.oberon.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class OberonFileType extends LanguageFileType {

    public static final OberonFileType INSTANCE = new OberonFileType();

    private OberonFileType() {
        super(OberonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Oberon File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Oberon language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mod";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return OberonIcons.FILE;
    }

 }
