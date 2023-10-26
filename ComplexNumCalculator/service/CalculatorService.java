package ComplexNumCalculator.service;


import ComplexNumCalculator.data.Calculator;
import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.DivideComplexNumber;
import ComplexNumCalculator.data.Logger;
import ComplexNumCalculator.data.MultiplyComplexNumber;
import ComplexNumCalculator.data.SumComplexNumber;

public class CalculatorService implements Calculator {
    private Logger logger;

    public CalculatorService(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(SumComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется сложение");
        return num1.sum(num2);
    }

    @Override
    public ComplexNumber multiply(MultiplyComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется умножение");
        return num1.multiply(num2);
    }

    @Override
    public ComplexNumber divide(DivideComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполняется деление");
        return num1.divide(num2);
    }
}

