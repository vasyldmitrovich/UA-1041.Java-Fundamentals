package com.softserve.edu03.hm;

import java.time.Year;
import java.util.Scanner;

public class Person {

    private int birthYear;
    private String firstName;
    private String lastName;
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

    public int setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return birthYear;
    }

    public Person() {
        this("NoFirstName", "NoLastName");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void input(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = sc.nextLine();
        person.setFirstName(name);
        System.out.println("What is your surname?");
        String surname = sc.nextLine();
        person.setLastName(surname);
        System.out.println("What is your birth year?");
        int birth = sc.nextInt();
        person.setBirthYear(birth);
    }
    public static void output(Person person){
        System.out.println(person);
    }
    public int getAge(){
        int yearNow = Year.now().getValue();
        int age = yearNow - birthYear;
        return age;
    }
    public String toString() {
        return "Person{" +
                "name=" + firstName +
                ", surname=" + lastName +
                ", age=" + getAge() +
                '}';
    }
    public void changeName(String fn, String ln){
        setLastName(fn);
        setLastName(ln);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        Person.input(person1);
        Person.output(person1);

        Person person2 = new Person();
        Person.input(person2);
        Person.output(person2);

        Person person3 = new Person();
        Person.input(person3);
        Person.output(person3);

        Person person4 = new Person();
        Person.input(person4);
        Person.output(person4);

        Person person5 = new Person();
        Person.input(person5);
        Person.output(person5);
    }
}
