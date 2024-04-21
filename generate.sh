#!/usr/bin/env bash
if [[ -x 'antlr' ]]
then
  antlr -visitor src/main/java/grammar/FlangParser.g4 src/main/java/grammar/FlangLexer.g4
else
  antlr4 -visitor src/main/java/grammar/FlangParser.g4 src/main/java/grammar/FlangLexer.g4
fi