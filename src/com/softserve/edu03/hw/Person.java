package com.softserve.edu03.hw;

// third task

import java.util.Scanner;

public class Person {
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
    public void output () {

        System.out.println(firstName + lastName);
    }
    public void input() {

    }

    public void changeName(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
public static void createPerson (Person person) {
    System.out.println("Input First name: ");
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.nextLine();
    System.out.println("Input last name: ");
    String lastName = scanner.nextLine();
    person.setFirstName(firstName);
    person.setLastName(lastName);
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


}
