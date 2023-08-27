package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task1");

        Task_01 result1 = new Task_01();
        int num1 = Task_01.getNumber("Input side 1: ");
        int num2 = Task_01.getNumber("Input side 2: ");
        int num3 = Task_01.getNumber("Input side 3: ");

        Task_01.getCountOddNumbers();
        System.out.println();

        // Task 2
        System.out.println("Task2");

        Task_02 response = new Task_02();
        int numberOfTheDay = Task_02.getNumberOfTheDay();
        Task_02.getNameOfTheDay(numberOfTheDay);
        System.out.println();

        // Task 3
        System.out.println("Task 3");

        String nameOfTheCountry = Continents.getCountryName();
        Continents.getContinent(nameOfTheCountry);
        System.out.println();

        // Task 4, 5
        System.out.println("Task 4,5");

        Product product1 = new Product();
        Product.parameters(product1);
        System.out.println();

        Double maxPrice = product1.price;
        String nameOfMostExpensiveProduct = product1.name;
        int quantityOfMostExpensiveProduct = product1.quantity;

        int biggestQuantity = product1.quantity;
        String nameOfBiggestQuantity = product1.name;

        Product product2 = new Product();
        Product.parameters(product2);
        System.out.println();

        if (product2.equals(product1)==false) {
            if (maxPrice < product2.price) {
                maxPrice = product2.price;
                nameOfMostExpensiveProduct = product2.name;
                quantityOfMostExpensiveProduct = product2.quantity;
            }

            if (biggestQuantity < product2.quantity) {
                nameOfBiggestQuantity = product2.name;
                biggestQuantity = product2.quantity;
            }
        }

        Product product3 = new Product();
        Product.parameters(product3);
        System.out.println();

        if (product2.equals(product1)==false && product3.equals(product1)==false) {
            if (maxPrice < product3.price) {
                maxPrice = product3.price;
                nameOfMostExpensiveProduct = product3.name;
                quantityOfMostExpensiveProduct = product3.quantity;
            }

            if (biggestQuantity < product3.quantity) {
                nameOfBiggestQuantity = product3.name;
                biggestQuantity = product3.quantity;
            }
        }

        System.out.println("The most expensive product is " + nameOfMostExpensiveProduct + " (quantity = " +
                quantityOfMostExpensiveProduct + ").");

        System.out.println("The biggest quantity of the " + nameOfBiggestQuantity + " is " +
                biggestQuantity+".");

        System.out.println();

    }
}
