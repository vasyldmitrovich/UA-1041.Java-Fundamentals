package com.softserve.edu08.Homework.task1;

public abstract class Person {
    private FullName fullname;
    private int age;


    public Person(FullName fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
            System.out.println(fullname.getFirstName() + " " + fullname.getLastName() + ", " + age);
        return null;
    }

    public abstract String activity();
        //return "activity";




}