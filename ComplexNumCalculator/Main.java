package ComplexNumCalculator;

import ComplexNumCalculator.controller.CalculatorController;
import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.service.ComplexNumberService;

public class Main {
    public static void main(String[] args) {
        CalculatorController calculator = new CalculatorController();
    
        ComplexNumber num1 = new ComplexNumberService(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumberService(1.0, 2.0);
    
        calculator.SumComplexNumber(num1, num2);
        calculator.MultComplexNumber(num1, num2);
        calculator.DivComplexNumber(num1, num2);
        
    }
}
