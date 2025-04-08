package org.example;

import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<AparatElectric> aparate = new ArrayList<>();
    private boolean conectatLaCurent = false;

    public void adaugaAparat(AparatElectric aparat) {
        aparate.add(aparat);
    }

    public void conecteazaLaPriza() {
        if (!conectatLaCurent) {
            conectatLaCurent = true;
            System.out.println("Prelungitorul a fost conectat la priza.");
            for (AparatElectric aparat : aparate) {
                aparat.porneste();
            }
        }
    }

    public void deconecteazaDeLaPriza() {
        if (conectatLaCurent) {
            conectatLaCurent = false;
            System.out.println("Prelungitorul a fost deconectat de la priza.");
            for (AparatElectric aparat : aparate) {
                aparat.opreste();
            }
        }
    }
}

