package com.softserve.edu06.practicaltask1;

public class Sedan extends Car {
    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
        super.run();
    }//If logic there do not change than do not override this method here

    @Override
    public void stop() {
        super.stop();
    }
}
