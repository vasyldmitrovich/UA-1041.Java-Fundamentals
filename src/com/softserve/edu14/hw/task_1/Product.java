package com.softserve.edu14.hw.task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private String name;
    private String category;
    private LocalDate date;
    private double price;

    public Product() {
    }

    public Product(String name, String category, String date, double price) {
        this.name = name;
        this.category = category;
        this.date = LocalDate.from(FORMATTER.parse(date));
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}'+"\n";
    }
}
