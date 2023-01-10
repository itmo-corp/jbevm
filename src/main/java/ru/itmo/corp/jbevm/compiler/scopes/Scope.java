package ru.itmo.corp.jbevm.compiler.scopes;

import org.jetbrains.annotations.Nullable;

import java.util.Dictionary;
import java.util.Hashtable;

public class Scope {
  private final Dictionary<String, ScopeItem> table = new Hashtable<>();
  private Scope parentScope;

  public void setParentScope(Scope parentScope) {
    this.parentScope = parentScope;
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
}
