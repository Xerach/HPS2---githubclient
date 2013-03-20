package evaluator.nodes;

import evaluator.types.Double;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConstantTest {

    @Test
    public void testEvaluate() {
        Constant constant = new Constant(new Double(2.0));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(2.0, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        Constant constant = new Constant(new Double(-2.0));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(-2.0, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void testEvaluateZero() {
        Constant constant = new Constant(new Double(0.0));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(0.0, (double) constant.evaluate().getValue(), 0.0);
    }
}
