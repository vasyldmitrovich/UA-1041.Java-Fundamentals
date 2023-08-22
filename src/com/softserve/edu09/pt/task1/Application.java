package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(5, "Apple"));
        boxes.add(new HeavyBox(9, "Banana"));
        boxes.add(new HeavyBox(4, "Apple"));
        boxes.add(new HeavyBox(12, "Orange"));
        boxes.add(new HeavyBox(7, "Cherry"));
        boxes.add(new HeavyBox(15, "Melon"));

        showInfo(boxes);

        boxes.get(0).setWeight(1);
        boxes.remove(boxes.size() - 1);
        showInfo(boxes);

        boxes.clear();
        showInfo(boxes);
    }

    public static void showInfo(List<HeavyBox> list){
        for (HeavyBox box : list){
            System.out.println(box);
        }
        System.out.println("======================");
    }

}