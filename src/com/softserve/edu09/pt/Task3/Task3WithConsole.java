package com.softserve.edu09.pt.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3WithConsole {

        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            List<Integer>myCollection=new ArrayList<>(10);
            List<Integer>newCollection=new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                System.out.println("element № "+i);
                myCollection.add(scanner.nextInt());
            }
            System.out.println(myCollection);
            for (int i = 0; i < 10; i++) {
                if(myCollection.get(i)>5){
                    newCollection.add(i);
                }
            }
            System.out.println(newCollection);
            var iterator=myCollection.iterator();
            while (iterator.hasNext()){
                var element=iterator.next();
                if(element>20){
                    iterator.remove();
                }
            }
            System.out.println(myCollection);
            myCollection.add(2,-1);
            myCollection.add(8,-3);
            myCollection.add(5,-4);
            System.out.println(myCollection);

        }

}




