package com.softserve.edu09.hw.task1;

import java.util.*;

public class Task1 {

    private static final Random RND = new Random();

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        fillRandom(myCollection, 10);


        System.out.println(myCollection);

        List<Integer> swapped = swapMaxAndMin(myCollection);

        System.out.println("After swapping max and min");
        System.out.println(swapped);

        List<Integer> addedNumber = addThreeDigitNumber(myCollection);

        System.out.println("After adding three digit number");

        System.out.println(addedNumber);

        List<Integer> withZeroList = addZero(myCollection);

        System.out.println("After adding zero");
        System.out.println(withZeroList);


        List<Integer> list1 = copyElements(myCollection, 5);
        List<Integer> list2 = copyElements(myCollection, -5);

        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);


        List<Integer> removedNumber = removeLastEven(myCollection);

        System.out.println("After removing last even number");
        System.out.println(removedNumber);


        List<Integer> removedFollowingFirst = removeMinimumNext(myCollection);

        System.out.println("After removing following the first minimum");
        System.out.println(removedFollowingFirst);

    }

    private static void fillRandom(List<Integer> numbers, int size) {
        for (int i = 0; i < size; i++) numbers.add(RND.nextInt(-100, 100));
    }

    private static List<Integer> swapMaxAndMin(List<Integer> list) {

        List<Integer> newList = new ArrayList<>(list);

        int minValue = min(newList);
        int maxValue = max(newList);

        int minIndex = newList.indexOf(minValue);
        int maxIndex = newList.indexOf(maxValue);

        newList.set(minIndex, maxValue);
        newList.set(maxIndex, minIndex);

        return newList;
    }


    private static int min(List<Integer> list) {
        int minValue = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    private static int max(List<Integer> list) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    private static List<Integer> addThreeDigitNumber(List<Integer> list) {

        List<Integer> newList = new ArrayList<>(list);
        int rNumber = RND.nextInt(900) + 100;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                newList.add(i, rNumber);
                break;
            }
        }

        return newList;
    }


    private static List<Integer> addZero(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if ((newList.get(i) > 0 && newList.get(i + 1) < 0) ||
                    (newList.get(i) < 0 && newList.get(i + 1) > 0)) {

                newList.add(i + 1, 0);
            }
        }

        return newList;
    }

    private static List<Integer> copyElements(List<Integer> list, int k) {
        List<Integer> source = new ArrayList<>(list);

        if (k < 0) {
            k = Math.abs(k);
            Collections.reverse(source);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) result.add(source.get(i));
        return result;
    }

    private static List<Integer> removeLastEven(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);

        for (int i = newList.size() - 1; i > 0; i--) {
            if (newList.get(i) % 2 == 0) {
                newList.remove(i);
                break;
            }
        }
        return newList;
    }

    private static List<Integer> removeMinimumNext(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);

        int minIndex = newList.indexOf(min(newList));

        if (minIndex >= 0 && minIndex < newList.size() - 1) newList.remove(minIndex + 1);

        return newList;
    }
}
