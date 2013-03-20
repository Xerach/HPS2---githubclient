package evaluator.nodes.unary;

import evaluator.Node;
import evaluator.Type;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;

public class UnaryOperation extends Operation {

    private final Operator unaryOperation;
    private final Node child;

    public UnaryOperation(Operator unaryOperation, Node child) {
        this.unaryOperation = unaryOperation;
        this.child = child;
    }

    public Node getChild() {
        return child;
    }

    @Override
    public Type evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
