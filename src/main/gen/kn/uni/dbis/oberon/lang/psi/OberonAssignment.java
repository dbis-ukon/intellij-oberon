// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonAssignment extends PsiElement {

  @NotNull
  OberonExpression getExpression();

  @NotNull
  OberonIdent getIdent();

  @NotNull
  List<OberonSelector> getSelectorList();

}
