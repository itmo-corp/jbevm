package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class VariableIdentifierExpressionJNode extends VariableExpressionJNode {
  private Variable variable;
  
  public VariableIdentifierExpressionJNode(Variable variable) {
    this.variable = variable;
  }

  @Override
  public Variable getVariable() {
    return variable;
  }

  @Override
  public JType getReturnType() {
    return variable.getType();
  }
}
