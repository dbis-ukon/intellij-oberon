// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kn.uni.dbis.oberon.lang.psi.impl.*;

public interface OberonTypes {

  IElementType ACTUAL_PARAMETERS = new OberonElementType("ACTUAL_PARAMETERS");
  IElementType ARRAY_TYPE = new OberonElementType("ARRAY_TYPE");
  IElementType ASSIGNMENT = new OberonElementType("ASSIGNMENT");
  IElementType CASE = new OberonElementType("CASE");
  IElementType CASE_STATEMENT = new OberonElementType("CASE_STATEMENT");
  IElementType CONST_DECLARATION = new OberonElementType("CONST_DECLARATION");
  IElementType DECLARATION_SEQUENCE = new OberonElementType("DECLARATION_SEQUENCE");
  IElementType DESIGNATOR = new OberonElementType("DESIGNATOR");
  IElementType ELEMENT = new OberonElementType("ELEMENT");
  IElementType EXPRESSION = new OberonElementType("EXPRESSION");
  IElementType FACTOR = new OberonElementType("FACTOR");
  IElementType FIELD_LIST = new OberonElementType("FIELD_LIST");
  IElementType FORMAL_PARAMETERS = new OberonElementType("FORMAL_PARAMETERS");
  IElementType FOR_STATEMENT = new OberonElementType("FOR_STATEMENT");
  IElementType FP_SECTION = new OberonElementType("FP_SECTION");
  IElementType IDENT = new OberonElementType("IDENT");
  IElementType IDENTDEF = new OberonElementType("IDENTDEF");
  IElementType IF_STATEMENT = new OberonElementType("IF_STATEMENT");
  IElementType IMPORT = new OberonElementType("IMPORT");
  IElementType IMPORT_LIST = new OberonElementType("IMPORT_LIST");
  IElementType LABEL = new OberonElementType("LABEL");
  IElementType LABEL_RANGE = new OberonElementType("LABEL_RANGE");
  IElementType LOOP_STATEMENT = new OberonElementType("LOOP_STATEMENT");
  IElementType POINTER_TYPE = new OberonElementType("POINTER_TYPE");
  IElementType PROCEDURE_BODY = new OberonElementType("PROCEDURE_BODY");
  IElementType PROCEDURE_CALL = new OberonElementType("PROCEDURE_CALL");
  IElementType PROCEDURE_DECLARATION = new OberonElementType("PROCEDURE_DECLARATION");
  IElementType PROCEDURE_HEADING = new OberonElementType("PROCEDURE_HEADING");
  IElementType PROCEDURE_TYPE = new OberonElementType("PROCEDURE_TYPE");
  IElementType QUALIDENT = new OberonElementType("QUALIDENT");
  IElementType RECORD_TYPE = new OberonElementType("RECORD_TYPE");
  IElementType REPEAT_STATEMENT = new OberonElementType("REPEAT_STATEMENT");
  IElementType SELECTOR = new OberonElementType("SELECTOR");
  IElementType SET = new OberonElementType("SET");
  IElementType SIMPLE_EXPRESSION = new OberonElementType("SIMPLE_EXPRESSION");
  IElementType STATEMENT = new OberonElementType("STATEMENT");
  IElementType TERM = new OberonElementType("TERM");
  IElementType TYPE = new OberonElementType("TYPE");
  IElementType TYPE_DECLARATION = new OberonElementType("TYPE_DECLARATION");
  IElementType VARIABLE_DECLARATION = new OberonElementType("VARIABLE_DECLARATION");
  IElementType WHILE_STATEMENT = new OberonElementType("WHILE_STATEMENT");

