package ComplexNumCalculator.data;

public interface ComplexNumber {
    double getRealPart();
    double getImaginaryPart();
    
    
    ComplexNumber divide(ComplexNumber other);
}
