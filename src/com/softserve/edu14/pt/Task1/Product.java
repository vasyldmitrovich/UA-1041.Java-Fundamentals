package com.softserve.edu14.pt.Task1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private int price;

    public Product() {
    }

    public Product(String manufacture, String category, LocalDate dateOfManufacture, int price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
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
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public static List<Product> sortedByThePrice(List<Product>products){
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        return products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
    }
}

