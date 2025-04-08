package org.example;

import java.util.Random;

public class Student {
    private String nume;
    private static final Random rand = new Random();

    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getStatus() {
        return rand.nextBoolean() ? "prezent" : "absent";
    }
}
