package com.softserve.edu09.hm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NewCollection {
    public static int minIndex(ArrayList<Integer> list) {
        return list.indexOf(Collections.min(list));
    }

    public static int maxIndex(ArrayList<Integer> list) {
        return list.indexOf(Collections.max(list));
    }

    public static ArrayList insertZero(ArrayList<Integer> list){
        ArrayList<Integer> modifiedCollection = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            modifiedCollection.add(list.get(i));
            if (i < list.size() - 1) {
                if ((list.get(i) < 0 && list.get(i + 1) >= 0) ||
                        (list.get(i) >= 0 && list.get(i + 1) < 0)) {
                    modifiedCollection.add(0);
                }
            }
        }
        return modifiedCollection;
    }

    public static ArrayList swapMinMax(ArrayList<Integer> list) {

        int minimum = Collections.min(list);
        int maximum = Collections.max(list);
        int minInd = list.indexOf(minimum);
        int maxInd = list.indexOf(maximum);

        int t;
        if (maxInd != minInd) {
            t = list.get(minInd);
            list.set(minInd, list.get(maxInd));
            list.set(maxInd, t);
        }

        return list;
    }

    public static ArrayList insert3DigitNumber(ArrayList<Integer> list) {
        int count  = 0;
        int ind = 0;
        for (int i = 0; i < list.size(); i++) {
            if (count != 1) {
                if (list.get(i) < 0) {
                    count += 1;
                }
            }
            else{
                ind = i;
                break;
            }
        }
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        list.add(ind-1, randomNumber);
        return list;
    }

    public static void copyPartOfList(ArrayList<Integer> list, int k) {
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size()-1; i >= k; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list1);
        System.out.println(list2);
    }


    public static ArrayList removeLastEvenNum(ArrayList<Integer> list){
        int ind = -1;
        for (int i = list.size()-1; i > 0; i--) {
            if(list.get(i) % 2 == 0){
                ind = i;
                break;
            }
        }
        if (ind != -1){
            list.remove(list.get(ind));
        }
        else{
            System.out.println("No even numbers in the list");
        }
        return list;
    }

    public static ArrayList removeNumFolMin(ArrayList<Integer> list) {
        int minimum = Collections.min(list);
        int minInd = list.indexOf(minimum);
        if(minInd != list.size()-1){
            list.remove(minInd-1);
        }
        return list;
    }
}
