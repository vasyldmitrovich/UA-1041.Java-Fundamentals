package com.softserve.edu06.hm;


abstract class Bird {

    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}

class FlyingBird extends Bird{

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly");
    }
}

class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can't fly");
    }
}

class Eagle extends FlyingBird{

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}

class Sparrow extends FlyingBird{

    public Sparrow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    void fly() {
        System.out.println("Sparrow can fly");
    }
}

class Penguin extends NonFlyingBird{

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }
}

class Kiwi extends NonFlyingBird{

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    void fly() {
        System.out.println("Kiwi can't fly");
    }
}

