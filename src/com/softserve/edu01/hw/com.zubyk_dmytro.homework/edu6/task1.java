package edu6;
import java.util.Scanner;
import java.util.Arrays;

abstract class Bird{
    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean hasFeathers(){
        return feathers;
    }

    public boolean laysEggs(){
        return layEggs;
    }

}

class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

}

class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird cannot fly");
    }
}

class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}

class Swallow extends FlyingBird{

    public Swallow(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow can fly");
    }
}

class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguin cannot fly");
    }
}

class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi cannot fly");
    }
}
public class task1 {
    public static void main(String[] args){
        Bird[] birds = new Bird[4];
        birds[0] =  new Eagle(true, true);
        birds[1] =  new Swallow(true, true);
        birds[2] =  new Penguin(true, true);
        birds[3] =  new Kiwi(true, true);

        for(Bird bird: birds){
            System.out.println("Feathers: " + bird.hasFeathers() + " lays eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println();
        }

    }
}
