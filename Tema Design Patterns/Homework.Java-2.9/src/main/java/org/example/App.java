package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Shape shape1 = ShapeFactory.createShape(5.0f); // Circle
        Shape shape2 = ShapeFactory.createShape(3.0f, 4.0f); // Rectangle

        System.out.println("Area of Circle: " + shape1.getArea());
        System.out.println("Area of Rectangle: " + shape2.getArea());
    }
}
