package com.softserve.edu06.hw.task2;

public class Task2 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("Ivan", 29, 1400.78, "Junior Java Developer"),
                new Employee("Serhii", 30, 6300),
                new Developer("Roman", 45, 2500, "Middle Java Developer"),
                new Employee("Anna", 24, 1800)
        };

        for (Employee employee : employees){
            System.out.println(employee.report());
        }
    }
}
