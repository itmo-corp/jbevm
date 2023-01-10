package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

import ru.itmo.corp.jbevm.compiler.syntaxTree.JNode;

public class AddOperatorExpressionJNode extends ExpressionJNode {
    private JNode left;
    private JNode right;

    @Override
    public void addChild(JNode child) {
        if (left == null) {
            left = child;
        } else if (right == null) {
            right = child;
        } else {
            throw new IllegalStateException("AddOperatorExpressionJNode can have only two children");
        }
    }
    
}
