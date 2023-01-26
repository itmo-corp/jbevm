package ru.itmo.corp.jbevm.compiler;

import java.util.ArrayList;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.basm.BasmFunction;
import ru.itmo.corp.jbevm.compiler.basm.BasmLine;
import ru.itmo.corp.jbevm.compiler.basm.BasmProgram;
import ru.itmo.corp.jbevm.compiler.basm.OneWordBasmStaticVariable;
import ru.itmo.corp.jbevm.compiler.basm.SimpleBasmLine;
import ru.itmo.corp.jbevm.compiler.basm.SimpleVariableBasmLine;
import ru.itmo.corp.jbevm.compiler.syntax_tree.ClassJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.JNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.LocalVariableJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.MethodJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.RootJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.ScopedCodeJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.AddOperatorExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.AssignExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.IntLiteralExpressionJNode;
import ru.itmo.corp.jbevm.compiler.syntax_tree.expressions.VariableIdentifierExpressionJNode;
import ru.itmo.corp.jbevm.compiler.types.IntJType;

public class BasmProgramBuilder {
  private String entryClassName = "Main";
  private BasmProgram program = new BasmProgram();

  public void setEntryClassName(String entryClassName) {
    this.entryClassName = entryClassName;
  }

  public BasmProgram build(RootJNode root) {
    List<ClassJNode> classes = root.getClasses();
    ClassJNode entryClass = getEntryClass(classes);
    buildEntryClass(entryClass);
    classes.remove(entryClass);

    for (ClassJNode classJNode : root.getClasses()) {
      buildClass(classJNode);
    }

    program.addStaticVariable(new OneWordBasmStaticVariable("_tmp", "?"));
    return program;
  }

  private ClassJNode getEntryClass(List<ClassJNode> classes) {
    for (ClassJNode classJNode : classes) {
      if (classJNode.getName().equals(entryClassName)) {
        return classJNode;
      }
    }
    throw new IllegalArgumentException("Entry class not found: " + entryClassName);
  }

  private void buildEntryClass(ClassJNode classJNode) {
    MethodJNode mainMethod = getMainMethod(classJNode);
    List<MethodJNode> methods = classJNode.getMethods();
    methods.remove(mainMethod);
    buildMethod(mainMethod);
    for (MethodJNode methodJNode : methods) {
      buildMethod(methodJNode);
    }
  }

  private MethodJNode getMainMethod(ClassJNode classJNode) {
    for (MethodJNode methodJNode : classJNode.getMethods()) {
      if (methodJNode.getName().equals("main")) {
        return methodJNode;
      }
    }
    throw new IllegalArgumentException("Main method not found in class: " + classJNode.getName());
  }

  private void buildClass(ClassJNode classJNode) {
    for (MethodJNode methodJNode : classJNode.getMethods()) {
      buildMethod(methodJNode);
    }
  }

  private void buildMethod(MethodJNode methodJNode) {
    BasmFunction function = new BasmFunction(methodJNode.getName());

    function.addLines(buildNode(methodJNode.getBody()));
    function.addLine(new SimpleBasmLine("hlt"));

    program.addFunction(function);
  }

  private List<BasmLine> buildNode(JNode node) {
    if (node instanceof ScopedCodeJNode) {
      return buildNode((ScopedCodeJNode) node);
    } else if (node instanceof LocalVariableJNode) {
      return buildNode((LocalVariableJNode) node);
    } else if (node instanceof AssignExpressionJNode) {
      return buildNode((AssignExpressionJNode) node);
    } else if (node instanceof AddOperatorExpressionJNode) {
      return buildNode((AddOperatorExpressionJNode) node);
    } else if (node instanceof IntLiteralExpressionJNode) {
      return buildNode((IntLiteralExpressionJNode) node);
    } else if (node instanceof VariableIdentifierExpressionJNode) {
      return buildNode((VariableIdentifierExpressionJNode) node);
    } else {
      throw new IllegalArgumentException("Unsupported node type: " + node.getClass().getName());
    }
  }

  private List<BasmLine> buildNode(ScopedCodeJNode node) {
    List<BasmLine> lines = new ArrayList<>();
    for (JNode child : node.getChildren()) {
      lines.addAll(buildNode(child));
    }
    return lines;
  }

  private List<BasmLine> buildNode(LocalVariableJNode node) {
    if (!(node.getVariable().getType() instanceof IntJType)) {
      throw new IllegalArgumentException("Only int variables are supported for now");
    }
    List<BasmLine> lines = new ArrayList<>();
    for (JNode child : node.getChildren()) {
      lines.addAll(buildNode(child));
    }

    lines.add(new SimpleVariableBasmLine("st", node.getVariable()));

    program.addStaticVariable(new OneWordBasmStaticVariable(node.getVariable().getName(), "0"));

    return lines;
  }

  private List<BasmLine> buildNode(AssignExpressionJNode node) {
    List<BasmLine> lines = new ArrayList<>();
    
    lines.addAll(buildNode(node.getRight()));

    lines.add(new SimpleVariableBasmLine("st", node.getLeft().getVariable()));

    return lines;
  }

  private List<BasmLine> buildNode(AddOperatorExpressionJNode node) {
    List<BasmLine> lines = new ArrayList<>();
    
    lines.addAll(buildNode(node.getLeft()));

    lines.add(new SimpleBasmLine("push"));

    lines.addAll(buildNode(node.getRight()));

    lines.add(new SimpleBasmLine("st $_tmp"));
    lines.add(new SimpleBasmLine("pop"));
    lines.add(new SimpleBasmLine("add $_tmp"));

    return lines;
  }

  private List<BasmLine> buildNode(IntLiteralExpressionJNode node) {
    List<BasmLine> lines = new ArrayList<>();
    lines.add(new SimpleBasmLine("ld #" + node.getValue()));
    return lines;
  }

  private List<BasmLine> buildNode(VariableIdentifierExpressionJNode node) {
    List<BasmLine> lines = new ArrayList<>();
    lines.add(new SimpleVariableBasmLine("ld", node.getVariable()));
    return lines;
  }
}
