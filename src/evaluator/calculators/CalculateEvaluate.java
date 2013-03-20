package evaluator.calculators;
 

import evaluator.Type;
import evaluator.calculator.number.OperationsNumberCalculator;
import evaluator.calculators.annotations.Operators;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

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

    
    static HashMap<String, Method> operatorMap;
    
    static {
        operatorMap = new HashMap<>();
     Reflections ref = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
     addMethods(ref.getSubTypesOf(Calculator.class));
    
    }
    
    private static void addMethods(Set<Class<? extends Calculator>> classes) {
        for (Class<?> theClass : classes) {
            addMethods(theClass);
        }
    }
    
    private static void addMethods(Class<?> theClass) {
        for (Method method : theClass.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Operators.class)) continue;
            operatorMap.put(getSignature(method), method);
        }
    }

    private static String getSignature(Method method) {
        String signature = method.getName();
        Class<?>[] object;
        object = method.getParameterTypes();
        for(int i=0;i<object.length;i++){
            signature += object[i].getSimpleName();
        }
        return signature;
    }
    
    
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
