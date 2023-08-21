package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {
        Department department = new Department("Biology", new Department.Address("Kyiv", "Garmatna", 2));
        System.out.println(department);
        Department department1 = department.clone();
        department1.getAddress().setCity("Lviv");
        System.out.println(department1);
    }
}
