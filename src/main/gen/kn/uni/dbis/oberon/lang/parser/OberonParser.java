// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static kn.uni.dbis.oberon.lang.psi.OberonTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class OberonParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // LPAREN [ <<comma_list expression>> ] RPAREN
  public static boolean actual_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && actual_parameters_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ACTUAL_PARAMETERS, r);
    return r;
  }

  // [ <<comma_list expression>> ]
  private static boolean actual_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameters_1")) return false;
    comma_list(b, l + 1, OberonParser::expression);
    return true;
  }

  /* ********************************************************** */
  // KW_ARRAY expression KW_OF type
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, KW_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ARRAY);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_OF);
    r = r && type(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ident ( selector )* OP_BECOMES expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && assignment_1(b, l + 1);
    r = r && consumeToken(b, OP_BECOMES);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  // ( selector )*
  private static boolean assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!assignment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_1", c)) break;
    }
    return true;
  }

  // ( selector )
  private static boolean assignment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FALSE | KW_TRUE
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    if (!nextTokenIs(b, "<boolean $>", KW_FALSE, KW_TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean $>");
    r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_TRUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_INTEGER | KW_LONGINT | KW_REAL | KW_LONGREAL | KW_BOOLEAN | KW_STRING
  public static boolean builtin_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtin_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILTIN_TYPE, "<builtin type>");
    r = consumeToken(b, KW_INTEGER);
    if (!r) r = consumeToken(b, KW_LONGINT);
    if (!r) r = consumeToken(b, KW_REAL);
    if (!r) r = consumeToken(b, KW_LONGREAL);
    if (!r) r = consumeToken(b, KW_BOOLEAN);
    if (!r) r = consumeToken(b, KW_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<p>> (COMMA <<p>>)*
  static boolean comma_list(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "comma_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    r = r && comma_list_1(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA <<p>>)*
  private static boolean comma_list_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "comma_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comma_list_1_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "comma_list_1", c)) break;
    }
    return true;
  }

  // COMMA <<p>>
  private static boolean comma_list_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "comma_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONST ( ident OP_EQ expression SEMICOLON )+
  public static boolean const_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarations")) return false;
    if (!nextTokenIs(b, KW_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    r = r && const_declarations_1(b, l + 1);
    exit_section_(b, m, CONST_DECLARATIONS, r);
    return r;
  }

  // ( ident OP_EQ expression SEMICOLON )+
  private static boolean const_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_declarations_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!const_declarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "const_declarations_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ident OP_EQ expression SEMICOLON
  private static boolean const_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declarations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ const_declarations ] [ type_declarations ] [ var_declarations ] ( procedure_declaration )*
  public static boolean declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATIONS, "<declarations>");
    r = declarations_0(b, l + 1);
    r = r && declarations_1(b, l + 1);
    r = r && declarations_2(b, l + 1);
    r = r && declarations_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ const_declarations ]
  private static boolean declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations_0")) return false;
    const_declarations(b, l + 1);
    return true;
  }

  // [ type_declarations ]
  private static boolean declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations_1")) return false;
    type_declarations(b, l + 1);
    return true;
  }

  // [ var_declarations ]
  private static boolean declarations_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations_2")) return false;
    var_declarations(b, l + 1);
    return true;
  }

  // ( procedure_declaration )*
  private static boolean declarations_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declarations_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarations_3", c)) break;
    }
    return true;
  }

  // ( procedure_declaration )
  private static boolean declarations_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarations_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_expression [ ( OP_EQ | OP_NEQ | OP_LT | OP_LEQ | OP_GT | OP_GEQ ) simple_expression ]
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = simple_expression(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( OP_EQ | OP_NEQ | OP_LT | OP_LEQ | OP_GT | OP_GEQ ) simple_expression ]
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    expression_1_0(b, l + 1);
    return true;
  }

  // ( OP_EQ | OP_NEQ | OP_LT | OP_LEQ | OP_GT | OP_GEQ ) simple_expression
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_1_0_0(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_EQ | OP_NEQ | OP_LT | OP_LEQ | OP_GT | OP_GEQ
  private static boolean expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_NEQ);
    if (!r) r = consumeToken(b, OP_LT);
    if (!r) r = consumeToken(b, OP_LEQ);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_GEQ);
    return r;
  }

  /* ********************************************************** */
  // ident [ actual_parameters ] ( selector )*  |
  //              integer | real | boolean | string | LPAREN expression RPAREN | OP_NOT factor
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = factor_0(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = real(b, l + 1);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = factor_5(b, l + 1);
    if (!r) r = factor_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident [ actual_parameters ] ( selector )*
  private static boolean factor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && factor_0_1(b, l + 1);
    r = r && factor_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ actual_parameters ]
  private static boolean factor_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_1")) return false;
    actual_parameters(b, l + 1);
    return true;
  }

  // ( selector )*
  private static boolean factor_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!factor_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_0_2", c)) break;
    }
    return true;
  }

  // ( selector )
  private static boolean factor_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN expression RPAREN
  private static boolean factor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_NOT factor
  private static boolean factor_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FOR ident OP_BECOMES expression KW_TO expression [ KW_BY expression ] KW_DO statement_sequence KW_END
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOR);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, OP_BECOMES);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_TO);
    r = r && expression(b, l + 1);
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, KW_DO);
    r = r && statement_sequence(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // [ KW_BY expression ]
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_statement_6_0(b, l + 1);
    return true;
  }

  // KW_BY expression
  private static boolean for_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [ <<semicolon_list fp_section>> ] RPAREN
  public static boolean formal_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && formal_parameters_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FORMAL_PARAMETERS, r);
    return r;
  }

  // [ <<semicolon_list fp_section>> ]
  private static boolean formal_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_1")) return false;
    semicolon_list(b, l + 1, OberonParser::fp_section);
    return true;
  }

  /* ********************************************************** */
  // [ "VAR" ] ident_list COLON type | VARARGS
  public static boolean fp_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FP_SECTION, "<fp section>");
    r = fp_section_0(b, l + 1);
    if (!r) r = consumeToken(b, VARARGS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "VAR" ] ident_list COLON type
  private static boolean fp_section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fp_section_0_0(b, l + 1);
    r = r && ident_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "VAR" ]
  private static boolean fp_section_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section_0_0")) return false;
    consumeToken(b, KW_VAR);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // <<comma_list ident>>
  public static boolean ident_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma_list(b, l + 1, OberonParser::ident);
    exit_section_(b, m, IDENT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IF expression KW_THEN statement_sequence
  //                  { KW_ELSIF expression KW_THEN statement_sequence }
  //                  [ KW_ELSE statement_sequence ] KW_END
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_THEN);
    r = r && statement_sequence(b, l + 1);
    r = r && if_statement_4(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // KW_ELSIF expression KW_THEN statement_sequence
  private static boolean if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSIF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_THEN);
    r = r && statement_sequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_ELSE statement_sequence ]
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // KW_ELSE statement_sequence
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && statement_sequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    if (!nextTokenIs(b, INTEGER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, INTEGER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_LOOP statement_sequence KW_END
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    if (!nextTokenIs(b, KW_LOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LOOP);
    r = r && statement_sequence(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, LOOP_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MODULE ident SEMICOLON declarations [ KW_BEGIN statement_sequence ] KW_END ident PERIOD
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODULE);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && declarations(b, l + 1);
    r = r && module_4(b, l + 1);
    r = r && consumeToken(b, KW_END);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_BEGIN statement_sequence ]
  private static boolean module_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_4")) return false;
    module_4_0(b, l + 1);
    return true;
  }

  // KW_BEGIN statement_sequence
  private static boolean module_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BEGIN);
    r = r && statement_sequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declarations [ KW_BEGIN statement_sequence ] KW_END
  public static boolean procedure_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_BODY, "<procedure body>");
    r = declarations(b, l + 1);
    r = r && procedure_body_1(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ KW_BEGIN statement_sequence ]
  private static boolean procedure_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_1")) return false;
    procedure_body_1_0(b, l + 1);
    return true;
  }

  // KW_BEGIN statement_sequence
  private static boolean procedure_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BEGIN);
    r = r && statement_sequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident [ actual_parameters ]
  public static boolean procedure_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && procedure_call_1(b, l + 1);
    exit_section_(b, m, PROCEDURE_CALL, r);
    return r;
  }

  // [ actual_parameters ]
  private static boolean procedure_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1")) return false;
    actual_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // procedure_heading SEMICOLON ( procedure_body ident | KW_EXTERN ) SEMICOLON
  public static boolean procedure_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_declaration")) return false;
    if (!nextTokenIs(b, KW_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_heading(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && procedure_declaration_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PROCEDURE_DECLARATION, r);
    return r;
  }

  // procedure_body ident | KW_EXTERN
  private static boolean procedure_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_declaration_2_0(b, l + 1);
    if (!r) r = consumeToken(b, KW_EXTERN);
    exit_section_(b, m, null, r);
    return r;
  }

  // procedure_body ident
  private static boolean procedure_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_body(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PROCEDURE ident [ formal_parameters ] [ COLON type ]
  public static boolean procedure_heading(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading")) return false;
    if (!nextTokenIs(b, KW_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PROCEDURE);
    r = r && ident(b, l + 1);
    r = r && procedure_heading_2(b, l + 1);
    r = r && procedure_heading_3(b, l + 1);
    exit_section_(b, m, PROCEDURE_HEADING, r);
    return r;
  }

  // [ formal_parameters ]
  private static boolean procedure_heading_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading_2")) return false;
    formal_parameters(b, l + 1);
    return true;
  }

  // [ COLON type ]
  private static boolean procedure_heading_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading_3")) return false;
    procedure_heading_3_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean procedure_heading_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REAL_LITERAL
  public static boolean real(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "real")) return false;
    if (!nextTokenIs(b, REAL_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REAL_LITERAL);
    exit_section_(b, m, REAL, r);
    return r;
  }

  /* ********************************************************** */
  // ident_list COLON type
  public static boolean record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, RECORD_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RECORD <<semicolon_list record_field>> KW_END
  public static boolean record_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type")) return false;
    if (!nextTokenIs(b, KW_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RECORD);
    r = r && semicolon_list(b, l + 1, OberonParser::record_field);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, RECORD_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // KW_REPEAT statement_sequence KW_UNTIL expression
  public static boolean repeat_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repeat_statement")) return false;
    if (!nextTokenIs(b, KW_REPEAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_REPEAT);
    r = r && statement_sequence(b, l + 1);
    r = r && consumeToken(b, KW_UNTIL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, REPEAT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // PERIOD ident | LBRACK expression RBRACK
  public static boolean selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector")) return false;
    if (!nextTokenIs(b, "<selector>", LBRACK, PERIOD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = selector_0(b, l + 1);
    if (!r) r = selector_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PERIOD ident
  private static boolean selector_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERIOD);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACK expression RBRACK
  private static boolean selector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<p>> (SEMICOLON <<p>>)*
  static boolean semicolon_list(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "semicolon_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    r = r && semicolon_list_1(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEMICOLON <<p>>)*
  private static boolean semicolon_list_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "semicolon_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!semicolon_list_1_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "semicolon_list_1", c)) break;
    }
    return true;
  }

  // SEMICOLON <<p>>
  private static boolean semicolon_list_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "semicolon_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ OP_PLUS | OP_MINUS ] term ( ( OP_PLUS | OP_MINUS | OP_OR ) term )*
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = simple_expression_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && simple_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ OP_PLUS | OP_MINUS ]
  private static boolean simple_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_0")) return false;
    simple_expression_0_0(b, l + 1);
    return true;
  }

  // OP_PLUS | OP_MINUS
  private static boolean simple_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_0_0")) return false;
    boolean r;
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    return r;
  }

  // ( ( OP_PLUS | OP_MINUS | OP_OR ) term )*
  private static boolean simple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_expression_2", c)) break;
    }
    return true;
  }

  // ( OP_PLUS | OP_MINUS | OP_OR ) term
  private static boolean simple_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expression_2_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_PLUS | OP_MINUS | OP_OR
  private static boolean simple_expression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_OR);
    return r;
  }

  /* ********************************************************** */
  // assignment | procedure_call | if_statement | /* case_statement | */
  //                 while_statement | repeat_statement | for_statement | loop_statement |
  //                 /* with_statement | */ KW_EXIT | KW_RETURN [ expression ]
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = assignment(b, l + 1);
    if (!r) r = procedure_call(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = repeat_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = consumeToken(b, KW_EXIT);
    if (!r) r = statement_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_RETURN [ expression ]
  private static boolean statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && statement_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ]
  private static boolean statement_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<semicolon_list statement>>
  public static boolean statement_sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_SEQUENCE, "<statement sequence>");
    r = semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, STRING, r);
    return r;
  }

  /* ********************************************************** */
  // factor ( ( OP_TIMES | OP_DIV | OP_MOD | OP_AND ) factor )*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( OP_TIMES | OP_DIV | OP_MOD | OP_AND ) factor )*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // ( OP_TIMES | OP_DIV | OP_MOD | OP_AND ) factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term_1_0_0(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_TIMES | OP_DIV | OP_MOD | OP_AND
  private static boolean term_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, OP_TIMES);
    if (!r) r = consumeToken(b, OP_DIV);
    if (!r) r = consumeToken(b, OP_MOD);
    if (!r) r = consumeToken(b, OP_AND);
    return r;
  }

  /* ********************************************************** */
  // ident | array_type | record_type | builtin_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = ident(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = record_type(b, l + 1);
    if (!r) r = builtin_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPE ( ident OP_EQ type SEMICOLON )+
  public static boolean type_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarations")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TYPE);
    r = r && type_declarations_1(b, l + 1);
    exit_section_(b, m, TYPE_DECLARATIONS, r);
    return r;
  }

  // ( ident OP_EQ type SEMICOLON )+
  private static boolean type_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_declarations_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!type_declarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_declarations_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ident OP_EQ type SEMICOLON
  private static boolean type_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VAR ( ident_list COLON type SEMICOLON )+
  public static boolean var_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_declarations")) return false;
    if (!nextTokenIs(b, KW_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_VAR);
    r = r && var_declarations_1(b, l + 1);
    exit_section_(b, m, VAR_DECLARATIONS, r);
    return r;
  }

  // ( ident_list COLON type SEMICOLON )+
  private static boolean var_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_declarations_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!var_declarations_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "var_declarations_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ident_list COLON type SEMICOLON
  private static boolean var_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_declarations_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHILE expression KW_DO statement_sequence KW_END
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHILE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_DO);
    r = r && statement_sequence(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

}
