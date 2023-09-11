package com.softserve.edu14.hw.task1;

public class Product {
    private String manufactureCategory;
    private int dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, int dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
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
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
