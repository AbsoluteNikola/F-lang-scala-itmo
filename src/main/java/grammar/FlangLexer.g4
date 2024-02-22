lexer grammar FlangLexer;

@header {
   package org.lambda.flang.grammar;
}

IDENTIFIER : ((LETTER (LETTER | DIGIT)*)) ;

OP : '(' ;
CP : ')' ;

NUMBER : '-'? (DIGIT)+ ;
DIGIT : '0'..'9';

LETTER : LOWER | UPPER ;

LOWER : ('a'..'z') ;
UPPER : ('A'..'Z') ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
WS : [ \t\n\r\f]+ -> skip ;