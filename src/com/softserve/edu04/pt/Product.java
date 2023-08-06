package com.softserve.edu04.pt;

public class Product {

    int quantity;
    String name;
    double price;

    public Product(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
