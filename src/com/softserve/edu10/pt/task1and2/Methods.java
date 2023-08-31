package com.softserve.edu10.pt.task1and2;

import java.util.Map;
import java.util.Scanner;

public class Methods {
    public static final Scanner SC = new Scanner(System.in);

    public static int getID(String prompt) {
        System.out.print(prompt);
        return SC.nextInt();
    }

    public static String getName(String prompt) {
        System.out.print(prompt);
        SC.nextLine();
        return SC.nextLine();
    }

    public static void displayTheCorrespondingNameToId(int id, Map<Integer, String> employeeMap) {
        if (employeeMap.containsKey(id)) {
            System.out.println("The name is: " + employeeMap.get(id));
        } else {
            System.out.println("There is no such an ID!");
        }
    }

    public static void displayTheCorrespondingIdToName(String name, Map<Integer, String> employeeMap) {
        if (employeeMap.containsValue(name)) {
            for (var e : employeeMap.entrySet()) {
                if (e.getValue().equals(name)) {
                    System.out.println("The ID is: " + e.getKey());
                }
            }
        } else {
            System.out.println("There is no such a name!");
        }
    }


    public static String checkForDuplicatesBeforeAdding(Map<Integer, String> employeeMap) {
        int id = getID("Enter the ID of the person: ");
        String name = getName("Enter the name of the person: ");
        if (!employeeMap.containsKey(id)) {
            System.out.println(name + " with the ID " + id + " has been added to the list.");
            return employeeMap.put(id, name);
        } else {
            System.out.println("A person with such an ID already exists in the list.");
            return null;
        }
    }
}
