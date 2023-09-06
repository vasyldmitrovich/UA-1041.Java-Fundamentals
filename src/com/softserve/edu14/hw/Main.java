package com.softserve.edu14.hw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static final Random rand = new Random();
    public static final LocalDate now = LocalDate.now();
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList = initProdList(20);
        System.out.println("List of products:");
        productList.forEach(System.out::println);


        List<Product> sortedByPricePhones = productList.stream()
                .filter(product -> Category.ELECTRONICS.equals(product.getCategory()))
                .filter(product -> product.getPrice()>500)
                .filter(product -> product.getDateOfManufacture().isAfter(now.minusYears(1)))
                .toList();

        System.out.println("List of electronic after filter:");
        if (sortedByPricePhones.size()>0) {
            sortedByPricePhones.forEach(System.out::println);
        }else{
            System.out.println("No such electronic");
        }

        System.out.println("The most popular product:");
        System.out.println(mostPopularCategory(productList));

    }

    public static List<Product> initProdList(int size) {
       return Stream
                .generate(() -> new Product(genRandDate(), getRandCategory(), getRandPrice(2)))
                .limit(size)
                .toList();
    }

    public static LocalDate genRandDate() {
        LocalDate start = LocalDate.of(2022, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(start, LocalDate.now());
        return start.plusDays(rand.nextInt((int) days + 1));
    }

    public static Category getRandCategory() {
        int randNum = rand.nextInt(Category.values().length);
        return Category.values()[randNum];
    }

    public static double getRandPrice(int scale) {
        double randDouble = rand.nextDouble(300,1000);
        BigDecimal bd = BigDecimal.valueOf(randDouble);
        bd = bd.setScale(scale, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public static Optional<Category> mostPopularCategory(List<Product> list){
        Map<Category,Long> counter = list.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));

        Optional<Map.Entry<Category,Long>> popProd = counter
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

                return popProd.map(Map.Entry::getKey);
    }

}
