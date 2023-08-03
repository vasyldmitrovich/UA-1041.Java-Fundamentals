package com.softserve.edu04.pt.task4_task5;

public class Task4 {

    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.99, 5);
        Product product2 = new Product("Product 2", 19.99, 3);
        Product product3 = new Product("Product 3", 5.99, 8);
        Product product4 = new Product("Product 4", 25.49, 2);

        Product expensive = findMostExpensiveProduct(product1, product2, product3, product4);

        System.out.println("The most expensive product has name - " + expensive.getName() + " and has price - " + expensive.getPrice());

        Product quantitative = findMostQuantitativeProduct(product1, product2, product3, product4);
        System.out.println("The most quantitative product has name - " + quantitative.getName() + " and has quantity - " + quantitative.getQuantity());

    }
    
    private static Product findMostExpensiveProduct(Product product1, Product product2, Product product3, Product product4) {
        Product expensive = findExpensive(product1, product2);
        
        expensive = findExpensive(expensive, product3);
        
        expensive = findExpensive(expensive, product4);
        
        
        return expensive;
    }
    
    private static Product findExpensive(Product product1, Product product2) {
        return product1.getPrice() > product2.getPrice() ? product1 : product2;
    }

    private static Product findMostQuantitativeProduct(Product product1, Product product2, Product product3, Product product4) {
        Product expensive = findQuantitative(product1, product2);

        expensive = findQuantitative(expensive, product3);

        expensive = findQuantitative(expensive, product4);


        return expensive;
    }

    private static Product findQuantitative(Product product1, Product product2) {
        return product1.getQuantity() > product2.getQuantity() ? product1 : product2;
    }
}
