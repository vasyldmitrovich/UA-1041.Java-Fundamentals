package com.softserve.edu08.hw.Task2;

import com.softserve.edu08.hw.Task1.FullName;
import com.softserve.edu08.hw.Task1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    //Where is constructor without parameters?

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    //Getters and setters should be here

    @Override
    public void info() {
        super.info();
        System.out.println("course: "+course);
    }

    @Override
    public String activity() {
       return "I study at university";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
