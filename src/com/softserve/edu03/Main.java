package com.softserve.edu03;

import com.softserve.edu03.pt.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee(4,3.4);
        System.out.println("Text your name: ");
        employee1.setName(scanner.nextLine());

        Employee employee2 = new Employee(45,1.4);
        System.out.println("Text your name: ");
        employee2.setName(scanner.nextLine());

        Employee employee3 = new Employee(5,4.6);
        System.out.println("Text your name: ");
        employee3.setName(scanner.nextLine());

        System.out.println("The total salary is: " + (employee1.getSalary() + employee2.getSalary() + employee3.getSalary()));

    }
}
