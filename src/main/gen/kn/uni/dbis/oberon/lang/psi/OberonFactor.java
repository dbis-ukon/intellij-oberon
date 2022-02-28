// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonFactor extends PsiElement {

  @Nullable
  OberonActualParameters getActualParameters();

  @Nullable
  OberonBoolean getBoolean();

  @Nullable
  OberonExpression getExpression();

  @Nullable
  OberonFactor getFactor();

  @Nullable
  OberonIdent getIdent();

  @Nullable
  OberonInteger getInteger();

  @Nullable
  OberonReal getReal();

  @NotNull
  List<OberonSelector> getSelectorList();

  @Nullable
  OberonString getString();

}
