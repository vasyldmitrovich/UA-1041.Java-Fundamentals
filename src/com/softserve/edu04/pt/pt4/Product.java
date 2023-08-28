package com.softserve.edu04.pt;

import java.util.Arrays;

public class Product {
    private String name;
    private double price;
    private int quantity;


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

    public static void main(String[] args) {
        Product product1 = new Product("John", 10, 5);
        Product product2 = new Product("Bill", 15, 12);
        Product product3 = new Product("Cris", 7, 15);
        Product product4 = new Product("Angelina", 23, 9);
        Product[] productPriceList = {product1, product2, product3, product4};
        int curentPrice = 0;
        String curentName = "";
        for (Product product : productPriceList) {
            if (product.price > 0) {
                curentPrice = (int) product.price;
                curentName = product.name;
            }
        }
        System.out.println(curentName + " has the biggest price " + curentPrice);
        int curentQuantity = 0;

        for (Product product : productPriceList) {
            if (product.quantity > curentQuantity) {
                curentQuantity = product.quantity;
                curentName = product.name;
            }
        }
        System.out.println(curentName + " has the biggest quantity " + curentQuantity);
    }

}

