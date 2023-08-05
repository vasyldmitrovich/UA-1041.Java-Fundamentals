package com.softserve.edu04.pt.task4_task5;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Always add constructor without parameters and in the button add to string equals and hash code
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
