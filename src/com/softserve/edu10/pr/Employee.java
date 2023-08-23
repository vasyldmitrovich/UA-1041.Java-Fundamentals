package com.softserve.edu10.pr;

import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        var employeeMap = Map.of(
          1, "Alex",
          2, "Alice",
          3, "Bob"
        );
        System.out.println(employeeMap);
        System.out.println("Enter id:");
        int id = SCANNER.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name is " +
                    employeeMap.get(id));
        }
        else{
            System.out.println("No such id");
        }
        System.out.println("Enter name:");
        String name = SCANNER.next();
        boolean found = false;
        for (var e: employeeMap.entrySet()){
            if (e.getValue().equals(name)){
                System.out.println("The id is "+
                        e.getKey());
                found = true;
            }
        }
    }
}
