public abstract class Staff extends Person {
    private int salary;

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public abstract void salary();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
