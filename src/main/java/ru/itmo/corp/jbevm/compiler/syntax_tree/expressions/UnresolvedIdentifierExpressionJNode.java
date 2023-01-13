package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
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
    throw new UnsupportedOperationException("Identifier " + name + " is not resolved yet");
  }

  @Override
  public Variable getVariable() {
    throw new UnsupportedOperationException("Identifier " + name + " is not resolved yet");
  }
}
