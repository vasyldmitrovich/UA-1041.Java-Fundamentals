package com.softserve.edu05.hw;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        Task_1.getCountDaysInTheMonth();
        System.out.println();
        Task_1.getArrayInt();
        System.out.println();
        Task_1.getNumbersFromArray();
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        Task_2.getNumbers();

        // Task 3
        System.out.println("Task 3");

        String[][] cars = {{"audy", "2013", "5.6"},
                {"honda", "2022", "3.2"},
                {"opel", "2008", "3.5"},
                {"bmw", "2019", "6.0"},
                {"mazda", "2006", "4.8"}};
        Car.getModelYear();
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        Task_4.getRandomNumber();

    }
}
