package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox> dynamicArray = new ArrayList<>();
        dynamicArray.add(new HeavyBox(1, "A"));
        dynamicArray.add(new HeavyBox(3, "B"));
        dynamicArray.add(new HeavyBox(2, "C"));
        dynamicArray.add(new HeavyBox(2, "B"));

        System.out.println(dynamicArray);

        var firstElement = dynamicArray.get(0);
        firstElement.setWeight(firstElement.getWeight() + 1);

        dynamicArray.remove(dynamicArray.size() - 1);

        System.out.println("==========================");
        System.out.println(dynamicArray);

        dynamicArray.clear();

        System.out.println("==========================");
        System.out.println(dynamicArray);
    }
}
