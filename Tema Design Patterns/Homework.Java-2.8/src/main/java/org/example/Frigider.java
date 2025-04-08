package org.example;

public class Frigider implements AparatElectric {
    @Override
    public void porneste() {
        System.out.println("Frigiderul a fost conectat la curent.");
    }

    @Override
    public void opreste() {
        System.out.println("Frigiderul a fost deconectat de la curent.");
    }
}

