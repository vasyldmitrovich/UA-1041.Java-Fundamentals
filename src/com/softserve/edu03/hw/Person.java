package com.softserve.edu03.hw;

import java.time.Year;

import static com.softserve.edu03.hw.App.SCANNER;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String fn;
    private String ln;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void input(Person person) {
        System.out.print("What is your firstname? ");
        String firstName = SCANNER.nextLine();
        person.setFirstName(firstName);
        System.out.print("What is your lastname? ");
        String lastName = SCANNER.nextLine();
        person.setLastName(lastName);
        System.out.print("Input birth year of '" +
                firstName + " " + lastName + "': ");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        person.setBirthYear(birthYear);
    }

    public static void output(Person person) {
        int birthYear1 = person.getBirthYear();
        String firstName1 = person.getFirstName();
        String lastName1 = person.getLastName();
        if (person.getAge(birthYear1) == Year.now().getValue()) {
            System.out.println(firstName1 + " " + lastName1 + "(The year of birth is entered incorrectly, so it is impossible to determine the age.)");
        } else {
            System.out.println(firstName1 + " " + lastName1 + " (age is " + person.getAge(birthYear1) + ").");
        }
    }

    public int getAge(int birthYear) {
        this.birthYear = birthYear;
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void changeName(String fn, String ln) {
        if (fn == null) {
            this.fn = firstName;
        } else {
            this.fn = fn;
        }
        if (ln == null) {
            this.ln = lastName;
        } else {
            this.ln = ln;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (fn == null) {
            this.firstName = firstName;
        } else {
            this.firstName = fn;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (ln == null) {
            this.lastName = lastName;
        } else {
            this.lastName = ln;
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 1800 && birthYear < Year.now().getValue()) {
            this.birthYear = birthYear;
        }
    }
}
