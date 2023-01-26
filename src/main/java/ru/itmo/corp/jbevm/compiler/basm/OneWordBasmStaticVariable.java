package ru.itmo.corp.jbevm.compiler.basm;

public class OneWordBasmStaticVariable extends BasmLine {
  private String name;
  private String value;

  public OneWordBasmStaticVariable(String name, String value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String toBasm() {
    return name + ": word " + value;
  }
}
