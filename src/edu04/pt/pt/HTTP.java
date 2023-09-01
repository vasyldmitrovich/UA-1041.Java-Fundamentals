package edu04.pt.pt;

public class HTTP {  public enum HttpEnum {
    ERR_500("Internal Service"),
    ERR_501("Not Implemented"),
    ERR_502("Bad Getaway"),
    ERR_503("Service Unavailable"),
    ERR_504("Getaway Timeout"),
    ERR_5O5("HTTP Version Not Supported");
    private final String err;

    HttpEnum(String err) {
        this.err = err;
    }

    public String getErr() {
        return err;
    }
}


}


