package edu07;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("1", "Kateryna", 200, 150, "123456"),
                new SalariedEmployee("2", "Leonid", 100000, "987654321"),
                new ContractEmployee("3", "Arkadii", 350, 500, "876954321")
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