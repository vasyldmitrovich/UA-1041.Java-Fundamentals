package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();

        Person person2 = new Person("Egor", "Pupkin");
        person2.input();
        person2.output();

        Person person3 = new Person("Maxim", "First");
        person3.input();
        person3.output();
        person3.changeName("Max", "Second");
        person3.output();

        Person person4 = new Person();
        person4.input();
        person4.changeName("person 4", "changed");
        person4.output();

        Person person5 = new Person("Vovka", "Stupenko");
        person5.input();
        person5.output();
    }
}

class Person{
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
        if(birthYear > 1900 && birthYear < 2024)
        this.birthYear = birthYear;
        else
            System.out.println("Incorrect data");
    }

    public int getAge(){
        return 2023 - birthYear;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        if(firstName == null && lastName == null){
            System.out.print("Input first name: ");
            firstName = sc.nextLine();
            System.out.print("Input last name: ");
            lastName = sc.nextLine();
        }
        System.out.print("Input birthday: ");
        this.setBirthYear(sc.nextInt());
    }

    public void output(){
        System.out.println("\n====================");
        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Age: " + this.getAge());
        System.out.println("====================\n");
    }

    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
}