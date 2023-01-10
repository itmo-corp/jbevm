package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

public class UnresolvedLiteralExpressionJNode extends ExpressionJNode {
    private String value;

    public UnresolvedLiteralExpressionJNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
