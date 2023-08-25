package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Serhii");
        employeeMap.put(2, "Roman");
        employeeMap.put(3, "Vitalik");
        employeeMap.put(4, "Andrii");
        employeeMap.put(5, "Ihor");
        employeeMap.put(6, "Anna");
        employeeMap.put(7, "Viktor");

        int ID = getNumber("Enter an ID: ");
        System.out.println(employeeMap.containsKey(ID) ? employeeMap.get(ID) : "Employee not found");
      //  System.out.println(employeeMap.getOrDefault(ID, "Employee not found"));

        String name = getString("Enter name: ");

        Integer key = getKeyByValue(employeeMap, name);
        System.out.println(key != null ? "ID: " + key : "Name is not found in the map");
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static String getString(String prompt){
        System.out.print(prompt);
        return sc.next();
    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V value){
        for (Map.Entry<K, V> m : map.entrySet()){
            if (m.getValue().equals(value)) return m.getKey();
        }
        return null;
    }
}