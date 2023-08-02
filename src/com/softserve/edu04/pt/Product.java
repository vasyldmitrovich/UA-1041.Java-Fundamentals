package com.softserve.edu04.pt;

import java.util.ArrayList;
import java.util.List;

public class Product {
    static List<Product> storehouse = new ArrayList<Product>();
    int quantity;
    String name;
    double price;

    public Product(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        storehouse.add(this);
    }

    public static Product getMostExpensiveProduct() {
        double maxPrice = 0;
        Product maxPriceProd = null;
        for (var product : storehouse
        ) {
            if (product.getPrice() > maxPrice) {
                maxPriceProd = product;
                maxPrice = product.getPrice();
            }
        }
        return maxPriceProd;
    }

    public static Product getMostQuantifiedProduct() {
        int maxQuantity = 0;
        Product maxQuantityProd = null;
        for (var product : storehouse
        ) {
            if (product.getQuantity() > maxQuantity) {
                maxQuantityProd = product;
                maxQuantity = product.getQuantity();
            }
        }
        return maxQuantityProd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
