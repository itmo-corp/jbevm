package ru.itmo.corp.jbevm.exceptions;

public class LexicalException extends RuntimeException {
  public LexicalException(String error) {
    super(error);
  }
}
