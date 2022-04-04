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

public class OberonFactorImpl extends ASTWrapperPsiElement implements OberonFactor {

  public OberonFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitFactor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OberonActualParameters getActualParameters() {
    return findChildByClass(OberonActualParameters.class);
  }

  @Override
  @Nullable
  public OberonDesignator getDesignator() {
    return findChildByClass(OberonDesignator.class);
  }

  @Override
  @Nullable
  public OberonExpression getExpression() {
    return findChildByClass(OberonExpression.class);
  }

  @Override
  @Nullable
  public OberonFactor getFactor() {
    return findChildByClass(OberonFactor.class);
  }

  @Override
  @Nullable
  public OberonSet getSet() {
    return findChildByClass(OberonSet.class);
  }

}
