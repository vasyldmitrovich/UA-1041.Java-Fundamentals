package edu06.hw;

/*ALL CLASS SHOULD BE IN UNIQUE FILE,
 * Do not write all classes in one file, this practice is not good*/
abstract class Bird {
    boolean feathers;//Make fields private
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    //Write getters and setters for manipulation fields

    public abstract void fly();

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }

}
