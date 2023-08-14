package com.softserve.edu07.pr;

class Cleaner extends Staff {
    static final String TYPE_PERSON = "Cleaner";
    static final int money = 20000;

    public Cleaner(String name) {
        super(name);
    }

    @Override
    protected void printInternal() {
        System.out.println(String.format("I am %s %s", name, TYPE_PERSON));
    }

    @Override
    void salary() {
        System.out.println("My salary is " + money);
    }
}
