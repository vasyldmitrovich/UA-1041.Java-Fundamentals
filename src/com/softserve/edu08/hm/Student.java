package com.softserve.edu08.hm;

class Student extends Person implements Cloneable {
    int course;//Write access modifier private for fields

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    String info() {
        return super.info() + "\ncourse: " + course;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

