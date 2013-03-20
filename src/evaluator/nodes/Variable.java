package evaluator.nodes;

import evaluator.Node;
import evaluator.Type;

class Variable extends Node {

    private Type value;

    public Variable(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }
}
