// Generated from JbevmParser.g4 by ANTLR 4.10.1

  package ru.itmo.corp.jbevm.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JbevmParser}.
 */
public interface JbevmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JbevmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JbevmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JbevmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JbevmParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JbevmParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JbevmParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JbevmParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JbevmParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JbevmParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JbevmParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JbevmParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JbevmParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JbevmParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JbevmParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JbevmParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JbevmParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JbevmParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JbevmParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JbevmParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JbevmParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JbevmParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JbevmParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JbevmParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JbevmParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JbevmParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JbevmParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JbevmParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JbevmParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JbevmParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JbevmParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JbevmParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JbevmParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JbevmParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JbevmParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JbevmParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JbevmParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JbevmParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JbevmParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JbevmParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JbevmParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JbevmParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JbevmParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JbevmParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JbevmParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JbevmParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JbevmParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JbevmParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JbevmParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JbevmParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JbevmParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JbevmParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JbevmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JbevmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JbevmParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JbevmParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JbevmParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JbevmParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JbevmParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JbevmParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JbevmParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JbevmParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JbevmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JbevmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JbevmParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JbevmParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JbevmParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JbevmParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JbevmParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JbevmParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JbevmParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JbevmParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JbevmParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JbevmParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JbevmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JbevmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JbevmParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JbevmParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JbevmParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JbevmParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JbevmParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JbevmParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JbevmParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JbevmParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JbevmParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JbevmParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JbevmParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JbevmParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JbevmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JbevmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JbevmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JbevmParser.ArgumentsContext ctx);
}