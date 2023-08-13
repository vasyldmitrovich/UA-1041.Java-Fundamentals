package com.softserve.edu07.pt.task_2;

public class Teacher extends Staff {
    public final String TYPE_PERSON = "Teacher";

    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("My salary is 30000 uah");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
