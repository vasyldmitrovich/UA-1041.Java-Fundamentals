package com.softserve.edu04.hw.task5;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jessie", 6);
        Dog dog2 = new Dog("Richard", 10);
        Dog dog3 = new Dog("Alfie", 12);
        Dog.checkName(dog1, dog2, dog3);
        Dog.getOldest(dog1, dog2, dog3);
    }
}
