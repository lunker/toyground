package org.lunker.toyground.core;

/**
 * Created by dongqlee on 2018. 1. 9..
 */
public class ServerResponse {

    private int status;
    private String message;
    private String data;

    public ServerResponse(int status, String message, String data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
