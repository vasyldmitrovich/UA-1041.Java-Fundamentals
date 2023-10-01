package com.softserve.edu14.Homework.task1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var products = List.of(
                new Product("Phone", LocalDate.of(2022,7,15),12000),
                new Product("Monitor", LocalDate.of(2021,11,18),1500),
                new Product("keyboard", LocalDate.of(2021,9,8),800),
                new Product("laptop", LocalDate.of(2023,3,12),18000),
                new Product("mouse pad", LocalDate.of(2022,8,10),150),
                new Product("mouse", LocalDate.of(2022,9,23),300),
                new Product("Phone", LocalDate.of(2021,11,25),15000),
                new Product("Printer", LocalDate.of(2021,10,1),10500),
                new Product("Monitor", LocalDate.of(2022,8,22),1800),
                new Product("mouse pad", LocalDate.of(2020,5,15),100),
                new Product("Monitor", LocalDate.of(2021,11,18),1500),
                new Product("Phone", LocalDate.of(2023,1,18),20500),
                new Product("mouse", LocalDate.of(2023,5,13),600),
                new Product("Phone", LocalDate.of(2022,9,5),10600),
                new Product("laptop", LocalDate.of(2020,11,13),13000),
                new Product("keyboard", LocalDate.of(2022,3,7),1500),
                new Product("Adapter", LocalDate.of(2020,11,3),600),
                new Product("keyboard", LocalDate.of(2021,6,15),800),
                new Product("Adapter", LocalDate.of(2021,1,18),800),
                new Product("Monitor", LocalDate.of(2023,5,13),1400)

        );
        products.stream()
                .filter(product -> product.getManufacture_category().equals("Phone"))
                .filter(product -> product.getPrice()>3000)
                .filter(product -> LocalDate.now().minusYears(1).isAfter(product.getDate_of_manufacture()))
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }
}
