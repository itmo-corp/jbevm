package ru.itmo.corp.jbevm.compiler.syntaxTree;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.ExpressionJNode;

public class LocalVariableJNode extends VariableJNode implements ScopeItem {
  private @Nullable ExpressionJNode value;

  @Override
  public void addChild(JNode child) {
    if (child instanceof ExpressionJNode) {
      value = (ExpressionJNode) child;
    } else {
      throw new IllegalArgumentException("LocalVariableJNode can have only ExpressionJNode as child");
    }
  }

  @Override
  public List<JNode> getChildren() {
    return value == null ? Collections.emptyList() : Collections.singletonList(value);
  }

  @Override
  public void replaceChild(JNode oldChild, JNode newChild) {
    if (value == oldChild) {
      value = (ExpressionJNode) newChild;
    } else {
      throw new IllegalArgumentException("Not found child to replace");
    }
  }
}