  IElementType COLON = new OberonTokenType(":");
  IElementType COMMA = new OberonTokenType(",");
  IElementType COMMAN = new OberonTokenType("COMMAN");
  IElementType COMMENT = new OberonTokenType("COMMENT");
  IElementType IDENTIFIER = new OberonTokenType("IDENTIFIER");
  IElementType INTEGER = new OberonTokenType("integer");
  IElementType INTEGER_LITERAL = new OberonTokenType("INTEGER_LITERAL");
  IElementType KW_AND = new OberonTokenType("AND");
  IElementType KW_ARRAY = new OberonTokenType("ARRAY");
  IElementType KW_BEGIN = new OberonTokenType("BEGIN");
  IElementType KW_BOOLEAN = new OberonTokenType("BOOLEAN");
  IElementType KW_BY = new OberonTokenType("BY");
  IElementType KW_CASE = new OberonTokenType("CASE");
  IElementType KW_CONST = new OberonTokenType("CONST");
  IElementType KW_DO = new OberonTokenType("DO");
  IElementType KW_ELSE = new OberonTokenType("ELSE");
  IElementType KW_ELSIF = new OberonTokenType("ELSIF");
  IElementType KW_END = new OberonTokenType("END");
  IElementType KW_EXIT = new OberonTokenType("EXIT");
  IElementType KW_EXTERN = new OberonTokenType("EXTERN");
  IElementType KW_FALSE = new OberonTokenType("FALSE");
  IElementType KW_FOR = new OberonTokenType("FOR");
  IElementType KW_FUNCTION = new OberonTokenType("FUNCTION");
  IElementType KW_IF = new OberonTokenType("IF");
  IElementType KW_IMPORT = new OberonTokenType("IMPORT");
  IElementType KW_INTEGER = new OberonTokenType("INTEGER");
  IElementType KW_LONGINT = new OberonTokenType("LONGINT");
  IElementType KW_LONGREAL = new OberonTokenType("LONGREAL");
  IElementType KW_LOOP = new OberonTokenType("LOOP");
  IElementType KW_MODULE = new OberonTokenType("MODULE");
  IElementType KW_NEW = new OberonTokenType("NEW");
  IElementType KW_NIL = new OberonTokenType("NIL");
  IElementType KW_OF = new OberonTokenType("OF");
  IElementType KW_POINTER = new OberonTokenType("POINTER");
  IElementType KW_PROCEDURE = new OberonTokenType("PROCEDURE");
  IElementType KW_REAL = new OberonTokenType("REAL");
  IElementType KW_RECORD = new OberonTokenType("RECORD");
  IElementType KW_REPEAT = new OberonTokenType("REPEAT");
  IElementType KW_RETURN = new OberonTokenType("RETURN");
  IElementType KW_STRING = new OberonTokenType("STRING");
  IElementType KW_THEN = new OberonTokenType("THEN");
  IElementType KW_TO = new OberonTokenType("TO");
  IElementType KW_TRUE = new OberonTokenType("TRUE");
  IElementType KW_TYPE = new OberonTokenType("TYPE");
  IElementType KW_UNTIL = new OberonTokenType("UNTIL");
  IElementType KW_VAR = new OberonTokenType("VAR");
  IElementType KW_WHILE = new OberonTokenType("WHILE");
  IElementType KW_WITH = new OberonTokenType("WITH");
  IElementType LBRACE = new OberonTokenType("{");
  IElementType LBRACK = new OberonTokenType("[");
  IElementType LPAREN = new OberonTokenType("(");
  IElementType OP_AND = new OberonTokenType("&");
  IElementType OP_BECOMES = new OberonTokenType(":=");
  IElementType OP_DEREF = new OberonTokenType("^");
  IElementType OP_DIV = new OberonTokenType("DIV");
  IElementType OP_DIVIDE = new OberonTokenType("/");
  IElementType OP_EQ = new OberonTokenType("=");
  IElementType OP_GEQ = new OberonTokenType(">=");
  IElementType OP_GT = new OberonTokenType(">");
  IElementType OP_IN = new OberonTokenType("IN");
  IElementType OP_IS = new OberonTokenType("IS");
  IElementType OP_LEQ = new OberonTokenType("<=");
  IElementType OP_LT = new OberonTokenType("<");
  IElementType OP_MINUS = new OberonTokenType("-");
  IElementType OP_MOD = new OberonTokenType("MOD");
  IElementType OP_NEQ = new OberonTokenType("#");
  IElementType OP_NOT = new OberonTokenType("~");
  IElementType OP_OR = new OberonTokenType("OR");
  IElementType OP_PLUS = new OberonTokenType("+");
  IElementType OP_TIMES = new OberonTokenType("*");
  IElementType PERIOD = new OberonTokenType(".");
  IElementType PIPE = new OberonTokenType("|");
  IElementType RANGE = new OberonTokenType("..");
  IElementType RBRACE = new OberonTokenType("}");
  IElementType RBRACK = new OberonTokenType("]");
  IElementType REAL_LITERAL = new OberonTokenType("REAL_LITERAL");
  IElementType RPAREN = new OberonTokenType(")");
  IElementType SEMICOLON = new OberonTokenType(";");
  IElementType STRING_LITERAL = new OberonTokenType("STRING_LITERAL");
  IElementType VARARGS = new OberonTokenType("...");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTUAL_PARAMETERS) {
        return new OberonActualParametersImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new OberonArrayTypeImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new OberonAssignmentImpl(node);
      }
      else if (type == CASE) {
        return new OberonCaseImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new OberonCaseStatementImpl(node);
      }
      else if (type == CONST_DECLARATION) {
        return new OberonConstDeclarationImpl(node);
      }
      else if (type == DECLARATION_SEQUENCE) {
        return new OberonDeclarationSequenceImpl(node);
      }
      else if (type == DESIGNATOR) {
        return new OberonDesignatorImpl(node);
      }
      else if (type == ELEMENT) {
        return new OberonElementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new OberonExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new OberonFactorImpl(node);
      }
      else if (type == FIELD_LIST) {
        return new OberonFieldListImpl(node);
      }
      else if (type == FORMAL_PARAMETERS) {
        return new OberonFormalParametersImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new OberonForStatementImpl(node);
      }
      else if (type == FP_SECTION) {
        return new OberonFpSectionImpl(node);
      }
      else if (type == IDENT) {
        return new OberonIdentImpl(node);
      }
      else if (type == IDENTDEF) {
        return new OberonIdentdefImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new OberonIfStatementImpl(node);
      }
      else if (type == IMPORT) {
        return new OberonImportImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new OberonImportListImpl(node);
      }
      else if (type == LABEL) {
        return new OberonLabelImpl(node);
      }
      else if (type == LABEL_RANGE) {
        return new OberonLabelRangeImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new OberonLoopStatementImpl(node);
      }
      else if (type == POINTER_TYPE) {
        return new OberonPointerTypeImpl(node);
      }
      else if (type == PROCEDURE_BODY) {
        return new OberonProcedureBodyImpl(node);
      }
      else if (type == PROCEDURE_CALL) {
        return new OberonProcedureCallImpl(node);
      }
      else if (type == PROCEDURE_DECLARATION) {
        return new OberonProcedureDeclarationImpl(node);
      }
      else if (type == PROCEDURE_HEADING) {
        return new OberonProcedureHeadingImpl(node);
      }
      else if (type == PROCEDURE_TYPE) {
        return new OberonProcedureTypeImpl(node);
      }
      else if (type == QUALIDENT) {
        return new OberonQualidentImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new OberonRecordTypeImpl(node);
      }
      else if (type == REPEAT_STATEMENT) {
        return new OberonRepeatStatementImpl(node);
      }
      else if (type == SELECTOR) {
        return new OberonSelectorImpl(node);
      }
      else if (type == SET) {
        return new OberonSetImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION) {
        return new OberonSimpleExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new OberonStatementImpl(node);
      }
      else if (type == TERM) {
        return new OberonTermImpl(node);
      }
      else if (type == TYPE) {
        return new OberonTypeImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new OberonTypeDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new OberonVariableDeclarationImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new OberonWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
