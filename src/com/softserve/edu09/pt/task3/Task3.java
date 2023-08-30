package com.softserve.edu09.pt.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        var rand = new Random();
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(35));
        }
        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
        var it = myCollection.iterator();
        while (it.hasNext()) {
            var el = it.next();
            if (el > 20) {
                it.remove();
            }
        }
        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        Collections.sort(myCollection);

        System.out.println(myCollection);

    }
}
