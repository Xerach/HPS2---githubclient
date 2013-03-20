package evaluator.nodes;

import evaluator.types.Double;
import static org.junit.Assert.*;
import org.junit.Test;

public class VariableTest {

    @Test
    public void testEvaluate() {
        Variable variable = new Variable(new Double(2.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(2.0, (double) variable.evaluate().getValue(), 0.0);
    }

    @Test
    public void testSetVariable() {
        Variable variable = new Variable(new Double(2.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(2.0, (double) variable.evaluate().getValue(), 0.0);
        variable.setValue(new Double(3.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(3.0, (double) variable.evaluate().getValue(), 0.0);

    }
}
