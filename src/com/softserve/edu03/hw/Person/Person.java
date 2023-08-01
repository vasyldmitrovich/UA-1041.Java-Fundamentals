package com.softserve.edu03.hw.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    Scanner sc = new Scanner(System.in);

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = formatNames(firstName);
        this.lastName = formatNames(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = formatNames(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = formatNames(lastName);
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    int calcAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null)) {
            return Period.between(dob, curDate).getYears();
        }
        return -1;
    }

    protected void input() {
        System.out.println("Hey, please fulfill next information");
        System.out.println("What is your first name: ");
        this.firstName = sc.nextLine();
        System.out.println("What is your last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter your birth year in this format YYYY-MM-DD: ");
        String dataInfo = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dob = LocalDate.parse(dataInfo, dtf);

    }

    public void output() {
        System.out.println("\nOutputting info about " + this.firstName + " " + this.lastName + "\n");
        System.out.println("Your first name is:" + this.firstName + "\nYour last name is: " + this.lastName + "\nYou were born on: " + dob + "\nYour current age is: " + calcAge(this.dob));
    }

    protected void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    static String formatNames(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
