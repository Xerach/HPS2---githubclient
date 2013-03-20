package evaluator.calculator.number;

import evaluator.calculators.Calculator;
import evaluator.calculators.annotations.Operators;

public class OperationsNumberCalculator extends Calculator implements OperatorsOfCalculator {

    @Override
    @Operators("+")
    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("+")
    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("+")
    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("+")
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Double arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Double arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Integer arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Integer subtract(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Double arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Double arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Integer arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }
}
