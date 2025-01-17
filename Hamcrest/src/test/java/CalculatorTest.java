import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Calculator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


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
        assertThat(result, equalTo(8));
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
        assertThat(result, is(6));
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
        assertThat(result, is(14));
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
        assertThat(result, closeTo(5.0, 0.0001));
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
        assertThat(exception.getMessage(), equalTo("Divisor cannot be zero"));
    }

    @Test
    public void testAdd_resultGreaterThan() {
        // given:
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        // when:
        int result = calculator.add(a, b);

        // then:
        assertThat(result, greaterThan(7));
    }

    @Test
    public void testDivide_resultInRange() {
        // given:
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 3;

        // when:
        double result = calculator.divide(a, b);

        // then:
        assertThat(result, allOf(
                greaterThan(3.0),
                lessThan(4.0)
        ));
    }
}