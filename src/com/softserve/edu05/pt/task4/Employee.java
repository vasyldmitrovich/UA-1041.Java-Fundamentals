package com.softserve.edu05.pt.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;


    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void sortEmployees(Employee[] emp) {
        Arrays.sort(emp, Comparator.comparing(Employee::getSalary).reversed());
        for (var empl : emp) {
            System.out.println(empl);
        }
    }

    public static int scan(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void checkDep(Employee[] emp, int depNumber) {
        for (var emp1 : emp) {
            if (emp1.getDepartmentNumber() == depNumber) {
                System.out.println(emp1);
            }
        }
    }
}