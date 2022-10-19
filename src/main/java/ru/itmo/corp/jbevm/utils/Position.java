package ru.itmo.corp.jbevm.utils;

public class Position implements Comparable<Position> {
  public final int line;
  public final int column;

  public Position(int line, int column) {
    if (line < 0 || column < 0) {
      throw new IllegalArgumentException("Invalid line or column arg");
    }
    this.line = line;
    this.column = column;
  }

  public Position withColumn(int column) {
    return new Position(this.line, column);
  }

  public Position withLine(int line) {
    return new Position(line, this.column);
  }

  public boolean isValid() {
    return column > 0 && line > 0;
  }

  @Override
  public int hashCode() {
    return 31 * line + column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Position other = (Position) o;
    return other.line == line && other.column == column;
  }

  @Override
  public String toString() {
    return "[" + line + ":" + column + "]";
  }

  @Override
  public int compareTo(Position o) {
    int res = Integer.compare(o.line, line);
    if (res == 0) {
      res = Integer.compare(o.column, column);
    }

    return res;
  }
}
