package src.com.softserve.edu04.homework;

public enum Error {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401,"Unauthorized"),
    ERROR_402(402,"Payment Required"),
    ERROR_403(403,"Forbidden"),
    ERROR_404(404,"Not Found"),
    ERROR_405(405,"Method Not Allowed"),
    ERROR_406(406,"Not Acceptable"),
    ERROR_407(407,"Proxy Authentication Required"),
    ERROR_408(408,"Request Timeout"),
    ERROR_409(409,"Conflict"),
    ERROR_410(410,"Gone"),
    ERROR_411(411,"Length Required"),
    ERROR_412(412,"Precondition Failed"),
    ERROR_413(413,"Payload Too Large"),
    ERROR_414(414,"URI Too Long"),
    ERROR_415(415,"Unsupported Media Type"),
    ERROR_416(416,"Range Not Satisfiable"),
    ERROR_417(417,"Expectation Failed"),
    ERROR_418(418,"I'm a teapot (RFC 2324, RFC 7168)");

    private final int number;

    private final String description;

    Error(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
