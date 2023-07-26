package com.softserve.edu03.HW3;

import static com.softserve.edu03.HW3.HW3.SCANNER;

public class Person {

    private String firstName;
    private String lastName;
    static private int birthYear;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void printPersonAge() {
        System.out.println("Person age: " + Person.getAge());
    }
    public static void promptParameters(Person person) {
        System.out.println("Input your first name: ");
        String firstName = SCANNER.nextLine();
        person.setFirstName(firstName);
        System.out.println("Input your last name: ");
        String lastName = SCANNER.nextLine();
        person.setLastName(lastName);
        System.out.println("Input your birthday year: ");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        person.setBirthYear(birthYear);
    }

    static public int getAge(){
        return 2023 - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
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


}
