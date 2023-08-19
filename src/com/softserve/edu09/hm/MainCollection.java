package com.softserve.edu09.hm;

import java.util.ArrayList;
import java.util.Random;

public class MainCollection {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        while(myCollection.size() != 10){
            myCollection.add(rand.nextInt(-10, 10));
        }
        System.out.println(myCollection);
        NewCollection.swapMinMax(myCollection);
        System.out.println(myCollection);
        NewCollection.insert3DigitNumber(myCollection);
        System.out.println(myCollection);
        NewCollection.copyPartOfList(myCollection, 4);
        NewCollection.removeLastEvenNum(myCollection);
        System.out.println(myCollection);
        NewCollection.removeNumFolMin(myCollection);
        System.out.println(myCollection);
        ArrayList newlist = NewCollection.insertZero(myCollection);
        System.out.println(newlist);
    }
}
