package com.softserve.edu03.pt.Task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private int salary;
    private int bonuses;

    //methods like this should be in the end of class
    static int totalSum(int... nums) {
        int sum = 0;
        for (int num : nums
        ) {
            sum += num;
        }
        return sum;
    }

    public Employee() {

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    int getSalary(int rate, int hours) {
        return rate * hours;
    }

    double getBonuses() {
        return salary * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    //Create class for example App.java where will be main method, not there
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100, 23);
        Employee emp2 = new Employee("Fedor", 172, 36);
        Employee emp3 = new Employee("Misha", 89, 43);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);


        emp1.setSalary(emp1.getSalary(emp1.rate, emp1.hours));
        emp2.setSalary(emp2.getSalary(emp2.rate, emp2.hours));
        emp3.setSalary(emp3.getSalary(emp3.rate, emp3.hours));

        int sum = totalSum(emp1.getSalary(), emp2.getSalary(), emp3.getSalary());
        System.out.println("Total salary of employees are:" + sum);
    }
}
