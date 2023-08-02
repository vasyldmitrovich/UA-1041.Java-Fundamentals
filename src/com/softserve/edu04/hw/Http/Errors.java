package com.softserve.edu04.hw.Http;
import static com.softserve.edu04.hw.Http.HTTPError.*;
import static com.softserve.edu04.util.CollectInputs.*;
public class Errors {
    private int errNum;

    public Errors() {

    }
    public Errors(int errNum) {
        this.errNum = errNum;
    }

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }
    public void inputHttpError(){
        this.errNum = inputNumberInt("Please enter number of error");
    }
      public void outputError(){
        switch (this.errNum){
            case 400 -> System.out.println(ERROR_400.getDesc());
            case 401 -> System.out.println(ERROR_401.getDesc());
            case 402 -> System.out.println(ERROR_402.getDesc());
            case 403 -> System.out.println(ERROR_403.getDesc());
            case 404 -> System.out.println(ERROR_404.getDesc());
            case 405 -> System.out.println(ERROR_405.getDesc());
            case 406 -> System.out.println(ERROR_406.getDesc());
            case 407 -> System.out.println(ERROR_407.getDesc());
            case 408 -> System.out.println(ERROR_408.getDesc());
            case 409 -> System.out.println(ERROR_409.getDesc());
            case 410 -> System.out.println(ERROR_410.getDesc());
            case 411 -> System.out.println(ERROR_411.getDesc());
            case 412 -> System.out.println(ERROR_412.getDesc());
            case 413 -> System.out.println(ERROR_413.getDesc());
            case 414 -> System.out.println(ERROR_414.getDesc());
            case 415 -> System.out.println(ERROR_415.getDesc());
            case 416 -> System.out.println(ERROR_416.getDesc());
            case 417 -> System.out.println(ERROR_417.getDesc());
            default -> System.out.println("No such error");
        }
    }
}
