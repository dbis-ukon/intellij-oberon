// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OberonType extends PsiElement {

  @Nullable
  OberonArrayType getArrayType();

  @Nullable
  OberonPointerType getPointerType();

  @Nullable
  OberonProcedureType getProcedureType();

  @Nullable
  OberonQualident getQualident();

  @Nullable
  OberonRecordType getRecordType();

}
