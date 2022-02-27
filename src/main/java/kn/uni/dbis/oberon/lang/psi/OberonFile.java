package kn.uni.dbis.oberon.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import kn.uni.dbis.oberon.lang.OberonFileType;
import kn.uni.dbis.oberon.lang.OberonLanguage;
import org.jetbrains.annotations.NotNull;

public class OberonFile extends PsiFileBase {

    public OberonFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, OberonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return OberonFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Oberon File";
    }

}
