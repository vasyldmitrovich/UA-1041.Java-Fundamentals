package com.softserve.edu08.pt.task1_task2;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() + ", Course:" + course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student copy() {
        try {
            Student newStudent = (Student) this.clone();
            newStudent.setFullName(this.getFullName().copy());

            return newStudent;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
