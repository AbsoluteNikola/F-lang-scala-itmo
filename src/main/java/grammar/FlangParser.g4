parser grammar FlangParser;

@header {
   package org.lambda.flang.grammar;
}

options { tokenVocab=FlangLexer; }

program
    : element+
    ;

element
    : atom
    | literal
    | list
    | quote_short
    | '(' special_form ')'
    ;

boolean_const
    : TRUE
    | FALSE
    ;

literal
    : NULL
    | INTEGER
    | REAL
    | boolean_const
    ;

special_form
    : quote
    | setq
    | func
    | lambda
    | prog
    | cond
    | while
    | return
    | break
    ;

atoms_list
    : '(' atom* ')'
    ;

prog_context
    : '(' ('(' atom element ')')* ')'
    ;

atom : ATOM;

quote : QUOTE element;

quote_short : QUOTE_SHORT element;

setq : SETQ atom element;

func : FUNC atom atoms_list element; // should be list of atoms

lambda : LAMBDA atoms_list element; // should be list of atoms

prog : PROG prog_context element; // should be list of pairs (atom, element)

cond : COND element element element?;

while : WHILE element element;

return : RETURN element;

break : BREAK;

list
  : '(' element* ')'
  ;