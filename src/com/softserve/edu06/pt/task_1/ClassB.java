package com.softserve.edu06.pt.task_1;

public class ClassB extends ClassA {
    public double i = 1.1;
    @Override
    public void m1() {
        System.out.println("ClassB, method m1, i= " + i);
    }
    @Override
    public void m4() {
        System.out.println("ClassB, method m4");
    }
    public void m5() {
        System.out.println("ClassB, method m5, i= " + i);
    }
}