package org.example;

public class ComplexAdapter {


    public static ComplexNumber fromDouble(Double d) {
        return new ComplexNumber(d, 0.0);
    }

    public static Double toDouble(ComplexNumber c) {
        return c.modulus();
    }
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return nr1.add(nr2);
    }

    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 =fromDouble(nr1);
        ComplexNumber c2 =fromDouble(nr2);
        return c1.add(c2);
    }
    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        Double d1 = toDouble(nr1);
        Double sum = d1 + nr2;
        return fromDouble(sum);
    }
    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        Double d2 = toDouble(nr2);
        Double sum = nr1 + d2;
        return fromDouble(sum);
    }
}

