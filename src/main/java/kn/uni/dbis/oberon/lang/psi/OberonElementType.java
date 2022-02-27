package kn.uni.dbis.oberon.lang.psi;

import com.intellij.psi.tree.IElementType;
import kn.uni.dbis.oberon.lang.OberonLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class OberonElementType extends IElementType {

    public OberonElementType(@NotNull @NonNls String debugName) {
        super(debugName, OberonLanguage.INSTANCE);
    }

}
