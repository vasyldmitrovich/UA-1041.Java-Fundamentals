package edu8.hw;

abstract class Person {
    protected FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFisrtName() + "Last name: " + fullName.getLastname() + ", Age: " + age;
    }

    public abstract String activity();
}
