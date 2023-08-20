package com.softserve.edu07.pt.task1;

public class App {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
        };
        for (var an : animals) {
            an.voice();
            an.feed();
        }

    }
}
