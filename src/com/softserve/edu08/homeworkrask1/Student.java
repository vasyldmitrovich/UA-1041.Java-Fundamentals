package com.softserve.edu08.homeworkrask1;

public class Student extends Person {
    private int numberOfCourse;

    public Student(FullName fullName, int age, int numberOfCourse) {
        super(fullName, age);
        this.numberOfCourse = numberOfCourse;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    @Override
    public String activity() {
        return "I study in university";
    }

    @Override
    public String info() {
        return super.info() + ", Course number: " + numberOfCourse;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        super.clone();
        return new Student(getFullName(), getAge(), numberOfCourse);
    }
}
