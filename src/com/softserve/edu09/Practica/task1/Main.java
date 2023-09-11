package com.softserve.edu09.Practica.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> dynamicArray = new ArrayList<>();
        dynamicArray.add(new HeavyBox(15,"Apples"));
        dynamicArray.add(new HeavyBox(10,"Pears"));
        dynamicArray.add(new HeavyBox(45,"Tomatoes"));
        dynamicArray.add(new HeavyBox(12,"Avocado"));
        dynamicArray.add(new HeavyBox(5,"Oranges"));
        System.out.println(dynamicArray);
        System.out.println("===========");

        var element = dynamicArray.get(0);
        element.setWeight(element.getWeight()+1);
        System.out.println(dynamicArray);
        System.out.println("===========");

        dynamicArray.remove(dynamicArray.size()-1);
        System.out.println(dynamicArray);
        System.out.println("===========");
        dynamicArray.clear();
        System.out.println(dynamicArray);
    }
}
