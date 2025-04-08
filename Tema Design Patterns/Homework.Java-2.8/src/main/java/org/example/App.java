package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();
        prelungitor.adaugaAparat(new Frigider());
        prelungitor.adaugaAparat(new AparatCafea());

        prelungitor.conecteazaLaPriza();
        System.out.println();
        prelungitor.deconecteazaDeLaPriza();
    }
}
