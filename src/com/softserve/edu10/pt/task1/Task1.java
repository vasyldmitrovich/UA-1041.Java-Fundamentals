package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Charlie");
        employeeMap.put(4, "David");
        employeeMap.put(5, "Eve");
        employeeMap.put(6, "Frank");
        employeeMap.put(7, "Grace");

        displayEmployees(employeeMap);

        System.out.println("=".repeat(10));

        System.out.print("Enter id: ");
        int id = SCANNER.nextInt();

        SCANNER.nextLine();

        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("Name for id " + id + "= " + name);
        } else {
            System.out.println("Id " + id + " not found in the map.");
        }

        System.out.print("Enter name: ");
        String foundName = SCANNER.nextLine();


        if (employeeMap.containsValue(foundName)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(foundName)) {
                    System.out.println("Id for name " + foundName + "= " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name " + foundName + " not found in the map.");
        }

    }

    private static void displayEmployees(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

