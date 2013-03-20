package evaluator.calculators;
 

import evaluator.Type;
import evaluator.calculator.number.OperationsNumberCalculator;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculateEvaluate implements Evaluate {
    
     
//    private static HashMap<String, Operator> operatorMap;
//
//    static {
//        operatorMap = new HashMap<>();
//        operatorMap.put("+", Operator.add);
//        operatorMap.put("-", Operator.subtract);
//        operatorMap.put("*", Operator.mul);
//    }

//    public static Operator getOperator(String value) {
//        return operatorMap.get(value);
//    }

    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        Calculator calculator = findCalculator(arg0, arg1);
        
        if (operator == null || calculator == null) {
            return null;
        }
        try {
            //getsignature en lugar de getmethod
            Method method = calculator.getClass().getMethod(operator.getName(), arg0.getValue().getClass(), arg1.getValue().getClass());
            return findType(method.invoke(calculator, arg0.getValue(), arg1.getValue()));
            //main_tree.hashmap_operator("+");
        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }

    private Type findType(Object object) {
        if (object instanceof Integer) {
            return new evaluator.types.Integer((Integer) object);
        }
        if (object instanceof Double) {
            return new evaluator.types.Double((Double) object);
        }
        return null;
    }

    private Calculator findCalculator(Type arg0, Type arg1) {
        if (arg0 == null || arg1 == null) {
            return null;
        }
   
        if ((arg0.getValue() instanceof Double) && (arg1.getValue() instanceof Double)) {
            return new OperationsNumberCalculator();
        }
        if ((arg0.getValue() instanceof Integer) && (arg1.getValue() instanceof Double)) {
            return new OperationsNumberCalculator();
        }
        if ((arg0.getValue() instanceof Double) && (arg1.getValue() instanceof Integer)) {
            return new OperationsNumberCalculator();
        }
        if ((arg0.getValue() instanceof Integer) && (arg1.getValue() instanceof Integer)) {
            return new OperationsNumberCalculator();
        }
        return null;
       
    }
}
