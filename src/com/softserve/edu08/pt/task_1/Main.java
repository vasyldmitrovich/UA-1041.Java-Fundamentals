package com.softserve.edu08.pt.task_1;

public class Main {
    public static void main(String[] args) {
        Department department1 = new Department("development department","Kyiv","Geroiv Nebesnoi sotni",20);
        Department department2=department1.clone();
        department2.setCity("Lviv");
        System.out.println(department1);
        System.out.println(department2);

    }
}
