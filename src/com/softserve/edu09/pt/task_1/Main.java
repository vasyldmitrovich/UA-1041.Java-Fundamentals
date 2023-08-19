package com.softserve.edu09.pt.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(50, "First"));
        heavyBoxes.add(new HeavyBox(10, "Second"));
        heavyBoxes.add(new HeavyBox(30, "Third"));
        System.out.println(heavyBoxes);

        heavyBoxes.get(1).setWeight(1);
        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println(heavyBoxes);

        heavyBoxes.clear();
        System.out.println(heavyBoxes);
    }
}
