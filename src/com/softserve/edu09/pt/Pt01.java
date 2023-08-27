package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class Pt01 {
    public static void main(String[] args) {
        List<HeavyBox> dynamicArray = new ArrayList<>();
        dynamicArray.add(new HeavyBox(14, "A"));
        dynamicArray.add(new HeavyBox(5, "B"));
        dynamicArray.add(new HeavyBox(7, "C"));
        dynamicArray.add(new HeavyBox(9, "D"));
        dynamicArray.add(new HeavyBox(4, "E"));

        for (var el : dynamicArray) {
            System.out.println(el);
        }

        System.out.println("\nChange the weight of the first box by 1\n");

        var el = dynamicArray.get(0);
        el.setWeight(el.getWeight() + 1);

        for (var all : dynamicArray) {
            System.out.println(all);
        }

        System.out.println("\nRemove the last box\n");

        dynamicArray.remove(dynamicArray.size() - 1);

        for (var all : dynamicArray) {
            System.out.println(all);
        }

        System.out.println("\nRemove all boxes\n");
        dynamicArray.clear();
        System.out.println(dynamicArray);

    }


}
