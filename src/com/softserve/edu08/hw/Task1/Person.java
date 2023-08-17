package com.softserve.edu08.hw.Task1;

abstract public class Person  {
    FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void info(){
        System.out.println("First name: <"+fullName.getFirstName()+">, Last name: <"+fullName.getLastName()+">, Age: <"+age+">");
    }
    public String activity(){
        return "activity";
    }
}
