package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private LocalDate dateOfManufacture;
    private Category category;
    double price;

    public Product(LocalDate dateOfManufacture, Category category, double price) {
        this.dateOfManufacture = dateOfManufacture;
        this.category = category;
        this.price = price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(dateOfManufacture, product.dateOfManufacture) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfManufacture, category, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "dateOfManufacture=" + dateOfManufacture +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
