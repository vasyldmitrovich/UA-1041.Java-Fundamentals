package com.softserve.edu06.hw.Task2;

public class Main {
    public static void main(String[] args) {//Good
        Developer developer=new Developer("Taras",32, "Average Java developer", 800);
        System.out.println(developer.report());

        Employee employee=new Employee("Andriy",40,900);
        System.out.println(employee.report());

    }
}
