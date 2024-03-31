lexer grammar FlangLexer;

@header {
   package org.lambda.flang.grammar;
}

OP : '(' ;
CP : ')' ;

INTEGER : '-'? DIGIT+ ;
REAL: INTEGER '.' (DIGIT)+;
NULL : 'null';
TRUE : 'true';
FALSE : 'false';

// keywords
QUOTE: 'quote' | '\'';
SETQ : 'setq';
FUNC : 'func';
LAMBDA : 'lambda';
PROG : 'prog';
COND : 'cond';
WHILE : 'while';
RETURN : 'return';
BREAK : 'break';


// here to make keywords work
ATOM : ID;
// helpers
DIGIT_WITHOUT_ZERO : [1-9];
DIGIT : [0-9];
ID : [a-zA-Z_][\-a-zA-Z_0-9]* ;
WS : [ \t\n\r\f]+ -> skip ;
COMMENT : ';'.*? -> skip ;