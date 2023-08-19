package com.softserve.edu03.pt;

import static com.softserve.edu03.example.Main.SCANNER;

public class Employee {

    private static double totalSum;
    private double salary;
    private double bonus;

    private String name;
    private double rate;
    private double hours;

    public Employee() {
        this("N/A", 0);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary += bonus;
    }

    public static void printEmployeeSalaries() {
        System.out.println("Total Salary: %.2f".formatted(totalSum));
    }

    public static void parameters(Employee employee) {
        System.out.print("Input name: ");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.print("Input rate for employee '" +
                employee.getName() + "': ");
        double rate = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setRate(rate);
        System.out.print("Input working hours for employee '" +
                employee.getName() + "': ");
        double hours = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hours);
        System.out.format("Salary with bonuses of employee '" + employee.getName() +
                "' %.2f\n\n", employee.getBonuses());
    }

    public double getSalary(double rate, double hours) {
        salary = rate * hours;
        return salary;
    }

    public double getBonuses() {
        bonus += getSalary(rate, hours) * 1.1;
        totalSum += bonus;
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                " salary with bonus = " + bonus +
                '}';
    }

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
        this.hours = hours;
    }
}

