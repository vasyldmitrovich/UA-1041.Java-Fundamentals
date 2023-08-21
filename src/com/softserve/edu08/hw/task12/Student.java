package com.softserve.edu08.hw.task12;

public class Student extends Person implements Cloneable {
    private int course;

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
    public String info() {
        return "First name: " + getFullName().getFirstName() + ", Last name: " + getFullName().getLastName() + ", Age: " + getAge() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    @Override
    public Student clone() {
        try {
            Student res = (Student) super.clone();
            res.setFullName(res.getFullName().clone());
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
