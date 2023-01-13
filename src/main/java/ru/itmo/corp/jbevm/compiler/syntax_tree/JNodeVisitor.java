package ru.itmo.corp.jbevm.compiler.syntax_tree;

public abstract class JNodeVisitor {
  public void visit(JNode node) {
    unregistredNode(node);
    unknownNode(node);
  }

  protected void unknownNode(JNode node) {
    for (JNode child : node.getChildren()) {
      child.accept(this);
    }
  }

  protected void unregistredNode(JNode node) {
    throw new UnsupportedOperationException("Unregistred node: " + node.getClass().getName());
  }
}
