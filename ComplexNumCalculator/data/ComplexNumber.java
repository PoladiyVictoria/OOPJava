package ComplexNumCalculator.data;

public interface ComplexNumber  {
    double getRealPart();
    double getImaginaryPart();
    ComplexNumber sum(ComplexNumber other);
    ComplexNumber multiply(ComplexNumber other);
    ComplexNumber divide(ComplexNumber other);
}
