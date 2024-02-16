import example.example.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, ScientificCalculator.performSquareRoot(4), 0.0001);
        assertEquals(18.8679622641, ScientificCalculator.performSquareRoot(356), 0.0001);
        assertEquals(Double.NaN, ScientificCalculator.performSquareRoot(-1.0), 0.0001);
        //This statement compares expected and actual results, ensuring they match within a specified tolerance (delta)
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.performFactorial(5));
        assertEquals(Double.NaN, ScientificCalculator.performFactorial(-1.0));
        assertEquals(1, ScientificCalculator.performFactorial(0.0));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, ScientificCalculator.performNaturalLogarithm(Math.E), 0.0001);
        assertEquals(Double.NaN, ScientificCalculator.performNaturalLogarithm(-Math.E), 0.0001);
        assertEquals(0.0, ScientificCalculator.performNaturalLogarithm(1), 0.0001);

    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.performPowerFunction(2, 3), 0.0001);
        assertEquals(0.5, ScientificCalculator.performPowerFunction(2.0, -1), 0.0001);
        assertEquals(Double.NaN, ScientificCalculator.performPowerFunction(Double.NaN, 100), 0.0001);
        
    }
}
