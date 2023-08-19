package com.softserve.edu08.hw.task_1_2;

public class Student extends Person implements Cloneable {
    private int courseNumber;

    public Student() {
    }

    public Student(FullName fullName, int age, int courseNumber) {
        super(fullName, age);
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String info() {
        return "the course the student:" + this.courseNumber + ", " + super.info();
    }

    @Override
    public String activity() {
        return "I study at university the course:" + this.courseNumber;
    }

    @Override
    public Student clone() {
        try {
            var res = (Student) super.clone();
            res.fullName = fullName.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
