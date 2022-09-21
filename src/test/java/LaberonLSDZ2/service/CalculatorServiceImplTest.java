package LaberonLSDZ2.service;

import LaberonLSDZ2.exception.ExceptionByZero;
import org.junit.jupiter.api.Test;

import static LaberonLSDZ2.service.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void returnTwoWhenSumOneAndOne() {
        int result = calculatorService.calcPlus(NUM1, NUM1);
        assertEquals(NUM1+NUM1,result);
    }
    @Test
    public void returnThreeWhenSumTwoAndOne() {
        int result = calculatorService.calcPlus(NUM2, NUM1);
        assertEquals(NUM2+NUM1,result);
    }
    @Test
    public void returnOneWhenMinusTwoAndOne() {
        int result = calculatorService.calcMinus(NUM2, NUM1);
        assertEquals(NUM2-NUM1,result);
    }
    @Test
    public void returnZeroWhenMinusOneAndOne() {
        int result = calculatorService.calcMinus(NUM1, NUM1);
        assertEquals(NUM1-NUM1,result);
    }
    @Test
    public void returnTwoWhenMultipleOneAndTwo() {
        int result = calculatorService.calcMultiply(NUM1, NUM2);
        assertEquals(NUM1*NUM2,result);
    }
    @Test
    public void returnOneWhenMultipleOneAndOne() {
        int result = calculatorService.calcMultiply(NUM1, NUM1);
        assertEquals(NUM1*NUM1,result);
    }
    @Test
    public void returnTwoWhenDivideTwoAndOne() {
        int result = calculatorService.calcDivide(NUM2, NUM1);
        assertEquals(NUM2/NUM1,result);
    }
    @Test
    public void returnOneWhenDivideOneAndOne() {
        int result = calculatorService.calcDivide(NUM1, NUM1);
        assertEquals(NUM1/NUM1,result);
    }

    @Test
    public void returnThrowDivideByZeroException() {
        assertThrows(ExceptionByZero.class,
                () -> calculatorService.calcDivide(NUM1, ZERO));
    }

}