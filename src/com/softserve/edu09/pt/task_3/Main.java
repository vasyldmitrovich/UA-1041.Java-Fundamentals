package com.softserve.edu09.pt.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        addRandomNumbers(myCollection);
        System.out.println(myCollection);

        //• Find and save in list newCollection all positions of element more than 5
        List<Integer> newCollection = findMore5(myCollection);
        System.out.println(newCollection);

        //• Insert elements 1, -3, -4 in positions 2, 8, 5.
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
        }

        //• Sort and print collection.
        Collections.sort(myCollection);
        System.out.println(myCollection);

        //• Remove from collection myCollection elements, which are greater then 20
        removeMore20(myCollection);
        System.out.println(myCollection);


    }

    private static void removeMore20(List<Integer> myCollection) {
        var iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            var el = iterator.next();
            if (el > 20) {
                iterator.remove();
            }
        }


    }

    private static List<Integer> findMore5(List<Integer> myCollection) {
        List<Integer> newCollection = new ArrayList<>();
        for (var el : myCollection
        ) {
            if (el > 5) {
                newCollection.add(el);
            }
        }
        return newCollection;
    }

    private static void addRandomNumbers(List<Integer> myCollection) {

        for (int i = 0; i < 10; i++) {
            myCollection.add(i, RANDOM.nextInt(-20, 100 + 1));
        }
    }
}
