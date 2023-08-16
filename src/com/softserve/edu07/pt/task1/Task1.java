package com.softserve.edu07.pt.task1;

public class Task1 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(),new Cat()};

        for (var animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
