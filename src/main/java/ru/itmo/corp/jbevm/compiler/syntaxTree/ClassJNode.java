package ru.itmo.corp.jbevm.compiler.syntaxTree;

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
  public void addChild(JNode child) {
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
}
