package com.softserve.edu07.hw.work1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new SalariedEmployee(345, "Barbara", 654321, 16000),
                new ContractEmployee(007, "Jack", 487434, 41, 380),
                new SalariedEmployee(456, "Amy", 20394, 27000),
                new ContractEmployee(103, "Drew", 196548, 32, 640)};

        for (var employee : employees) {
            System.out.println(employee.getEmployeeID() + " " + employee.getName() + " " + employee.calculatePay());
        }

        //Move this logic to some method and call this method here
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee p1, Employee p2) {
                return Double.compare(p2.calculatePay(), p1.calculatePay());
            }
        });

        System.out.println("Sorted by average monthly wage");

        for (var employee : employees) {
            System.out.println(employee.getEmployeeID() + " " + employee.getName() + " " + employee.calculatePay());
        }
    }
}