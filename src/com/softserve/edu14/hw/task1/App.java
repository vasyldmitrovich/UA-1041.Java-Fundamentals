package com.softserve.edu14.hw.task1;

import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Product> product = List.of(
                new Product("Phone", 2017, 3500),
                new Product("TV", 2010, 2003),
                new Product("Laptop", 2004, 2500),
                new Product("Fridge", 2020, 1000),
                new Product("Radio", 2013, 500),
                new Product("Phone", 2017, 2300),
                new Product("TV", 2010, 2003),
                new Product("Laptop", 2004, 2500),
                new Product("Fridge", 2020, 1000),
                new Product("Radio", 2013, 500),
                new Product("Phone", 2017, 4000),
                new Product("TV", 2010, 2003),
                new Product("Laptop", 2004, 2500),
                new Product("Fridge", 2020, 1000),
                new Product("Radio", 2013, 500),
                new Product("Phone", 2017, 1700),
                new Product("TV", 2010, 2003),
                new Product("Laptop", 2004, 2500),
                new Product("Fridge", 2020, 1000),
                new Product("Radio", 2013, 500)
        );
        var sortedPhones = product.stream()
                .filter(product1 -> product1.getManufactureCategory().equals("Phone"))
                .filter(x -> x.getPrice() > 3000)
                .filter(x -> (2023 - x.getDateOfManufacture()) > 1)
                .toList();
        System.out.println(sortedPhones);

        // Task 2
        Stream<Employee> stream = Stream.of(
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Bob"));
        System.out.println(Employee.mostPopularName(stream));
    }
}
