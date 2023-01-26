package ru.itmo.corp.jbevm.compiler.generators;

import ru.itmo.corp.jbevm.compiler.scopes.Scope;
import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RecursiveJNodeVisitor;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RootJNode;

public class ScopesGenerator extends RecursiveJNodeVisitor {
  public static void generate(JNode node) {
    node.accept(new ScopesGenerator());
  }

  public static void regenerateOne(JNode node) {
    node.newScope().setParent(node.getParent().getScope());
    generateOne(node);
  }

  public static void regenerateOne(RootJNode node) {
    node.newScope();
    generateOne(node);
  }

  private static void generateOne(JNode node) {
    Scope scope = node.getScope();
    for (JNode child : node.getChildren()) {
      if (child instanceof ScopeItem) {
        scope.add((ScopeItem) child);
      }
    }
  }

  @Override
  public void visit(RootJNode node) {
    regenerateOne(node);
    visitChildren(node);
  }

  @Override
  protected void unknownNode(JNode node) {
    regenerateOne(node);
    super.unknownNode(node);
  }
}
