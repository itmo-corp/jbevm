package ru.itmo.corp.jbevm.compiler.syntaxTree;

import java.util.Collections;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.scopes.Scope;

public abstract class JNode {
  protected Scope scope;

  public void addChild(JNode child) {
    throw new UnsupportedOperationException();
  }

  public List<JNode> getChildren() {
    return Collections.emptyList();
  }

  public void removeChild(JNode child) {
    throw new UnsupportedOperationException();
  }

  public void replaceChild(JNode oldChild, JNode newChild) {
    throw new UnsupportedOperationException();
  }

  public Scope getScope() {
    return scope;
  }

  public Scope newScope() {
    scope = new Scope();
    return scope;
  }
}
