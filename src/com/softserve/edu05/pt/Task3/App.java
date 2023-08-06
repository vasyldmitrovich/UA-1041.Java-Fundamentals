package com.softserve.edu05.pt.Task3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]= random.nextInt(-100,100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            System.out.println();
        }
        Task3 ob=new Task3();
        ob.getmax(array);
        ob.getmin(array);
        ob.getpositive(array);
        ob.getnegative(array);
        ob.getResult();

    }
}
