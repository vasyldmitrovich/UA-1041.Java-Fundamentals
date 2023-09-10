package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{
    private int courseNumber;

    public Student() {
        this.courseNumber = 1;
    }

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    @Override
    String activity() {
        return "I study at university";
    }

    @Override
    String info() {
        var msgStudent = super.info() + ", Course: " + courseNumber;
        return msgStudent;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}
