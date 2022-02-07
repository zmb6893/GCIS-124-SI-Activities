
package solutions.Review01.Solutions.UnitTestPractice;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class TestOperation {
    @Test
    public void testPlus(){
        // Setup
        int n1 = 1; int n2 = 3; char sign = '+';
        double expected = 4;

        // Invocation
        double actual = Operation.performOperation(sign, n1, n2);

        // Analyzation
        assert actual == expected;
    }

    @Test
    public void testDivide(){
        // Setup
        int n1 = 15; int n2 = 3; char sign = '/';
        double expected = 5;

        // Invocation
        double actual = Operation.performOperation(sign, n1, n2);

        // Analyzation
        assert actual == expected;
    }
}
