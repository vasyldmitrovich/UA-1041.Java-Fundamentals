package com.softserve.edu03.hw.task_3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int currentYear;


    {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        Person.setCurrentYear(year);
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public static int getCurrentYear() {
        return currentYear;
    }

    private static void setCurrentYear(int year) {
        currentYear = year;
    }

    public static int getAge(Person person) {
        return getCurrentYear() - person.birthYear;
    }

    public static Person input() {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("input first name:");
        person.setFirstName(sc.nextLine());
        System.out.print("input last name:");
        person.setLastName(sc.nextLine());
        System.out.print("input the birthday year:");
        person.setBirthYear(sc.nextInt());
        return person;
    }

    public static void output(Person person) {

        System.out.println("Person \nfirst name: " + person.getFirstName());
        System.out.println("last name: " + person.getLastName());
        System.out.println("birthday year :" + person.getBirthYear());
        System.out.println("age :" + getAge(person));

    }

    public void changeName(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }


}
