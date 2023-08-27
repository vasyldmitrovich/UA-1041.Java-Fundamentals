package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Hw01 {

    public static void main(String[] args) {
        var rnd = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-30, 30));
        }
        System.out.println("Random collection: " + myCollection);

        swapMaxMin(new ArrayList<>(List.copyOf(myCollection)));
        randomNumber(new ArrayList<>(List.copyOf(myCollection)));
        zeroBetween(new ArrayList<>(List.copyOf(myCollection)));
        copyList(new ArrayList<>(List.copyOf(myCollection)));
        lastEven(new ArrayList<>(List.copyOf(myCollection)));
        removeAfterMin(new ArrayList<>(List.copyOf(myCollection)));

    }

    private static void swapMaxMin(List<Integer> myCollection) {
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        Collections.swap(myCollection, myCollection.indexOf(max), myCollection.indexOf(min));
        System.out.println("Swap the maximum and minimum elements in the list: " + myCollection);
    }

    private static void randomNumber(List<Integer> myCollection) {
        var rndThreeDigit = (int) (Math.random() * 899 + 100);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rndThreeDigit);
                break;
            }
        }
        System.out.println("Insert a random three-digit number before the first negative " + myCollection);
    }

    private static void zeroBetween(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int ix = myCollection.get(i);
            int nextIx = myCollection.get(i + 1);
            if (ix < 0 && nextIx > 0 || ix > 0 && nextIx < 0) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println("Insert a zero between all neighboring elements with different signs " + myCollection);
    }

    private static void copyList(List<Integer> myCollection) {
        int k = myCollection.size() / 2;
        List<Integer> list1 = new ArrayList<>(List.copyOf(myCollection.subList(0, k)));
        List<Integer> list2 = new ArrayList<>(List.copyOf(myCollection.subList(k, myCollection.size())));
        Collections.reverse(list2);
        System.out.println("Copy the first k elements " + list1);
        System.out.println("Rest in reverse order " + list2);
    }

    private static void lastEven(List<Integer> myCollection) {
        int lastEven = myCollection.size() - 1;
        if (myCollection.get(lastEven) % 2 == 0) {
            myCollection.remove(lastEven);
            System.out.println("Remove the last even element: " + myCollection);
        } else System.out.println("Last element is not even ");
    }

    private static void removeAfterMin(List<Integer> myCollection) {
        int lastMin = myCollection.indexOf(Collections.min(myCollection));
        if (lastMin != myCollection.size() - 1) {
            myCollection.remove(lastMin + 1);
            System.out.println("Remove the element following the first minimum: " + myCollection);
        } else {
            System.out.println("The minimum element is the last one, nothing needs to be removed");
        }
    }

}




