package ru.itmo.corp.jbevm.compiler.generators;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RecursiveJNodeVisitor;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.UnresolvedIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.VariableIdentifierExpressionJNode;

public class VariableExpressionGenerator extends RecursiveJNodeVisitor {
  public static void generate(JNode node) {
    node.accept(new VariableExpressionGenerator());
  }
  
  @Override
  public void visit(UnresolvedIdentifierExpressionJNode node) {
    String name = node.getName();
    JNode parent = node.getParent();
    Variable variable = node.getScope().getVariableByName(name);
    if (variable == null) {
      throw new RuntimeException("Variable " + name + " is not defined");
    }
    VariableIdentifierExpressionJNode newNode = new VariableIdentifierExpressionJNode(variable);
    parent.replaceChild(node, newNode);
    ScopesGenerator.regenerateOne(newNode);
    ScopesGenerator.regenerateOne(parent);
  }
}
