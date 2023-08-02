package com.softserve.edu04.pt.pt0405;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static void getMaxPrice(Product prod1, Product prod2, Product prod3, Product prod4) {
        double maxPrice = Math.max(prod1.getPrice(), Math.max(prod2.getPrice(), Math.max(prod3.getPrice(), prod4.getPrice())));

        if (maxPrice == prod1.getPrice()) {
            System.out.println("Most expensive item is " + prod1.getName() + ", " + prod1.getQuantity() + " pcs");
        }
        if (maxPrice == prod2.getPrice()) {
            System.out.println("Most expensive item is " + prod2.getName() + ", " + prod2.getQuantity() + " pcs");
        }
        if (maxPrice == prod3.getPrice()) {
            System.out.println("Most expensive item is " + prod3.getName() + ", " + prod3.getQuantity() + " pcs");
        }
        if (maxPrice == prod4.price) {
            System.out.println("Most expensive item is " + prod4.getName() + ", " + prod4.getQuantity() + " pcs");
        }
    }

    public static void getMaxQuantity(Product prod1, Product prod2, Product prod3, Product prod4) {

        int maxQuantity = Math.max(prod1.getQuantity(), Math.max(prod2.getQuantity(), Math.max(prod3.getQuantity(), prod4.getQuantity())));

        if (maxQuantity == prod1.getQuantity()) {
            System.out.println("The biggest quantity item is " + prod1.getName());
        }
        if (maxQuantity == prod2.getQuantity()) {
            System.out.println("The biggest quantity item is " + prod2.getName());
        }
        if (maxQuantity == prod3.getQuantity()) {
            System.out.println("The biggest quantity item is " + prod3.getName());
        }
        if (maxQuantity == prod4.getQuantity()) {
            System.out.println("The biggest quantity item is " + prod4.getName());
        }
    }

    @Override
    public String toString() {
        return "Product {" +
                "name ='" + name + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                '}';
    }
}
