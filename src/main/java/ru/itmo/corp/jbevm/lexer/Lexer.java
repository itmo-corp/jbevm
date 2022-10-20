package ru.itmo.corp.jbevm.lexer;

import java.util.*;

import ru.itmo.corp.jbevm.token.Token;
import ru.itmo.corp.jbevm.token.TokenType;

import ru.itmo.corp.jbevm.utils.Position;
import ru.itmo.corp.jbevm.utils.Reporter;
import ru.itmo.corp.jbevm.utils.TokenHelper;

import static ru.itmo.corp.jbevm.token.TokenType.*;

public class Lexer {
  private final String source;
  private final List<Token> tokens = new ArrayList<>();

  private int start = 0;
  private int current = 0;
  private int line = 1;
  private int currentLineChar = 0;

  public Lexer(String source) {
    this.source = source;
  }

  public List<Token> scanTokens() {
    while (!isAtEnd()) {
      start = current;
      scanToken();
    }
    tokens.add(new Token(EOF, "", null, currentPosition()));
    return tokens;
  }

  private void scanToken() {
    char c = pointToNextChar();
    switch (c) {
      case '[':
        addToken(ARRAY_OPEN);
        break;
      case ']':
        addToken(ARRAY_CLOSE);
        break;
      case '(':
        addToken(LEFT_PAREN);
        break;
      case ')':
        addToken(RIGHT_PAREN);
        break;
      case '{':
        addToken(LEFT_BRACE);
        break;
      case '}':
        addToken(RIGHT_BRACE);
        break;
      case ',':
        addToken(COMMA);
        break;
      case '.':
        addToken(DOT);
        break;
      case '-':
        addToken(match('-') ? MINUS_MINUS : MINUS);
        break;
      case '+':
        addToken(match('+') ? PLUS_PLUS : PLUS);
        break;
      case ';':
        addToken(SEMICOLON);
        break;
      case '*':
        addToken(STAR);
        break;
      case '?':
        addToken(QUESTION_MARK);
        break;
      case ':':
        addToken(COLON);
        break;
      case '!':
        addToken(match('=') ? BANG_EQUAL : BANG);
        break;
      case '=':
        addToken(match('=') ? EQUAL_EQUAL : EQUAL);
        break;
      case '<':
        addToken(match('=') ? LESS_EQUAL : match('<') ? SHIFT_LEFT : LESS);
        break;
      case '>':
        addToken(match('=') ? GREATER_EQUAL :
            match('>') ? match('>') ? LOGICAL_SHIFT_RIGHT : SHIFT_RIGHT : GREATER);
        break;
      case '/':
        if (match('/')) {
          while (getCurrentChar() != '\n' && !isAtEnd()) pointToNextChar();
        } else {
          addToken(SLASH);
        }
        break;
      case ' ':
      case '\r':
      case '\t':
        // Ignore whitespace
        break;
      case '\n':
        line++;
        currentLineChar = 0;
        break;
      case '"':
        scanString();
        break;
      case '\'':
        scanChar();
        break;
      default:
        if (TokenHelper.isDigit(c)) {
          scanNumber();
        } else if (TokenHelper.isAlpha(c)) {
          scanIdentifier();
        } else {
          Reporter.error(currentPosition(), "Unexpected character.");
        }
    }
  }

  private void scanNumber() {
    boolean isFloat = false;
    while (TokenHelper.isDigit(getCurrentChar()) || getCurrentChar() == '_') {
      pointToNextChar();
    }

    // Look for a fractional part
    if (getCurrentChar() == '.' && TokenHelper.isDigit(getNextChar())) {
      // Consume the "."
      isFloat = true;
      pointToNextChar();
      while (TokenHelper.isDigit(getCurrentChar())) pointToNextChar();
    }

    String number = source.substring(start, current);
    number = number.replaceAll("_", "");

    if (isFloat) {
      addToken(FLOAT_NUMBER, Double.parseDouble(number));
    } else {
      addToken(INT_NUMBER, Integer.parseInt(number));
    }
  }

  private void scanString() {
    while (getCurrentChar() != '"' && !isAtEnd()) {
      if (getCurrentChar() == '\n') line++;
      pointToNextChar();
    }

    // Unterminated scanString
    if (isAtEnd()) {
      Reporter.error(currentPosition(), "Unterminated string variable.");
      return;
    }

    // The closing "
    pointToNextChar();

    // Trim the surrounding quotes
    String value = source.substring(start + 1, current - 1);
    addToken(STRING, value);
  }

  private void scanChar() {
    String value = source.substring(start + 1, start + 2);
    pointToNextChar();
    if (getCurrentChar() != '\'') {
      Reporter.error(currentPosition(), "Unterminated char variable.");
      return;
    }
    pointToNextChar();
    addToken(CHAR, value.charAt(0));
  }

  private void scanIdentifier() {
    while (TokenHelper.isAlphaNumeric(getCurrentChar())) pointToNextChar();

    // See if the scanIdentifier is a reserved word
    String text = source.substring(start, current);

    TokenType type = Keywords.get(text);

    if (type == null) type = IDENTIFIER;
    addToken(type);
  }

  private char pointToNextChar() {
    current++;
    currentLineChar++;
    return source.charAt(current - 1);
  }

  private void addToken(TokenType type) {
    addToken(type, null);
  }

  private void addToken(TokenType type, Object literal) {
    String text = source.substring(start, current);
    tokens.add(new Token(type, text, literal, currentPosition()));
  }

  private boolean isAtEnd() {
    return current >= source.length();
  }

  private boolean match(char expected) {
    if (isAtEnd()) return false;
    if (source.charAt(current) != expected) return false;

    current++;
    currentLineChar++;
    return true;
  }

  private char getCurrentChar() {
    if (isAtEnd()) return '\0';

    return source.charAt(current);
  }

  private char getNextChar() {
    if (current + 1 >= source.length()) return '\0';

    return source.charAt(current + 1);
  }

  private Position currentPosition() {
    return new Position(this.line, this.currentLineChar);
  }
}
