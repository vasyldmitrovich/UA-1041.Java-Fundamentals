package com.softserve.edu14.hw.task_1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = fillingList();
        var sortList = products.stream()
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> (LocalDate.now().getYear() - product.getDate().getYear()) >= 1)
                .toList()
                .stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println(sortList);

    }


    private static List<Product> fillingList() {

        return new ArrayList<>(Arrays.asList(
                new Product("Samsung", "Phone", "2022-03-15", 18000.60),
                new Product("iPhone", "Phone", "2023-01-12", 25000.70),
                new Product("Google Pixel", "Phone", "2022-02-10", 7000.50),
                new Product("OnePlus", "Phone", "2021-05-05", 3999.85),
                new Product("Xiaomi", "Phone", "2021-12-18", 2500.99),
                new Product("HP", "Laptop", "2023-08-20", 1299.99),
                new Product("Dell", "Laptop", "2023-09-05", 1199.99),
                new Product("Lenovo", "Laptop", "2023-07-30", 999.99),
                new Product("Acer", "Laptop", "2023-06-15", 899.99),
                new Product("Asus", "Laptop", "2023-05-10", 1099.99),
                new Product("Sony", "Headphones", "2023-03-22", 149.99),
                new Product("Bose", "Headphones", "2023-04-28", 199.99),
                new Product("JBL", "Headphones", "2023-05-15", 129.99),
                new Product("Sennheiser", "Headphones", "2023-06-30", 179.99),
                new Product("Beats", "Headphones", "2023-07-25", 249.99),
                new Product("Apple", "Smartwatch", "2023-06-05", 249.99),
                new Product("Samsung", "Smartwatch", "2023-07-10", 299.99),
                new Product("Fitbit", "Smartwatch", "2023-08-15", 199.99),
                new Product("Garmin", "Smartwatch", "2023-09-20", 229.99),
                new Product("Huawei", "Smartwatch", "2023-10-25", 179.99)

        ));
    }
}
