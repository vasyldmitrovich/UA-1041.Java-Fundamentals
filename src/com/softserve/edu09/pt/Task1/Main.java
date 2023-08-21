package com.softserve.edu09.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <HeavyBox> dynamicArray=new ArrayList<>();
        dynamicArray.add(new HeavyBox(1,"first"));
        dynamicArray.add(new HeavyBox(2,"second"));
        dynamicArray.add(new HeavyBox(3,"third"));
        dynamicArray.add(new HeavyBox(2,"second"));
        dynamicArray.add(new HeavyBox(1,"first"));
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        System.out.println();
        System.out.println("Change the weight of the first box by 1");
        var firstElement=dynamicArray.get(0);
        firstElement.setWeight(firstElement.getWeight()+1);
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        System.out.println();
        System.out.println("Remove the last box");
        dynamicArray.remove(dynamicArray.size()-1);
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        System.out.println();
        System.out.println("Remove all boxes");
        dynamicArray.clear();
        System.out.println(dynamicArray);

    }
}
