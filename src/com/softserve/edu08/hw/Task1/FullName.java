package com.softserve.edu08.hw.Task1;

public class FullName {

    private String firstName;
    private String lastName;

    //Add constructor without parameters

    //And move constructor with parameters here

    public  String getFirstName() {
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

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Add equals hashCode and toString here
}
