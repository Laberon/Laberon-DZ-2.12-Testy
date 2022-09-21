package LaberonLSDZ2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeCalc() {
        return "<b>Добро пожаловать в калькулятор</b> ";
    }

    public String calcPlus(int num1, int num2) {
        int num3 = num1 + num2;
        return num1 + "+" + num2 + "=" + num3;
    }

    public String calcMinus(int num1, int num2) {
        int num3 = num1 - num2;
        return num1 + "-" + num2 + "=" + num3;
    }

    public String calcMultiply(int num1, int num2) {
        int num3 = num1 * num2;
        return num1 + "*" + num2 + "=" + num3;
    }

    public String calcDivide(int num1, int num2) {
        if (num1 == 0) {
            return null;
        } else if (num2 == 0) {
            return null;
        } else {
            int num3 = num1 / num2;
            return num1 + "/" + num2 + "=" + num3;
        }
    }
}