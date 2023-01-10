package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

public class UnresolvedIdentifierExpressionJNode extends ExpressionJNode {
    private String name;

    public UnresolvedIdentifierExpressionJNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
