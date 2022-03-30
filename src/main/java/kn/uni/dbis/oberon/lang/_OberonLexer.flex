package kn.uni.dbis.oberon.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static kn.uni.dbis.oberon.lang.psi.OberonTypes.*;

@SuppressWarnings("all")

%%

%unicode
%public
%class _OberonLexer
%implements FlexLexer

%function advance
%type IElementType

%eof{ return;
%eof}

%{
  public _OberonLexer() {
    this((java.io.Reader)null);
  }
  public void goTo(int offset) {
    zzCurrentPos = zzMarkedPos = zzStartRead = offset;
    zzAtEOF = false;
  }
%}



WHITESPACE      = [\ \n\r\t\f]+

COMMENT         = "(*" !([^]* "*)" [^]*) ("*)")?

IDENTIFIER      = [:jletter:][:jletterdigit:]*

INTEGER_LITERAL = (0|0H)|[A-Z1-9][A-Z0-9]*(H)?
STRING_LITERAL  = \"(\\[ \t\n\x0B\f\r]*\n[ \t\n\x0B\f\r]*\\|\\\"|[^\"\n])*\"
REAL_LITERAL    = ([0-9]+\.[0-9]+((e|E)(\+|\-)?[0-9]+)?|[0-9]+((e|E)(\+|\-)?[0-9]+))

%%
<YYINITIAL> {
  ":"                    { return COLON; }
  ","                    { return COMMA; }
  "{"                    { return LBRACE; }
  "["                    { return LBRACK; }
  "("                    { return LPAREN; }
  "."                    { return PERIOD; }
  "|"                    { return PIPE; }
  ".."                   { return RANGE; }
  "}"                    { return RBRACE; }
  "]"                    { return RBRACK; }
  ")"                    { return RPAREN; }
  ";"                    { return SEMICOLON; }
  "..."                  { return VARARGS; }
  "AND"                  { return KW_AND; }
  "ARRAY"                { return KW_ARRAY; }
  "BEGIN"                { return KW_BEGIN; }
  "BOOLEAN"              { return KW_BOOLEAN; }
  "BY"                   { return KW_BY; }
  "CASE"                 { return KW_CASE; }
  "CONST"                { return KW_CONST; }
  "DO"                   { return KW_DO; }
  "ELSE"                 { return KW_ELSE; }
  "ELSIF"                { return KW_ELSIF; }
  "END"                  { return KW_END; }
  "EXIT"                 { return KW_EXIT; }
  "EXTERN"               { return KW_EXTERN; }
  "FALSE"                { return KW_FALSE; }
  "FOR"                  { return KW_FOR; }
  "FUNCTION"             { return KW_FUNCTION; }
  "IF"                   { return KW_IF; }
  "IMPORT"               { return KW_IMPORT; }
  "INTEGER"              { return KW_INTEGER; }
  "LONGINT"              { return KW_LONGINT; }
  "LONGREAL"             { return KW_LONGREAL; }
  "LOOP"                 { return KW_LOOP; }
  "MODULE"               { return KW_MODULE; }
  "NEW"                  { return KW_NEW; }
  "NIL"                  { return KW_NIL; }
  "OF"                   { return KW_OF; }
  "POINTER"              { return KW_POINTER; }
  "PROCEDURE"            { return KW_PROCEDURE; }
  "REAL"                 { return KW_REAL; }
  "RECORD"               { return KW_RECORD; }
  "REPEAT"               { return KW_REPEAT; }
  "RETURN"               { return KW_RETURN; }
  "STRING"               { return KW_STRING; }
  "THEN"                 { return KW_THEN; }
  "TO"                   { return KW_TO; }
  "TRUE"                 { return KW_TRUE; }
  "TYPE"                 { return KW_TYPE; }
  "UNTIL"                { return KW_UNTIL; }
  "VAR"                  { return KW_VAR; }
  "WITH"                 { return KW_WITH; }
  "WHILE"                { return KW_WHILE; }
  "&"                    { return OP_AND; }
  ":="                   { return OP_BECOMES; }
  "^"                    { return OP_DEREF; }
  "DIV"                  { return OP_DIV; }
  "/"                    { return OP_DIVIDE; }
  "="                    { return OP_EQ; }
  ">="                   { return OP_GEQ; }
  ">"                    { return OP_GT; }
  "IN"                   { return OP_IN; }
  "IS"                   { return OP_IS; }
  "<="                   { return OP_LEQ; }
  "<"                    { return OP_LT; }
  "-"                    { return OP_MINUS; }
  "MOD"                  { return OP_MOD; }
  "#"                    { return OP_NEQ; }
  "~"                    { return OP_NOT; }
  "OR"                   { return OP_OR; }
  "+"                    { return OP_PLUS; }
  "*"                    { return OP_TIMES; }

  {INTEGER_LITERAL}      { return INTEGER_LITERAL; }
  {STRING_LITERAL}       { return STRING_LITERAL; }
  {REAL_LITERAL}         { return REAL_LITERAL; }

  {COMMENT}              { return COMMENT; }
  {IDENTIFIER}           { return IDENTIFIER; }
  {WHITESPACE}           { return WHITE_SPACE; }
  .                      { return BAD_CHARACTER; }
}
