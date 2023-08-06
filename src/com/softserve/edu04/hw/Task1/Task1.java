package com.softserve.edu04.hw.Task1;

import java.util.Scanner;

//Name of class should start from upper case
class Task1 {
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
    void Perevirka (int number1, int number2, int number3) {
        int s = 0;
        if (number1 > 5 || number1 < -5) {
            System.out.println("First number not belong to the range [-5, 5]");
            s++;
        } else System.out.println("First number  belong to the range [-5, 5]");
        if (number2 > 5 || number2 < -5) {
            System.out.println("Second number not belong to the range [-5, 5]");
            s++;
        } else System.out.println("Second number  belong to the range [-5, 5]");
        if (number3 > 5 || number3 < -5) {
            System.out.println("Third number not belong to the range [-5, 5]");
            s++;
        } else System.out.println("Third number  belong to the range [-5, 5]");
        System.out.println();
        System.out.println(s + (" numbers are belong to the range [-5, 5]"));

    }


}
