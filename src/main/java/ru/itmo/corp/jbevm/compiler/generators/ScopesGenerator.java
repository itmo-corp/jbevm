package ru.itmo.corp.jbevm.compiler.generators;

import ru.itmo.corp.jbevm.compiler.scopes.Scope;
import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;

public class ScopesGenerator {
  public static void generate(JNode node, Scope parentScope) {
    for (JNode child : node.getChildren()) {
      generate(child, node.getScope());
    }
    regenerateOne(node, parentScope);
  }

  public static void regenerateOne(JNode node, Scope parentScope) {
    node.newScope().setParent(parentScope);
    generateOne(node);
  }

  private static void generateOne(JNode node) {
    Scope scope = node.getScope();
    for (JNode child : node.getChildren()) {
      if (child instanceof ScopeItem) {
        scope.add((ScopeItem) child);
      }
      child.getScope().setParent(scope);
    }
  }
}
