package calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
//    @Test
//    @DisplayName("Separating expressions into operands and operators.")
//    void separateExpressionTest(String expression) {
//        String[] values = expression.split(" ");
//        Spliter spliter = new Spliter();
//        spliter.separateExpression();
//    }


//    @ParameterizedTest(name = "throw exception if an expression is not separated by a space")
//    @CsvSource({"1 + 2, 3", "1 + 2 / 3, 5"})
//    void expressionSplitExceptionTest(String expression, int expected) {
//        String[] values = expression.split(" ");
//        assertThat(values.length).isEqualTo(expected);
//    }

    @ParameterizedTest
    @CsvSource({"1 + 2, 3", "1 - 2, -1", "1 + 1 + 1, 3", "3 * 2, 6", "4 / 2, 2"})
    void calculatorTest(String expression, int expected) {
        int result = new Calculator().calculate(expression);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"1 + 2 - 1, 2", "1 - 2 * 2, -2", "2 + 4 / 2, 3"})
    void calculatorTest2(String expression, int expected) {
        int result = new Calculator().calculate(expression);
        assertThat(result).isEqualTo(expected);
    }

}
