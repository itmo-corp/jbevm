package ru.itmo.corp.jbevm.compiler.basm;

import java.util.ArrayList;
import java.util.List;

public class BasmProgram {
  private List<BasmFunction> functions = new ArrayList<>();
  private List<OneWordBasmStaticVariable> staticVariables = new ArrayList<>();

  public void addFunction(BasmFunction function) {
    functions.add(function);
  }

  public void addFunctions(List<BasmFunction> functions) {
    this.functions.addAll(functions);
  }

  public void addStaticVariable(OneWordBasmStaticVariable variable) {
    staticVariables.add(variable);
  }

  public String toBasm() {
    StringBuilder sb = new StringBuilder();
    for (BasmFunction function : functions) {
      sb.append(function.toBasm()).append("\n");
    }
    for (OneWordBasmStaticVariable variable : staticVariables) {
      sb.append(variable.toBasm()).append("\n");
    }
    return sb.toString();
  }
}
