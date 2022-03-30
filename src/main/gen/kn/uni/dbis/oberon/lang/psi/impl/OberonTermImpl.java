// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kn.uni.dbis.oberon.lang.psi.OberonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kn.uni.dbis.oberon.lang.psi.*;

public class OberonTermImpl extends ASTWrapperPsiElement implements OberonTerm {

  public OberonTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<OberonFactor> getFactorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonFactor.class);
  }

  @Override
  @NotNull
  public List<OberonMultOperator> getMultOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonMultOperator.class);
  }

}
