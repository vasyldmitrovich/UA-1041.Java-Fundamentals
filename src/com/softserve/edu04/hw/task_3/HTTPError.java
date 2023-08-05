package com.softserve.edu04.hw.task_3;

public enum HTTPError {//Good

    ERR_100(100, "Continue"), ERR_101(101, "Switching Protocols"), ERR_102(102, "Processing"),
    ERR_200(200, "OK"), ERR_201(201, "Created"), ERR_202(202, "Accepted"),
    ERR_300(300, "Multiple Choices"), ERR_301(301, "Moved Permanently"), ERR_302(302, "Found"),
    ERR_400(400, "Bad Request"), ERR_401(401, "Unauthorized"), ERR_402(402, "Payment Required"), ERR_404(404, "Not Found"),
    ERR_500(500, "Internal Server Error"), ERR_501(501, "Not Implemented"), ERR_502(502, "Bad Gateway");
    private final int codeError;
    private final String description;

    HTTPError(int codeError, String description) {
        this.codeError = codeError;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCodeError() {
        return codeError;
    }


}
