package com.softserve.edu03.pt.task2;


public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();
        Employee employee2 = new Employee();
        employee2.input();
        Employee employee3 = new Employee();
        employee3.input();
        System.out.println("Total salary of all employees is " + Employee.getTotalSum(employee1, employee2, employee3) + " dollars.");
    }
}
