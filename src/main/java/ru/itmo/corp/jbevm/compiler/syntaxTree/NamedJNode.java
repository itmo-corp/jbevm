package ru.itmo.corp.jbevm.compiler.syntaxTree;

public abstract class NamedJNode extends JNode {
  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
