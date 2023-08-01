package com.softserve.edu03.pt.task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static private double totalSum;

    public Employee() {
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
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
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
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

    public static void main(String[] args) {
        Employee employee1 = new Employee("George", 4, 10);
        Employee employee2 = new Employee("Steve", 7, 8);
        Employee employee3 = new Employee("William", 12, 6);
        System.out.println("Total salary of all employees is " + getTotalSum(employee1, employee2, employee3) + " dollars.");
        System.out.println(employee1 + " His salary is " + employee1.getSalary() + " dollars a day.");
        System.out.println(employee2 + " His bonus is " + employee2.getBonuses() + " dollars daily.");
    }
}

