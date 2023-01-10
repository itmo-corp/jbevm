package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

import ru.itmo.corp.jbevm.compiler.syntaxTree.StatementJNode;
import ru.itmo.corp.jbevm.compiler.types.JType;

public abstract class ExpressionJNode extends StatementJNode {
  public abstract JType getReturnType();
}
