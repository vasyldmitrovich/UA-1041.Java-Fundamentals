package com.softserve.edu10.pt.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        putEmployeeToMap(employeeMap);
        System.out.println(employeeMap);

        int id = getIdToFind();
        findEmployeesAnId(id, employeeMap);

        System.out.println("_______________________");
        String name = getNameToFind();
        findEmployeesAnName(name, employeeMap);

    }

    private static int getIdToFind() {
        System.out.print("Enter employee ID:");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();
        return id;
    }

    private static String getNameToFind() {
        System.out.print("Enter employee name:");
        return SCANNER.nextLine();
    }

    private static void findEmployeesAnName(String name, Map<Integer, String> employeeMap) {
        if (!employeeMap.containsValue(name)) {
            System.out.println("employeeMap don`t have employee with name:" + name);
            return;
        }
        for (var el : employeeMap.keySet()
        ) {
            if (employeeMap.get(el).equalsIgnoreCase(name)) {
                System.out.println("ID:" + el + ", name:" + name);
            }
        }

    }

    private static void findEmployeesAnId(int id, Map<Integer, String> employeeMap) {
        if (!employeeMap.containsKey(id)) {
            System.out.println("employeeMap don`t have employee with id:" + id);
            return;
        }
        System.out.println("ID:" + id + ", name:" + employeeMap.get(id));

    }

    private static void putEmployeeToMap(Map<Integer, String> employeeMap) {
        employeeMap.put(10, "Olivia");
        employeeMap.put(12, "Ethan");
        employeeMap.put(11, "Sophia");
        employeeMap.put(15, "Jackson");
        employeeMap.put(17, "Ethan");
        employeeMap.put(13, "Liam");
        employeeMap.put(16, "Mia");
    }

}
