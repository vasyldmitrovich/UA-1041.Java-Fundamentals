package com.softserve.edu08.hw.Task2;

import com.softserve.edu08.hw.Task1.FullName;
import com.softserve.edu08.hw.Task1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("course: "+course);
    }

    @Override
    public String activity() {
       return "I study at university";
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
