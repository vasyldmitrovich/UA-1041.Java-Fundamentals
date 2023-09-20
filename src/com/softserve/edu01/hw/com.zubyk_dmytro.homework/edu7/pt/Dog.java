package edu7.pt;

// Class Dog implementing Animal
class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating.");
    }
}
