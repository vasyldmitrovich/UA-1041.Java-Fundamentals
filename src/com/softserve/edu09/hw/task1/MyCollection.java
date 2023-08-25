package com.softserve.edu09.hw.task1;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
       // List.of(12, 32, -67, 1, 32, 1, 87)
        fillCollection(myCollection);
        System.out.println(myCollection);
        swapMaxMin(myCollection);
        System.out.println(myCollection);
        insertRandDigits(myCollection);
        System.out.println(myCollection);
        insertBetweenDiffSign(myCollection);
        System.out.println(myCollection);

        List<Integer> list1 = copyOfFirstElements(myCollection, 5);
        List<Integer> list2 = copyOfRestElements(myCollection, 5);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println(deleteLastEven(myCollection) ? myCollection : "Collection doesn\'t contain even elements");

        removeAfterFirstMinimum(myCollection);
        System.out.println(myCollection);
    }

    public static void fillCollection(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.format("Input %d element: ", i);
            list.add(sc.nextInt());
        }
    }

    public static void swapMaxMin(List<Integer> list){
        int max = Collections.max(list);
        int indexMax = list.indexOf(max);

        int min = Collections.min(list);
        int indexMin = list.indexOf(min);

        list.remove(indexMax);
        list.add(indexMax, min);

        list.remove(indexMin);
        list.add(indexMin, max);
    }

    public static void insertRandDigits(List<Integer> list){
        int i = 0;
        while (list.get(i) < 0){
            i++;
        }
        Random random = new Random();
        for (int j = 0; j < 3; j++){
            list.add(i, random.nextInt(150));
        }
    }

    public static void insertBetweenDiffSign(List<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) * list.get(i + 1) < 0){
                list.add(i++ + 1, 0);
            }
        }
    }

    public static List<Integer> copyOfFirstElements(List<Integer> list, int k){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++){
            list1.add(list.get(i));
        }
        return list1;
    }

    public static List<Integer> copyOfRestElements(List<Integer> list, int k){
        List<Integer> list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= k; i--){
            list2.add(list.get(i));
        }
        return list2;
    }

    public static boolean deleteLastEven(List<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void removeAfterFirstMinimum(List<Integer> list){
        int indexOfMin = list.indexOf(Collections.min(list));

        if(indexOfMin != list.size() - 1){
            list.remove(indexOfMin + 1);
        }
    }
}