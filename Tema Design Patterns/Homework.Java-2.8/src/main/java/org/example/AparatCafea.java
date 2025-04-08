package org.example;

public class AparatCafea implements AparatElectric {
    @Override
    public void porneste() {
        System.out.println("Aparatul de cafea a fost conectat la curent.");
    }

    @Override
    public void opreste() {
        System.out.println("Aparatul de cafea a fost deconectat de la curent.");
    }
}

