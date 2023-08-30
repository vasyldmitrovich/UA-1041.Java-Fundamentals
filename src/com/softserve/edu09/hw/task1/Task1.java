package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        var rand = new Random(3);
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(-100, 100));
        }
        System.out.println(myCollection);
        System.out.println("===================================");

        int indexMin = swapMinAndMaxValueOfTheList(myCollection);
        System.out.println(myCollection);

        System.out.println("===================================");
        insertThreeDigitNumber(rand, myCollection);
        System.out.println(myCollection);

        System.out.println("===================================");
        insertZeroBetweenNeighboringNumbers(myCollection);
        System.out.println(myCollection);

        System.out.println("===================================");
        splitCollectionInTwo(myCollection);

        System.out.println("===================================");
        removeTheLastEvenElement(myCollection);
        System.out.println(myCollection);

        System.out.println("===================================");
        removeTheElementFollowingFirstMinimum(myCollection, indexMin);
        System.out.println(myCollection);
    }

    private static int swapMinAndMaxValueOfTheList(List<Integer> myCollection) {
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (Collections.min(myCollection) == myCollection.get(i)) {
                indexMin = i;
            }
            if (Collections.max(myCollection) == myCollection.get(i)) {
                indexMax = i;
            }
        }
        Collections.swap(myCollection, indexMin, indexMax);
        return indexMin;
    }

    private static void insertThreeDigitNumber(Random rand, List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rand.nextInt(100, 999));
                break;
            }
        }
    }

    private static void insertZeroBetweenNeighboringNumbers(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) || (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
            }
        }
    }

    private static void splitCollectionInTwo(List<Integer> myCollection) {
        List<Integer> list1 = myCollection.subList(0, myCollection.size() / 2);
        List<Integer> list2 = myCollection.subList(myCollection.size() / 2, myCollection.size());
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    private static void removeTheLastEvenElement(List<Integer> myCollection) {
        int indexOfLast = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) {
                indexOfLast = i;
            }
        }

        myCollection.remove(indexOfLast);
    }

    private static void removeTheElementFollowingFirstMinimum(List<Integer> myCollection, int indexMin) {
        if (indexMin != myCollection.size() - 1) {
            myCollection.remove(indexMin + 1);
        } else {
            System.out.println("The minimum number is in the last place.");
        }
    }
}



