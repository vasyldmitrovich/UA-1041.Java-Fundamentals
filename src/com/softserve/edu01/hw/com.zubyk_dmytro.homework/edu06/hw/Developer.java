package edu06.hw;

class Developer extends Employee {//Move to another file like Developer.java
    private String position;

    //Add constructor without parameters

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    //Add getters and setters

    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, " + "Salary: \u20B4 %.2f", getName(), getAge(), position, getSalary());

    }


}
