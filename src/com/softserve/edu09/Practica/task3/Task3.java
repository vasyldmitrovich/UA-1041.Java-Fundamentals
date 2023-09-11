package com.softserve.edu09.Practica.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        var rnd = new Random(1);
        List<Integer> myCollaction = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollaction.add(rnd.nextInt(30));


        }
        System.out.println(myCollaction);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i<myCollaction.size(); i++) {
            if (myCollaction.get(i) > 5) {
                newCollection.add(i);
            }

        }
        System.out.println(newCollection);
        var it = myCollaction.iterator();
        while ((it.hasNext())) {
            var el = it.next();
            if (el > 20) {
                it.remove();
            }
        }
        System.out.println(myCollaction);

        myCollaction.add(2,1);
        myCollaction.add(5,-4);
        myCollaction.add(8,-3);

        System.out.println(myCollaction);

        myCollaction.sort(Integer::compare);
        System.out.println(myCollaction);
    }

}
