package com.softserve.edu14.hw.hw01;

import java.time.LocalDate;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufactured;
    private int price;

    public Product() {
    }

    public Product(String manufactureCategory, LocalDate dateOfManufactured, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufactured = dateOfManufactured;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufactured() {
        return dateOfManufactured;
    }

    public void setDateOfManufactured(LocalDate dateOfManufactured) {
        this.dateOfManufactured = dateOfManufactured;
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
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufactured=" + dateOfManufactured +
                ", price=" + price +
                '}';
    }
}
