package com.softserve.edu07.pr;

class Teacher extends Staff {
    static final String TYPE_PERSON = "Teacher";
    static final int MONEY = 30000;//If variable is final then should be in uppercase style

    public Teacher(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }

    @Override
    void salary() {
        System.out.println("My salary is " + MONEY);
    }
}
