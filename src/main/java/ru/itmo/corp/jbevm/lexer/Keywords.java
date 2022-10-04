package ru.itmo.corp.jbevm.lexer;

import ru.itmo.corp.jbevm.token.TokenType;

import java.util.HashMap;
import java.util.Map;

import static ru.itmo.corp.jbevm.token.TokenType.*;

public class Keywords {
  private static final Map<String, TokenType> keywords;

  static {
    keywords = new HashMap<>() {
      {
        put("break", BREAK);
        put("catch", CATCH);
        put("class", CLASS);
        put("continue", CONTINUE);
        put("do", DO);
        put("else", ELSE);
        put("final", FINAL);
        put("for", FOR);
        put("if", IF);
        put("instanceof", INSTANCEOF);
        put("new", NEW);
        put("return", RETURN);
        put("static", STATIC);
        put("super", SUPER);
        put("this", THIS);
        put("throw", THROW);
        put("throws", THROWS);
        put("try", TRY);
        put("while", WHILE);

        put("true", TRUE);
        put("false", FALSE);
        put("null", NULL);

        put("boolean", BOOLEAN_TYPE);
        put("byte", BYTE_TYPE);
        put("int", INT_TYPE);
        put("float", FLOAT_TYPE);
        put("char", CHAR_TYPE);
        put("double", DOUBLE_TYPE);
        put("long", LONG_TYPE);
        put("short", SHORT_TYPE);
        put("void", VOID_TYPE);
      }
    };
  }

  public static TokenType get(String text) {
    return keywords.get(text);
  }
}
