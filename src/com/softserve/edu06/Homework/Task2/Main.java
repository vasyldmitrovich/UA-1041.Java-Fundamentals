package com.softserve.edu06.Homework.Task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
               new Employee("Kevin",30,20000.2) ,
                new Developer("Helen",28,15000.6,"Average Java developer"),
                new Employee("Kate",31,22000.6) ,
                new Developer("Mark",29,18000.7,"Java developer"),
        };
        for (var employee : employees) {
            System.out.println(employee.report());

        }

    }
}
