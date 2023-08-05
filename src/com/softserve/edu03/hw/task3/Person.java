package com.softserve.edu03.hw.task3;
//In first line was bad package
import java.util.Scanner;

public class Person {
    //Do not correct order
    // firstly should be private variable, after static, after constructors, after getters and setters and after another methods
    private String firstName;
    private String lastName;
    private int birthYear;

    static Scanner SCANNER=new Scanner(System.in);
    static private int totalPeople;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
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
        this("N/A","N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalPeople++;
    }
    public void getAge(){
        System.out.println();
        System.out.println("you are: "+(2023-birthYear));
        System.out.println();

    }

    /**
     * this method request information about people and takes information from console
     */
    void input(){
        System.out.println("Your first name: ");
        firstName=SCANNER.nextLine();
        System.out.println("Your last name: ");
        lastName=SCANNER.nextLine();
        System.out.print("Your year of birth: ");
        birthYear=SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println();
    }

    /**
     * this method display information about people
     */
    void output(){
        System.out.println("Your first name: "+(firstName));

        System.out.println("Your last name: "+(lastName));

        System.out.println("Your year of birth: "+(birthYear));
        System.out.println();

    }

    //this method do not work correct, should be this.fn=ln etc...
    public void changeName(String fn, String ln){
        String the_Third_Cup;
        the_Third_Cup=fn;
        this.firstName=ln;
        this.lastName=the_Third_Cup;
    }

    //Move this method to class like App.java

}