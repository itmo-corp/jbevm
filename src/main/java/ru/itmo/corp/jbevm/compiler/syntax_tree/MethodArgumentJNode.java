package ru.itmo.corp.jbevm.compiler.syntax_tree;

import ru.itmo.corp.jbevm.compiler.types.JType;

public class MethodArgumentJNode extends NamedJNode {
  protected JType type;

  public JType getType() {
    return type;
  }

  public void setType(JType type) {
    this.type = type;
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
