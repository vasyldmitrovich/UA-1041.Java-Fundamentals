package com.softserve.edu09.practicaltask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30));
        }
        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);

        var iterator = newCollection.iterator();
        while(iterator.hasNext()){
            var element = iterator.next();
            if(element > 20){
                iterator.remove();
            }
        }
        System.out.println(newCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println(myCollection);
        myCollection.sort(Integer::compare);
        System.out.println(myCollection);

    }
}
