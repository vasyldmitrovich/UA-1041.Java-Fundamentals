package com.softserve.edu08.hw.Task1;

public class Main {
    public static void main(String[] args) {

        Person person=new Person(new FullName("cdcs","sdc"),12) {
            @Override
            public void info() {
                super.info();
            }

            @Override
            public String activity() {
                return super.activity();
            }
        };
        person.info();

    }
}
