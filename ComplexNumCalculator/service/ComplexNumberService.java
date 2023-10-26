package ComplexNumCalculator.service;

import ComplexNumCalculator.data.ComplexNumber;

public class ComplexNumberService implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

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
    public String toString() {
        return "ComplexNumber{" +
                realPart + '+' +
                imaginaryPart +
                '}';
    }
}


