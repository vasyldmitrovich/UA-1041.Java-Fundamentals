package com.softserve.edu06.hw;

abstract class Bird {

    String feathers;
    int layEggs;

    public Bird() {
    }

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

class FlyingBird extends Bird {
    public FlyingBird() {
    }

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Flying bird.");
    }
}

class NonFlyingBird extends Bird {

    public NonFlyingBird() {
    }

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Non flying bird.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
    }

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle flies.");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
    }

    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Swallow flies.");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
    }

    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin doesn't fly.");
    }
}

class Kiwi extends NonFlyingBird {

    public Kiwi() {
    }

    public Kiwi(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi doesn't fly.");
    }
}