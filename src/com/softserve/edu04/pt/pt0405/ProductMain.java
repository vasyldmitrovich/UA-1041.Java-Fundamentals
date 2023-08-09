package com.softserve.edu04.pt.pt0405;

public class ProductMain {
    public static void main(String[] args) {

        Product prod1 = new Product("Car", 20000.0, 5);

        System.out.println(prod1);

        Product prod2 = new Product("Boat", 27000.0, 6);

        System.out.println(prod2);

        Product prod3 = new Product("Plane", 80000.0, 4);

        System.out.println(prod3);

        Product prod4 = new Product("Train", 128000.5, 2);

        System.out.println(prod4);

        ProductMain.getMaxPrice(prod1, prod2, prod3, prod4);
        ProductMain.getMaxQuantity(prod1, prod2, prod3, prod4);

    }

    private static void getMaxPrice(Product prod1, Product prod2, Product prod3, Product prod4) { // Method like that should be in class where is main method
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
        if (maxPrice == prod4.getPrice()) {
            System.out.println("Most expensive item is " + prod4.getName() + ", " + prod4.getQuantity() + " pcs");
        }
    }

    private static void getMaxQuantity(Product prod1, Product prod2, Product prod3, Product prod4) {//And this method too

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

}



