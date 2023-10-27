package ComplexNumCalculator.controller;

import ComplexNumCalculator.data.Calculator;
import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.Logger;
import ComplexNumCalculator.service.CalculatorService;
import ComplexNumCalculator.view.ComplexNumberView;
import ComplexNumCalculator.view.LoggerView;

public class CalculatorController {
    private final Logger logger = new LoggerView();
    private final Calculator calculator = new CalculatorService(logger);
    private final ComplexNumberView complNumView = new ComplexNumberView();

    public void SumComplexNumber(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber res = calculator.sum(num1, num2);
        complNumView.sendOnConsoleSum(res);
    }

    public void MultComplexNumber(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber res = calculator.multiply(num1, num2);
        complNumView.sendOnConsoleMult(res);
    }

    public void DivComplexNumber(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber res = calculator.divide(num1, num2);
        complNumView.sendOnConsoleDiv(res);
    }
}
