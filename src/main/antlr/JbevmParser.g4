parser grammar JbevmParser;

@header {
  package ru.itmo.corp.jbevm.antlr;
}

options { tokenVocab=JbevmLexer; }

program
    : typeDeclaration*
    ;

typeDeclaration
    : classOrInterfaceModifier* classDeclaration
    | ';'
    ;

modifier
    : classOrInterfaceModifier
    ;

classOrInterfaceModifier
    : STATIC
    ;

classDeclaration
    : CLASS identifier
      classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | STATIC? block
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | classDeclaration
    ;

methodDeclaration
    : typeTypeOrVoid identifier formalParameters
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

constructorDeclaration
    : identifier formalParameters constructorBody=block
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : identifier
    ;

variableInitializer
    : expression
    ;

classOrInterfaceType
    : identifier ('.' identifier)*
    ;

formalParameters
    : '(' ( receiverParameter?
          | receiverParameter (',' formalParameterList)?
          | formalParameterList?
          ) ')'
    ;

receiverParameter
    : typeType (identifier '.')* THIS
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : typeType variableDeclaratorId
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    | localTypeDeclaration
    ;

localVariableDeclaration
    : (typeType variableDeclarators '=' expression)
    ;

identifier
    : IDENTIFIER
    ;

localTypeDeclaration
    : classOrInterfaceModifier* classDeclaration
    | ';'
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    | RETURN expression? ';'
    | BREAK ';'
    | CONTINUE ';'
    | SEMI
    | statementExpression=expression ';'
    ;

forControl
    : forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : identifier '(' expressionList? ')'
    | THIS '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      (
         identifier
       | methodCall
       | THIS
       | NEW innerCreator
      )
    | methodCall
    | NEW creator
    | '(' typeType ('&' typeType)* ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

primary
    : '(' expression ')'
    | THIS
    | literal
    | identifier
    ;

creator
    : createdName arguments
    ;

createdName
    : identifier ('.' identifier)*
    | primitiveType
    ;

innerCreator
    : identifier arguments
    ;

typeType
    : (classOrInterfaceType | primitiveType)
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;

arguments
    : '(' expressionList? ')'
    ;
