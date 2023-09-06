package com.softserve.edu14.hm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private Category category;
    private LocalDate date;
    private double price;

    public Product(Category category, LocalDate date, double price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    enum Category {
        Phone, Computer, Audio, Accessories
    }

}
