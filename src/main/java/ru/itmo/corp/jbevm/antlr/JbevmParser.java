// Generated from JbevmParser.g4 by ANTLR 4.10.1

  package ru.itmo.corp.jbevm.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JbevmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, BYTE=3, CHAR=4, CLASS=5, CONTINUE=6, DO=7, DOUBLE=8, 
		ELSE=9, FLOAT=10, FOR=11, IF=12, INT=13, LONG=14, NEW=15, RETURN=16, SHORT=17, 
		STATIC=18, THIS=19, VOID=20, WHILE=21, DECIMAL_LITERAL=22, HEX_LITERAL=23, 
		OCT_LITERAL=24, BINARY_LITERAL=25, FLOAT_LITERAL=26, HEX_FLOAT_LITERAL=27, 
		BOOL_LITERAL=28, CHAR_LITERAL=29, STRING_LITERAL=30, NULL_LITERAL=31, 
		LPAREN=32, RPAREN=33, LBRACE=34, RBRACE=35, LBRACK=36, RBRACK=37, SEMI=38, 
		COMMA=39, DOT=40, ASSIGN=41, GT=42, LT=43, BANG=44, TILDE=45, QUESTION=46, 
		COLON=47, EQUAL=48, LE=49, GE=50, NOTEQUAL=51, AND=52, OR=53, INC=54, 
		DEC=55, ADD=56, SUB=57, MUL=58, DIV=59, BITAND=60, BITOR=61, CARET=62, 
		MOD=63, ADD_ASSIGN=64, SUB_ASSIGN=65, MUL_ASSIGN=66, DIV_ASSIGN=67, AND_ASSIGN=68, 
		OR_ASSIGN=69, XOR_ASSIGN=70, MOD_ASSIGN=71, LSHIFT_ASSIGN=72, RSHIFT_ASSIGN=73, 
		URSHIFT_ASSIGN=74, WS=75, COMMENT=76, LINE_COMMENT=77, IDENTIFIER=78;
	public static final int
		RULE_program = 0, RULE_typeDeclaration = 1, RULE_modifier = 2, RULE_classOrInterfaceModifier = 3, 
		RULE_classDeclaration = 4, RULE_classBody = 5, RULE_classBodyDeclaration = 6, 
		RULE_memberDeclaration = 7, RULE_methodDeclaration = 8, RULE_methodBody = 9, 
		RULE_typeTypeOrVoid = 10, RULE_constructorDeclaration = 11, RULE_fieldDeclaration = 12, 
		RULE_variableDeclarators = 13, RULE_variableDeclarator = 14, RULE_variableDeclaratorId = 15, 
		RULE_variableInitializer = 16, RULE_classOrInterfaceType = 17, RULE_formalParameters = 18, 
		RULE_receiverParameter = 19, RULE_formalParameterList = 20, RULE_formalParameter = 21, 
		RULE_literal = 22, RULE_integerLiteral = 23, RULE_floatLiteral = 24, RULE_block = 25, 
		RULE_blockStatement = 26, RULE_localVariableDeclaration = 27, RULE_identifier = 28, 
		RULE_localTypeDeclaration = 29, RULE_statement = 30, RULE_forControl = 31, 
		RULE_forInit = 32, RULE_parExpression = 33, RULE_expressionList = 34, 
		RULE_methodCall = 35, RULE_expression = 36, RULE_primary = 37, RULE_creator = 38, 
		RULE_createdName = 39, RULE_innerCreator = 40, RULE_typeType = 41, RULE_primitiveType = 42, 
		RULE_arguments = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "typeDeclaration", "modifier", "classOrInterfaceModifier", 
			"classDeclaration", "classBody", "classBodyDeclaration", "memberDeclaration", 
			"methodDeclaration", "methodBody", "typeTypeOrVoid", "constructorDeclaration", 
			"fieldDeclaration", "variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "classOrInterfaceType", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "literal", "integerLiteral", 
			"floatLiteral", "block", "blockStatement", "localVariableDeclaration", 
			"identifier", "localTypeDeclaration", "statement", "forControl", "forInit", 
			"parExpression", "expressionList", "methodCall", "expression", "primary", 
			"creator", "createdName", "innerCreator", "typeType", "primitiveType", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'break'", "'byte'", "'char'", "'class'", "'continue'", 
			"'do'", "'double'", "'else'", "'float'", "'for'", "'if'", "'int'", "'long'", 
			"'new'", "'return'", "'short'", "'static'", "'this'", "'void'", "'while'", 
			null, null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "BYTE", "CHAR", "CLASS", "CONTINUE", "DO", 
			"DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "INT", "LONG", "NEW", "RETURN", 
			"SHORT", "STATIC", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JbevmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JbevmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << STATIC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(88);
				typeDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STATIC) {
					{
					{
					setState(94);
					classOrInterfaceModifier();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				classDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			classOrInterfaceModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JbevmParser.STATIC, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JbevmParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CLASS);
			setState(109);
			identifier();
			setState(110);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JbevmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JbevmParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LBRACE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STATIC) | (1L << VOID) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(113);
				classBodyDeclaration();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JbevmParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(122);
					match(STATIC);
					}
				}

				setState(125);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STATIC) {
					{
					{
					setState(126);
					modifier();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_memberDeclaration);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			typeTypeOrVoid();
			setState(142);
			identifier();
			setState(143);
			formalParameters();
			setState(144);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBody);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JbevmParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeTypeOrVoid);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			identifier();
			setState(155);
			formalParameters();
			setState(156);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			typeType();
			setState(159);
			variableDeclarators();
			setState(160);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JbevmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JbevmParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			variableDeclarator();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				variableDeclarator();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JbevmParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			variableDeclaratorId();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171);
				match(ASSIGN);
				setState(172);
				variableInitializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JbevmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JbevmParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			identifier();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(180);
				match(DOT);
				setState(181);
				identifier();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JbevmParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LPAREN);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==IDENTIFIER) {
					{
					setState(188);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(191);
				receiverParameter();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(192);
					match(COMMA);
					setState(193);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==IDENTIFIER) {
					{
					setState(196);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(201);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JbevmParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JbevmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JbevmParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			typeType();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(204);
				identifier();
				setState(205);
				match(DOT);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JbevmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JbevmParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			formalParameter();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				formalParameter();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			typeType();
			setState(223);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JbevmParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JbevmParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JbevmParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JbevmParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JbevmParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JbevmParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JbevmParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JbevmParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JbevmParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JbevmParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JbevmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JbevmParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LBRACE);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << THIS) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(238);
				blockStatement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_blockStatement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				localVariableDeclaration();
				setState(247);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JbevmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			typeType();
			setState(254);
			variableDeclarators();
			setState(255);
			match(ASSIGN);
			setState(256);
			expression(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JbevmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STATIC) {
					{
					{
					setState(260);
					classOrInterfaceModifier();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				classDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(JbevmParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JbevmParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JbevmParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JbevmParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JbevmParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(JbevmParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(JbevmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(JbevmParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(JbevmParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(IF);
				setState(272);
				parExpression();
				setState(273);
				statement();
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(274);
					match(ELSE);
					setState(275);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(FOR);
				setState(279);
				match(LPAREN);
				setState(280);
				forControl();
				setState(281);
				match(RPAREN);
				setState(282);
				statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(WHILE);
				setState(285);
				parExpression();
				setState(286);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				match(DO);
				setState(289);
				statement();
				setState(290);
				match(WHILE);
				setState(291);
				parExpression();
				setState(292);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				match(RETURN);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
					{
					setState(295);
					expression(0);
					}
				}

				setState(298);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(BREAK);
				setState(300);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				match(CONTINUE);
				setState(302);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 9);
				{
				setState(303);
				match(SEMI);
				}
				break;
			case NEW:
			case THIS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 10);
				{
				setState(304);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(305);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public List<TerminalNode> SEMI() { return getTokens(JbevmParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JbevmParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << THIS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				setState(309);
				forInit();
				}
			}

			setState(312);
			match(SEMI);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(313);
				expression(0);
				}
			}

			setState(316);
			match(SEMI);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(317);
				((ForControlContext)_localctx).forUpdate = expressionList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forInit);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(LPAREN);
			setState(325);
			expression(0);
			setState(326);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JbevmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JbevmParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			expression(0);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				expression(0);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JbevmParser.THIS, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodCall);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				identifier();
				setState(337);
				match(LPAREN);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
					{
					setState(338);
					expressionList();
					}
				}

				setState(341);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(THIS);
				setState(344);
				match(LPAREN);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
					{
					setState(345);
					expressionList();
					}
				}

				setState(348);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JbevmParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JbevmParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JbevmParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(JbevmParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JbevmParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JbevmParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JbevmParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JbevmParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JbevmParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(JbevmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JbevmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JbevmParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JbevmParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JbevmParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JbevmParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JbevmParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JbevmParser.LE, 0); }
		public TerminalNode GE() { return getToken(JbevmParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JbevmParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JbevmParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JbevmParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JbevmParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JbevmParser.AND, 0); }
		public TerminalNode OR() { return getToken(JbevmParser.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(JbevmParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JbevmParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JbevmParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JbevmParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JbevmParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JbevmParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JbevmParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JbevmParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JbevmParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JbevmParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JbevmParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JbevmParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JbevmParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JbevmParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(352);
				primary();
				}
				break;
			case 2:
				{
				setState(353);
				methodCall();
				}
				break;
			case 3:
				{
				setState(354);
				match(NEW);
				setState(355);
				creator();
				}
				break;
			case 4:
				{
				setState(356);
				match(LPAREN);
				setState(357);
				typeType();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(358);
					match(BITAND);
					setState(359);
					typeType();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(RPAREN);
				setState(366);
				expression(15);
				}
				break;
			case 5:
				{
				setState(368);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				expression(13);
				}
				break;
			case 6:
				{
				setState(370);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				expression(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(375);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(376);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(378);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(379);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(388);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(381);
							match(LT);
							setState(382);
							match(LT);
							}
							break;
						case 2:
							{
							setState(383);
							match(GT);
							setState(384);
							match(GT);
							setState(385);
							match(GT);
							}
							break;
						case 3:
							{
							setState(386);
							match(GT);
							setState(387);
							match(GT);
							}
							break;
						}
						setState(390);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(392);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(393);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(395);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(396);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(397);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(398);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(399);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(400);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(401);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(402);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(403);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(404);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(405);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(407);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(408);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(410);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(411);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(413);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (ASSIGN - 41)) | (1L << (ADD_ASSIGN - 41)) | (1L << (SUB_ASSIGN - 41)) | (1L << (MUL_ASSIGN - 41)) | (1L << (DIV_ASSIGN - 41)) | (1L << (AND_ASSIGN - 41)) | (1L << (OR_ASSIGN - 41)) | (1L << (XOR_ASSIGN - 41)) | (1L << (MOD_ASSIGN - 41)) | (1L << (LSHIFT_ASSIGN - 41)) | (1L << (RSHIFT_ASSIGN - 41)) | (1L << (URSHIFT_ASSIGN - 41)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(414);
						expression(1);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(416);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(422);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(417);
							identifier();
							}
							break;
						case 2:
							{
							setState(418);
							methodCall();
							}
							break;
						case 3:
							{
							setState(419);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(420);
							match(NEW);
							setState(421);
							innerCreator();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(424);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(425);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JbevmParser.THIS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(LPAREN);
				setState(432);
				expression(0);
				setState(433);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(THIS);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			createdName();
			setState(441);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JbevmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JbevmParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_createdName);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				identifier();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(444);
					match(DOT);
					setState(445);
					identifier();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			identifier();
			setState(455);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(457);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(458);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JbevmParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JbevmParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JbevmParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JbevmParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JbevmParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JbevmParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JbevmParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JbevmParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JbevmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JbevmParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JbevmParserListener ) ((JbevmParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(LPAREN);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (NEW - 15)) | (1L << (THIS - 15)) | (1L << (DECIMAL_LITERAL - 15)) | (1L << (HEX_LITERAL - 15)) | (1L << (OCT_LITERAL - 15)) | (1L << (BINARY_LITERAL - 15)) | (1L << (FLOAT_LITERAL - 15)) | (1L << (HEX_FLOAT_LITERAL - 15)) | (1L << (BOOL_LITERAL - 15)) | (1L << (CHAR_LITERAL - 15)) | (1L << (STRING_LITERAL - 15)) | (1L << (NULL_LITERAL - 15)) | (1L << (LPAREN - 15)) | (1L << (BANG - 15)) | (1L << (TILDE - 15)) | (1L << (INC - 15)) | (1L << (DEC - 15)) | (1L << (ADD - 15)) | (1L << (SUB - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(464);
				expressionList();
				}
			}

			setState(467);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u01d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0001\u0005\u0001`\b\u0001\n"+
		"\u0001\f\u0001c\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005\n\u0005"+
		"\f\u0005v\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006|\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006"+
		"\f\u0006\u0083\t\u0006\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001"+
		"\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ae\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b7\b\u0011\n\u0011\f\u0011"+
		"\u00ba\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00be\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c3\b\u0012\u0001\u0012\u0003"+
		"\u0012\u00c6\b\u0012\u0003\u0012\u00c8\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d0\b\u0013"+
		"\n\u0013\f\u0013\u00d3\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00da\b\u0014\n\u0014\f\u0014\u00dd\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e8\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u00f0\b\u0019\n\u0019\f\u0019\u00f3\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00fc"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0005\u001d\u0106\b\u001d\n\u001d\f\u001d"+
		"\u0109\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010d\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0115\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0129\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0134\b\u001e\u0001\u001f\u0003\u001f\u0137\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u013b\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u013f\b\u001f\u0001 \u0001 \u0003 \u0143\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u014c\b\"\n\"\f\"\u014f"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u0154\b#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0003#\u015b\b#\u0001#\u0003#\u015e\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0169\b$\n$\f$\u016c\t$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0175\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0185\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01a7\b$\u0001$\u0001"+
		"$\u0005$\u01ab\b$\n$\f$\u01ae\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01b7\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u01bf\b\'\n\'\f\'\u01c2\t\'\u0001\'\u0003\'\u01c5\b\'\u0001("+
		"\u0001(\u0001(\u0001)\u0001)\u0003)\u01cc\b)\u0001*\u0001*\u0001+\u0001"+
		"+\u0003+\u01d2\b+\u0001+\u0001+\u0001+\u0000\u0001H,\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u000b\u0001\u0000\u0016\u0019\u0001\u0000"+
		"\u001a\u001b\u0001\u000069\u0001\u0000,-\u0002\u0000:;??\u0001\u00008"+
		"9\u0002\u0000*+12\u0002\u00000033\u0002\u0000))@J\u0001\u000067\u0006"+
		"\u0000\u0001\u0001\u0003\u0004\b\b\n\n\r\u000e\u0011\u0011\u01fc\u0000"+
		"[\u0001\u0000\u0000\u0000\u0002f\u0001\u0000\u0000\u0000\u0004h\u0001"+
		"\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000"+
		"\u0000\np\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e"+
		"\u008b\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012"+
		"\u0094\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016"+
		"\u009a\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a"+
		"\u00a2\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e"+
		"\u00af\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00b3"+
		"\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000"+
		"\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000*\u00de\u0001\u0000\u0000\u0000"+
		",\u00e7\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000\u0000\u00000\u00eb"+
		"\u0001\u0000\u0000\u00002\u00ed\u0001\u0000\u0000\u00004\u00fb\u0001\u0000"+
		"\u0000\u00006\u00fd\u0001\u0000\u0000\u00008\u0102\u0001\u0000\u0000\u0000"+
		":\u010c\u0001\u0000\u0000\u0000<\u0133\u0001\u0000\u0000\u0000>\u0136"+
		"\u0001\u0000\u0000\u0000@\u0142\u0001\u0000\u0000\u0000B\u0144\u0001\u0000"+
		"\u0000\u0000D\u0148\u0001\u0000\u0000\u0000F\u015d\u0001\u0000\u0000\u0000"+
		"H\u0174\u0001\u0000\u0000\u0000J\u01b6\u0001\u0000\u0000\u0000L\u01b8"+
		"\u0001\u0000\u0000\u0000N\u01c4\u0001\u0000\u0000\u0000P\u01c6\u0001\u0000"+
		"\u0000\u0000R\u01cb\u0001\u0000\u0000\u0000T\u01cd\u0001\u0000\u0000\u0000"+
		"V\u01cf\u0001\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u0001\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^`\u0003\u0006\u0003\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dg\u0003\b\u0004\u0000eg\u0005"+
		"&\u0000\u0000fa\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0003"+
		"\u0001\u0000\u0000\u0000hi\u0003\u0006\u0003\u0000i\u0005\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0012\u0000\u0000k\u0007\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0005\u0000\u0000mn\u00038\u001c\u0000no\u0003\n\u0005\u0000"+
		"o\t\u0001\u0000\u0000\u0000pt\u0005\"\u0000\u0000qs\u0003\f\u0006\u0000"+
		"rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wx\u0005#\u0000\u0000x\u000b\u0001\u0000\u0000\u0000y\u0086"+
		"\u0005&\u0000\u0000z|\u0005\u0012\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0086\u00032\u0019"+
		"\u0000~\u0080\u0003\u0004\u0002\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u000e\u0007\u0000\u0085"+
		"y\u0001\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087\u008c\u0003\u0010"+
		"\b\u0000\u0088\u008c\u0003\u0018\f\u0000\u0089\u008c\u0003\u0016\u000b"+
		"\u0000\u008a\u008c\u0003\b\u0004\u0000\u008b\u0087\u0001\u0000\u0000\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u000f\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f\u00038\u001c\u0000\u008f"+
		"\u0090\u0003$\u0012\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0011"+
		"\u0001\u0000\u0000\u0000\u0092\u0095\u00032\u0019\u0000\u0093\u0095\u0005"+
		"&\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0099\u0003R)\u0000"+
		"\u0097\u0099\u0005\u0014\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u00038\u001c\u0000\u009b\u009c\u0003$\u0012\u0000\u009c\u009d"+
		"\u00032\u0019\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0003"+
		"R)\u0000\u009f\u00a0\u0003\u001a\r\u0000\u00a0\u00a1\u0005&\u0000\u0000"+
		"\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003\u001c\u000e\u0000"+
		"\u00a3\u00a4\u0005\'\u0000\u0000\u00a4\u00a6\u0003\u001c\u000e\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u001b\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0003\u001e\u000f\u0000\u00ab\u00ac\u0005)\u0000\u0000\u00ac\u00ae"+
		"\u0003 \u0010\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00b0\u0003"+
		"8\u001c\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003H$"+
		"\u0000\u00b2!\u0001\u0000\u0000\u0000\u00b3\u00b8\u00038\u001c\u0000\u00b4"+
		"\u00b5\u0005(\u0000\u0000\u00b5\u00b7\u00038\u001c\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9#\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c7\u0005 \u0000"+
		"\u0000\u00bc\u00be\u0003&\u0013\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c8\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0003&\u0013\u0000\u00c0\u00c1\u0005\'\u0000\u0000\u00c1"+
		"\u00c3\u0003(\u0014\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0003(\u0014\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"!\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00d1\u0003R)\u0000"+
		"\u00cc\u00cd\u00038\u001c\u0000\u00cd\u00ce\u0005(\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0013\u0000\u0000\u00d5\'\u0001"+
		"\u0000\u0000\u0000\u00d6\u00db\u0003*\u0015\u0000\u00d7\u00d8\u0005\'"+
		"\u0000\u0000\u00d8\u00da\u0003*\u0015\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc)\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0003R)\u0000\u00df\u00e0"+
		"\u0003\u001e\u000f\u0000\u00e0+\u0001\u0000\u0000\u0000\u00e1\u00e8\u0003"+
		".\u0017\u0000\u00e2\u00e8\u00030\u0018\u0000\u00e3\u00e8\u0005\u001d\u0000"+
		"\u0000\u00e4\u00e8\u0005\u001e\u0000\u0000\u00e5\u00e8\u0005\u001c\u0000"+
		"\u0000\u00e6\u00e8\u0005\u001f\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0007\u0000\u0000\u0000\u00ea/\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0007\u0001\u0000\u0000\u00ec1\u0001\u0000\u0000\u0000\u00ed\u00f1"+
		"\u0005\"\u0000\u0000\u00ee\u00f0\u00034\u001a\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"#\u0000\u0000\u00f53\u0001\u0000\u0000\u0000\u00f6\u00f7\u00036\u001b"+
		"\u0000\u00f7\u00f8\u0005&\u0000\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0003<\u001e\u0000\u00fa\u00fc\u0003:\u001d\u0000\u00fb\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc5\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003"+
		"R)\u0000\u00fe\u00ff\u0003\u001a\r\u0000\u00ff\u0100\u0005)\u0000\u0000"+
		"\u0100\u0101\u0003H$\u0000\u01017\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005N\u0000\u0000\u01039\u0001\u0000\u0000\u0000\u0104\u0106\u0003\u0006"+
		"\u0003\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0003\b\u0004\u0000\u010b\u010d\u0005&\u0000"+
		"\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d;\u0001\u0000\u0000\u0000\u010e\u0134\u00032\u0019\u0000\u010f"+
		"\u0110\u0005\f\u0000\u0000\u0110\u0111\u0003B!\u0000\u0111\u0114\u0003"+
		"<\u001e\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0115\u0003<\u001e"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0134\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u000b\u0000"+
		"\u0000\u0117\u0118\u0005 \u0000\u0000\u0118\u0119\u0003>\u001f\u0000\u0119"+
		"\u011a\u0005!\u0000\u0000\u011a\u011b\u0003<\u001e\u0000\u011b\u0134\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005\u0015\u0000\u0000\u011d\u011e\u0003"+
		"B!\u0000\u011e\u011f\u0003<\u001e\u0000\u011f\u0134\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u0007\u0000\u0000\u0121\u0122\u0003<\u001e\u0000"+
		"\u0122\u0123\u0005\u0015\u0000\u0000\u0123\u0124\u0003B!\u0000\u0124\u0125"+
		"\u0005&\u0000\u0000\u0125\u0134\u0001\u0000\u0000\u0000\u0126\u0128\u0005"+
		"\u0010\u0000\u0000\u0127\u0129\u0003H$\u0000\u0128\u0127\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u0134\u0005&\u0000\u0000\u012b\u012c\u0005\u0002\u0000\u0000"+
		"\u012c\u0134\u0005&\u0000\u0000\u012d\u012e\u0005\u0006\u0000\u0000\u012e"+
		"\u0134\u0005&\u0000\u0000\u012f\u0134\u0005&\u0000\u0000\u0130\u0131\u0003"+
		"H$\u0000\u0131\u0132\u0005&\u0000\u0000\u0132\u0134\u0001\u0000\u0000"+
		"\u0000\u0133\u010e\u0001\u0000\u0000\u0000\u0133\u010f\u0001\u0000\u0000"+
		"\u0000\u0133\u0116\u0001\u0000\u0000\u0000\u0133\u011c\u0001\u0000\u0000"+
		"\u0000\u0133\u0120\u0001\u0000\u0000\u0000\u0133\u0126\u0001\u0000\u0000"+
		"\u0000\u0133\u012b\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000\u0000"+
		"\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000"+
		"\u0000\u0134=\u0001\u0000\u0000\u0000\u0135\u0137\u0003@ \u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0005&\u0000\u0000\u0139\u013b"+
		"\u0003H$\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0005&\u0000"+
		"\u0000\u013d\u013f\u0003D\"\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f?\u0001\u0000\u0000\u0000\u0140"+
		"\u0143\u00036\u001b\u0000\u0141\u0143\u0003D\"\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143A\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0005 \u0000\u0000\u0145\u0146\u0003H$\u0000"+
		"\u0146\u0147\u0005!\u0000\u0000\u0147C\u0001\u0000\u0000\u0000\u0148\u014d"+
		"\u0003H$\u0000\u0149\u014a\u0005\'\u0000\u0000\u014a\u014c\u0003H$\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014eE\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u00038\u001c\u0000\u0151\u0153\u0005 \u0000\u0000\u0152\u0154\u0003"+
		"D\"\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005!\u0000"+
		"\u0000\u0156\u015e\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0013\u0000"+
		"\u0000\u0158\u015a\u0005 \u0000\u0000\u0159\u015b\u0003D\"\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0005!\u0000\u0000\u015d\u0150"+
		"\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015eG\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0006$\uffff\uffff\u0000\u0160\u0175\u0003"+
		"J%\u0000\u0161\u0175\u0003F#\u0000\u0162\u0163\u0005\u000f\u0000\u0000"+
		"\u0163\u0175\u0003L&\u0000\u0164\u0165\u0005 \u0000\u0000\u0165\u016a"+
		"\u0003R)\u0000\u0166\u0167\u0005<\u0000\u0000\u0167\u0169\u0003R)\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0005!\u0000\u0000\u016e\u016f\u0003H$\u000f\u016f\u0175"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0007\u0002\u0000\u0000\u0171\u0175"+
		"\u0003H$\r\u0172\u0173\u0007\u0003\u0000\u0000\u0173\u0175\u0003H$\f\u0174"+
		"\u015f\u0001\u0000\u0000\u0000\u0174\u0161\u0001\u0000\u0000\u0000\u0174"+
		"\u0162\u0001\u0000\u0000\u0000\u0174\u0164\u0001\u0000\u0000\u0000\u0174"+
		"\u0170\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u01ac\u0001\u0000\u0000\u0000\u0176\u0177\n\u000b\u0000\u0000\u0177\u0178"+
		"\u0007\u0004\u0000\u0000\u0178\u01ab\u0003H$\f\u0179\u017a\n\n\u0000\u0000"+
		"\u017a\u017b\u0007\u0005\u0000\u0000\u017b\u01ab\u0003H$\u000b\u017c\u0184"+
		"\n\t\u0000\u0000\u017d\u017e\u0005+\u0000\u0000\u017e\u0185\u0005+\u0000"+
		"\u0000\u017f\u0180\u0005*\u0000\u0000\u0180\u0181\u0005*\u0000\u0000\u0181"+
		"\u0185\u0005*\u0000\u0000\u0182\u0183\u0005*\u0000\u0000\u0183\u0185\u0005"+
		"*\u0000\u0000\u0184\u017d\u0001\u0000\u0000\u0000\u0184\u017f\u0001\u0000"+
		"\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u01ab\u0003H$\n\u0187\u0188\n\b\u0000\u0000\u0188\u0189"+
		"\u0007\u0006\u0000\u0000\u0189\u01ab\u0003H$\t\u018a\u018b\n\u0007\u0000"+
		"\u0000\u018b\u018c\u0007\u0007\u0000\u0000\u018c\u01ab\u0003H$\b\u018d"+
		"\u018e\n\u0006\u0000\u0000\u018e\u018f\u0005<\u0000\u0000\u018f\u01ab"+
		"\u0003H$\u0007\u0190\u0191\n\u0005\u0000\u0000\u0191\u0192\u0005>\u0000"+
		"\u0000\u0192\u01ab\u0003H$\u0006\u0193\u0194\n\u0004\u0000\u0000\u0194"+
		"\u0195\u0005=\u0000\u0000\u0195\u01ab\u0003H$\u0005\u0196\u0197\n\u0003"+
		"\u0000\u0000\u0197\u0198\u00054\u0000\u0000\u0198\u01ab\u0003H$\u0004"+
		"\u0199\u019a\n\u0002\u0000\u0000\u019a\u019b\u00055\u0000\u0000\u019b"+
		"\u01ab\u0003H$\u0003\u019c\u019d\n\u0001\u0000\u0000\u019d\u019e\u0007"+
		"\b\u0000\u0000\u019e\u01ab\u0003H$\u0001\u019f\u01a0\n\u0012\u0000\u0000"+
		"\u01a0\u01a6\u0005(\u0000\u0000\u01a1\u01a7\u00038\u001c\u0000\u01a2\u01a7"+
		"\u0003F#\u0000\u01a3\u01a7\u0005\u0013\u0000\u0000\u01a4\u01a5\u0005\u000f"+
		"\u0000\u0000\u01a5\u01a7\u0003P(\u0000\u01a6\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\n\u000e\u0000\u0000\u01a9\u01ab\u0007\t\u0000\u0000\u01aa"+
		"\u0176\u0001\u0000\u0000\u0000\u01aa\u0179\u0001\u0000\u0000\u0000\u01aa"+
		"\u017c\u0001\u0000\u0000\u0000\u01aa\u0187\u0001\u0000\u0000\u0000\u01aa"+
		"\u018a\u0001\u0000\u0000\u0000\u01aa\u018d\u0001\u0000\u0000\u0000\u01aa"+
		"\u0190\u0001\u0000\u0000\u0000\u01aa\u0193\u0001\u0000\u0000\u0000\u01aa"+
		"\u0196\u0001\u0000\u0000\u0000\u01aa\u0199\u0001\u0000\u0000\u0000\u01aa"+
		"\u019c\u0001\u0000\u0000\u0000\u01aa\u019f\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"I\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0005 \u0000\u0000\u01b0\u01b1\u0003H$\u0000\u01b1\u01b2\u0005!\u0000"+
		"\u0000\u01b2\u01b7\u0001\u0000\u0000\u0000\u01b3\u01b7\u0005\u0013\u0000"+
		"\u0000\u01b4\u01b7\u0003,\u0016\u0000\u01b5\u01b7\u00038\u001c\u0000\u01b6"+
		"\u01af\u0001\u0000\u0000\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"K\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003N\'\u0000\u01b9\u01ba\u0003"+
		"V+\u0000\u01baM\u0001\u0000\u0000\u0000\u01bb\u01c0\u00038\u001c\u0000"+
		"\u01bc\u01bd\u0005(\u0000\u0000\u01bd\u01bf\u00038\u001c\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c5"+
		"\u0003T*\u0000\u01c4\u01bb\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5O\u0001\u0000\u0000\u0000\u01c6\u01c7\u00038\u001c\u0000"+
		"\u01c7\u01c8\u0003V+\u0000\u01c8Q\u0001\u0000\u0000\u0000\u01c9\u01cc"+
		"\u0003\"\u0011\u0000\u01ca\u01cc\u0003T*\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01ccS\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0007\n\u0000\u0000\u01ceU\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d1\u0005 \u0000\u0000\u01d0\u01d2\u0003D\"\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005!\u0000\u0000\u01d4W\u0001\u0000"+
		"\u0000\u0000.[aft{\u0081\u0085\u008b\u0094\u0098\u00a7\u00ad\u00b8\u00bd"+
		"\u00c2\u00c5\u00c7\u00d1\u00db\u00e7\u00f1\u00fb\u0107\u010c\u0114\u0128"+
		"\u0133\u0136\u013a\u013e\u0142\u014d\u0153\u015a\u015d\u016a\u0174\u0184"+
		"\u01a6\u01aa\u01ac\u01b6\u01c0\u01c4\u01cb\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}