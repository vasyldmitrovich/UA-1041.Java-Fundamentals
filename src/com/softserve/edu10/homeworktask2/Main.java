package com.softserve.edu10.homeworktask2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        addPersonMap(personMap);
        printFullName(personMap);

        System.out.println("Are there at least two persons with the same first name among these ten people?: " + isTheSameName(personMap));

        removeByName(personMap);

    }

    private static void addPersonMap(Map<String, String> personMap) {
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "Michael");
        personMap.put("Brown", "Jessica");
        personMap.put("Miller", "David");
        personMap.put("Davis", "Sarah");
        personMap.put("Wilson", "Michael");
        personMap.put("Martinez", "Jennifer");
        personMap.put("Anderson", "William");
        personMap.put("Taylor", "Elizabeth");
    }

    private static void printFullName(Map<String, String> personMap) {
        printLine();
        for (var list : personMap.entrySet()) {
            System.out.println("Full name: " + list.getKey() + " " + list.getValue());
        }
        printLine();
    }
    private static boolean isTheSameName(Map<String, String> personMap) {
        for (var firstName : personMap.values()) {
            int count = 0;
            for (var dupName : personMap.values()){
                if (firstName.equals(dupName)){
                    count++;
                }
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
    private static void removeByName(Map<String, String> personMap) {
        printLine();
        System.out.print("Enter the name which you want to remove from the list:");
        String name = SCANNER.nextLine();

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var element = iterator.next().getValue();
            if(element.equals(name)) {
                iterator.remove();
            }
        }
        System.out.println("List with removed name");
        printFullName(personMap);

    }

    private static void printLine() {
        for (int i = 0; i < 30; i++) {
            System.out.print("---");
        }
        System.out.println();
    }
}
