package evaluator.calculators;

import evaluator.Type;
import evaluator.nodes.Operator;

public interface Evaluate {
    public Type calculate(Operator operator, Type arg0, Type arg1);
}
