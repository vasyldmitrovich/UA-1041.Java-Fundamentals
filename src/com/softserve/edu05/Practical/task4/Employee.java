package com.softserve.edu05.Practical.task4;

import java.util.*;


public class Employee {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Kevin", 11, 12000),
                new Employee("Sten", 32, 15000),
                new Employee("Olga", 18, 10500),
                new Employee("Alona", 1, 16000),
                new Employee("Serge", 15, 17000),
        };



        System.out.println("Enter department number of employee: ");
        Scanner scan = new Scanner(System.in);
        int departmentNumber = scan.nextInt();

        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }

        System.out.println("Your employees sort:");

            Arrays.sort(employees, Comparator.comparing(
                    Employee::getSalary
            ));
            System.out.println(Arrays.toString(employees));



        }


    private String name;
    private int departmentNumber;
    private int salary;

    public Employee() {
    }

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
}
