package ComplexNumCalculator.service;

import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.MultiplyComplexNumber;

public class MultiplyComplexNumberService implements MultiplyComplexNumber{
    private double realPart;
    private double imaginaryPart;

    public MultiplyComplexNumberService(double realPart, double imaginaryPart) {
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
    public ComplexNumber multiply(ComplexNumber other) {
        double real = (this.realPart * other.getRealPart()) - (this.imaginaryPart * other.getImaginaryPart());
        double imaginary = (this.realPart * other.getImaginaryPart()) + (this.imaginaryPart * other.getRealPart());
        return new ComplexNumberService(real, imaginary);
    }

    @Override
    public String toString() {
        return "Multiply{" +
                realPart + '+' +
                imaginaryPart +
                '}';
    }
}
