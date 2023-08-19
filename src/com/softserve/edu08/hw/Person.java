package com.softserve.edu08.hw;

public abstract class Person implements Cloneable{
    private int age;
    private FullName fullName = new FullName();

    public Person() {

    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    public String info(){
        String firstName = this.fullName.firstName;
        String lastName = this.fullName.lastName;
        return String.format("First name: %s, Last name: %s, Age: %d", firstName, lastName,age);
    }
    public abstract String activity();

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            clone.fullName = fullName.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new  RuntimeException(e);
        }
    }

    public static class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName() {
        }

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public FullName clone() {
            try {
                return (FullName) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new  RuntimeException(e);
            }
        }
    }
}
