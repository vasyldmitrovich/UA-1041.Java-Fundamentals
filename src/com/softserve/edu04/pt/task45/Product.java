package com.softserve.edu04.pt.task45;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Always add constructor without parameters

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void getExpensive(Product pr1, Product pr2, Product pr3, Product pr4) {
        if (pr1.getPrice() > pr2.getPrice() && pr1.getPrice() > pr3.getPrice() && pr1.getPrice() > pr4.getPrice()) {
            System.out.println("Name \"" + pr1.getName() + "\" and quantity " + pr1.getQuantity() + " of the most expensive product.");
        } else if (pr2.getPrice() > pr1.getPrice() && pr2.getPrice() > pr3.getPrice() && pr2.getPrice() > pr4.getPrice()) {
            System.out.println("Name \"" + pr2.getName() + "\" and quantity " + pr2.getQuantity() + " of the most expensive product.");
        } else if (pr3.getPrice() > pr1.getPrice() && pr3.getPrice() > pr2.getPrice() && pr3.getPrice() > pr4.getPrice()) {
            System.out.println("Name \"" + pr3.getName() + "\" and quantity " + pr3.getQuantity() + " of the most expensive product.");
        } else {
            System.out.println("Name \"" + pr4.getName() + "\" and quantity " + pr4.getQuantity() + " of the most expensive product.");
        }
    }

    public static void getBiggestQuantity(Product pr1, Product pr2, Product pr3, Product pr4) {
        if (pr1.getQuantity() > pr2.getQuantity() && pr1.getQuantity() > pr3.getQuantity() && pr1.getQuantity() > pr4.getQuantity()) {
            System.out.println("Name: \"" + pr1.getName() + "\" of the product with the biggest quantity.");
        } else if (pr2.getQuantity() > pr1.getQuantity() && pr2.getQuantity() > pr3.getQuantity() && pr2.getQuantity() > pr4.getQuantity()) {
            System.out.println("Name: \"" + pr2.getName() + "\" of the product with the biggest quantity.");
        } else if (pr3.getQuantity() > pr1.getQuantity() && pr3.getQuantity() > pr2.getQuantity() && pr3.getQuantity() > pr4.getQuantity()) {
            System.out.println("Name: \"" + pr3.getName() + "\" of the product with the biggest quantity.");
        } else {
            System.out.println("Name: \"" + pr4.getName() + "\" of the product with the biggest quantity.");
        }
    }
}
