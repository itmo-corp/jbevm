package ru.itmo.corp.jbevm.compiler.basm;

import ru.itmo.corp.jbevm.compiler.dataContainers.Variable;

public class SimpleVariableBasmLine extends BasmLine {
  private String basm;
  private Variable variable;

  public SimpleVariableBasmLine(String basm, Variable variable) {
    this.basm = basm;
    this.variable = variable;
  }

  @Override
  public String toBasm() {
    return basm + " $" + variable.getName(); // TODO implement not only static variables
  }

  public Variable getVariable() {
    return variable;
  }
}
