// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonSelector extends PsiElement {

  @NotNull
  List<OberonExpression> getExpressionList();

  @Nullable
  OberonIdent getIdent();

  @Nullable
  OberonQualident getQualident();

}
