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
  IElementType BOOLEAN = new OberonElementType("BOOLEAN");
  IElementType BUILTIN_TYPE = new OberonElementType("BUILTIN_TYPE");
  IElementType CONST_DECLARATIONS = new OberonElementType("CONST_DECLARATIONS");
  IElementType DECLARATIONS = new OberonElementType("DECLARATIONS");
  IElementType EXPRESSION = new OberonElementType("EXPRESSION");
  IElementType FACTOR = new OberonElementType("FACTOR");
  IElementType FORMAL_PARAMETERS = new OberonElementType("FORMAL_PARAMETERS");
  IElementType FOR_STATEMENT = new OberonElementType("FOR_STATEMENT");
  IElementType FP_SECTION = new OberonElementType("FP_SECTION");
  IElementType IDENT = new OberonElementType("IDENT");
  IElementType IDENT_LIST = new OberonElementType("IDENT_LIST");
  IElementType IF_STATEMENT = new OberonElementType("IF_STATEMENT");
  IElementType INTEGER = new OberonElementType("INTEGER");
  IElementType LOOP_STATEMENT = new OberonElementType("LOOP_STATEMENT");
  IElementType PROCEDURE_BODY = new OberonElementType("PROCEDURE_BODY");
  IElementType PROCEDURE_CALL = new OberonElementType("PROCEDURE_CALL");
  IElementType PROCEDURE_DECLARATION = new OberonElementType("PROCEDURE_DECLARATION");
  IElementType PROCEDURE_HEADING = new OberonElementType("PROCEDURE_HEADING");
  IElementType REAL = new OberonElementType("REAL");
  IElementType RECORD_FIELD = new OberonElementType("RECORD_FIELD");
  IElementType RECORD_TYPE = new OberonElementType("RECORD_TYPE");
  IElementType REPEAT_STATEMENT = new OberonElementType("REPEAT_STATEMENT");
  IElementType SELECTOR = new OberonElementType("SELECTOR");
  IElementType SIMPLE_EXPRESSION = new OberonElementType("SIMPLE_EXPRESSION");
  IElementType STATEMENT = new OberonElementType("STATEMENT");
  IElementType STATEMENT_SEQUENCE = new OberonElementType("STATEMENT_SEQUENCE");
  IElementType STRING = new OberonElementType("STRING");
  IElementType TERM = new OberonElementType("TERM");
  IElementType TYPE = new OberonElementType("TYPE");
  IElementType TYPE_DECLARATIONS = new OberonElementType("TYPE_DECLARATIONS");
  IElementType VAR_DECLARATIONS = new OberonElementType("VAR_DECLARATIONS");
  IElementType WHILE_STATEMENT = new OberonElementType("WHILE_STATEMENT");

  IElementType COLON = new OberonTokenType(":");
  IElementType COMMA = new OberonTokenType(",");
  IElementType COMMENT = new OberonTokenType("COMMENT");
  IElementType IDENTIFIER = new OberonTokenType("IDENTIFIER");
  IElementType INTEGER_LITERAL = new OberonTokenType("INTEGER_LITERAL");
  IElementType KW_AND = new OberonTokenType("AND");
  IElementType KW_ARRAY = new OberonTokenType("ARRAY");
  IElementType KW_BEGIN = new OberonTokenType("BEGIN");
  IElementType KW_BOOLEAN = new OberonTokenType("BOOLEAN");
  IElementType KW_BY = new OberonTokenType("BY");
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
  IElementType KW_INTEGER = new OberonTokenType("INTEGER");
  IElementType KW_LONGINT = new OberonTokenType("LONGINT");
  IElementType KW_LONGREAL = new OberonTokenType("LONGREAL");
  IElementType KW_LOOP = new OberonTokenType("LOOP");
  IElementType KW_MODULE = new OberonTokenType("MODULE");
  IElementType KW_NEW = new OberonTokenType("NEW");
  IElementType KW_OF = new OberonTokenType("OF");
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
  IElementType OP_DIV = new OberonTokenType("DIV");
  IElementType OP_EQ = new OberonTokenType("=");
  IElementType OP_GEQ = new OberonTokenType(">=");
  IElementType OP_GT = new OberonTokenType(">");
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
      else if (type == BOOLEAN) {
        return new OberonBooleanImpl(node);
      }
      else if (type == BUILTIN_TYPE) {
        return new OberonBuiltinTypeImpl(node);
      }
      else if (type == CONST_DECLARATIONS) {
        return new OberonConstDeclarationsImpl(node);
      }
      else if (type == DECLARATIONS) {
        return new OberonDeclarationsImpl(node);
      }
      else if (type == EXPRESSION) {
        return new OberonExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new OberonFactorImpl(node);
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
      else if (type == IDENT_LIST) {
        return new OberonIdentListImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new OberonIfStatementImpl(node);
      }
      else if (type == INTEGER) {
        return new OberonIntegerImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new OberonLoopStatementImpl(node);
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
      else if (type == REAL) {
        return new OberonRealImpl(node);
      }
      else if (type == RECORD_FIELD) {
        return new OberonRecordFieldImpl(node);
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
      else if (type == SIMPLE_EXPRESSION) {
        return new OberonSimpleExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new OberonStatementImpl(node);
      }
      else if (type == STATEMENT_SEQUENCE) {
        return new OberonStatementSequenceImpl(node);
      }
      else if (type == STRING) {
        return new OberonStringImpl(node);
      }
      else if (type == TERM) {
        return new OberonTermImpl(node);
      }
      else if (type == TYPE) {
        return new OberonTypeImpl(node);
      }
      else if (type == TYPE_DECLARATIONS) {
        return new OberonTypeDeclarationsImpl(node);
      }
      else if (type == VAR_DECLARATIONS) {
        return new OberonVarDeclarationsImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new OberonWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
