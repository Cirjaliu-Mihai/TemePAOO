package org.example;

public class ShapeFactory {

    public static Shape createShape(float... values) {
        if (values.length == 1) {
            return new Circle(values[0]);
        } else if (values.length == 2) {
            return new Rectangle(values[0], values[1]);
        } else {
            throw new IllegalArgumentException("Invalid number of parameters");
        }
    }
}

