package ru.itmo.corp.jbevm;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ru.itmo.corp.jbevm.antlr.JbevmLexer;
import ru.itmo.corp.jbevm.antlr.JbevmParser;
import ru.itmo.corp.jbevm.compiler.JbevmCompiler;

import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    var source = "class Main { public static void main(int a) { int a = 1; int b = 2; int c = a + b; } }";

    var compiler = new JbevmCompiler();

    System.out.println(compiler.compile(source));

    // var lexer = new JbevmLexer(CharStreams.fromString(source));
    // var tokenStream = new CommonTokenStream(lexer);
    // var parser = new JbevmParser(tokenStream);

    // ParseTree tree = parser.program();

    // System.out.println(tree.toStringTree(parser));

    // (new TreeViewer(Arrays.asList(parser.getRuleNames()), tree)).open();
  }
}
