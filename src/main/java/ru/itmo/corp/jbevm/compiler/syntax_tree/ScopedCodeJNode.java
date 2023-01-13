package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.ArrayList;
import java.util.List;

public class ScopedCodeJNode extends StatementJNode {
  private List<LocalVariableJNode> localVariables = new ArrayList<>();
  private List<StatementJNode> statements = new ArrayList<>();

  @Override
  public void addChild(JNode child) {
    if (child instanceof LocalVariableJNode) {
      localVariables.add((LocalVariableJNode) child);
    } else if (child instanceof StatementJNode) {
      statements.add((StatementJNode) child);
    } else {
      throw new IllegalArgumentException("Unexpected child type: " + child.getClass().getName());
    }
  }

  @Override
  public List<JNode> getChildren() {
    List<JNode> children = new ArrayList<>();
    children.addAll(localVariables);
    children.addAll(statements);
    return children;
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
