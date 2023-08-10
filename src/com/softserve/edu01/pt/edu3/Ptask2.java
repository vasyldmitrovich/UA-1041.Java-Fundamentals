package edu3;

import java.util.Scanner;

class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0.0;

    // Constructors
    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary(); // Update the totalSum when a new Employee is created
    }

    // Properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary(); // Update the totalSum before changing hours
        this.hours = hours;
        totalSum += getSalary(); // Update the totalSum after changing hours
    }

    public static double getTotalSum() {
        return totalSum;
    }

    // Methods
    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', rate=" + rate + ", hours=" + hours + "}";
    }
}

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

