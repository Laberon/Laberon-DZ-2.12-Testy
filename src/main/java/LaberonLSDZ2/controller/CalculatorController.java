package LaberonLSDZ2.controller;

import LaberonLSDZ2.exception.ExceptionByZero;
import LaberonLSDZ2.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(path = "/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String welcomeCalc() {
        return calculatorService.welcomeCalc();
    }

    @GetMapping(path = "/plus")
    public String calcPlus(@RequestParam int num1, @RequestParam int num2) {
        return message(num1,num2,"/",calculatorService.calcPlus(num1, num2));
    }

    @GetMapping(path = "/minus")
    public String calcMinus(@RequestParam int num1, @RequestParam int num2) {
        return message(num1,num2,"/",calculatorService.calcMinus(num1, num2));
    }

    @GetMapping(path = "/multiply")
    public String calcMultiply(@RequestParam int num1, @RequestParam int num2) {
        return message(num1,num2,"/",calculatorService.calcMultiply(num1, num2));
    }

    @GetMapping(path = "/divide")
    public String calcDivide(@RequestParam int num1, @RequestParam int num2) {
        return message(num1,num2,"/",calculatorService.calcDivide(num1, num2));
    }

    private String message(int num1, int num2, String operation, int result) {
        return String.format("%d %s %d = %d", num1, operation, num2, result);
    }

}