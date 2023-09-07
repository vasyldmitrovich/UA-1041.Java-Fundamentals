package com.softserve.edu14.homework;

import java.time.LocalDate;

public class Product {
    private String manufactureCategory;
    private int year;
    private int month;
    private int day;
    private double price;
    private LocalDate produceDate;


    public Product(String manufactureCategory, int year, int month, int day, double price) {
        this.manufactureCategory = manufactureCategory;
        this.year = year;
        this.month = month;
        this.day = day;
        this.produceDate = LocalDate.of(year, month, day);
        this.price = price;
    }

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {

        return String.format("%-20s %-10s $%-10.2f%n", getManufactureCategory(), getProduceDate(), getPrice());
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
