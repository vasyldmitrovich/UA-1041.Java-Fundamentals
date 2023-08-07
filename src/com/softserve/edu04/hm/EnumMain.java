package com.softserve.edu04.hm;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of error:");
        int numberOfError = sc.nextInt();
        switch (numberOfError){
            case 400 -> System.out.println(Error.HTTPError.BD.getGeneralInfo());
            case 401 -> System.out.println(Error.HTTPError.UN.getGeneralInfo());
            case 402 -> System.out.println(Error.HTTPError.PY.getGeneralInfo());
            case 403 -> System.out.println(Error.HTTPError.FB.getGeneralInfo());
            case 404 -> System.out.println(Error.HTTPError.NF.getGeneralInfo());
            case 405 -> System.out.println(Error.HTTPError.MNA.getGeneralInfo());
            case 406 -> System.out.println(Error.HTTPError.NA.getGeneralInfo());
        }

    }
}
