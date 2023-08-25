package com.softserve.edu07.pt.Task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
           
            animals[0] = new Cat(1);
            animals[1] = new Dog(2);
            animals[2] = new Cat(3);
            animals[3] = new Dog(4);


        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }

    }
}
