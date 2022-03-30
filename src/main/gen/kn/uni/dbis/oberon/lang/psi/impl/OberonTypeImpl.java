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

public class OberonTypeImpl extends ASTWrapperPsiElement implements OberonType {

  public OberonTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OberonArrayType getArrayType() {
    return findChildByClass(OberonArrayType.class);
  }

  @Override
  @Nullable
  public OberonPointerType getPointerType() {
    return findChildByClass(OberonPointerType.class);
  }

  @Override
  @Nullable
  public OberonProcedureType getProcedureType() {
    return findChildByClass(OberonProcedureType.class);
  }

  @Override
  @Nullable
  public OberonQualident getQualident() {
    return findChildByClass(OberonQualident.class);
  }

  @Override
  @Nullable
  public OberonRecordType getRecordType() {
    return findChildByClass(OberonRecordType.class);
  }

}