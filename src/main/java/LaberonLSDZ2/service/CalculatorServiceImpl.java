package LaberonLSDZ2.service;

import LaberonLSDZ2.exception.ExceptionByZero;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcomeCalc() {
        return "<b>Добро пожаловать в калькулятор</b> ";
    }

    @Override
    public int calcPlus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calcMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calcMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int calcDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new ExceptionByZero();
        }
        return num1 / num2;
    }
}