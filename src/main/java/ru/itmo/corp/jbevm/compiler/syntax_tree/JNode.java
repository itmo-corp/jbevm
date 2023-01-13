package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.Collections;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.scopes.Scope;

public abstract class JNode {
  protected Scope scope;

  public abstract void accept(JNodeVisitor visitor);

  public void addChild(JNode child) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public List<JNode> getChildren() {
    return Collections.emptyList();
  }

  public void removeChild(JNode child) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public void replaceChild(JNode oldChild, JNode newChild) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public Scope getScope() {
    return scope;
  }

  public Scope newScope() {
    scope = new Scope();
    return scope;
  }
}
