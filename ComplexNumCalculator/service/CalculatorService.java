package ComplexNumCalculator.service;


import ComplexNumCalculator.data.Calculator;
import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.Logger;

public class CalculatorService implements Calculator {
    private Logger logger;

    public CalculatorService(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется сложение");
        return num1.sum(num2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется умножение");
        return num1.multiply(num2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется деление");
        return num1.divide(num2);
    }

    
}

