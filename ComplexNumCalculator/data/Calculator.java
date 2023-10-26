package ComplexNumCalculator.data;

public interface Calculator {
    ComplexNumber sum(SumComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(MultiplyComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(DivideComplexNumber num1, ComplexNumber num2);
}
