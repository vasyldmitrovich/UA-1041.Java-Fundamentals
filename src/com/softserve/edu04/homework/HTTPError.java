package com.softserve.edu04.homework;

import static com.softserve.edu04.homework.Error.*;
import static com.softserve.edu04.homework.Main.SCANNER;

public class HTTPError {
    private int numberOfIssue;

    public HTTPError() {
    }

    public HTTPError(int numberOfIssue) {
        this.numberOfIssue = numberOfIssue;
    }

    public int getNumberOfIssue() {
        return numberOfIssue;
    }

    public void setNumberOfIssue(int numberOfIssue) {
        this.numberOfIssue = numberOfIssue;
    }
    public void promptNumberOfIssue(HTTPError errorNum) {
        System.out.print("\n\t*****THIRD TASK*****");
        System.out.println("\nProvide the number of HTTP Error to see the name of this issue");
        System.out.print("\nInput HTTP Error number: ");
        int num = SCANNER.nextInt();
        setNumberOfIssue(num);
    }

    public void findTheNameOfIssue(HTTPError errorNum){
        switch (numberOfIssue){
            case 400 -> System.out.println(ERROR_400.getDescription());
            case 401 -> System.out.println(ERROR_401.getDescription());
            case 402 -> System.out.println(ERROR_402.getDescription());
            case 403 -> System.out.println(ERROR_403.getDescription());
            case 404 -> System.out.println(ERROR_404.getDescription());
            case 405 -> System.out.println(ERROR_405.getDescription());
            case 406 -> System.out.println(ERROR_406.getDescription());
            case 407 -> System.out.println(ERROR_407.getDescription());
            case 408 -> System.out.println(ERROR_408.getDescription());
            case 409 -> System.out.println(ERROR_409.getDescription());
            case 410 -> System.out.println(ERROR_410.getDescription());
            case 411 -> System.out.println(ERROR_411.getDescription());
            case 412 -> System.out.println(ERROR_412.getDescription());
            case 413 -> System.out.println(ERROR_413.getDescription());
            case 414 -> System.out.println(ERROR_414.getDescription());
            case 415 -> System.out.println(ERROR_415.getDescription());
            case 416 -> System.out.println(ERROR_416.getDescription());
            case 417 -> System.out.println(ERROR_417.getDescription());
            case 418 -> System.out.println(ERROR_418.getDescription());
        }
    }

    public void printTheNameOfIssue(HTTPError errorNum) {
        System.out.print("\n\tRESULT OF DESCRIPTION");
        System.out.printf("\n\tThe Error %s is: ", numberOfIssue);
        findTheNameOfIssue(errorNum);
    }
}
