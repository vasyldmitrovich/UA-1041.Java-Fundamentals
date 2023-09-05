package com.softserve.edu11.pt.task2;

public class App {
    public static void main(String[] args) {
        String firstName = "Anton";
        String lastName = "Nadieiko";
        String middleName = "Mykolayovych";

        System.out.println(String.format("%s %c. %c.", lastName, firstName.charAt(0), middleName.charAt(0)));
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
