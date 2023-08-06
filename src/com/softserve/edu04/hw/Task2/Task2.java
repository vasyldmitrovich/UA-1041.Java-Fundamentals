package com.softserve.edu04.hw.Task2;

import java.util.Scanner;
//Name of class should start from upper case
public class Task2 {
    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }
    public void Maximum(int number1,int number2,int number3){
        if(number1>number2 && number1>number3){
            System.out.println("The maximum is "+(number1));
        }
        else if(number2>number1 && number2>number3){
            System.out.println("The maximum is "+(number2));
        }
        else System.out.println("The maximum is "+(number3));
    }
    public void Minimum(int number1,int number2,int number3){
        if(number1<number2 && number1<number3){
            System.out.println("The minimum is "+(number1));
        }
        else if(number2<number1 && number2<number3){
            System.out.println("The minimum is "+(number2));
        }
        else System.out.println("The minimum is "+(number3));
    }


}
