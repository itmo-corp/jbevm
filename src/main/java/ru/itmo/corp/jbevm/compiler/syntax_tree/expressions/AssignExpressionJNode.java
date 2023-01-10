package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import java.util.List;

import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class AssignExpressionJNode extends ExpressionJNode {
  private VariableExpressionJNode left;
  private ExpressionJNode right;

  @Override
  public void addChild(JNode child) {
    if (!(child instanceof ExpressionJNode)) {
      throw new IllegalArgumentException("AssignExpressionJNode can have only ExpressionJNode children");
    }
    if (left == null) {
      if (!(child instanceof VariableExpressionJNode)) {
        throw new IllegalArgumentException("AssignExpressionJNode can have only VariableExpressionJNode as left child");
      }
      left = (VariableExpressionJNode) child;
    } else if (right == null) {
      right = (ExpressionJNode) child;
    } else {
      throw new IllegalStateException("AssignExpressionJNode can have only two children");
    }
  }

  @Override
  public List<JNode> getChildren() {
    return List.of(left, right);
  }

  @Override
  public JType getReturnType() {
    return left.getReturnType();
  }

  @Override
  public void replaceChild(JNode oldChild, JNode newChild) {
    if (left == oldChild) {
      left = (VariableExpressionJNode) newChild;
    } else if (right == oldChild) {
      right = (ExpressionJNode) newChild;
    } else {
      throw new IllegalArgumentException("Not found child to replace");
    }
  }

  public VariableExpressionJNode getLeft() {
    return left;
  }

  public ExpressionJNode getRight() {
    return right;
  }
}
