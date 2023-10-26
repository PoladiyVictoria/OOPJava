package ComplexNumCalculator.data;

public interface ComplexNumber {
    double getRealPart();
    double getImaginaryPart();
    
    ComplexNumber multiply(ComplexNumber other);
    ComplexNumber divide(ComplexNumber other);
}
