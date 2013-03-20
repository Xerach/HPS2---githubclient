package evaluator.nodes;

import evaluator.Node;
import evaluator.nodes.binary.BinaryOperation;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorSubtractTest {
    
    @Test
    public void testSubtractDoubleDouble() {
        Node node = new BinaryOperation(Operator.subtract, new Constant(new evaluator.types.Double(3.0)), new Constant(new evaluator.types.Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-2.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testSubtractDoubleInteger() {
        Node node = new BinaryOperation(Operator.subtract, new Constant(new evaluator.types.Double(3.0)), new Constant(new evaluator.types.Integer(3)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testSubtractIntegerDouble() {
        Node node = new BinaryOperation(Operator.subtract, new Constant(new evaluator.types.Integer(3)), new Constant(new evaluator.types.Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-2.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testSubtractIntegerInteger() {
        Node node = new BinaryOperation(Operator.subtract, new Constant(new evaluator.types.Integer(3)), new Constant(new evaluator.types.Integer(5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(-2, (int) node.evaluate().getValue());
    }

}
