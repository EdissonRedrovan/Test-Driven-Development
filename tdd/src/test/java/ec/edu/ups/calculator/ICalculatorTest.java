package ec.edu.ups.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ICalculatorTest {

    @Test
    public void giveTwoIntegersWhenAdditionOk() {

        ICalculator iCalculator = Mockito.mock(ICalculator.class);
        when(iCalculator.addition(2,3)).thenReturn(5);
        assertEquals(5,iCalculator.addition(2,3));
    }
}