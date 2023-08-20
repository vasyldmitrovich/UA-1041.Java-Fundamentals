package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("IT", new Department.Address("Dnipro", "Ukrainska", 33));
        Department department2 = department1.clone();
        department2.address.setCity("Kharkiv");
        System.out.println(department1);
        System.out.println("After changing city");
        System.out.println(department2);
    }
}
