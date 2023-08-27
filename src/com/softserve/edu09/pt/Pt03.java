package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pt03 {

    public static void main(String[] args) {
        var rnd = new Random(1);
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(30));
        }
        System.out.println("Random collection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("All positions of element more than 5: " + newCollection);

        var it = myCollection.iterator();
        while (it.hasNext()) {
            var el = it.next();
            if (el > 20) {
                it.remove();
            }
        }
        System.out.println("Remove from elements, which are greater then 20: " + myCollection);

        System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5:");

        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sort collection: " + myCollection);


    }


}
