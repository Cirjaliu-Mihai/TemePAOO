package org.example;

public class PHelper {

    public static Produs productToProdus(Product p)
    {
        int pret=p.getPrice()*4;
        return new Produs(p.getId(),p.getName(), pret);
    }
    public static Product produsToProduct(Produs p)
    {
        int pret=p.getPret()/4;
        return new Product(p.getId(),p.getName(), pret);
    }
}
