package com.softserve.edu08.pt.Task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department=new Department("Alex",new Department.Address("Lviv","Chornovola",13));
        Department department1=department.clone();
        department1.getAddress().setCity("Kuba");
        System.out.println(department);
        System.out.println(department1);
    }
}
