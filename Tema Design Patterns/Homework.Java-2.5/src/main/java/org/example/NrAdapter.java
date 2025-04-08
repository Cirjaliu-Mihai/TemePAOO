package org.example;

public class NrAdapter {

    public static C3Nr convert(C2Nr c2) {
        return new C3Nr(c2.getNr1(), c2.getNr2(), 0);
    }
}
