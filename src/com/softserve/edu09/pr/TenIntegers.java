package com.softserve.edu09.pr;

import java.util.*;

public class TenIntegers {
    public static void main(String[] args) {
        var rnd = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(100));

        }
        System.out.println(myCollection);


        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

//      The next part works good if this one is commented. Separately they work well
//        var it = myCollection.iterator();
//        while (it.hasNext()){
//            var el = it.next();
//            if (el > 20){
//                it.remove();
//            }
//        }
//        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println(myCollection);


        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " +
                    i+", value of element – "+ myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
