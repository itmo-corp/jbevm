package ru.itmo.corp.jbevm.compiler.generators;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.UnresolvedIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.VariableIdentifierExpressionJNode;

public class VariableExpressionGenerator {
  public static void generate(JNode node) {
    for (JNode child : node.getChildren()) {
      if (child instanceof UnresolvedIdentifierExpressionJNode) {
        generateVariableExpressions((UnresolvedIdentifierExpressionJNode) child, node);
      }
      generate(child);
    }
  }

  private static void generateVariableExpressions(UnresolvedIdentifierExpressionJNode node, JNode parent) {
    String name = node.getName();
    Variable variable = parent.getScope().getVariableByName(name);
    if (variable == null) {
      throw new RuntimeException("Variable " + name + " is not defined");
    }
    VariableIdentifierExpressionJNode newNode = new VariableIdentifierExpressionJNode(variable);
    parent.replaceChild(node, newNode);
    ScopesGenerator.regenerateOne(newNode);
    ScopesGenerator.regenerateOne(parent);
  }
}
