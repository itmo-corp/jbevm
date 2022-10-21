package ru.itmo.corp.jbevm;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ru.itmo.corp.jbevm.antlr.JbevmLexer;
import ru.itmo.corp.jbevm.antlr.JbevmParser;

import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    var source = "class Hello { static float A = 42.10f; int a; Hello(int a) { this.a = a; } }";

    var lexer = new JbevmLexer(CharStreams.fromString(source));
    var tokenStream = new CommonTokenStream(lexer);
    var parser = new JbevmParser(tokenStream);

    ParseTree tree = parser.program();

    System.out.println(tree.toStringTree(parser));

    (new TreeViewer(Arrays.asList(parser.getRuleNames()), tree)).open();
  }
}
