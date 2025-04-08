package org.example;

public class App 
{
        public static void main(String[] args) {
            Curs curs = new Curs();
            curs.inscrieStudent(new Student("Ana"));
            curs.inscrieStudent(new Student("Bogdan"));
            curs.inscrieStudent(new Student("Carmen"));

            curs.prezenta();
            curs.prezenta();
            curs.prezenta();
        }
}
