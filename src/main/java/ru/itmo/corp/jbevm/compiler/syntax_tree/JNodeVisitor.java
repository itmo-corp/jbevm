package ru.itmo.corp.jbevm.compiler.syntax_tree;

import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.VariableExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.VariableIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.AddOperatorExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.AssignExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.ExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.IntLiteralExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.UnresolvedIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.UnresolvedLiteralExpressionJNode;

public abstract class JNodeVisitor {
  public void visit(JNode node) {
    unregistredNode(node);
    unknownNode(node);
  }

  protected void unknownNode(JNode node) {
  }

  protected void unregistredNode(JNode node) {
    throw new UnsupportedOperationException("Unregistred node: " + node.getClass().getName());
  }

  public void visit(RootJNode node) {
    unknownNode(node);
  }

  public void visit(ClassJNode node) {
    unknownNode(node);
  }

  public void visit(MethodJNode node) {
    unknownNode(node);
  }

  public void visit(MethodArgumentJNode node) {
    unknownNode(node);
  }

  public void visit(ScopedCodeJNode node) {
    unknownNode(node);
  }

  public void visit(NewVariableScopeJNode node) {
    unknownNode(node);
  }

  public void visit(LocalVariableJNode node) {
    unknownNode(node);
  }

  public void visit(VariableJNode node) {
    unknownNode(node);
  }

  public void visit(StatementJNode node) {
    unknownNode(node);
  }

  public void visit(ExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(AddOperatorExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(AssignExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(IntLiteralExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(UnresolvedIdentifierExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(UnresolvedLiteralExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(VariableExpressionJNode node) {
    unknownNode(node);
  }

  public void visit(VariableIdentifierExpressionJNode node) {
    unknownNode(node);
  }
}
