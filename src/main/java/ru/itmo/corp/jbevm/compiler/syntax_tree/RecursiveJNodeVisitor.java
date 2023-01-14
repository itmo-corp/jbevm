package ru.itmo.corp.jbevm.compiler.syntax_tree;

public abstract class RecursiveJNodeVisitor extends JNodeVisitor {
  @Override
  protected void unknownNode(JNode node) {
    visitChildren(node);
  }

  protected void visitChildren(JNode node) {
    for (JNode child : node.getChildren()) {
      child.accept(this);
    }
  }
}
