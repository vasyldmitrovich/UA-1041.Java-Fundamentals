package com.softserve.edu07.pt.pt01;

public class App {
    public static void main(String[] args) {
        Animal[] arr = {
                new Dog("Lucky"),
                new Dog ("Richy"),
                new Cat("Angel"),
                new Cat("Lady"),
        };
        for (Animal animal : arr){
            System.out.println(animal);
            animal.voice();
            animal.feed();
            System.out.println("=====================");
        }
    }


}
