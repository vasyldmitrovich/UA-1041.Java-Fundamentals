package com.softserve.edu04.pt;

import com.softserve.edu04.pt.Continents.Countries;
import com.softserve.edu04.pt.DaysOfWeek.DaysOfWeek;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu04.pt.Odds.calcOdds;
import static com.softserve.edu04.util.CollectInputs.inputNumberFloat;
import static com.softserve.edu04.util.CollectInputs.inputNumberInt;

public class App {
    static List<Product> storehouse = new ArrayList<Product>();

    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        int numOfTask = -1;
        do {
            printList();
            System.out.print("\nPlease input the number of the task: ");
            numOfTask = inputNumberInt();
            System.out.println("\nWelcome to " + numOfTask + " task\n");

            switch (numOfTask) {
                case 1 -> runFirstTask();
                case 2 -> runSecondTask();
                case 3 -> runThirdTask();
                case 4, 5 -> runForthFifthTask();
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid number of the task. Please select the correct one");
            }
        } while (numOfTask != 0);
    }

    private static void runFirstTask() {
        float firstNum = inputNumberFloat("Enter first num:");
        float secondNum = inputNumberFloat("Enter second num:");
        float thirdNum = inputNumberFloat("Enter third num:");
        System.out.println("The number of odds is: " + calcOdds(firstNum, secondNum, thirdNum));
    }

    private static void runSecondTask() {
        DaysOfWeek day = new DaysOfWeek();
        day.enterNumOfDay();
        day.printDay();
    }

    private static void runThirdTask() {
        Countries c1 = new Countries();
        c1.enterNameOfCountry();
        c1.getContinentName();
    }

    private static void runForthFifthTask() {
        Product p1 = new Product(19, "T-shirt", 200);
        Product p2 = new Product(8, "Iphone", 1200);
        Product p3 = new Product(10, "Laptop", 500);

        storehouse.add(p1);
        storehouse.add(p2);
        storehouse.add(p3);

        System.out.println("The most expensive is: " + getMostExpensiveProduct());
        System.out.println("The most quantified is: " + getMostQuantifiedProduct());
    }

    private static void printList() {
        System.out.print("\nPlease choose one of the tasks :" +
                "\n\t1 - First task" +
                "\n\t2 - Second task" +
                "\n\t3 - Third task" +
                "\n\t4 or 5 - Forth-Fifth task" +
                "\n\t0 - Exit\n");
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
}



