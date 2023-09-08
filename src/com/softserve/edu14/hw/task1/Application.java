package com.softserve.edu14.hw.task1;

import java.util.List;

import static com.softserve.edu14.hw.task1.Product.*;

public class Application {
    public static void main(String[] args) {
        var products = createProducts();

        List<Product> sortedProducts = sortedPhones(products);

        System.out.println(sortedProducts);
    }
}
