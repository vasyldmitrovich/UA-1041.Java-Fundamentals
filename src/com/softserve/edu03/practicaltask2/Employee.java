package com.softserve.edu03.practicaltask2;

import static com.softserve.edu03.practicaltask2.Main.SCANNER;

public class Employee {
    //static variable should go after private / DONE
    private String name;
    private double rate;
    private double hours;
    static public double totalSum;


    public Employee() {
        this("N/a", 0, 0);
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
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

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return ((getSalary() * 10) / 100);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", rate=" + rate + ", hours=" + hours + '}';
    }

    //Next three method move to the end of class / DONE
    public String getName() {
        return name;
    }

    public static void printEmployeeTotal() {
        System.out.println("\nTotal salary = " + totalEmployeeSum());
    }

    public static double totalEmployeeSum() {
        return totalSum;
    }

    public static void promptParameters(Employee worker) {
        System.out.print("Input name of employee: ");
        String name = SCANNER.nextLine();
        worker.setName(name);
        System.out.print("Input pay rate of employee: ");
        double rate = SCANNER.nextDouble();
        worker.setRate(rate);
        System.out.print("Input working hours of employee: ");
        double hours = SCANNER.nextDouble();
        worker.setHours(hours);
        SCANNER.nextLine();
        System.out.printf("\nSalary for %s is %s", worker.getName(), worker.getSalary());
        System.out.printf("\nBonuses for %s is %s", worker.getName(), worker.getBonuses());
    }
}
