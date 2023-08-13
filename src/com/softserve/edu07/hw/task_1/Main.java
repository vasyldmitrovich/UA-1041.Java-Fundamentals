package com.softserve.edu07.hw.task_1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("1", "Sergij", 160, 100.5, "987654"),
                new SalariedEmployee("2", "Svitlana", 20050.5, "321654987"),
                new ContractEmployee("3", "Mykola", 120, 110.7, "32145321")
        };
        System.out.println("Before sort");
        for (var el : employees
        ) {
            System.out.println(el);

        }
        System.out.println("After sort:");
        Arrays.sort(employees, Comparator.comparing(Employee::calculatePay));
        for (var el : employees
        ) {
            System.out.println(el);

        }
    }
}
