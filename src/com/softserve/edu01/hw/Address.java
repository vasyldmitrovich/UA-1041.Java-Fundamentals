package com.softserve.edu01.hw;

import java.util.Scanner;

public class Address {

    public static void main( String [] args) {
        var scanner= new Scanner(System.in);
        System.out.println("Впишіть Ваше ім'я:");
        var name=scanner.nextLine( );
        System.out.println("Впишіть Вашу адресу: ");
        var address=scanner.nextLine();


        System.out.println("Привіт,  "+ name );
        System.out.println ("Ваша адреса  "+address);
    }

}

