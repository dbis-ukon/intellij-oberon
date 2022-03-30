// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonStatement extends PsiElement {

  @Nullable
  OberonAssignment getAssignment();

  @Nullable
  OberonCaseStatement getCaseStatement();

  @Nullable
  OberonForStatement getForStatement();

  @Nullable
  OberonIfStatement getIfStatement();

  @Nullable
  OberonLoopStatement getLoopStatement();

  @Nullable
  OberonProcedureCall getProcedureCall();

  @Nullable
  OberonRepeatStatement getRepeatStatement();

  @Nullable
  OberonWhileStatement getWhileStatement();

}
