package ru.itmo.corp.jbevm.compiler.basm;

public class SimpleBasmLine extends BasmLine {
  private String basm;

  public SimpleBasmLine(String basm) {
    this.basm = basm;
  }

  @Override
  public String toBasm() {
    return basm;
  }
}