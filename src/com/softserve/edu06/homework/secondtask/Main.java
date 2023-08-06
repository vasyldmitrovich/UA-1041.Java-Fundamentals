package com.softserve.edu06.homework.secondtask;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[]{
                new Employee("John", 25, 1500.50),
                new Developer("Bob", 30, "Senior Java Developer", 6000.2)
        };
        for (var staff : employee) {
            System.out.println(staff.report());
        }
    }
}
