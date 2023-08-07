package com.softserve.edu05.pt.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task4 {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Emily", 5, 1340.2),
                new Employee("Mia", 2, 2124.5),
                new Employee("Billy", 6, 3300),
                new Employee("Bob", 5, 1500),
                new Employee("Lucas", 7, 2400.5)
        };

        System.out.print("Enter department number:");
        int depNumber = SCANNER.nextInt();
        SCANNER.nextLine();

        displayByDepNumber(employees, depNumber);

        System.out.println("====================================");


        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());

        System.out.println("Sorted array by salary");
        displayEmployees(employees);
    }

    private static void displayByDepNumber(Employee[] employees, int depNumber) {
        for (var emp : employees) {
            if (emp.getDepNumber() == depNumber) System.out.println(emp);
        }
    }

    private static void displayEmployees(Employee[] employees) {
        for (var emp: employees) {
            System.out.println(emp);
        }
    }
}
