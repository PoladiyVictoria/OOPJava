package ComplexNumCalculator.data;

public interface Calculator {
    ComplexNumber sum(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
