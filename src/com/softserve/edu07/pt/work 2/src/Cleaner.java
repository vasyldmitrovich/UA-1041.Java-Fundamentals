public class Cleaner extends Staff {
    final String TYPE_PERSON = "cleaner ";

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + getName());
    }

    @Override
    public void salary() {
        System.out.println("My salary is $" + getSalary());
    }

    public Cleaner(String name, int salary) {
        super(name, salary);
    }
}
