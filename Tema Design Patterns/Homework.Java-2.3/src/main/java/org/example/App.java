package org.example;

public class App 
{
    public static void main( String[] args )
    {
        ComplexNumber c=new ComplexNumber(1,1);
        Double d=2.0;
        System.out.println(ComplexAdapter.suma(d,c));
    }
}
