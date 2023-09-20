package edu06.hw;

class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
