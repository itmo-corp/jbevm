package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.ExpressionJNode;

public class LocalVariableJNode extends VariableJNode implements ScopeItem {
  private @Nullable ExpressionJNode value;

  @Override
  protected void addChildImpl(JNode child) {
    if (child instanceof ExpressionJNode) {
      value = (ExpressionJNode) child;
    } else {
      throw new IllegalArgumentException("LocalVariableJNode can have only ExpressionJNode as child, but got " + child.getClass().getName());
    }
  }

  @Override
  public List<JNode> getChildren() {
    return value == null ? Collections.emptyList() : Collections.singletonList(value);
  }

  @Override
  protected void replaceChildImpl(JNode oldChild, JNode newChild) {
    if (value == oldChild) {
      value = (ExpressionJNode) newChild;
    } else {
      throw new IllegalArgumentException("Not found child to replace");
    }
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
