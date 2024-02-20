parser grammar FlangParser;

@header {
   package org.lambda.flang.grammar;
}

options { tokenVocab = FlangLexer; }

program : expression* EOF ;
expression : OP IDENTIFIER (IDENTIFIER | NUMBER | expression)* CP;