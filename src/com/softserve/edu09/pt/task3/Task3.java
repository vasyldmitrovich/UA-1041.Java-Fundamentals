package com.softserve.edu09.pt.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {

    private static final Random RND = new Random();
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();


        fillRandom(myCollection, 10);

        System.out.println("Numbers");
        System.out.println(myCollection);


        List<Integer> newCollection = filterNumbers(myCollection, 5);


        System.out.println("Numbers what bigger 5");

        System.out.println(newCollection);

        myCollection.removeAll(filterNumbers(myCollection, 20));


        System.out.println("After deleting");
        System.out.println(myCollection);


        myCollection.add(2,-1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }

        myCollection.sort(Integer::compareTo);

        System.out.println("Sorted numbers");
        System.out.println(myCollection);
    }

    private static void fillRandom(List<Integer> numbers, int size) {
        for (int i = 0; i < size; i++) numbers.add(RND.nextInt(100));
    }

    private static List<Integer> filterNumbers(List<Integer> numbers, int more){
        List<Integer> newCollection = new ArrayList<>();

        for (var n : numbers) {
            if (n > more) newCollection.add(n);
        }

        return newCollection;
    }
}
