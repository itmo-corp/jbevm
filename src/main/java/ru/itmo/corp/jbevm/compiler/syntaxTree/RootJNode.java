package ru.itmo.corp.jbevm.compiler.syntaxTree;

import java.util.ArrayList;
import java.util.List;

public class RootJNode extends JNode {
  private final List<ClassJNode> classes = new ArrayList<>();
  
  @Override
  public void addChild(JNode child) {
    if (child instanceof ClassJNode) {
      classes.add((ClassJNode) child);
    } else {
      throw new IllegalArgumentException("Unexpected child type: " + child.getClass());
    }
  }

  @Override
  public List<JNode> getChildren() {
    return new ArrayList<>(classes);
  }

  public List<ClassJNode> getClasses() {
    return classes;
  }
}
