package ComplexNumCalculator.service;

import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.SumComplexNumber;

public class SumComplexNumberService implements SumComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public SumComplexNumberService(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

     @Override
    public ComplexNumber sum(ComplexNumber other) {
        double real = this.realPart + other.getRealPart();
        double imaginary = this.imaginaryPart + other.getImaginaryPart();
        return new ComplexNumberService(real, imaginary);
    }

    @Override
    public String toString() {
        return "Sum{" +
                realPart + '+' +
                imaginaryPart +
                '}';
    }
}
