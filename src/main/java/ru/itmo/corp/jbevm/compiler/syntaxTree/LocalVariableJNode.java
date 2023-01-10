package ru.itmo.corp.jbevm.compiler.syntaxTree;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.ExpressionJNode;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class LocalVariableJNode extends NamedJNode implements ScopeItem {
  protected JType type;
  protected @Nullable ExpressionJNode value;

  public void setType(JType type) {
    this.type = type;
  }

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
}
