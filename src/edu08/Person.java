package edu08;

public abstract class Person {
    FullName fullName;
    private int age;

    public Person() {

    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: <" + this.fullName.getFirstName() + ">, Last name: <" + this.fullName.getLastName() + ">, Age: <" + this.age + ">";
    }

    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }
}

