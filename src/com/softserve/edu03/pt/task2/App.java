package com.softserve.edu03.pt.task2;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("George", 4, 10);
        Employee employee2 = new Employee("Steve", 7, 8);
        Employee employee3 = new Employee("William", 12, 6);
        System.out.println("Total salary of all employees is " + Employee.getTotalSum(employee1, employee2, employee3) + " dollars.");
    }
}
