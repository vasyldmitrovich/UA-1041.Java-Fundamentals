package com.softserve.edu06.hw.Task1;

public class main {//Should be Main.java
    public static void main(String[] args) {
        Bird[]birds=new Bird[]{
          new Eagle(),
          new Penguin(),
          new Swallow(),
          new Kiwi()
        };
        for (int i = 0; i < 4; i++) {
            birds[i].type();
            birds[i].fly();
            System.out.println();
        }
    }
}
