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

public class OberonDeclarationsImpl extends ASTWrapperPsiElement implements OberonDeclarations {

  public OberonDeclarationsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitDeclarations(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OberonConstDeclarations getConstDeclarations() {
    return findChildByClass(OberonConstDeclarations.class);
  }

  @Override
  @NotNull
  public List<OberonProcedureDeclaration> getProcedureDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonProcedureDeclaration.class);
  }

  @Override
  @Nullable
  public OberonTypeDeclarations getTypeDeclarations() {
    return findChildByClass(OberonTypeDeclarations.class);
  }

  @Override
  @Nullable
  public OberonVarDeclarations getVarDeclarations() {
    return findChildByClass(OberonVarDeclarations.class);
  }

}
