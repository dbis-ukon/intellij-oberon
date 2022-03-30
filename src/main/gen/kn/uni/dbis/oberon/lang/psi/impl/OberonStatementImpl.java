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

public class OberonStatementImpl extends ASTWrapperPsiElement implements OberonStatement {

  public OberonStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OberonAssignment getAssignment() {
    return findChildByClass(OberonAssignment.class);
  }

  @Override
  @Nullable
  public OberonCaseStatement getCaseStatement() {
    return findChildByClass(OberonCaseStatement.class);
  }

  @Override
  @Nullable
  public OberonForStatement getForStatement() {
    return findChildByClass(OberonForStatement.class);
  }

  @Override
  @Nullable
  public OberonIfStatement getIfStatement() {
    return findChildByClass(OberonIfStatement.class);
  }

  @Override
  @Nullable
  public OberonLoopStatement getLoopStatement() {
    return findChildByClass(OberonLoopStatement.class);
  }

  @Override
  @Nullable
  public OberonProcedureCall getProcedureCall() {
    return findChildByClass(OberonProcedureCall.class);
  }

  @Override
  @Nullable
  public OberonRepeatStatement getRepeatStatement() {
    return findChildByClass(OberonRepeatStatement.class);
  }

  @Override
  @Nullable
  public OberonWhileStatement getWhileStatement() {
    return findChildByClass(OberonWhileStatement.class);
  }

}
