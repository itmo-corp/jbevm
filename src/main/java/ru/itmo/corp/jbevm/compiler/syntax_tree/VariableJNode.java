package ru.itmo.corp.jbevm.compiler.syntax_tree;

import ru.itmo.corp.jbevm.compiler.data_containers.Variable;
import ru.itmo.corp.jbevm.compiler.types.JType;

public abstract class VariableJNode extends NamedJNode {
  private Variable variable = new Variable();

  public void setType(JType type) {
    variable.setType(type);
  }

  public Variable getVariable() {
    return variable;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
    variable.setName(name);
  }
}
