package kn.uni.dbis.oberon.lang.psi;

import com.intellij.psi.tree.IElementType;
import kn.uni.dbis.oberon.lang.OberonLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class OberonTokenType extends IElementType {

    public OberonTokenType(@NotNull @NonNls String debugName) {
        super(debugName, OberonLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "OberonTokenType." + super.toString();
    }

}
