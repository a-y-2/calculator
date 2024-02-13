import example.example.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, ScientificCalculator.performSquareRoot(4), 0.0001);
        assertEquals(3.0, ScientificCalculator.performSquareRoot(9), 0.0001);
        // Add more test cases as needed
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.performFactorial(5));
        // Add more test cases as needed
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, ScientificCalculator.performNaturalLogarithm(Math.E), 0.0001);
        // Add more test cases as needed
    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.performPowerFunction(2, 3), 0.0001);
        // Add more test cases as needed
    }
}
