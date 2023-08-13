package com.softserve.edu07.pt.task_2;

public class Cleaner extends Staff {
    public final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
    }

    public Cleaner(String name) {
        super(name);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("My salary is 10000 uah");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
