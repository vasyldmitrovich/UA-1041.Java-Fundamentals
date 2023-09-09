package com.softserve.edu06.hw;

import java.util.Scanner;

public class App {

    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        Bird[] birds = {
                new Kiwi("different", 5),
                new Eagle("grey", 5),
                new Penguin("white", 1),
                new Swallow("black", 4),
                new Penguin("black", 1)
        };

        for (var bird : birds) {
            System.out.println(bird);
            bird.fly();
        }

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        Employee[] employees = {
                new Employee("Bob", 21, 2342.5),
                new Employee("Alex", 45, 3453.4),
                new Developer("Alice", 31, "Java Developer", 4564.6),
                new Employee("Sarah", 34, 34534.4),
                new Developer("John", 51, "Java Developer", 4533.7)
        };

        for (var employee : employees) {
            System.out.println(employee.report());
            ;
        }

    }


}