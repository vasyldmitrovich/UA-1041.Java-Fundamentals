package com.softserve.edu06.hw.Task2;

public class Developer extends Employee{
    String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age,salary);
        this.position = position;

    }


    @Override
    public String report() {
       return String.format( "Name:%s,  Age:%d,  Position:%s"+", Salary:%.2f\uD83D\uDCB2",getName(),getAge(),position,getSalary());
    }
}
