package com.softserve.edu04.pt.task45;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Shower gel", 12.5, 10);
        Product product2 = new Product("Shaver", 10, 32);
        Product product3 = new Product("Ball", 1.3, 125);
        Product product4 = new Product("Balloon", 0.7, 212);

        Product.getExpensive(product1, product2, product3, product4);

        Product.getBiggestQuantity(product1, product2, product3, product4);
    }
}
