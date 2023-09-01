package com.softserve.edu07.hw.hw01;

import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {//Ok
        Employee[] employees = new Employee[]{
                new ContractEmployee("A-235", "John", "DS-789", 8.75, 160),
                new ContractEmployee("A-122", "Patrick", "DC-369", 12.2, 172),
                new SalariedEmployee("B-963", "Alice", "AA-335", 1380),
                new SalariedEmployee("B-698", "Alice", "AA-985", 2500),
        };

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.calculatePay(), o1.calculatePay());
            }
        });

        for (Employee employee : employees) {
            System.out.println("Employee ID= " + employee.getEmployeeId() + ", Name= " + employee.getName() + ", Average monthly wage= " + employee.calculatePay());
        }
    }

}
