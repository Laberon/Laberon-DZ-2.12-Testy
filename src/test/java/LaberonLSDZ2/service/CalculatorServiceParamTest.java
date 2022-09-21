package LaberonLSDZ2.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static LaberonLSDZ2.service.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParamTest {
    private static Stream<Arguments> provideCalcParam() {
        return Stream.of(
                Arguments.of(NUM1, NUM2),
                Arguments.of(NUM2, NUM2),
                Arguments.of(NUM2, NUM3),
                Arguments.of(ZERO, NUM3));
    }
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @ParameterizedTest
    @MethodSource("provideCalcParam")
    public void returnCorrectSum(int num1, int num2) {
        int result = calculatorService.calcPlus(num1, num2);
        assertEquals(num1 + num2, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalcParam")
    public void returnCorrectMinus(int num1, int num2) {
        int result = calculatorService.calcMinus(num1, num2);
        assertEquals(num1 - num2, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalcParam")
    public void returnCorrectMultiply(int num1, int num2) {
        int result = calculatorService.calcMultiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalcParam")
    public void returnCorrectDivide(int num1, int num2) {
        int result = calculatorService.calcDivide(num1, num2);
        assertEquals(num1 / num2, result);
    }

}
