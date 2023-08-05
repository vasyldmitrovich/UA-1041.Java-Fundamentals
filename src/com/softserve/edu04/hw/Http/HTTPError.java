package com.softserve.edu04.hw.Http;

public enum HTTPError {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401, "Unauthorized"),
    ERROR_402(402, "Payment Required	"),
    ERROR_403(403, "Forbidden"),
    ERROR_404(404, "Not Found"),
    ERROR_405(405, "Method Not Allowed"),
    ERROR_406(406, "Not Acceptable"),
    ERROR_407(407, "Proxy Authentication Required"),
    ERROR_408(408, "Request Timeout"),
    ERROR_409(409, "Conflict"),
    ERROR_410(410, "Gone"),
    ERROR_411(411, "Length Required"),
    ERROR_412(412, "Precondition Failed"),
    ERROR_413(413, "Request Entity Too Large"),
    ERROR_414(414, "Request-URI Too Long"),
    ERROR_415(415, "Unsupported Media Type"),
    ERROR_416(416, "Requested Range Not Satisfiable"),
    ERROR_417(417, "Expectation Failed");

    private final int numOfError;
    private final String descOfError;

    HTTPError(int numOfError, String descOfError) {
        this.numOfError = numOfError;
        this.descOfError = descOfError;
    }

    public int getNum() {
        return this.numOfError;
    }

    public String getDesc() {
        return this.descOfError;
    }

}//Good
