package ru.itmo.corp.jbevm.compiler.syntax_tree.expressions;

import java.util.List;

import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNodeVisitor;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class AssignExpressionJNode extends ExpressionJNode {
  private VariableExpressionJNode left;
  private ExpressionJNode right;

  @Override
  protected void addChildImpl(JNode child) {
    if (!(child instanceof ExpressionJNode)) {
      throw new IllegalArgumentException(
          "AssignExpressionJNode can have only ExpressionJNode children, but got " + child.getClass().getName());
    }
    if (left == null) {
      if (!(child instanceof VariableExpressionJNode)) {
        throw new IllegalArgumentException(
            "AssignExpressionJNode can have only VariableExpressionJNode as left child, but got "
                + child.getClass().getName());
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
  protected void replaceChildImpl(JNode oldChild, JNode newChild) {
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

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
