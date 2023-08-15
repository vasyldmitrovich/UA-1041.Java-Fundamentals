package com.softserve.edu06.hw.task2;

public class Task2 {//Ok

    public static void main(String[] args) {

        Employee employee = new Employee("John", 28, 60000.0);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println("Employee Info:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Info:");
        System.out.println(developer.report());
    }
}
