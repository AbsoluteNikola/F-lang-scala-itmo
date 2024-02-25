parser grammar FlangParser;
options { tokenVocab=FlangLexer; }

program
    : element+
    ;

element
    : ATOM
    | literal
    | list
    | quote
    | setq
    | func
    | lambda
    | prog
    | cond
    | while
    | return
    | BREAK
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

quote : QUOTE element;

setq : SETQ ATOM element;

func : FUNC ATOM list element; // should be list of atoms

lambda : LAMBDA list element; // should be list of atoms

prog : PROG list element; // should be list of pairs (atom, element)

cond : COND element element element?;

while : WHILE element element;

return : RETURN element;

list
  : '(' element* ')'
  ;