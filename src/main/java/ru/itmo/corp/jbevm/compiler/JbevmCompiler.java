package ru.itmo.corp.jbevm.compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.antlr.v4.runtime.CharStreams;

import ru.itmo.corp.jbevm.antlr.JbevmLexer;
import ru.itmo.corp.jbevm.antlr.JbevmParser;
import ru.itmo.corp.jbevm.compiler.basm.BasmProgram;
import ru.itmo.corp.jbevm.compiler.generators.ScopesGenerator;
import ru.itmo.corp.jbevm.compiler.generators.VariableExpressionGenerator;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RootJNode;

public class JbevmCompiler {
  public String compile(String source) {
    var lexer = new JbevmLexer(CharStreams.fromString(source));
    var tokenStream = new CommonTokenStream(lexer);
    var parser = new JbevmParser(tokenStream);

    var syntaxTreeListener = new SyntaxTreeListener();

    ParseTree tree = parser.program();

    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(syntaxTreeListener, tree);

    RootJNode root = syntaxTreeListener.getRoot();

    ScopesGenerator.generate(root, null);

    VariableExpressionGenerator.generate(root);

    BasmProgramBuilder builder = new BasmProgramBuilder();
    builder.setEntryClassName("Main");
    BasmProgram program = builder.build(root);

    return program.toBasm();
  }
}
