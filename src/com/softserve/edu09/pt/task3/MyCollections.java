package com.softserve.edu09.pt.task3;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
        fillCollection(myCollection);
        System.out.println(myCollection);

        List<Integer> newCollection = createNewCollection(myCollection);
        System.out.println("Indexes elements which greater than 5: " + newCollection);
        delMore20(myCollection);
        System.out.println(myCollection);

        insertElements(myCollection, 1, -3, -4);
        printCollection(myCollection);
    }

    public static List<Integer> createNewCollection(List<Integer> list){
        List<Integer> positions = new ArrayList<>();

       // positions = list.stream().filter(i -> list.get(i) > 5).toList();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > 5){
                positions.add(i);
            }
        }
        return positions;
    }

    public static void delMore20(List<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) > 20){
                list.remove(i);
            } else i++;
        }
    }

    public static void insertElements(List<Integer> list, Integer... elements){
        list.add(2, elements[0]);
        list.add(8, elements[1]);
        list.add(5, elements[2]);
    }

    public static void printCollection(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.format("position – %d, value of element – %d\n", i, list.get(i));
        }
    }

    public static void fillCollection(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.format("Input %d element: ", i);
            list.add(sc.nextInt());
        }
    }
}