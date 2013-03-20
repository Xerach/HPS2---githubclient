package syntaxtree;

import evaluator.Node;
import evaluator.nodes.Constant;
import evaluator.nodes.Operator;
import evaluator.nodes.binary.BinaryOperation;
import evaluator.types.Double;
import static java.lang.System.out;
import org.junit.Test;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");

        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node multi = new BinaryOperation(Operator.mul, dos, tres);
        Node sum = new BinaryOperation(Operator.add, uno, multi);
        
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node resta = new BinaryOperation(Operator.subtract, dos, tres);
        Node sum = new BinaryOperation(Operator.add, uno, resta);
        
    }
}
