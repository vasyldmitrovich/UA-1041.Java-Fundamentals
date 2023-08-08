package com.softserve.edu05.hw.task4;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       startGuess();
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void startGuess(){
        int ran = new Random().nextInt(getNumber("Input range of number: "));
        int guessNum;
        do{
            guessNum = getNumber("Input number: ");
            String message = guessNum > ran ? "Too high, try again" :
                    guessNum < ran ? "Too low, try again" : "";
            if(!message.isEmpty())
                System.out.println(message);
            else break;
        }while (true);
    }

}
