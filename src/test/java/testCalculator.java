import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class testCalculator {
    Calculator calculations = null;
    CalculatorOperations calculatorOperations = mock(CalculatorOperations.class);
    @BeforeEach
    void assigningObject(){
        calculations = new Calculator(calculatorOperations);
    }

    @Test
    void toTestSumOfTwoDoubleInputs(){
        when(calculatorOperations.sum(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,calculations.sum(4.0,4.0));
        verify(calculatorOperations).sum(4.0,4.0);
    }

    @Test
    void toTestDifferenceOfTwoDoubleInputs(){
        when(calculatorOperations.difference(6.0,4.0)).thenReturn(2.0);
        assertEquals(2.0,calculations.difference(6.0,4.0));
        verify(calculatorOperations).difference(6.0,4.0);
    }

    @Test
    void toTestProductOfTwoDoubleInputs(){
        when(calculatorOperations.product(6.0,4.0)).thenReturn(24.0);
        assertEquals(24.0,calculations.product(6.0,4.0));
        verify(calculatorOperations).product(6.0,4.0);
    }

    @Test
    void toTestQuotientOfTwoDoubleInputs(){
        when(calculatorOperations.division(24.0,4.0)).thenReturn(6.0);
        assertEquals(6.0,calculations.division(24.0,4.0));
        verify(calculatorOperations).division(24.0,4.0);
    }
}
