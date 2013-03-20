package evaluator.nodes;

import evaluator.Node;
import evaluator.nodes.binary.BinaryOperation;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorMulTest {
 @Test
    public void testMulDoubleDouble() {
        Node node = new BinaryOperation(Operator.mul, new Constant(new evaluator.types.Double(3.0)), new Constant(new evaluator.types.Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(15.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testMulDoubleInteger() {
        Node node = new BinaryOperation(Operator.mul, new Constant(new evaluator.types.Double(3.0)), new Constant(new evaluator.types.Integer(5)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(15.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testMulIntegerDouble() {
        Node node = new BinaryOperation(Operator.mul, new Constant(new evaluator.types.Integer(0)), new Constant(new evaluator.types.Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testMulIntegerInteger() {
        Node node = new BinaryOperation(Operator.mul, new Constant(new evaluator.types.Integer(3)), new Constant(new evaluator.types.Integer(5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(15, (int) node.evaluate().getValue());
    }
}
