package ComplexNumCalculator;

import ComplexNumCalculator.data.Calculator;
import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.Logger;
import ComplexNumCalculator.service.CalculatorService;
import ComplexNumCalculator.service.ComplexNumberService;
import ComplexNumCalculator.view.LoggerView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerView();
        Calculator calculator = new CalculatorService(logger);
    
        ComplexNumber num1 = new ComplexNumberService(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumberService(1.0, 2.0);
    
        ComplexNumber sum = calculator.sum(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);
    
        System.out.println("Сумма " + sum);
        System.out.println("Произведение " + product);
        System.out.println("Результат деления " + quotient);
    }
}
