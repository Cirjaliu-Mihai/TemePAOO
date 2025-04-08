package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private List<Student> studenti = new ArrayList<>();

    public void inscrieStudent(Student student) {
        studenti.add(student);
    }

    public void prezenta() {
        System.out.println("Lista prezență:");
        for (Student s : studenti) {
            System.out.println(s.getNume() + ": " + s.getStatus());
        }
        System.out.println("---------------------");
    }
}
