package ru.itmo.corp.jbevm.compiler.scopes;

import org.jetbrains.annotations.Nullable;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
import ru.itmo.corp.jbevm.compiler.syntax_tree.VariableJNode;

import java.util.Dictionary;
import java.util.Hashtable;

public class Scope {
  private final Dictionary<String, ScopeItem> table = new Hashtable<>();
  private Scope parentScope;

  public void setParent(Scope parentScope) {
    this.parentScope = parentScope;
  }

  public Scope getParent() {
    return parentScope;
  }

  public void add(ScopeItem item) {
    table.put(item.getName(), item);
  }

  public void remove(String name) {
    table.remove(name);
  }

  public @Nullable ScopeItem getByName(String name) {
    ScopeItem item = table.get(name);
    if (item != null)
      return item;
    if (parentScope == null)
      return null;
    return parentScope.getByName(name);
  }

  public @Nullable Variable getVariableByName(String name) {
    ScopeItem item = getByName(name);
    if (item instanceof VariableJNode)
      return ((VariableJNode) item).getVariable();
    return null;
  }
}
