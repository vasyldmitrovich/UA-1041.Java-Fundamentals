package com.softserve.edu05.pt.task4;


public class App {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("John", 12, 23000),
                new Employee("Steve", 11, 20000),
                new Employee("Adam", 13, 29000),
                new Employee("Josh", 11, 22000),
                new Employee("Daniel", 12, 24000)
        };
        int departmentNumber = Employee.scan("Enter the number of the department: ");
        Employee.checkDep(employees, departmentNumber);
        System.out.println("Employees salaries in descending order:");
        Employee.sortEmployees(employees);

    }
}

