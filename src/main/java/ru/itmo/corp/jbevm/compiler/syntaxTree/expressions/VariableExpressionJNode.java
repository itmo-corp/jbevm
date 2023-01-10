package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

import ru.itmo.corp.jbevm.compiler.dataContainers.Variable;

public abstract class VariableExpressionJNode extends ExpressionJNode {
  public abstract Variable getVariable();
}
