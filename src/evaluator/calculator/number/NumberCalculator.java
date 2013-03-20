package evaluator.calculator.number;

public class NumberCalculator implements OperatorsOfCalculator {

    private final OperatorsOfCalculator calculator;

    public NumberCalculator(OperatorsOfCalculator calculator) {
        this.calculator = calculator;      
    }


    @Override
    public Double add(Double arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Double arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Integer arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Integer add(Integer arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double subtract(Double arg0, Double arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double subtract(Double arg0, Integer arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double subtract(Integer arg0, Double arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Integer subtract(Integer arg0, Integer arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Integer arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Integer mul(Integer arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }
}
