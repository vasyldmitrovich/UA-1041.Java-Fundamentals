package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {//Good
        Scanner scanner=new Scanner(System.in);
        int[] arrayDayMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        int numMonth=scanner.nextInt();
        for (int i = 1; i < 12; i++) {
            if(numMonth==i){
                System.out.println(arrayDayMonth[i-1]);
            }
        }
    }
}
