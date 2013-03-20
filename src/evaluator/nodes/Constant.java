package evaluator.nodes;

import evaluator.Node;
import evaluator.Type;

public class Constant extends Node {

    private final Type value;

    public Constant(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public Type evaluate() {
        return value;
    }
}
