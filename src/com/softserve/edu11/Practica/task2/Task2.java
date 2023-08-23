package com.softserve.edu11.Practica.task2;

public class Task2 {
    public static void main(String[] args) {
        String firstName = "Alyona";
        String lastName = "Molchanova";
        String middleName = "Olegivna";
        String s1 = "%s %c. %c.".formatted(
                lastName, firstName.charAt(0),
                middleName.charAt(0)
        );
        System.out.println(s1);
        String s2 = "%s %s %s".formatted(
                firstName,middleName,lastName
        );
        System.out.println(s2);
        String s3 = "%s".formatted(
                firstName
        );
        System.out.println(s3);
    }

}