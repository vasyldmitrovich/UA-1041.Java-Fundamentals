package com.softserve.edu09.practicaltask1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(10, "Tools"));
        boxes.add(new HeavyBox(15, "Books"));
        boxes.add(new HeavyBox(20, "Coal"));
        boxes.add(new HeavyBox(15, "Wheel"));
        boxes.add(new HeavyBox(12, "Computer"));

        for (var boxList : boxes) {
            System.out.println(boxList);
        }

        System.out.println("Added \"1\" to first box");

        if (!(boxes.isEmpty())) {
            HeavyBox boxOne = boxes.get(0);
            boxOne.setWeight(boxOne.getWeight() + 1);
        }

        for (var boxList : boxes) {
            System.out.println(boxList);
        }

        System.out.println("Remove the last box");

        boxes.remove(boxes.size() - 1);

        for (var boxList : boxes) {
            System.out.println(boxList);
        }

        System.out.println("Delete all boxes");

        boxes.removeAll(boxes);

        for (var boxList : boxes) {
            System.out.println(boxList);
        }
    }
}
