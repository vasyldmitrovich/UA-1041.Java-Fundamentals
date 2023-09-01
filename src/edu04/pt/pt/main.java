package edu04.pt.pt;

public class main {
    public static void main(String[] args) {//Nice
        Product[] products = new Product[4];
        products[0] = new Product("Perfume", 70.1, 20);
        products[1] = new Product("Lipstick", 30.2, 13);
        products[2] = new Product("Mascara", 40.5, 50);
        products[3] = new Product("Highlighter", 50.9, 3);
        findMostExpensive(products);
        findBiggestQuantity(products);
    }

    private static void findMostExpensive(Product[] products) {
        Product mostExpItem = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > mostExpItem.getPrice()) {
                mostExpItem = products[i];
            }
        }
        System.out.println("The most expensive item is " + mostExpItem.getName() + " " + mostExpItem.getQuantity() + "pcs.");
    }

    private static void findBiggestQuantity(Product[] products) {
        Product biggestQuantity = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getQuantity() > biggestQuantity.getQuantity()) {
                biggestQuantity = products[i];
            }
        }
        System.out.println("The biggest quantity has " + biggestQuantity.getName());

    }
}

