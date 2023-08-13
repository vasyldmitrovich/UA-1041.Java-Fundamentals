package com.softserve.edu07.pt.Task1;

public class Cat implements Animal{
    int numberOfCat;

    public Cat(int numberOfCat) {
        this.numberOfCat = numberOfCat;
    }

    @Override
    public void voice() {
        System.out.println("the cat № "+ numberOfCat +" meowed");
    }

    @Override
    public void feed() {
        System.out.println("the cat № "+ numberOfCat +" ate");
    }
}
