package com.softserve.edu04.pt;

import com.softserve.edu03.pt.Employee;

import java.util.Objects;

import static com.softserve.edu03.example.Main.SCANNER;

public class Product {
    String name;
    Double price;
    int quantity;

    public Product() {
    }

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void parameters(Product product) {
        System.out.print("Input name of the product: ");
        String name = SCANNER.nextLine();
        product.setName(name);
        System.out.print("Input price of the " + name + ": ");
        double price = SCANNER.nextDouble();
        SCANNER.nextLine();
        product.setPrice(price);
        System.out.print("Input quantity of the " + name + ": ");
        int quantity = SCANNER.nextInt();
        SCANNER.nextLine();
        product.setQuantity(quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getQuantity() == product.getQuantity() && Objects.equals(getName(), product.getName()) && Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getQuantity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
