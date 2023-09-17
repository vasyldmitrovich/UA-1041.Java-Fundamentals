package com.softserve.edu14.hw.hw01;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> product = List.of(
                new Product("Phone", LocalDate.of(2021, 1, 15), 4500),
                new Product("Car", LocalDate.of(2023, 2, 16), 12000),
                new Product("Plane", LocalDate.of(2019, 3, 17), 20000),
                new Product("Laptop", LocalDate.of(2018, 4, 17), 18000),
                new Product("Laptop", LocalDate.of(2016, 5, 18), 21000),
                new Product("Laptop", LocalDate.of(2020, 6, 22), 22000),
                new Product("Plane", LocalDate.of(2021, 7, 5), 250000),
                new Product("Plane", LocalDate.of(2023, 8, 9), 300000),
                new Product("Car", LocalDate.of(2005, 9, 6), 18500),
                new Product("Car", LocalDate.of(2002, 10, 8), 32000),
                new Product("Car", LocalDate.of(1999, 11, 9), 45000),
                new Product("House", LocalDate.of(1988, 12, 16), 1000000),
                new Product("House", LocalDate.of(2000, 1, 18), 1000000),
                new Product("Phone", LocalDate.of(2023, 2, 28), 2000),
                new Product("Phone", LocalDate.of(2023, 3, 20), 8000),
                new Product("Phone", LocalDate.of(2019, 4, 21), 1200),
                new Product("Phone", LocalDate.of(2016, 4, 22), 3200),
                new Product("Phone", LocalDate.of(2014, 4, 23), 7000),
                new Product("Phone", LocalDate.of(2013, 6, 24), 1500),
                new Product("Phone", LocalDate.of(2012, 7, 2), 6000)
        );
        System.out.println("List after sorting: ");
        product.stream()
                .filter(product1 -> product1.getManufactureCategory().equals("Phone"))
                .filter(product1 -> product1.getPrice() > 3000)
                .filter(product1 -> product1.getDateOfManufactured().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);


    }
}

