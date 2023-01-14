package ru.itmo.corp.jbevm.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ru.itmo.corp.jbevm.antlr.JbevmParserBaseListener;
import ru.itmo.corp.jbevm.compiler.syntax_tree.ClassJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNodeVisitor;
import ru.itmo.corp.jbevm.compiler.syntax_tree.LocalVariableJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.MethodArgumentJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.MethodJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.NewVariableScopeJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RootJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.ScopedCodeJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree_factories.ExpressionFacroty;
import ru.itmo.corp.jbevm.compiler.syntax_tree_factories.TypeFactory;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class SyntaxTreeListener extends JbevmParserBaseListener {
  private final RootJNode root = new RootJNode();
  private Stack<JNode> stack = new Stack<>();

  private JNode current() {
    return stack.peek();
  }

  public RootJNode getRoot() {
    return root;
  }

  @Override
  public void enterProgram(ru.itmo.corp.jbevm.antlr.JbevmParser.ProgramContext ctx) {
    stack.push(root);
  }

  @Override
  public void exitProgram(ru.itmo.corp.jbevm.antlr.JbevmParser.ProgramContext ctx) {
    stack.pop();
  }

  @Override
  public void enterClassDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.ClassDeclarationContext ctx) {
    ClassJNode classJNode = new ClassJNode();
    current().addChild(classJNode);
    stack.push(classJNode);
  }
  
  @Override
  public void exitClassDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.ClassDeclarationContext ctx) {
    String name = ctx.identifier().getText();
    ClassJNode classJNode = (ClassJNode) current();
    classJNode.setName(name);
    stack.pop();
  }

  @Override
  public void enterMethodDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.MethodDeclarationContext ctx) {
    MethodJNode methodJNode = new MethodJNode();
    current().addChild(methodJNode);
    stack.push(methodJNode);
  }
  
  @Override
  public void exitMethodDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.MethodDeclarationContext ctx) {
    String name = ctx.identifier().getText();
    JType returnType = TypeFactory.createTypeOrVoid(ctx.typeTypeOrVoid());
    MethodJNode methodJNode = (MethodJNode) current();
    methodJNode.setName(name);
    methodJNode.setReturnType(returnType);
    stack.pop();
  }

  @Override
  public void enterBlock(ru.itmo.corp.jbevm.antlr.JbevmParser.BlockContext ctx) {
    ScopedCodeJNode scopedCodeJNode = new ScopedCodeJNode();
    current().addChild(scopedCodeJNode);
    stack.push(scopedCodeJNode);
  }

  @Override
  public void exitBlock(ru.itmo.corp.jbevm.antlr.JbevmParser.BlockContext ctx) {
    while (current() instanceof NewVariableScopeJNode)
      stack.pop();
    stack.pop();
  }

  @Override
  public void exitFormalParameter(ru.itmo.corp.jbevm.antlr.JbevmParser.FormalParameterContext ctx) {
    String name = ctx.variableDeclaratorId().getText();
    JType type = TypeFactory.createType(ctx.typeType());
    MethodArgumentJNode methodArgumentJNode = new MethodArgumentJNode();
    methodArgumentJNode.setName(name);
    methodArgumentJNode.setType(type);
    current().addChild(methodArgumentJNode);
  }

  private class LocalVariablesInremideate extends JNode {
    private JType type;
    private List<LocalVariableJNode> localVariables = new ArrayList<>();

    public void setType(JType type) {
      this.type = type;
    }

    @Override
    protected void addChildImpl(JNode child) {
      if (child instanceof LocalVariableJNode)
        localVariables.add((LocalVariableJNode) child);
      else
        throw new IllegalArgumentException("LocalVariablesInremideate can only contain LocalVariableJNode, but got " + child.getClass().getName());
    }

    public List<LocalVariableJNode> getLocalVariables() {
      return localVariables;
    }

    @Override
    public void accept(JNodeVisitor visitor) {
      throw new UnsupportedOperationException("LocalVariablesInremideate is not a real node");
    }
  }

  @Override
  public void enterLocalVariableDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.LocalVariableDeclarationContext ctx) {
    LocalVariablesInremideate localVariablesInremideate = new LocalVariablesInremideate();
    stack.push(localVariablesInremideate);
  }
  
  @Override
  public void exitLocalVariableDeclaration(ru.itmo.corp.jbevm.antlr.JbevmParser.LocalVariableDeclarationContext ctx) {
    JType type = TypeFactory.createType(ctx.typeType());
    LocalVariablesInremideate localVariablesInremideate = (LocalVariablesInremideate) stack.pop();
    localVariablesInremideate.setType(type);
    for (LocalVariableJNode localVariable : localVariablesInremideate.getLocalVariables()) {
      localVariable.setType(localVariablesInremideate.type);
      NewVariableScopeJNode newVariableScopeJNode = new NewVariableScopeJNode();
      current().addChild(newVariableScopeJNode);
      stack.push(newVariableScopeJNode);
      current().addChild(localVariable);
    }
  }

  @Override
  public void enterVariableDeclarator(ru.itmo.corp.jbevm.antlr.JbevmParser.VariableDeclaratorContext ctx) {
    LocalVariableJNode localVariableJNode = new LocalVariableJNode();
    current().addChild(localVariableJNode);
    stack.push(localVariableJNode);
  }
  
  @Override
  public void exitVariableDeclarator(ru.itmo.corp.jbevm.antlr.JbevmParser.VariableDeclaratorContext ctx) {
    String name = ctx.variableDeclaratorId().getText();
    LocalVariableJNode localVariableJNode = (LocalVariableJNode) current();
    localVariableJNode.setName(name);
    stack.pop();
  }

  public class ExpressionIntermidiate extends JNode {
    private List<JNode> children = new ArrayList<>();

    @Override
    protected void addChildImpl(JNode child) {
        children.add(child);
    }

    @Override
    public List<JNode> getChildren() {
      return children;
    }

    @Override
    public void accept(JNodeVisitor visitor) {
      throw new UnsupportedOperationException("ExpressionIntermidiate is not a real node");
    }
  }

  @Override
  public void enterExpression(ru.itmo.corp.jbevm.antlr.JbevmParser.ExpressionContext ctx) {
    ExpressionIntermidiate expression = new ExpressionIntermidiate();
    stack.push(expression);
  }
  
  @Override
  public void exitExpression(ru.itmo.corp.jbevm.antlr.JbevmParser.ExpressionContext ctx) {
    JNode expression = ExpressionFacroty.createExpression(ctx);
    ExpressionIntermidiate expressionIntermidiate = (ExpressionIntermidiate) stack.pop();
    for (JNode child : expressionIntermidiate.getChildren())
      expression.addChild(child);
    current().addChild(expression);
  }
}
