package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public class Product {

    private String manufacturer;
    private String category;
    private LocalDate date;
    private double price;

    public Product(String manufacturer, String category, LocalDate date, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
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
                "manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", date of Manufacture=" + date +
                ", price=" + price +
                '}';
    }
}
