package edu7.pt;

// Class Cat implementing Animal
class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating.");
    }
}
