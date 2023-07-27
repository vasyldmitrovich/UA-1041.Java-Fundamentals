package com.softserve.edu03.task3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {

    private static Scanner SCANNER = new Scanner(System.in);

    private String firstName;
    private String lastName;

    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public void changeName(String fn, String ln) {
        this.firstName = fn;

        this.lastName = ln;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        return now.getYear() - birthYear;
    }

    public void input() {
        System.out.print("Enter fist name: ");
        this.firstName  = SCANNER.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = SCANNER.nextLine();

        System.out.print("Enter birthYear: ");
        this.birthYear = SCANNER.nextInt();
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }
}
