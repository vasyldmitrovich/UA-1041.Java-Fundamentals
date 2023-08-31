package com.softserve.edu06.Homework.Task2;



public class Developer extends Employee {
    private  String Position;


    public Developer(String name, int age, double salary, String Position) {
        super(name, age, salary);
        this.Position = Position;
    }


    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s" +
                "Salary: \u20B4 %.2f.", name, age, Position +"\t", salary);
    }

}
