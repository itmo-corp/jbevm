package ru.itmo.corp.jbevm.compiler.scopes;

public interface ScopeItemsContainer extends ScopeItem {
  public ScopeItem getItemByName(String name);
}
