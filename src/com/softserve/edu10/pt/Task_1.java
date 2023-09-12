package com.softserve.edu10.pt;

import java.util.*;

import static com.softserve.edu10.pt.App.SCANNER;

public class Task_1 {
    public static HashMap addPersons() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Ann");
        employeeMap.put(2, "Ivan");
        employeeMap.put(3, "Ann");
        employeeMap.put(4, "Bob");
        employeeMap.put(5, "Alex");
        employeeMap.put(6, "Alice");
        employeeMap.put(7, "John");
        return (HashMap) employeeMap;
    }

    public static void printHashMap(Map<Integer, String> employeeMap) {
        System.out.println(employeeMap);
    }

    public static int getId() {
        System.out.print("Please, input person ID: ");
        int personId = SCANNER.nextInt();
        SCANNER.nextLine();
        return personId;
    }

    public static String getName() {
        String personName = SCANNER.nextLine();
        return personName;
    }

    public static void getResultId(HashMap<Integer, String> personsHashMap, int id) {
        if (!personsHashMap.containsKey(id)) {
            System.out.println("You can use numbers 1-7.");
        } else {
            System.out.println("Person id is " + personsHashMap.get(id) + ".");
        }
    }

    public static void getResultName(HashMap<Integer, String> personsHashMap, String name) {
        if (!personsHashMap.containsValue(name)) {
            System.out.println("You need input names from the list given above.");
        } else {
            String id = null;
            for (var employee : personsHashMap.entrySet()) {
                int key = employee.getKey();
                if (personsHashMap.get(key).equals(name)) {
                    if (id != null) {
                        id = id + ", " + String.valueOf(key);
                    } else {
                        id = String.valueOf(key);
                    }
                }
            }
            System.out.println("Id of the " + name + " is " + id);
        }

    }
}
