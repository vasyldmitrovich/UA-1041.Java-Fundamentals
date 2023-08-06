package com.softserve.edu05.pt.Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Employee[] peoples = new Employee[]{
                new Employee("Tarro", "Albert", 1, 4565),
                new Employee("Fola", "Ykark", 2, 2132),
                new Employee("Posit", "Foc", 3, 5699),
                new Employee("Renet", "Dofal", 1, 1234),
                new Employee("Goter", "Ifarn", 2, 3456),
        };
        System.out.println("Enter a number of department: ");
        int s = scaner.nextInt();
        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i].getDepartmentNumber() == s) {
                peoples[i].getAllInformation();
            }
        }
        Arrays.sort(peoples, Comparator.comparing(
                Employee::getSalary
        ));
        for (var people : peoples) {
            System.out.println(people);
        }
    }
}
