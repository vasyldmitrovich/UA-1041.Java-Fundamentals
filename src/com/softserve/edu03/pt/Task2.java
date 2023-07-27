package com.softserve.edu03.pt;

public class Task2 {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setName("Egor");
        person1.setRate(3400);
        person1.setHours(89);
        System.out.println(person1);

        Employee person2 = new Employee("Maxim", 2500);
        person2.setHours(50);
        System.out.println(person2);

        Employee person3 = new Employee("Roman", 1800, 90);
        System.out.println(person3);
    }
}

class Employee{
    private String name;
    private double rate;
    private double hours;

    static int totalSum = 0;

    public Employee() {
        totalSum++;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        totalSum++;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if(rate > 0)
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours > 0)
        this.hours = hours;
    }

    public double getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee:\n" +
                "name: '" + name + '\'' +
                "\nrate: " + rate +
                "\nhours: " + hours +
                "\nsalary: " + this.getSalary() +
                "\nbonuses: " + this.getBonuses() +
                '\n';
    }

    public double getBonuses(){
        return this.getSalary() * 0.1;
    }
}
