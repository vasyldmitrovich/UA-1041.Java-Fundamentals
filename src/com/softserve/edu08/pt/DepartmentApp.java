package com.softserve.edu08.pt;

public class DepartmentApp {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Department dept1 = new Department("Marketing", "Dnipro", "Bandera", 21);
        Department dept2 = dept1.clone();
        dept2.getAddress().setCity("Lviv");
        System.out.println(dept1);
        System.out.println(dept2);
    }
}
