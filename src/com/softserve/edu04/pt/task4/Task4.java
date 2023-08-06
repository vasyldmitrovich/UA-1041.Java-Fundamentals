package com.softserve.edu04.pt.task4;

import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.50, 56);
        Product p2 = new Product("Phone", 450.90, 90);
        Product p3 = new Product("Stick memory", 25.2, 110);
        Product p4 = new Product("Speaker", 740.76, 25);

        Product expensiveProduct = theMostExpensiveProduct(p1, p2, p3, p4);
        System.out.format("The most expensive product\nname: %s\nquantity: %d\n",
                expensiveProduct.getName(), expensiveProduct.getQuantity());

        System.out.format("Item, which has the biggest quantity: %s\n",
                theBiggestQuantity(p1, p2, p3, p4).getName());
    }

    public static Product theMostExpensiveProduct(Product... products){
        return Arrays.stream(products).max(Comparator.comparing(Product::getPrice)).get();
    }

    public static Product theBiggestQuantity(Product... products){
        return Arrays.stream(products).max(Comparator.comparing(Product::getQuantity)).get();
    }
}
