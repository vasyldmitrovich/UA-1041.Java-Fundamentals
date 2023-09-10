package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        System.out.println(products.size());

        displayProducts(products);

        List<Product> phones = products.stream()
                .filter(p ->
                        (p.getCategory().equals("Phone")) &&
                                (p.getPrice() > 3000) &&
                                (p.getDate().getYear() < LocalDate.now().getYear() - 1))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("=".repeat(10));
        System.out.println("Phone with price bigger than 3000, and the date of manufacture was more then 1 year ago");
        displayProducts(phones);


        System.out.println("=".repeat(10));
        System.out.println(mostPopularName(products.stream()));
    }

    public static List<Product> getProducts() {
        return new ArrayList<>(
                List.of(
                        new Product("Samsung", "Phone", LocalDate.of(2020, 5, 15), 35000.0),
                        new Product("Apple", "Phone", LocalDate.of(2021, 8, 10), 45000.0),
                        new Product("Sony", "TV", LocalDate.of(2022, 4, 20), 15000.0),
                        new Product("LG", "TV", LocalDate.of(2022, 3, 25), 12000.0),
                        new Product("Dell", "Laptop", LocalDate.of(2022, 7, 5), 28000.0),
                        new Product("HP", "Laptop", LocalDate.of(2022, 6, 18), 32000.0),
                        new Product("Bosch", "Appliance", LocalDate.of(2022, 9, 8), 80000.0),
                        new Product("Philips", "Appliance", LocalDate.of(2022, 9, 2), 75000.0),
                        new Product("Nike", "Sportswear", LocalDate.of(2022, 2, 14), 1200.0),
                        new Product("Adidas", "Sportswear", LocalDate.of(2022, 1, 30), 1100.0),
                        new Product("Sony", "Headphones", LocalDate.of(2022, 10, 12), 20000.0),
                        new Product("Asus", "Phone", LocalDate.of(2019, 11, 5), 19000.0),
                        new Product("Logitech", "Mouse", LocalDate.of(2022, 8, 22), 30000.0),
                        new Product("Microsoft", "Mouse", LocalDate.of(2022, 7, 30), 250.0),
                        new Product("Canon", "Camera", LocalDate.of(2022, 6, 6), 800.0),
                        new Product("Nikon", "Camera", LocalDate.of(2022, 5, 3), 7500.0),
                        new Product("Whirlpool", "Appliance", LocalDate.of(2022, 4, 14), 9000.0),
                        new Product("Acer", "Laptop", LocalDate.of(2022, 3, 10), 27000.0),
                        new Product("Panasonic", "TV", LocalDate.of(2022, 2, 7), 14000.0),
                        new Product("Apple", "Phone", LocalDate.of(2020, 1, 2), 31000.0)
                ));
    }

    public static void displayProducts(List<Product> products) {
        for (int i = 1; i <= products.size(); i++) {
            System.out.println(i + "." + products.get(i - 1));
        }

    }

    public static Optional<String> mostPopularName(Stream<Product> products) {

        return products.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}

