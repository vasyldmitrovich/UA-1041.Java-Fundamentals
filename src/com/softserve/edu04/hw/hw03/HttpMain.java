package com.softserve.edu04.hw.hw03;

import java.util.Scanner;

public class HttpMain {
    static private final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        //Move this and next two lines to some method and there call this method
        //не дуже зрозумів

        System.out.print("Enter number HTTP error (400...405): ");
        int numErr = SC.nextInt();

        switch (numErr){
            case 400 -> System.out.println("\nValue: " + HttpEnum.ERR_400.getErr());
            case 401 -> System.out.println("\nValue: " + HttpEnum.ERR_401.getErr());
            case 402 -> System.out.println("\nValue: " + HttpEnum.ERR_402.getErr());
            case 403 -> System.out.println("\nValue: " + HttpEnum.ERR_403.getErr());
            case 404 -> System.out.println("\nValue: " + HttpEnum.ERR_404.getErr());
            case 405 -> System.out.println("\nValue: " + HttpEnum.ERR_4O5.getErr());
        }

    }
}
