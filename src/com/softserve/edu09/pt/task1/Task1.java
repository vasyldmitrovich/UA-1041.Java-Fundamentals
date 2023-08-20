package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(10, "tools"));
        boxes.add(new HeavyBox(60, "table"));
        boxes.add(new HeavyBox(25, "electronics"));


        System.out.println(boxes);

        HeavyBox first = boxes.get(0);
        first.setWeight(first.getWeight() + 1);

        System.out.println("After updating first element");
        System.out.println(boxes);



        boxes.remove(boxes.size() - 1);

        System.out.println("After deleting last element");
        System.out.println(boxes);


        boxes.clear();

        System.out.println("After removing all elements");
        System.out.println(boxes);
    }
}
