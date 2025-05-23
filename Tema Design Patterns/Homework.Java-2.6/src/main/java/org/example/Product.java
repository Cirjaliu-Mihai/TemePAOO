package org.example;

public class Product {
    private int id;
    private String name;
    private int price;
    Product(int id,String name ,int price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                "USD}";
    }
}
