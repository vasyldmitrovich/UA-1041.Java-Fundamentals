package com.softserve.edu04.pt.task_4_5;

public class Main {
    public static void main(String[] args) {//Nice
        Product[] products = new Product[4];
        products[0] = new Product("Orange", 60.5, 10);
        products[1] = new Product("Tomato", 40.7, 15);
        products[2] = new Product("Potato", 20.2, 100);
        products[3] = new Product("Banana", 50.3, 7);
        findMostExpensive(products);
        findBiggestQuantity(products);
    }

    private static void findMostExpensive(Product[] products) {
        Product mostExpItem = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > mostExpItem.getPrice()) {
                mostExpItem = products[i];
            }
        }
        System.out.println("The most expensive item is " + mostExpItem.getName() + " " + mostExpItem.getQuantity() + "pcs.");
    }

    private static void findBiggestQuantity(Product[] products) {
        Product biggestQuantity = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getQuantity() > biggestQuantity.getQuantity()) {
                biggestQuantity = products[i];
            }
        }
        System.out.println("The biggest quantity has " + biggestQuantity.getName());

    }
}
