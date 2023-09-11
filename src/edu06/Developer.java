package edu06;

public class Developer extends Employee {
    private String position;

    public Developer() {
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format(
                "Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f.",
                super.getName(), super.getAge(), position, super.getSalary());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Position='" + position + '\'' + ", " + super.toString() +
                '}';
    }
}

