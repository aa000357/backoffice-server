package com.happytuk.util;

public class Error {
    private String message; //失敗訊息

    public Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
