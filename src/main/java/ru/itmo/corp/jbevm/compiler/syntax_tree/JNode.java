package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.Collections;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.scopes.Scope;

public abstract class JNode {
  protected Scope scope;
  protected JNode parent;

  public abstract void accept(JNodeVisitor visitor);

  public final void addChild(JNode child) {
    addChildImpl(child);
    child.setParent(this);
  }
  
  protected void addChildImpl(JNode child) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public List<JNode> getChildren() {
    return Collections.emptyList();
  }

  public final void removeChild(JNode child) {
    if (child.getParent() != this) {
      throw new IllegalArgumentException("Child is not a child of this node");
    }
    removeChildImpl(child);
    child.setParent(null);
  }
  
  protected void removeChildImpl(JNode child) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public final void replaceChild(JNode oldChild, JNode newChild) {
    if (oldChild.getParent() != this) {
      throw new IllegalArgumentException("Child is not a child of this node");
    }
    replaceChildImpl(oldChild, newChild);
    oldChild.setParent(null);
    newChild.setParent(this);
  }
  
  protected void replaceChildImpl(JNode oldChild, JNode newChild) {
    throw new UnsupportedOperationException(getClass().getName() + " can't have children");
  }

  public final Scope getScope() {
    return scope;
  }

  public final Scope newScope() {
    scope = new Scope();
    return scope;
  }

  protected final void setParent(JNode parent) {
    this.parent = parent;
  }

  public final JNode getParent() {
    return parent;
  }
}
