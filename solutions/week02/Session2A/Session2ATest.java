package solutions.week02.Session2A;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

/**
 * Testing example. Go to Reference Libraries and reference your JUnit library. Add a breakpoint and run the program through the debugger.
 * @author Zoe Bingham
 */
@Testable
public class Session2ATest {
    @Test
    public void testReadFile(){
        // Setup
        String[] expected = new String[]{"What is your name?", "Nice to meet you %s! What is your major?","%s is a cool major. Where are you from?","When is your birthday?","Great friends share their social security number with each other! What's yours?","Thanks %s, I feel that this is beginning of a wonderful friendship!"};
        String filename = "full file path";

        // Invoke
        String[] actual = Session2A.readFile(filename); // This is where you call your function to be tested

        // Analyze
        assertArrayEquals(expected, actual);
    }
}
