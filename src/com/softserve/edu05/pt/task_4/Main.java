package com.softserve.edu05.pt.task_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = {
                new Employee("John", 135, 15000),
                new Employee("Sarah", 126, 12000),
                new Employee("Peter", 135, 14000),
                new Employee("Luis", 126, 5000),
                new Employee("David", 11, 9000)
        };
        System.out.println(Arrays.toString(employees));
        System.out.println("input department number:");
        int depNumber = sc.nextInt();

        findEmpOfNumb(employees, depNumber);

        Arrays.sort(employees, Comparator.comparing(Employee ::getSalary).reversed());
        System.out.println(Arrays.toString(employees));

    }

    private static void findEmpOfNumb(Employee[] employees, int depNumber) {
        int count = 0;
        for (var emp : employees
        ) {
            if (emp.getDepartmentNumber() == depNumber) {
                System.out.println(emp);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("department number don't find!");
        }

    }
}
