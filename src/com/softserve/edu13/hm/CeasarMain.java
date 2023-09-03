package com.softserve.edu13.hm;

public class CeasarMain {
    public static void main(String[] args) {
        System.out.println(Ceasar.encrypt("abcz", 3));
        System.out.println(Ceasar.encrypt("wxyz", 1));
        System.out.println(Ceasar.decrypt("defc", 3));
    }
}
