package edu04.pt.pt;

import java.util.Scanner;

public class HTTPmain {public class HttpMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Move this and next two lines to some method and there call this method
        System.out.print("Enter number HTTP error (500...505): ");
        int numErr = scanner.nextInt();

        switch (numErr){
            case 500 -> System.out.println("ERR_500 Internal Service");
            case 501 -> System.out.println ("ERR_501 Not Implemented");
            case 502 -> System.out.println("ERR_502 Bad Getaway");
            case 503 -> System.out.println("ERR_503 Service Unavailable");
            case 504 -> System.out.println("ERR_504 Getaway Timeout");
            case 505 -> System.out.println("ERR_505 HTTP Version Not Supported");


        }


    }}
}
