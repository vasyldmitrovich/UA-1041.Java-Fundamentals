package com.softserve.edu08.Practica.task1;

public class Main {
public static void main(String[] args) {
    Department department1 = new Department(
            "University", new Department.Address("Dnipro", "Shevchenko", 18)
                );
    Department department2 = department1.clone();
    department2.address.city = "Lviv";
    System.out.println(department1);
    System.out.println(department2);

}
}
