package com.softserve.edu03.hw;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    // Constructors
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Methods
    public int getAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            lastName = ln;
        }
    }
}