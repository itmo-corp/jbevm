package ru.itmo.corp.jbevm.compiler.types;

public class UnresolvedJType extends JType {
    private final String name;

    public UnresolvedJType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
