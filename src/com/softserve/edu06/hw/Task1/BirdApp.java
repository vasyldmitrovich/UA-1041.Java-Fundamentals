package com.softserve.edu06.hw.Task1;

import com.softserve.edu06.hw.Task1.FlyingBirds.Eagle;
import com.softserve.edu06.hw.Task1.FlyingBirds.Swallow;
import com.softserve.edu06.hw.Task1.NonFlyingBirds.Kiwi;
import com.softserve.edu06.hw.Task1.NonFlyingBirds.Penguin;

public class BirdApp {
    static int lengthOfLine = 30;
    static Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

    public static void main(String[] args) {
        printBirdsInfo();
    }

    public static void printBirdsInfo() {
        for (Bird bird : birds
        ) {
            System.out.println("-".repeat(lengthOfLine));
            System.out.println(bird.getInfo());
            System.out.println("\n");
            bird.fly();

            System.out.println("-".repeat(lengthOfLine));
        }
    }
}
