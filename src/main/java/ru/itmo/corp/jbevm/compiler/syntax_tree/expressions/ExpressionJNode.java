package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import ru.itmo.corp.jbevm.compiler.syntax_tree.StatementJNode;
import ru.itmo.corp.jbevm.compiler.types.JType;

public abstract class ExpressionJNode extends StatementJNode {
  public abstract JType getReturnType();
}
