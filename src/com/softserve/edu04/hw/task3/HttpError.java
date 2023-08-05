package com.softserve.edu04.hw.task3;

public enum HttpError {

    BAD_REQUEST("Bad Request"),
    UNAUTHORIZED("Unauthorized"),
    PAYMENT_REQUIRED("Payment Required"),
    FORBIDDEN("Forbidden"),

    NOT_FOUND("Not Found"),

    METHOD_NOT_ALLOWED("Method Not Allowed");

    private String message;

    HttpError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}//Good
