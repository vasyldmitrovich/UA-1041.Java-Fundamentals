package com.softserve.edu04.hm;

import java.util.Scanner;

public class Enum {

    //Move mein method to file like App.java

    //This class is Error and that should be Enum
    //Do what i wrote because for now it is bad practice
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
}

