package com.softserve.edu03.pt.task2;

import java.util.Scanner;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static private double totalSum;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum(Employee emp1, Employee emp2, Employee emp3) {
        return totalSum = emp1.getSalary() + emp2.getSalary() + emp3.getSalary();
    }//Good

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of the employee: ");
        String name1 = sc.nextLine();
        setName(name1);
        System.out.print("Input the rate of the employee: ");
        int rate1 = sc.nextInt();
        setRate(rate1);
        System.out.print("Input the number of working hours of the employee: ");
        int hours1 = sc.nextInt();
        setHours(hours1);
    }
    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return (rate * hours) / 10;
    }

    @Override
    public String toString() {
        return "Employee " +
                '\'' + name + '\'' +
                ": rate = " + rate +
                ", hours = " + hours +
                '.';
    }
}

