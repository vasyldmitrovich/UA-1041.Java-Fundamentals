package com.softserve.edu10.pt.task1and2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Kevin");
        employeeMap.put(4, "Michael");
        employeeMap.put(5, "Paul");
        employeeMap.put(6, "Evan");
        employeeMap.put(7, "Will");
        System.out.println(employeeMap);

        int id = Methods.getID("Enter the ID: ");
        Methods.displayTheCorrespondingNameToId(id, employeeMap);

        String name = Methods.getName("Enter the name: ");
        Methods.displayTheCorrespondingIdToName(name, employeeMap);

        Methods.checkForDuplicatesBeforeAdding(employeeMap);
        System.out.println(employeeMap);
    }
}
