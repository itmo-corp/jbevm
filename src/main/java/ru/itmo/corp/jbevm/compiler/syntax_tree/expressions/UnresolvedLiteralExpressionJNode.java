package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.types.JType;

public class UnresolvedLiteralExpressionJNode extends ExpressionJNode {
  private String value;

  public UnresolvedLiteralExpressionJNode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public JType getReturnType() {
    throw new UnsupportedOperationException("Literal " + value + " is not resolved yet");
  }
}
