package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    //не зрозумів, як порахувати total salary

    private static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setRate(double rate) {
        this.rate = rate;

    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee:\n" +
                "name='" + name + '\'' +
                "\nrate=" + rate +
                "\nhours=" + hours +
                "\nsalary: " + this.getSalary() +
                "\nbonuses: " + this.getBonuses() +
                '\n';
    }


    public double getBonuses() {
        return this.getSalary() * 0.1;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Dmitro");
        employee1.setRate(120);
        employee1.setHours(45);
        System.out.println(employee1);

        Employee employee2 = new Employee("Nadiya", 114);
        employee1.setHours(45);
        System.out.println(employee2);

        Employee employee3 = new Employee("Alex", 101, 50);
        System.out.println(employee3);

    }
}