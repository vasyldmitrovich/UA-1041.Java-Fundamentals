package com.softserve.edu05.pt;

import java.util.Scanner;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        System.out.println("Input 5 words separated by ,");
        Task_1.getArrayString();
        System.out.println();

        System.out.println("Input 5 double numbers separated by ,");
        Task_1.getArrayInt();
        System.out.println();

        Task_1.getPosition();
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        Task_2.getArrayInt();
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        Task_3.getResult();
        System.out.println();

        // Task 4
        System.out.println("Task 4");

        String[] [] employees={{"Ann", "1", "3245.50"},
                            {"Bob", "2", "4533"},
                            {"Alice", "3", "5343"},
                            {"Stew", "4", "3424.6"},
                            {"Greg", "5", "5432.3"}};

        System.out.println("Input number of the department from the list: 1,2,3,4,5");
        int departmentNumber = SCANNER.nextInt();
        SCANNER.nextLine();
        Employee.getEmployees(departmentNumber, employees);

        Employee.rangeEmployeesBySalary(employees);

    }
}
