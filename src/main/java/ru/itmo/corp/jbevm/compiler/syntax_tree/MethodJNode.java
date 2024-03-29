package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.ArrayList;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.types.JType;

public class MethodJNode extends NamedJNode implements ScopeItem {
  private JType returnType;
  private ScopedCodeJNode body;
  private List<MethodArgumentJNode> arguments = new ArrayList<>();

  public JType getReturnType() {
    return returnType;
  }

  public JType setReturnType(JType returnType) {
    return this.returnType = returnType;
  }

  @Override
  protected void addChildImpl(JNode child) {
    if (child instanceof ScopedCodeJNode) {
      body = (ScopedCodeJNode) child;
    } else if (child instanceof MethodArgumentJNode) {
      arguments.add((MethodArgumentJNode) child);
    } else {
      throw new IllegalArgumentException(
          "MethodJNode can have only ScopedCodeJNode and MethodArgumentJNode as child, but got " + child.getClass().getName());
    }
  }

  @Override
  public List<JNode> getChildren() {
    List<JNode> children = new ArrayList<>(arguments);
    children.add(body);
    return children;
  }

  public List<MethodArgumentJNode> getArguments() {
    return arguments;
  }

  public ScopedCodeJNode getBody() {
    return body;
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
