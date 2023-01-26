package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import java.util.List;

import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNodeVisitor;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class AddOperatorExpressionJNode extends ExpressionJNode {
  private JNode left;
  private JNode right;

  @Override
  protected void addChildImpl(JNode child) {
    if (left == null) {
      left = child;
    } else if (right == null) {
      right = child;
    } else {
      throw new IllegalStateException("AddOperatorExpressionJNode can have only two children");
    }
  }

  @Override
  public List<JNode> getChildren() {
    return List.of(left, right);
  }

  @Override
  protected void replaceChildImpl(JNode oldChild, JNode newChild) {
    if (left == oldChild) {
      left = newChild;
    } else if (right == oldChild) {
      right = newChild;
    } else {
      throw new IllegalArgumentException("Not found child to replace");
    }
  }

  @Override
  public JType getReturnType() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  public JNode getLeft() {
    return left;
  }

  public JNode getRight() {
    return right;
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
