package ComplexNumCalculator.service;

import ComplexNumCalculator.data.ComplexNumber;

public class ComplexNumberService implements ComplexNumber {
    protected double realPart;
    protected double imaginaryPart;

    public ComplexNumberService(double realPart, double imaginaryPart) {
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
    public ComplexNumber multiply(ComplexNumber other) {
        double real = (this.realPart * other.getRealPart()) - (this.imaginaryPart * other.getImaginaryPart());
        double imaginary = (this.realPart * other.getImaginaryPart()) + (this.imaginaryPart * other.getRealPart());
        return new ComplexNumberService(real, imaginary);
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
        return "{" +
                realPart + '+' +
                imaginaryPart +
                '}';
    }

    
}


