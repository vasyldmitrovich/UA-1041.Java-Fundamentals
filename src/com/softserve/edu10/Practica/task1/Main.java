package com.softserve.edu10.Practica.task1;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public final static Scanner SCANNER = new Scanner(System.in);
    public static void main (String[] args) {
        var employeeMap = Map.of(
                1,"Sem",
                2,"Alex",
                3,"John",
                4,"Kevin",
                5,"Alice",
                6,"Max",
                7,"Alona"
        );
        System.out.println(employeeMap);
        System.out.println("Enter ID: ");
        int id = SCANNER.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name is" + employeeMap.get(id));
        }else  {
            System.out.println("No found ID");
        }
        System.out.println("Enter name:");
        String name = SCANNER.next();
        if (employeeMap.containsValue(name)) {
            for (var e :employeeMap.entrySet()) {
                if (e.getValue().equals(name)) {
                    System.out.println("The ID is" + e.getKey());
                    break;
                }
            }

        } else {
            System.out.println("No such name");
        }
    }
}
