// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonSimpleExpression extends PsiElement {

  @NotNull
  List<OberonAndOperator> getAndOperatorList();

  @NotNull
  List<OberonTerm> getTermList();

}
