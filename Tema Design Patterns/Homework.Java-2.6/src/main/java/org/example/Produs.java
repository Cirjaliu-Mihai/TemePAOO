package org.example;

public class Produs {
    private int id;
    private String name;
    private int pret;
    Produs(int id,String name ,int price)
    {
        this.id=id;
        this.name=name;
        this.pret=price;
    }

    public int getPret() {
        return pret;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pret=" + pret +
                "RON}";
    }
}
