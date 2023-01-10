package ru.itmo.corp.jbevm.compiler.scopes;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public final class ScopeReference implements Iterable<String> {
  private final List<String> target;

  private static final ScopeReference empty = new ScopeReference(new ArrayList<>());

  public ScopeReference(@NotNull List<String> target) {
    this.target = Collections.unmodifiableList(target);
  }

  public String first() {
    return target.get(0);
  }

  public @NotNull ListIterator<String> iterator() {
    return target.listIterator();
  }

  public @NotNull ScopeReference add(String name) {
    List<String> newTarget = new ArrayList<>(target);
    newTarget.add(name);
    return new ScopeReference(newTarget);
  }

  public static ScopeReference getEmpty() {
    return empty;
  }

  public boolean isEmpty() {
    return target.isEmpty();
  }
}
