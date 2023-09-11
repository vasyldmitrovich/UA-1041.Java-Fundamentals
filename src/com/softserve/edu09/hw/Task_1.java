package com.softserve.edu09.hw;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task_1 {
    public static void getRandom(){
        System.out.println("Random collection");
        var rnd= new Random();
        List<Integer> newCollection = new ArrayList<>();
        int countList = 10;
        for (int i = 0; i < countList; i++) {
            newCollection.add(rnd.nextInt(-10, 31));
        }

        System.out.println("Swap the maximum and minimum elements in the list.");
        int maxValue=0;
        int minValue=0;
        int maxPosition=0;
        int minPosition=0;
        int num=0;
        for (int i = 0; i < newCollection.size(); i++) {
            num=newCollection.get(i);
            if (i==0){
                maxValue = num;
                minValue = num;
            } else {
                if(maxValue < num) {
                    maxValue = num;
                    maxPosition=i;
                }
                if(minValue > num) {
                    minValue = num;
                    minPosition=i;
                }
            }
        Collections.swap(newCollection,maxPosition,minPosition);
        }

        System.out.println();
        System.out.println("Insert a random three-digit number before the first negative element of the list.");
        int threeDigitNumber = rnd.nextInt(100,1000);
        newCollection.add(minPosition,threeDigitNumber);
        System.out.println(newCollection);

        System.out.println();
        System.out.println("Insert a zero between all neighboring elements \n " +
                "collection myCollection with different signs.");
        for (int i = 0; i < newCollection.size()-1; i++) {
            int numCurrent =newCollection.get(i);
            int numNext =newCollection.get(i+1);

            if (numCurrent<0 && numNext>0) {
                i++;
                newCollection.add(i,0);
            } else if (numCurrent>0 && numNext<0) {
                i++;
                newCollection.add(i,0);
            }
        }
        System.out.println(newCollection);

        System.out.println();
        System.out.println("Copy the first k elements of the myCollection to the list1, \n" +
                "in direct order, and the rest to the list2 in reverse order");
        int sizeCol =newCollection.size();
        int k=sizeCol/2;
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for (int i = 0; i < newCollection.size(); i++) {
            if (i<k) {
                list1.add(i,newCollection.get(i));
            } else {
                list2.add(i-k,newCollection.get(sizeCol+k-i-1));
            }
        }
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);

        System.out.println();
        System.out.println("In a list myCollection remove the last even element \n" +
                "(if there are even elements in the list).");
        String msg=null;
        for (int i = newCollection.size()-1; i >=0 ; i--) {
            num=newCollection.get(i);
            if (num%2==0){
                newCollection.remove(i);
                break;
            } else {
                msg="There are no even elements in the list";
            }
        }
        if (msg !=null) {
            System.out.println(msg);
        }
        System.out.println(newCollection);

        System.out.println();
        System.out.println("Remove from the list myCollection the element following the first minimum.");
        minPosition=0;
        for (int i = 0; i < newCollection.size(); i++) {
            num=newCollection.get(i);
            if (i==0){
                minValue=num;
            } else {
                if (minValue>num){
                    minValue=num;
                    minPosition=i;
                }
            }
        }
        if(minPosition!=newCollection.size()) {
            newCollection.remove(minPosition + 1);
        }
        System.out.println(newCollection);
    }
}
