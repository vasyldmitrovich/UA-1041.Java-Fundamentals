package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3 {
    public static void getRandom() {
        System.out.println("Random collection");
        var rnd = new Random();

        List<Integer> newCollection = new ArrayList<>();
        int count = 10;
        for (int i = 0; i < count; i++) {
            newCollection.add(rnd.nextInt(0, 31));
        }
        System.out.println(newCollection);

        System.out.println();
        System.out.println("New collection with numbers more then 5.");
        List<Integer> newCollection2 = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (newCollection.get(i) > 5) {
                newCollection2.add(newCollection.get(i));
            }
        }
        System.out.println(newCollection2);

        System.out.println();
        System.out.println("New collection with numbers less then 20.");
        for (int i = 0; i < newCollection2.size(); i++) {
            if (newCollection2.get(i) >= 20) {
                newCollection2.remove(i);
                i--;
            }
        }
        System.out.println(newCollection2);

        System.out.println();
        System.out.println("New collection with new elements.");
        if (newCollection2.size() >= 2) {
            newCollection2.add(2, 1);
        } else {
            System.out.println("Can't added element on the 2 position. ");
        }
        if (newCollection2.size() >= 8) {
            newCollection2.add(8, -3);
        } else {
            System.out.println("Can't added element on the 8 position. ");
        }
        if (newCollection2.size() >= 5) {
            newCollection2.add(5, -4);
        } else {
            System.out.println("Can't added element on the 5 position. ");
        }
        for (int i = 0; i < newCollection2.size(); i++) {
            System.out.println("position – " + i +
                    ", value of element – " + newCollection2.get(i));
        }

        System.out.println();
        System.out.println("Sort collection.");

        newCollection2.sort(Integer::compare);
        System.out.println(newCollection2);
    }
}
