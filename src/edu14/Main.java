package edu14;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = fillingList();
        var sortList = products.stream()
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> (LocalDate.now().getYear() - product.getDate().getYear()) >= 1)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println(sortList);


    }


    private static List<Product> fillingList() {

        return new ArrayList<>(Arrays.asList(
                new Product("Chanel", "lipstick", "2022-03-15", 180),
                new Product("Dolce Gabanna", "Eyeshadows", "2023-01-12", 250),
                new Product("Giorgio Armani", "Primer", "2022-02-10", 700),
                new Product("Luois Vitton", "Handbag", "2021-05-05", 5000),
                new Product("Van Cleef", "Jewelry", "2021-12-18", 6000),
                new Product("Calvin Klein", "Shoes", "2023-08-20", 1300),
                new Product("Montale","Perfume","2023-09-05", 200),
                new Product("Tom Ford", "Perfume", "2023-07-30", 1000),
                new Product("Killian", "Perfume", "2023-06-15", 120),
                new Product("Tommy Hilfiger", "Clothes", "2023-05-10", 600),
                new Product("Maritel", "Clothes", "2023-03-22", 300),
                new Product("Hugo boss", "Perfume", "2023-04-28", 500),
                new Product("Carolina Herera", "Perfume", "2023-05-15", 500),
                new Product("Versace", "Clothes", "2023-06-30", 3000),
                new Product("Gucci", "Clothes", "2023-07-25", 4000),
                new Product("Mango", "Clothes", "2023-06-05", 600),
                new Product("Zara", "Clothes", "2023-07-10", 500),
                new Product("Bershka", "Clothes", "2023-08-15", 400),
                new Product("Victoria`s Secret", "Underwear", "2023-09-20", 300),
                new Product("Mark&Andre", "Underwear", "2023-10-25", 500)

        ));
    }
}