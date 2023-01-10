package ru.itmo.corp.jbevm.compiler.generators;

import ru.itmo.corp.jbevm.compiler.dataContainers.Variable;
import ru.itmo.corp.jbevm.compiler.syntaxTree.JNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.UnresolvedIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.VariableIdentifierExpressionJNode;

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
    ScopesGenerator.regenerateOne(newNode, parent.getScope());
    ScopesGenerator.regenerateOne(parent, parent.getScope().getParent());
  }
}