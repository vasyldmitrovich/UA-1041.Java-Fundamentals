package com.softserve.edu09.hw.task_1;

import java.util.*;

public class Main {
    public static final Random RANDOM = new Random(5);

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        addRandomNumbers(myCollection);
        System.out.println(myCollection);

        //• Swap the maximum and minimum elements in the list.
        swapMaxMin(myCollection);
        System.out.println(myCollection);

        //• Insert a random three-digit number before the first negative element of the list
        addRandomThreeDigitNumber(myCollection);
        System.out.println(myCollection);

        //• Insert a zero between all neighboring elements collection myCollection with different signs
        addZeroBetweenDifferentSigns(myCollection);
        System.out.println(myCollection);

   /* Copy the first k elements of the myCollection to the list1, in direct order,
         and the rest to the list2 in reverse order.*/

        List<Integer> list1 = copyFirstElem(5, myCollection);
        System.out.println(list1);
        List<Integer> list2 = copyLastElem(5, myCollection);
        System.out.println(list2);

        /*• In a list myCollection remove the last even element (if there are even elements in the list). If
        there is no such element, display a message.*/
        removeLastEven(myCollection);
        System.out.println(myCollection);

    /*Remove from the list myCollection the element following the first minimum. If the minimum
        element is the last one, nothing needs to be removed.*/
        removeNextMin(myCollection);
        System.out.println(myCollection);

    }

    private static void removeNextMin(List<Integer> myCollection) {
        int min = Collections.min(myCollection);
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) == min) {
                myCollection.remove(i + 1);
                return;
            }
        }
    }

    private static void removeLastEven(List<Integer> myCollection) {
        Collections.reverse(myCollection);
        var it = myCollection.iterator();
        while (it.hasNext()) {
            var el = it.next();
            if (el != 0 && el % 2 == 0) {
                it.remove();
                Collections.reverse(myCollection);
                return;

            }

        }
        System.out.println("there is no such element!!!");
    }


    private static List<Integer> copyFirstElem(int k, List<Integer> myCollection) {
        List<Integer> list1 = Arrays.asList(new Integer[k]);
        Collections.copy(list1.subList(0, k), myCollection.subList(0, k));
        return list1;
    }


    private static List<Integer> copyLastElem(int k, List<Integer> myCollection) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < myCollection.size() - k; i++) {
            list2.add(i, myCollection.get(myCollection.size() - 1 - i));
        }
        return list2;
    }


    private static void addZeroBetweenDifferentSigns(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {

            if ((myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) || (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
    }

    private static void addRandomThreeDigitNumber(List<Integer> myCollection) {
        int num = RANDOM.nextInt(100, 1000);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, num);
                return;
            }
        }
    }

    private static void swapMaxMin(List<Integer> myCollection) {
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) == max) {
                myCollection.set(i, min);
                continue;
            }
            if (myCollection.get(i) == min) {

                myCollection.set(i, max);
            }
        }

    }

    private static void addRandomNumbers(List<Integer> myCollection) {

        for (int i = 0; i < 10; i++) {
            myCollection.add(i, RANDOM.nextInt(-20, 100 + 1));
        }
    }
}
