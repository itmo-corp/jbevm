package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.types.IntJType;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class IntLiteralExpressionJNode extends ExpressionJNode {
  private int value;

  public IntLiteralExpressionJNode() {
  }

  public IntLiteralExpressionJNode(String value) {
    this(Integer.parseInt(value));
  }

  public IntLiteralExpressionJNode(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public JType getReturnType() {
    return new IntJType();
  }
}
