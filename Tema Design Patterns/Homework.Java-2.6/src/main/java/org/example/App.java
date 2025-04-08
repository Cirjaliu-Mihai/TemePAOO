package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Product p=new Product(11,"Lapte",2);
        Produs p2=PHelper.productToProdus(p);
        System.out.println(p.toString());
        System.out.println(p2.toString());

    }
}
