package com.softserve.edu10.practicaltask1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        addListOfEmployee(employeeMap);
        System.out.println(employeeMap);

        int id = getId();
        findNameById(id, employeeMap);

        String name = getName();
        findIdByName(name, employeeMap);

    }

    private static int getId() {
        System.out.print("Enter an ID: ");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();
        return id;
    }

    private static void findNameById(int id, Map<Integer, String> employeeMap) {
        if (employeeMap.containsKey(id)) {
            System.out.println("Name is " + employeeMap.get(id));
        } else {
            System.out.println("No such ID");
        }
    }

    private static String getName() {
        System.out.print("Enter a name: ");
        return SCANNER.nextLine();
    }

    private static void findIdByName(String name, Map<Integer, String> employeeMap) {
        if (employeeMap.containsValue(name)) {
            for (var employee : employeeMap.entrySet()) {
                if (employee.getValue().equals(name)) {
                    System.out.println("The ID is: " + employee.getKey());
                    break;
                }
            }
        } else {
            System.out.println("No such name");
        }
    }

    private static void addListOfEmployee(Map<Integer, String> employeeMap) {
        employeeMap.put(1, "John");
        employeeMap.put(2, "Dan");
        employeeMap.put(3, "Mindy");
        employeeMap.put(4, "Daniel");
        employeeMap.put(5, "Robert");
        employeeMap.put(6, "Diana");
        employeeMap.put(7, "Sara");
    }
}
