package ru.itmo.corp.jbevm.compiler.syntax_tree;

public abstract class NamedJNode extends JNode {
  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
