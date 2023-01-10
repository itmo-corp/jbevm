package ru.itmo.corp.jbevm.compiler.dataContainers;

import ru.itmo.corp.jbevm.compiler.types.JType;

public class Variable {
  private JType type;
  private String name;

  public JType getType() {
    return type;
  }

  public void setType(JType type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
