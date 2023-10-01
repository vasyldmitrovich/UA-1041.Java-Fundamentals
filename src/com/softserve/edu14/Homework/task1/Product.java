package com.softserve.edu14.Homework.task1;

import java.time.LocalDate;
import java.util.List;

public class Product {

    String manufacture_category;
    LocalDate date_of_manufacture;
    int price;

    public Product(String manufacture_category, LocalDate date_of_manufacture, int price) {
        this.manufacture_category = manufacture_category;
        this.date_of_manufacture = date_of_manufacture;
        this.price = price;
    }

    public String getManufacture_category() {
        return manufacture_category;
    }

    public void setManufacture_category(String manufacture_category) {
        this.manufacture_category = manufacture_category;
    }

    public LocalDate getDate_of_manufacture() {
        return date_of_manufacture;
    }

    public void setDate_of_manufacture(LocalDate date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
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
                "manufacture_category='" + manufacture_category + '\'' +
                ", date_of_manufacture=" + date_of_manufacture +
                ", price=" + price +
                '}';
    }
}
