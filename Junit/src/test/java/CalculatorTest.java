import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_validArgument_success() {
        // given:
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        // when:
        int result = calculator.add(a, b);

        // then:
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtract_validArgument_success() {
        // given:
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 4;

        // when:
        int result = calculator.subtract(a, b);

        // then:
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMultiply_validArgument_success() {
        // given:
        Calculator calculator = new Calculator();
        int a = 7;
        int b = 2;

        // when:
        int result = calculator.multiply(a, b);

        // then:
        Assertions.assertEquals(14, result);
    }

    @Test
    public void testDivide_validArgument_success() {
        // given:
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // when:
        double result = calculator.divide(a, b);

        // then:
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testDivide_byZero_throwsException() {
        // given:
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // when:
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });

        // then:
        Assertions.assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}