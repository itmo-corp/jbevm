package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

import ru.itmo.corp.jbevm.compiler.dataContainers.Variable;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class UnresolvedIdentifierExpressionJNode extends VariableExpressionJNode {
  private String name;

  public UnresolvedIdentifierExpressionJNode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public JType getReturnType() {
    throw new UnsupportedOperationException();
  }

  @Override
  public Variable getVariable() {
    throw new UnsupportedOperationException();
  }
}
