package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        Task1 result = new Task1();
        int num1 = Task1.getNumber("Enter the first number: ");
        int num2 = Task1.getNumber("Enter the second number: ");
        System.out.println(Task1.getTotal(num1, num2));
        System.out.println(Task1.getAverage(num1, num2));
        System.out.println();

        // Task 2
        System.out.println("Task 2");

        Employee employee1 = new Employee();
        Employee.parameters(employee1);

        Employee employee2 = new Employee();
        Employee.parameters(employee2);

        Employee employee3 = new Employee();
        Employee.parameters(employee3);

        Employee.printEmployeeSalaries();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}