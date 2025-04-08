package org.example;

public class C2Nr {
    private int nr1;
    private int nr2;

    public C2Nr(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public int getNr1() {
        return nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public int getSum() {
        return nr1 + nr2;
    }
}
