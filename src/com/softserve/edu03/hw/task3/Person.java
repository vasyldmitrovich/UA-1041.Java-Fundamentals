package com.softserve.edu03.hw.task3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    static final Scanner SC = new Scanner(System.in);

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

    public int getAge() {
        return 2023 - birthYear;
    }

    public void input() {
        System.out.print("Input the Firstname of the person: ");
        String firstName1 = SC.nextLine();
        setFirstName(firstName1);
        System.out.print("Input the Lastname of the person: ");
        String lastName1 = SC.nextLine();
        setLastName(lastName1);
        System.out.print("Input the birth year of the person: ");
        int birthYear1 = SC.nextInt();
        setBirthYear(birthYear1);
    }

    public void output() {
        System.out.println("The Firstname of the person is: " + getFirstName());
        System.out.println("The Lastname of the person is: " + getLastName());
        System.out.println("The birth year of the person is: " + getBirthYear());
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        Person person2 = new Person();
        person2.input();
        Person person3 = new Person();
        person3.input();
        Person person4 = new Person();
        person4.input();
        Person person5 = new Person();
        person5.input();
    }
}
