package com.softserve.edu08.hm.task1;

public class Task1 {

    public static void main(String[] args) {
        Department department1 = new Department("IT", new Department.Address("Lviv","Yevhena Konovaltsia",21));

        System.out.println(department1);

        Department department2 = department1.copy();

        department2.getAddress().setCity("Kiev");

        department2.getAddress().setBuilding(40);

        System.out.println(department2);

    }
}
