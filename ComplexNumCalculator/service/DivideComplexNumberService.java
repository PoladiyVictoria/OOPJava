package ComplexNumCalculator.service;

import ComplexNumCalculator.data.ComplexNumber;
import ComplexNumCalculator.data.DivideComplexNumber;

public class DivideComplexNumberService implements DivideComplexNumber{
    private double realPart;
    private double imaginaryPart;

    public DivideComplexNumberService(double realPart, double imaginaryPart) {
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
    public ComplexNumber divide(ComplexNumber other) {
        double real = ((this.realPart * other.getRealPart()) + (this.imaginaryPart * other.getImaginaryPart()))
                / ((other.getRealPart() * other.getRealPart()) + (other.getImaginaryPart() * other.getImaginaryPart()));
        double imaginary = ((this.imaginaryPart * other.getRealPart()) - (this.realPart * other.getImaginaryPart()))
                / ((other.getRealPart() * other.getRealPart()) + (other.getImaginaryPart() * other.getImaginaryPart()));
        return new ComplexNumberService(real, imaginary);
    }

    @Override
    public String toString() {
        return "Divide{" +
                realPart + '+' +
                imaginaryPart +
                '}';
    }
}
