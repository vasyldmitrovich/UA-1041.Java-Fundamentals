package com.softserve.edu09.hw.Task1;

import java.util.*;

public class Task1HwRandom {

    public static void main(String[] args) {
        var random=new Random();
        List<Integer>myCollection=new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10,11));
        }
        System.out.println(myCollection);
        var maxIndex = myCollection.indexOf(Collections.max(myCollection));
        var minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println(myCollection);
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i)<0){
                myCollection.add(i,333);
                break;
            }
        }
        System.out.println(myCollection);
        for (int i = 0; i < myCollection.size()-1; i++) {
            if((myCollection.get(i)<0 && myCollection.get(i+1)>0)|| (myCollection.get(i)>0 && myCollection.get(i+1)<0)){
                myCollection.add(i+1,0);
            }
        }
        System.out.println(myCollection);


        var halfSizeOfMyCollection=myCollection.size()/2;
        List<Integer>list1=new ArrayList<>(myCollection.subList(0,halfSizeOfMyCollection));
        List<Integer>list2=new ArrayList<>(myCollection.subList(halfSizeOfMyCollection,myCollection.size()));
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);

        int last=myCollection.size()-1;
        if(myCollection.get(last)%2==0) {
            myCollection.remove(last);
            System.out.println("last was removed");
            System.out.println(myCollection);
        }
        else System.out.println("the last element is not even");
        var min=Collections.min(myCollection);
        var indexOfMinElement=myCollection.indexOf(min);
        myCollection.remove(indexOfMinElement+1);
        System.out.println(myCollection);

    }

}

