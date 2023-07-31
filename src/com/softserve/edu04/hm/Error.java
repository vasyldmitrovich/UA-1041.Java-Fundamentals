package com.softserve.edu04.hm;

import java.util.Scanner;

public class Error {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        enum HTTPError {
            BD("Bad request"), UN("Unauthorized"), PY("Payment required"),
            FB("Forbidden"), NF("Not found"), MNA("Method not allowed"), NA("Not acceptable");

            public String getGeneralInfo() {
                return error;
            }
            private final String error;
            HTTPError(String error){
                this.error = error;
            }
        }
        System.out.println("Enter the number of error:");
        int numberOfError = sc.nextInt();
        switch (numberOfError){
            case 400 -> System.out.println(HTTPError.BD.getGeneralInfo());
            case 401 -> System.out.println(HTTPError.UN.getGeneralInfo());
            case 402 -> System.out.println(HTTPError.PY.getGeneralInfo());
            case 403 -> System.out.println(HTTPError.FB.getGeneralInfo());
            case 404 -> System.out.println(HTTPError.NF.getGeneralInfo());
            case 405 -> System.out.println(HTTPError.MNA.getGeneralInfo());
            case 406 -> System.out.println(HTTPError.NA.getGeneralInfo());
        }

    }
}

