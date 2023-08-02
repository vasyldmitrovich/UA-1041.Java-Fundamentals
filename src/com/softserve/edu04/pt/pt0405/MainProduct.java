package com.softserve.edu04.pt.pt0405;

public class MainProduct {
    public static void main(String[] args) {

        Product prod1 = new Product("Car", 20000.0, 5);

        System.out.println(prod1);

        Product prod2 = new Product("Boat", 27000.0, 6);

        System.out.println(prod2);

        Product prod3 = new Product("Plane", 80000.0, 4);

        System.out.println(prod3);

        Product prod4 = new Product("Train", 128000.5, 2);

        System.out.println(prod4);

        Product.getMaxPrice(prod1, prod2, prod3, prod4);
        Product.getMaxQuantity(prod1, prod2, prod3, prod4);

    }
}
