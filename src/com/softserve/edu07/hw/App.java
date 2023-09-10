package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        // Task 1
        Employee[] personnel = {
                new SalariedEmployee("Ann", "09"),
                new ContractEmployee("Boris", "15", "47658837465", 34, 45),
                new SalariedEmployee("Ann", "03", "345436", 4564),
                new ContractEmployee("Alex", "07"),
                new ContractEmployee("Boris", "19", "34543", 23, 43)
        };
        Arrays.sort(personnel, Comparator.comparing(employee -> employee.calculatePay()));

        for (var person : personnel) {
            System.out.println(person);
            System.out.println();
        }

        // Task 2
        System.out.println("Task 2");

    }

}
