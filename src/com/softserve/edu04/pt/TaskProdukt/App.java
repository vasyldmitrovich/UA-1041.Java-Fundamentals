package com.softserve.edu04.pt.TaskProdukt;

public class App {
    public static void main(String[] args) {
        Product Product1 = new Product("Banana", 10, 20);
        Product Product2 = new Product("apple", 30.3, 70);
        Product Product3 = new Product("Grape", 100, 1300);
        Product Product4 = new Product("Cheese", 500, 200);

        //Separate logic to methods and call methods in main method
        if (Product1.price > Product2.price && Product1.price > Product3.price && Product1.price > Product4.price) {
            System.out.println("The most expensive item is:" + (Product1.name) + (" quantity: ") + (Product1.quantity));
        } else if (Product2.price > Product1.price && Product2.price > Product3.price && Product2.price > Product4.price) {
            System.out.println("The most expensive item is:" + (Product2.name) + (" quantity: ") + (Product2.quantity));
        } else if (Product3.price > Product1.price && Product3.price > Product2.price && Product3.price > Product4.price) {
            System.out.println("The most expensive item is:" + (Product3.name) + (" quantity: ") + (Product3.quantity));
        } else
            System.out.println("The most expensive item is:" + (Product4.name) + (" quantity: ") + (Product4.quantity));


        if (Product1.quantity > Product2.quantity && Product1.quantity > Product3.quantity && Product1.quantity > Product4.quantity) {
            System.out.println("Has the biggest quantity:" + (Product1.name));
        } else if (Product2.quantity > Product1.quantity && Product2.quantity > Product3.quantity && Product2.quantity > Product4.quantity) {
            System.out.println("Has the biggest quantity:" + (Product2.name));
        } else if (Product3.quantity > Product1.quantity && Product3.quantity > Product2.quantity && Product3.quantity > Product4.quantity) {
            System.out.println("Has the biggest quantity:" + (Product3.name));
        } else System.out.println("Has the biggest quantity:" + (Product4.name));
    }
}