package ru.itmo.corp.jbevm;

import ru.itmo.corp.jbevm.compiler.JbevmCompiler;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    var source = "class Main { public static void main() { int a = 1; int b = 2; int c = a + b; a = a + c + 16; } }";

    var compiler = new JbevmCompiler();

    System.out.println(compiler.compile(source));
  }
}
