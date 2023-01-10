package ru.itmo.corp.jbevm.compiler.syntaxTreeFactories;

import ru.itmo.corp.jbevm.compiler.syntaxTree.JNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.AddOperatorExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.AssignExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.IntLiteralExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.UnresolvedIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntaxTree.expressions.UnresolvedLiteralExpressionJNode;

public class ExpressionFacroty {
  public static JNode createExpression(ru.itmo.corp.jbevm.antlr.JbevmParser.ExpressionContext ctx) {
    if (ctx.ASSIGN() != null) {
      return new AssignExpressionJNode();
    } else if (ctx.ADD() != null) {
      return new AddOperatorExpressionJNode();
    } else if (ctx.primary() != null) {
      return createPrimaryExpression(ctx.primary());
    } else {
      throw new IllegalStateException("Unknown expression type");
    }
  }

  private static JNode createPrimaryExpression(ru.itmo.corp.jbevm.antlr.JbevmParser.PrimaryContext ctx) {
    if (ctx.literal() != null) {
      return createLiteralExpression(ctx.literal());
    } else if (ctx.identifier() != null) {
      return new UnresolvedIdentifierExpressionJNode(ctx.identifier().getText());
    } else {
      throw new IllegalStateException("Unknown primary expression type");
    }
  }

  private static JNode createLiteralExpression(ru.itmo.corp.jbevm.antlr.JbevmParser.LiteralContext ctx) {
    if (ctx.integerLiteral() != null) {
      return new IntLiteralExpressionJNode(ctx.integerLiteral().getText());
    } else {
      return new UnresolvedLiteralExpressionJNode(ctx.getText());
    }
  }

}
