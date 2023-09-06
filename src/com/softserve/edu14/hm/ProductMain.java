package com.softserve.edu14.hm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Phone, LocalDate.of(2021, 5, 23), 3000));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2019, 9, 2), 1560));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2020, 11, 5), 2000));
        productList.add(new Product(Product.Category.Accessories, LocalDate.of(2021, 11, 5), 2000));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Phone, LocalDate.of(2010, 10, 1), 5000));
        productList.add(new Product(Product.Category.Phone, LocalDate.of(2018, 10, 26), 9000));
        productList.add(new Product(Product.Category.Accessories, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Phone, LocalDate.of(2012, 1, 5), 10000));
        productList.add(new Product(Product.Category.Accessories, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Audio, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Audio, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Audio, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Audio, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Accessories, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2022, 11, 5), 2000));
        productList.add(new Product(Product.Category.Phone, LocalDate.of(2009, 11, 5), 6000));
        productList.add(new Product(Product.Category.Computer, LocalDate.of(2020, 11, 2), 20));

        List filtered = productList.stream()
                .filter(s -> s.getCategory().equals(Product.Category.Phone))
                .filter(s -> s.getPrice() > 3000)
                .filter(s -> LocalDate.now().getYear() - s.getDate().getYear() > 1)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList())
                ;

        System.out.println(filtered);
    }
}
