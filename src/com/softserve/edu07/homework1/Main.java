package com.softserve.edu07.homework1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new SalariedEmployee(1000, "Bob", 123535543, 3000), new SalariedEmployee(1001, "Alice", 272885291, 2500), new ContractEmployee(1002, "John", 1325371, 25, 100), new ContractEmployee(1003, "Nick", 5392452, 20, 140)};
        for (var employee : employees) {
            System.out.println(employee.employeeId + " " + employee.name + " " + employee.calculatePay());
        }

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.calculatePay(), o1.calculatePay());
            }
        });
        System.out.println("Sorted array by Average monthly wage");

        for (var employee : employees) {
            System.out.println(employee.employeeId + " " + employee.name + " " + employee.calculatePay());
        }
    }
}
