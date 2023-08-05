package com.softserve.edu04.hw;

import java.util.Scanner;

public class HttpMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Move this and next two lines to some method and there call this method
        System.out.print("Enter number HTTP error (400...405): ");
        int numErr = scanner.nextInt();

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
