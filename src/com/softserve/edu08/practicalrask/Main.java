package com.softserve.edu08.practicalrask;

public class Main {
    public static void main(String[] args) {
        Department.Address departmentAddress = new Department.Address("Kyiv", "Andersa", 24);
        Department department = new Department("Finance", departmentAddress);

        Department department1 = new Department("Marketing", (new Department.Address("Lviv", "Nova", 44)));

        Department department2 = null;
        try{
            department2 = department1.clone();
            department2.getAddress().setCity("Kyiv");
            department2.getAddress().setStreet("Andersa");
            department2.getAddress().setBuilding(24);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(department.getInfo());
        System.out.println(department1.getInfo());
        System.out.println("Cloned department with changed city, street and number of building");
        System.out.println(department2.getInfo());
    }
}
