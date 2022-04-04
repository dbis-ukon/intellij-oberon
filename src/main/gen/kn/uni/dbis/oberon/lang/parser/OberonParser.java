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
  // OP_PLUS | OP_MINUS | OP_OR
  static boolean and_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_operator")) return false;
    boolean r;
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_OR);
    return r;
  }

  /* ********************************************************** */
  // KW_ARRAY expression ( COMMAN expression )* KW_OF type
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, KW_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ARRAY);
    r = r && expression(b, l + 1);
    r = r && array_type_2(b, l + 1);
    r = r && consumeToken(b, KW_OF);
    r = r && type(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // ( COMMAN expression )*
  private static boolean array_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_type_2", c)) break;
    }
    return true;
  }

  // COMMAN expression
  private static boolean array_type_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // designator OP_BECOMES expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = designator(b, l + 1);
    r = r && consumeToken(b, OP_BECOMES);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_INTEGER | KW_LONGINT | KW_REAL | KW_LONGREAL | KW_BOOLEAN | KW_STRING
  static boolean builtin_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtin_type")) return false;
    boolean r;
    r = consumeToken(b, KW_INTEGER);
    if (!r) r = consumeToken(b, KW_LONGINT);
    if (!r) r = consumeToken(b, KW_REAL);
    if (!r) r = consumeToken(b, KW_LONGREAL);
    if (!r) r = consumeToken(b, KW_BOOLEAN);
    if (!r) r = consumeToken(b, KW_STRING);
    return r;
  }

  /* ********************************************************** */
  // [ <<comma_list label_range>> COLON <<semicolon_list statement>> ]
  public static boolean case_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_$")) return false;
    Marker m = enter_section_(b, l, _NONE_, CASE, "<case $>");
    case_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // <<comma_list label_range>> COLON <<semicolon_list statement>>
  private static boolean case_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma_list(b, l + 1, OberonParser::label_range);
    r = r && consumeToken(b, COLON);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE expression KW_OF case ( PIPE case ) KW_END
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_OF);
    r = r && case_$(b, l + 1);
    r = r && case_statement_4(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // PIPE case
  private static boolean case_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && case_$(b, l + 1);
    exit_section_(b, m, null, r);
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
  // identdef OP_EQ expression
  public static boolean const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_DECLARATION, "<const declaration>");
    r = identdef(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ KW_CONST ( const_declaration SEMICOLON )* ]
  //                          [ KW_TYPE ( type_declaration SEMICOLON )* ]
  //                          [ KW_VAR ( variable_declaration SEMICOLON )* ]
  //                          ( procedure_declaration SEMICOLON )*
  public static boolean declaration_sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_SEQUENCE, "<declaration sequence>");
    r = declaration_sequence_0(b, l + 1);
    r = r && declaration_sequence_1(b, l + 1);
    r = r && declaration_sequence_2(b, l + 1);
    r = r && declaration_sequence_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ KW_CONST ( const_declaration SEMICOLON )* ]
  private static boolean declaration_sequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_0")) return false;
    declaration_sequence_0_0(b, l + 1);
    return true;
  }

  // KW_CONST ( const_declaration SEMICOLON )*
  private static boolean declaration_sequence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONST);
    r = r && declaration_sequence_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( const_declaration SEMICOLON )*
  private static boolean declaration_sequence_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_sequence_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_sequence_0_0_1", c)) break;
    }
    return true;
  }

  // const_declaration SEMICOLON
  private static boolean declaration_sequence_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_TYPE ( type_declaration SEMICOLON )* ]
  private static boolean declaration_sequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_1")) return false;
    declaration_sequence_1_0(b, l + 1);
    return true;
  }

  // KW_TYPE ( type_declaration SEMICOLON )*
  private static boolean declaration_sequence_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TYPE);
    r = r && declaration_sequence_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( type_declaration SEMICOLON )*
  private static boolean declaration_sequence_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_sequence_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_sequence_1_0_1", c)) break;
    }
    return true;
  }

  // type_declaration SEMICOLON
  private static boolean declaration_sequence_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_VAR ( variable_declaration SEMICOLON )* ]
  private static boolean declaration_sequence_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_2")) return false;
    declaration_sequence_2_0(b, l + 1);
    return true;
  }

  // KW_VAR ( variable_declaration SEMICOLON )*
  private static boolean declaration_sequence_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_VAR);
    r = r && declaration_sequence_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( variable_declaration SEMICOLON )*
  private static boolean declaration_sequence_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_sequence_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_sequence_2_0_1", c)) break;
    }
    return true;
  }

  // variable_declaration SEMICOLON
  private static boolean declaration_sequence_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( procedure_declaration SEMICOLON )*
  private static boolean declaration_sequence_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_sequence_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_sequence_3", c)) break;
    }
    return true;
  }

  // procedure_declaration SEMICOLON
  private static boolean declaration_sequence_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_sequence_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qualident ( selector )*
  public static boolean designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGNATOR, "<designator>");
    r = qualident(b, l + 1);
    r = r && designator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( selector )*
  private static boolean designator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!designator_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "designator_1", c)) break;
    }
    return true;
  }

  // ( selector )
  private static boolean designator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression [ RANGE expression ]
  public static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT, "<element>");
    r = expression(b, l + 1);
    r = r && element_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ RANGE expression ]
  private static boolean element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_1")) return false;
    element_1_0(b, l + 1);
    return true;
  }

  // RANGE expression
  private static boolean element_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_expression [ relation simple_expression ]
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = simple_expression(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ relation simple_expression ]
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    expression_1_0(b, l + 1);
    return true;
  }

  // relation simple_expression
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | string | KW_NIL | KW_TRUE | KW_FALSE | set | designator [ actual_parameters ] |
  //            LPAREN expression RPAREN | OP_NOT factor
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = number(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = consumeToken(b, KW_NIL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = set(b, l + 1);
    if (!r) r = factor_6(b, l + 1);
    if (!r) r = factor_7(b, l + 1);
    if (!r) r = factor_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // designator [ actual_parameters ]
  private static boolean factor_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = designator(b, l + 1);
    r = r && factor_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ actual_parameters ]
  private static boolean factor_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_6_1")) return false;
    actual_parameters(b, l + 1);
    return true;
  }

  // LPAREN expression RPAREN
  private static boolean factor_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_NOT factor
  private static boolean factor_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<comma_list identdef>> COLON type
  public static boolean field_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_LIST, "<field list>");
    r = comma_list(b, l + 1, OberonParser::identdef);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_FOR ident OP_BECOMES expression KW_TO expression [ KW_BY expression ] KW_DO <<semicolon_list statement>> KW_END
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
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
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
  // LPAREN [ <<semicolon_list fp_section>> ] RPAREN [ COLON qualident ]
  public static boolean formal_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && formal_parameters_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && formal_parameters_3(b, l + 1);
    exit_section_(b, m, FORMAL_PARAMETERS, r);
    return r;
  }

  // [ <<semicolon_list fp_section>> ]
  private static boolean formal_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_1")) return false;
    semicolon_list(b, l + 1, OberonParser::fp_section);
    return true;
  }

  // [ COLON qualident ]
  private static boolean formal_parameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_3")) return false;
    formal_parameters_3_0(b, l + 1);
    return true;
  }

  // COLON qualident
  private static boolean formal_parameters_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameters_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && qualident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ KW_VAR ] <<comma_list ident>> COLON [ KW_ARRAY KW_OF ] qualident | VARARGS
  public static boolean fp_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FP_SECTION, "<fp section>");
    r = fp_section_0(b, l + 1);
    if (!r) r = consumeToken(b, VARARGS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ KW_VAR ] <<comma_list ident>> COLON [ KW_ARRAY KW_OF ] qualident
  private static boolean fp_section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fp_section_0_0(b, l + 1);
    r = r && comma_list(b, l + 1, OberonParser::ident);
    r = r && consumeToken(b, COLON);
    r = r && fp_section_0_3(b, l + 1);
    r = r && qualident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_VAR ]
  private static boolean fp_section_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section_0_0")) return false;
    consumeToken(b, KW_VAR);
    return true;
  }

  // [ KW_ARRAY KW_OF ]
  private static boolean fp_section_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fp_section_0_3")) return false;
    parseTokens(b, 0, KW_ARRAY, KW_OF);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | builtin_type
  public static boolean ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT, "<ident>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = builtin_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident [ OP_TIMES ]
  public static boolean identdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTDEF, "<identdef>");
    r = ident(b, l + 1);
    r = r && identdef_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ OP_TIMES ]
  private static boolean identdef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identdef_1")) return false;
    consumeToken(b, OP_TIMES);
    return true;
  }

  /* ********************************************************** */
  // KW_IF expression KW_THEN <<semicolon_list statement>>
  //                  ( KW_ELSIF expression KW_THEN <<semicolon_list statement>> )*
  //                  [ KW_ELSE <<semicolon_list statement>> ] KW_END
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_THEN);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    r = r && if_statement_4(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ( KW_ELSIF expression KW_THEN <<semicolon_list statement>> )*
  private static boolean if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_statement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_4", c)) break;
    }
    return true;
  }

  // KW_ELSIF expression KW_THEN <<semicolon_list statement>>
  private static boolean if_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSIF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_THEN);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_ELSE <<semicolon_list statement>> ]
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // KW_ELSE <<semicolon_list statement>>
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident [ OP_BECOMES ident ]
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT, "<import $>");
    r = ident(b, l + 1);
    r = r && import_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ OP_BECOMES ident ]
  private static boolean import_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_1")) return false;
    import_1_0(b, l + 1);
    return true;
  }

  // OP_BECOMES ident
  private static boolean import_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BECOMES);
    r = r && ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT <<comma_list import>> SEMICOLON
  public static boolean import_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_list")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPORT);
    r = r && comma_list(b, l + 1, OberonParser::import_$);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, IMPORT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // integer | string | qualident
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL, "<label>");
    r = consumeToken(b, INTEGER);
    if (!r) r = string(b, l + 1);
    if (!r) r = qualident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // label [ RANGE label ]
  public static boolean label_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL_RANGE, "<label range>");
    r = label(b, l + 1);
    r = r && label_range_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ RANGE label ]
  private static boolean label_range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_range_1")) return false;
    label_range_1_0(b, l + 1);
    return true;
  }

  // RANGE label
  private static boolean label_range_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_range_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RANGE);
    r = r && label(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_LOOP <<semicolon_list statement>> KW_END
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    if (!nextTokenIs(b, KW_LOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LOOP);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, LOOP_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MODULE ident SEMICOLON [ import_list ] declaration_sequence [ KW_BEGIN <<semicolon_list statement>> ] KW_END ident PERIOD
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODULE);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && module_3(b, l + 1);
    r = r && declaration_sequence(b, l + 1);
    r = r && module_5(b, l + 1);
    r = r && consumeToken(b, KW_END);
    r = r && ident(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ import_list ]
  private static boolean module_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_3")) return false;
    import_list(b, l + 1);
    return true;
  }

  // [ KW_BEGIN <<semicolon_list statement>> ]
  private static boolean module_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_5")) return false;
    module_5_0(b, l + 1);
    return true;
  }

  // KW_BEGIN <<semicolon_list statement>>
  private static boolean module_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BEGIN);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_TIMES | OP_DIVIDE | OP_DIV | OP_MOD | OP_AND
  static boolean mult_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_operator")) return false;
    boolean r;
    r = consumeToken(b, OP_TIMES);
    if (!r) r = consumeToken(b, OP_DIVIDE);
    if (!r) r = consumeToken(b, OP_DIV);
    if (!r) r = consumeToken(b, OP_MOD);
    if (!r) r = consumeToken(b, OP_AND);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL | REAL_LITERAL
  static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, "", INTEGER_LITERAL, REAL_LITERAL)) return false;
    boolean r;
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, REAL_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // KW_POINTER KW_TO type
  public static boolean pointer_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pointer_type")) return false;
    if (!nextTokenIs(b, KW_POINTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_POINTER, KW_TO);
    r = r && type(b, l + 1);
    exit_section_(b, m, POINTER_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // declaration_sequence [ KW_BEGIN <<semicolon_list statement>> ] [ KW_RETURN expression ] KW_END
  public static boolean procedure_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_BODY, "<procedure body>");
    r = declaration_sequence(b, l + 1);
    r = r && procedure_body_1(b, l + 1);
    r = r && procedure_body_2(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ KW_BEGIN <<semicolon_list statement>> ]
  private static boolean procedure_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_1")) return false;
    procedure_body_1_0(b, l + 1);
    return true;
  }

  // KW_BEGIN <<semicolon_list statement>>
  private static boolean procedure_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BEGIN);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ KW_RETURN expression ]
  private static boolean procedure_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_2")) return false;
    procedure_body_2_0(b, l + 1);
    return true;
  }

  // KW_RETURN expression
  private static boolean procedure_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // designator [ actual_parameters ]
  public static boolean procedure_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL, "<procedure call>");
    r = designator(b, l + 1);
    r = r && procedure_call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ actual_parameters ]
  private static boolean procedure_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1")) return false;
    actual_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // procedure_heading SEMICOLON ( procedure_body ident | KW_EXTERN )
  public static boolean procedure_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_declaration")) return false;
    if (!nextTokenIs(b, KW_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_heading(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && procedure_declaration_2(b, l + 1);
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
  // KW_PROCEDURE identdef [ formal_parameters ]
  public static boolean procedure_heading(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading")) return false;
    if (!nextTokenIs(b, KW_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PROCEDURE);
    r = r && identdef(b, l + 1);
    r = r && procedure_heading_2(b, l + 1);
    exit_section_(b, m, PROCEDURE_HEADING, r);
    return r;
  }

  // [ formal_parameters ]
  private static boolean procedure_heading_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_heading_2")) return false;
    formal_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_PROCEDURE [ formal_parameters ]
  public static boolean procedure_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_type")) return false;
    if (!nextTokenIs(b, KW_PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PROCEDURE);
    r = r && procedure_type_1(b, l + 1);
    exit_section_(b, m, PROCEDURE_TYPE, r);
    return r;
  }

  // [ formal_parameters ]
  private static boolean procedure_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_type_1")) return false;
    formal_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ ident PERIOD ] ident
  public static boolean qualident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualident")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIDENT, "<qualident>");
    r = qualident_0(b, l + 1);
    r = r && ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ident PERIOD ]
  private static boolean qualident_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualident_0")) return false;
    qualident_0_0(b, l + 1);
    return true;
  }

  // ident PERIOD
  private static boolean qualident_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualident_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RECORD [ LPAREN qualident RPAREN ] [ <<semicolon_list field_list>> ] KW_END
  public static boolean record_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type")) return false;
    if (!nextTokenIs(b, KW_RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RECORD);
    r = r && record_type_1(b, l + 1);
    r = r && record_type_2(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, RECORD_TYPE, r);
    return r;
  }

  // [ LPAREN qualident RPAREN ]
  private static boolean record_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_1")) return false;
    record_type_1_0(b, l + 1);
    return true;
  }

  // LPAREN qualident RPAREN
  private static boolean record_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && qualident(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ <<semicolon_list field_list>> ]
  private static boolean record_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_2")) return false;
    semicolon_list(b, l + 1, OberonParser::field_list);
    return true;
  }

  /* ********************************************************** */
  // OP_EQ | OP_NEQ | OP_LT | OP_LEQ | OP_GT | OP_GEQ | OP_IN | OP_IS
  static boolean relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation")) return false;
    boolean r;
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_NEQ);
    if (!r) r = consumeToken(b, OP_LT);
    if (!r) r = consumeToken(b, OP_LEQ);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_GEQ);
    if (!r) r = consumeToken(b, OP_IN);
    if (!r) r = consumeToken(b, OP_IS);
    return r;
  }

  /* ********************************************************** */
  // KW_REPEAT <<semicolon_list statement>> KW_UNTIL expression
  public static boolean repeat_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repeat_statement")) return false;
    if (!nextTokenIs(b, KW_REPEAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_REPEAT);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    r = r && consumeToken(b, KW_UNTIL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, REPEAT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // PERIOD ident | LBRACK <<comma_list expression>> RBRACK | OP_DEREF | LPAREN qualident RPAREN
  public static boolean selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = selector_0(b, l + 1);
    if (!r) r = selector_1(b, l + 1);
    if (!r) r = consumeToken(b, OP_DEREF);
    if (!r) r = selector_3(b, l + 1);
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

  // LBRACK <<comma_list expression>> RBRACK
  private static boolean selector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && comma_list(b, l + 1, OberonParser::expression);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN qualident RPAREN
  private static boolean selector_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && qualident(b, l + 1);
    r = r && consumeToken(b, RPAREN);
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
  // LBRACE [ <<comma_list element>> ] RBRACE
  public static boolean set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && set_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SET, r);
    return r;
  }

  // [ <<comma_list element>> ]
  private static boolean set_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_1")) return false;
    comma_list(b, l + 1, OberonParser::element);
    return true;
  }

  /* ********************************************************** */
  // [ OP_PLUS | OP_MINUS ] term ( and_operator term )*
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

  // ( and_operator term )*
  private static boolean simple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_expression_2", c)) break;
    }
    return true;
  }

  // and_operator term
  private static boolean simple_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_operator(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ assignment | procedure_call | if_statement | case_statement |
  //                 while_statement | repeat_statement | for_statement | loop_statement |
  //                 /* with_statement | */ KW_EXIT ]
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    statement_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // assignment | procedure_call | if_statement | case_statement |
  //                 while_statement | repeat_statement | for_statement | loop_statement |
  //                 /* with_statement | */ KW_EXIT
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    r = assignment(b, l + 1);
    if (!r) r = procedure_call(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = case_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = repeat_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = consumeToken(b, KW_EXIT);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  static boolean string(PsiBuilder b, int l) {
    return consumeToken(b, STRING_LITERAL);
  }

  /* ********************************************************** */
  // factor ( mult_operator factor )*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( mult_operator factor )*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // mult_operator factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_operator(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qualident | array_type | record_type | pointer_type | procedure_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = qualident(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = record_type(b, l + 1);
    if (!r) r = pointer_type(b, l + 1);
    if (!r) r = procedure_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identdef OP_EQ type
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = identdef(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<comma_list identdef>> COLON type
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = comma_list(b, l + 1, OberonParser::identdef);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_WHILE expression KW_DO <<semicolon_list statement>>
  //                     ( KW_ELSIF expression KW_DO <<semicolon_list statement>> )*
  //                     KW_END
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHILE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_DO);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    r = r && while_statement_4(b, l + 1);
    r = r && consumeToken(b, KW_END);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // ( KW_ELSIF expression KW_DO <<semicolon_list statement>> )*
  private static boolean while_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!while_statement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "while_statement_4", c)) break;
    }
    return true;
  }

  // KW_ELSIF expression KW_DO <<semicolon_list statement>>
  private static boolean while_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSIF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, KW_DO);
    r = r && semicolon_list(b, l + 1, OberonParser::statement);
    exit_section_(b, m, null, r);
    return r;
  }

}
