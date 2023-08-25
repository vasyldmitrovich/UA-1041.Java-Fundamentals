package com.softserve.edu08.hw.Task1;

abstract public class Person  {
    private FullName fullName; //Make field private
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("First name: <"+fullName.getFirstName()+">, Last name: <"+fullName.getLastName()+">, Age: <"+age+">");
    }
    public String activity(){
        return "activity";
    }

    //I suppose FullName class should be here, it should be inner
}
