package com.softserve.edu08.hm;

class MainPerson {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Mary", "Smith"), 25, 2);
        Student student2 = new Student(new Person.FullName("John", "Collins"), 30, 3);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = (Student) student1.clone();
        System.out.println(student3.info());
        student3.course = 4;
        System.out.println(student3.info());

    }
}

abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    String info() {
        return "First name:" + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    abstract public String activity();

    static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}

class Student extends Person implements Cloneable {
    int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    String info() {
        return super.info() + "\ncourse: " + course;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
