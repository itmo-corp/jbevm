package ru.itmo.corp.jbevm.utils;

import ru.itmo.corp.jbevm.exceptions.LexicalException;
import ru.itmo.corp.jbevm.token.Token;
import ru.itmo.corp.jbevm.token.TokenType;


public class Reporter {
  public static void error(Position position, String message) {
    report(position.toString(), "", message);
  }

  public static void error(String message) {
    report(message);
  }

  public static void error(Token token, String message) {
    if (token.type == TokenType.EOF) {
      report(token.pos.toString(), " at end", message);
    } else {
      report(token.pos.toString(), " at '" + token.lexeme + "'", message);
    }
  }

  private static void report(String position, String where, String message) {
    throw new LexicalException(position + " Error" + where + ": " + message);
  }

  private static void report(String message) {
    System.err.println(message);
  }
}
