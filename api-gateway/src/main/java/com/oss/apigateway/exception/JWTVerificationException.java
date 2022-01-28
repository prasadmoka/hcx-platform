package com.oss.apigateway.exception;

public class JWTVerificationException extends Exception {

    private ErrorCodes errCode;

    public JWTVerificationException(String message) {
        super(message);
    }

    public JWTVerificationException(ErrorCodes errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public ErrorCodes getErrCode() {
        return errCode;
    }

}
