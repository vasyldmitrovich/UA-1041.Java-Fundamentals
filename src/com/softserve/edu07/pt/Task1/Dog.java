package com.softserve.edu07.pt.Task1;

public class Dog implements Animal{
    int NumberOfDog;//Make private

    public Dog(int numberOfDog) {
        NumberOfDog = numberOfDog;
    }

    @Override
    public void voice() {
        System.out.println("the dog № "+ NumberOfDog +" barked");
    }

    @Override
    public void feed() {
        System.out.println("the dog № "+ NumberOfDog +" ate");
    }
}
