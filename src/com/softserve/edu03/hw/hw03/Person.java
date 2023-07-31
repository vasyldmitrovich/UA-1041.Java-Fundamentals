package com.softserve.edu03.hw.hw03;

import java.util.Scanner;

public class Person {
    static Scanner SCANNER = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

    //After fields should go constructor, after getters and setters and after another methods
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

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return 2023 - birthYear;
    }

    public void input() {
        System.out.print("Enter your first name: ");
        this.firstName = SCANNER.nextLine();
        System.out.print("Enter your last name: ");
        this.lastName = SCANNER.nextLine();
        System.out.print("Enter your birth year: ");
        this.birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
