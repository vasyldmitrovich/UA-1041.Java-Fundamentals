package com.softserve.edu11.pt.task_2;

public class FullName {
    private String FirstName;
    private String MiddleName;
   private String LastName;

    public FullName() {
    }

    public FullName(String firstName, String middleName, String lastName) {
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
