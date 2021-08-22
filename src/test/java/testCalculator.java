import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCalculator {
    @Test
    void toTestSumOfTwoDoubleInputs(){
        Calculator calc = new Calculator();
        double expectedSum = 8.0;
        double actualSum = calc.sum(4.0, 4.0);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void toTestDifferenceOfTwoDoubleInputs(){
        Calculator calc = new Calculator();
        double expectedDiff = 2.0;
        double actualDiff = calc.diff(6.0, 4.0);
        assertEquals(expectedDiff, actualDiff);
    }

    @Test
    void toTestProductOfTwoDoubleInputs(){
        Calculator calc = new Calculator();
        double expectedProduct = 24.0;
        double actualProduct = calc.product(6.0, 4.0);
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void toTestQuotientOfTwoDoubleInputs(){
        Calculator calc = new Calculator();
        double expectedQuot = 6.0;
        double actualQuot= calc.division(24.0, 4.0);
        assertEquals(expectedQuot, actualQuot);
    }
}
