package edu06.hw;

class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi cannot fly");
    }
}
