package ru.itmo.corp.jbevm.compiler.syntaxTree.expressions;

import java.util.List;

import ru.itmo.corp.jbevm.compiler.syntaxTree.JNode;

public class AssignExpressionJNode extends ExpressionJNode {
    private ExpressionJNode left;
    private ExpressionJNode right;

    @Override
    public void addChild(JNode child) {
        if (!(child instanceof ExpressionJNode)) {
            throw new IllegalArgumentException("AssignExpressionJNode can have only ExpressionJNode children");
        }
        if (left == null) {
            left = (ExpressionJNode) child;
        } else if (right == null) {
            right = (ExpressionJNode) child;
        } else {
            throw new IllegalStateException("AssignExpressionJNode can have only two children");
        }
    }

    @Override
    public List<JNode> getChildren() {
        return List.of(left, right);
    }
}
