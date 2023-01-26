package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;

public abstract class VariableExpressionJNode extends ExpressionJNode {
  public abstract Variable getVariable();
}
