lexer grammar FlangLexer;

@header {
   package org.lambda.flang.grammar;
}

OP : '(' ;
CP : ')' ;

DIGIT : '0'..'9';
INTEGER : '-'? (DIGIT)+ ;
REAL: '-'? (DIGIT)+ '.' (DIGIT)+;
NULL : 'null';
TRUE : 'true';
FALSE : 'false';

// keywords

SETQ : 'setq';
FUNC : 'func';
LAMBDA : 'lambda';
PROG : 'prog';
COND : 'cond';
WHILE : 'while';
RETURN : 'return';
BREAK : 'break';

LETTER : LOWER | UPPER ;

LOWER : ('a'..'z') ;
UPPER : ('A'..'Z') ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
WS : [ \t\n\r\f]+ -> skip ;