package com.softserve.edu03.pt;

import java.util.Scanner;



public class Ptask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter information for employee #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hourly rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours worked: ");
            double hours = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            employees[i] = new Employee(name, rate, hours);
        }

        System.out.println("\nEmployees' information:");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Bonuses: " + employee.getBonuses());
            System.out.println();
        }

        System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }
}

