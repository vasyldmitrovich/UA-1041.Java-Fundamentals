package edu06.hw;


public class task1 {//This class should have name like App.java
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
