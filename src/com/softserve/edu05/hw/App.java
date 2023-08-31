package com.softserve.edu05.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        // Task 1
  /*
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
*/
        // Task 3
        System.out.println("Task 3");

        Car car1 = new Car();
        Car.inputParameters(car1);

        Car car2 = new Car();
        Car.inputParameters(car2);

        Car car3 = new Car();
        Car.inputParameters(car3);

        Car car4 = new Car();
        Car.inputParameters(car4);

        Car.getModelYear();


    }
}
