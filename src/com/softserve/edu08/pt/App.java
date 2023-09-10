package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        Department department1 = new Department("IT", new Department.Address("Kyiv", "Kalynu", 32));
        Department department2 = department1.clone();
        department2.getAddress().setCity("Lviv");
        System.out.println("First department:");
        System.out.println(department1);
        System.out.println();
        System.out.println("Cloning and changing department:");
        System.out.println(department2);
    }
}
