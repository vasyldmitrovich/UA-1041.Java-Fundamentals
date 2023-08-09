package com.softserve.edu01.hw;

import java.util.Scanner;

public class Circle {

    static Scanner sc=new Scanner (System.in);
    public static void main (String args [] ){
        System.out.println("впишіть радіус: ");
        double radius=sc.nextDouble ();
        double area=Math.PI*(radius*radius);
        System.out.print ("площа круга дорівнює:"+area);
        double circumference=Math.PI*2*radius;
        System.out.println("довжина кола дорівнює:" +circumference);

    }
}
