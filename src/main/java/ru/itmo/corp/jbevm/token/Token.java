package ru.itmo.corp.jbevm.token;

import ru.itmo.corp.jbevm.utils.Position;

public class Token {
  public final TokenType type;
  public String lexeme;
  public Object literal;
  public Position pos;

  public Token(TokenType type, String lexeme, Position pos) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = null;
    this.pos = pos;
  }

  public Token(TokenType type, String lexeme, Object literal, Position pos) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.pos = pos;
  }

  public void concat(Token token) {
    if (token == null) return;

    this.lexeme += token.lexeme;
  }

  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}
