package ru.itmo.corp.jbevm.compiler.basm;

import java.util.ArrayList;
import java.util.List;

public class BasmFunction {
  private String name;
  private List<BasmLine> body = new ArrayList<>();

  public BasmFunction(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addLine(BasmLine line) {
    body.add(line);
  }

  public void addLines(List<BasmLine> lines) {
    body.addAll(lines);
  }

  public String toBasm() {
    StringBuilder sb = new StringBuilder();
    sb.append(name).append(":\n");
    for (BasmLine line : body) {
      sb.append(line.toBasm()).append("\n");
    }
    return sb.toString();
  }
}
