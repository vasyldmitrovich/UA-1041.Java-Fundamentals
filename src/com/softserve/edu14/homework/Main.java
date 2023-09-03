package com.softserve.edu14.homework;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //Introducing the list of products from list.txt and printing it to the console

        List<Product> products = null;
        try {
            products = new ProjectFileReader().readList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (var product : products) {
            System.out.println(product);
        }

        System.out.println("\n=======Sorted list=======\n");

        //Sorting the products by the price

        Stream<Product> sortedStream = products.stream();

        sortedStream
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);

       /* Sorting the product and creating separate list of products which named "Phone",
         older than 1 year and the price more than 3000$*/

        Stream<Product> sortedStreamByCategoryAndPrice = products.stream();

        List<Product> filteredProducts = sortedStreamByCategoryAndPrice
                .filter(product -> product
                        .getManufactureCategory()
                        .equalsIgnoreCase("Phone") && (product.getPrice() > 3000) && (product.getYear() < LocalDate.now().getYear() - 1))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("Sorted by category, price and year of production");
        filteredProducts.forEach(System.out::println);

        /*Method 'mostPopularProduct'*/

        Stream<Product> sortedStreamMostPopular = products.stream();
        Optional<String> mostPopular = mostPopularProduct(sortedStreamMostPopular);
        mostPopular.ifPresent(category -> System.out.println("Most popular category is: " + category));
    }

    public static Optional<String> mostPopularProduct(Stream<Product> product) {

        Map<String, Long> counter = product
                .collect(Collectors.groupingBy(Product::getManufactureCategory, Collectors.counting()));
        Optional<Map.Entry<String, Long>> popularProduct = counter
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return popularProduct.map(Map.Entry::getKey);
    }

}
