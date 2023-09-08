package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Product {
    private Category category;
    private LocalDate dadeOfManufacture;
    private int price;

    public Product(Category category, LocalDate dadeOfManufacture, int price) {
        this.category = category;
        this.dadeOfManufacture = dadeOfManufacture;
        this.price = price;
    }

    public static List<Product> createProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Product(Category.PHONE, LocalDate.of(2023, 1, 15), 8599));
        products.add(new Product(Category.LAPTOP, LocalDate.of(2023, 2, 20), 1299));
        products.add(new Product(Category.HEADPHONES, LocalDate.of(2023, 3, 10), 79));
        products.add(new Product(Category.MEMORY_STICK, LocalDate.of(2023, 4, 5), 29));
        products.add(new Product(Category.MOUSE, LocalDate.of(2023, 5, 8), 19));
        products.add(new Product(Category.KEYBOARD, LocalDate.of(2023, 6, 12), 49));
        products.add(new Product(Category.ADAPTER, LocalDate.of(2023, 7, 7), 9));
        products.add(new Product(Category.PHONE, LocalDate.of(2021, 8, 25), 4699));
        products.add(new Product(Category.LAPTOP, LocalDate.of(2023, 9, 14), 1499));
        products.add(new Product(Category.HEADPHONES, LocalDate.of(2023, 10, 30), 89));
        products.add(new Product(Category.MEMORY_STICK, LocalDate.of(2023, 11, 2), 39));
        products.add(new Product(Category.MOUSE, LocalDate.of(2023, 12, 18), 24));
        products.add(new Product(Category.KEYBOARD, LocalDate.of(2024, 1, 5), 59));
        products.add(new Product(Category.ADAPTER, LocalDate.of(2024, 2, 9), 12));
        products.add(new Product(Category.PHONE, LocalDate.of(2022, 3, 7), 3749));
        products.add(new Product(Category.LAPTOP, LocalDate.of(2024, 4, 19), 1699));
        products.add(new Product(Category.HEADPHONES, LocalDate.of(2024, 5, 22), 99));
        products.add(new Product(Category.MEMORY_STICK, LocalDate.of(2024, 6, 30), 49));
        products.add(new Product(Category.MOUSE, LocalDate.of(2024, 7, 14), 29));
        products.add(new Product(Category.KEYBOARD, LocalDate.of(2024, 8, 8), 69));

        return products;
    }

    public static List<Product> sortedPhones(List<Product> products){
        return products.stream()
                .filter(p -> p.getCategory().equals(Category.PHONE))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> LocalDate.now().minusYears(1).isAfter(p.getDadeOfManufacture()))
                .toList();
    }

    enum Category {
        PHONE, LAPTOP, HEADPHONES, MEMORY_STICK, MOUSE, KEYBOARD, ADAPTER;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDadeOfManufacture() {
        return dadeOfManufacture;
    }

    public void setDadeOfManufacture(LocalDate dadeOfManufacture) {
        this.dadeOfManufacture = dadeOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", dadeOfManufacture=" + dadeOfManufacture +
                ", price=" + price +
                '}';
    }
}
