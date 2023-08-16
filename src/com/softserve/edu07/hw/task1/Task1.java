package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("1", "SSN123", 5000);
        employees[1] = new ContractEmployee("2", "FTI456", 20, 160);
        employees[2] = new SalariedEmployee("3", "SSN789", 6000);
        employees[3] = new ContractEmployee("4", "FTI012", 18, 180);


        Arrays.sort(employees, Comparator.comparingDouble((Employee emp) -> emp instanceof Payment ? ((Payment) emp).calculatePay() : 0.0).reversed());


        display(employees);

    }

    private static void display(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Employee id: " + employee.getEmployeeId());
            System.out.println("Average Monthly Wage: " + ((Payment) employee).calculatePay());
            System.out.println("=".repeat(10));
        }
    }
}
