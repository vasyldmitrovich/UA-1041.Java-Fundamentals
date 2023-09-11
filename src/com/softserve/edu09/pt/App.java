package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(3, "Candy"));
        boxes.add(new HeavyBox(4, "Ice cream"));
        boxes.add(new HeavyBox(5, "Cookies"));
        boxes.add(new HeavyBox(3, "Bun"));
        boxes.add(new HeavyBox(5, "Gingerbread"));

        //in the task we do the same loop twice, how can it be added to the loop?
        //    public void printResult() {
        for (var box : boxes) {
            System.out.println(box);
        }
        //  }

        boxes.get(0).setWeight(1);

        boxes.remove(boxes.size() - 1);
        System.out.println();
        System.out.println("Changed list");

        for (var box : boxes) {
            System.out.println(box);
        }

        System.out.println();
        System.out.println("Clear list");
        boxes.removeAll(boxes);

        System.out.println(boxes);

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        //       Task_2.getNumbersArray();

        // Task 3
        System.out.println();
        System.out.println("Task 3");
        Task_3.getRandom();
    }
}
