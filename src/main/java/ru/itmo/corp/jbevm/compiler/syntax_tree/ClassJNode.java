package ru.itmo.corp.jbevm.compiler.syntax_tree;

import java.util.ArrayList;
import java.util.List;

import ru.itmo.corp.jbevm.compiler.scopes.ScopeItem;
import ru.itmo.corp.jbevm.compiler.scopes.ScopeItemsContainer;

public class ClassJNode extends NamedJNode implements ScopeItemsContainer {
  private List<MethodJNode> methods = new ArrayList<>();

  public ScopeItem getItemByName(String name) {
    return null;
  }

  @Override
  protected void addChildImpl(JNode child) {
    if (child instanceof MethodJNode) {
      methods.add((MethodJNode) child);
    } else {
      throw new IllegalArgumentException("Unexpected child type: " + child.getClass());
    }
  }

  @Override
  public List<JNode> getChildren() {
    return new ArrayList<>(methods);
  }

  public List<MethodJNode> getMethods() {
    return methods;
  }

  @Override
  public void accept(JNodeVisitor visitor) {
    visitor.visit(this);
  }
}
