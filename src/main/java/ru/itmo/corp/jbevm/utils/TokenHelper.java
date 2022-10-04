package ru.itmo.corp.jbevm.utils;

public class TokenHelper {
  public static boolean isAlpha(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_';
  }

  public static boolean isDigit(char c) {
    return c >= '0' && c <= '9';
  }

  public static boolean isAlphaNumeric(char c) {
    return isAlpha(c) || isDigit(c);
  }
}
