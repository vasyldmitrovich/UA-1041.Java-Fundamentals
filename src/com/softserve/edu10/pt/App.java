package com.softserve.edu10.pt;

import java.util.*;

public class App {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        var EmploeeMap = Task_1.addPersons();
        Task_1.printHashMap(EmploeeMap);
        int id = Task_1.getId();
        Task_1.getResultId(EmploeeMap,id);
        System.out.print("Please, input person name: ");
        String name = Task_1.getName();
        Task_1.getResultName(EmploeeMap,name);

    }
}
