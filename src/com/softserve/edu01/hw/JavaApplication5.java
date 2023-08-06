package com.softserve.edu01.hw;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Радіус кола: ");
        var Radius=scanner.nextInt();
        System.out.println("Area="+(Math.PI*Radius*Radius));
        System.out.println("Perimetr="+(Math.PI*2*Radius));
    }
}
