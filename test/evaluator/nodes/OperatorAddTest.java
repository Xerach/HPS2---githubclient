package evaluator.nodes;

import evaluator.Node;
import evaluator.nodes.binary.BinaryOperation;
import evaluator.types.Double;
import evaluator.types.Integer;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorAddTest {
    
    @Test
    public void testAddDoubleDouble() {
        Node node = new BinaryOperation(Operator.add, new Constant(new Double(3.0)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(8.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddDoubleInteger() {
        Node node = new BinaryOperation(Operator.add, new Constant(new Double(3.0)), new Constant(new Integer(5)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(8.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddIntegerDouble() {
        Node node = new BinaryOperation(Operator.add, new Constant(new Integer(3)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(8.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddIntegerInteger() {
        Node node = new BinaryOperation(Operator.add, new Constant(new Integer(3)), new Constant(new Integer(5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(8, (int) node.evaluate().getValue());
    }
   
}
