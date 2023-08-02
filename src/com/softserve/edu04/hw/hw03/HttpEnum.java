package com.softserve.edu04.hw.hw03;

public enum HttpEnum {
    ERR_400("Bad Request"),
    ERR_401("Unauthorized"),
    ERR_402("Payment Required"),
    ERR_403("Forbidden"),
    ERR_404("Not Found"),
    ERR_4O5("Method Not Allowed");
    private final String err;

    HttpEnum(String err) {
        this.err = err;
    }

    public String getErr() {
        return err;
    }
}
