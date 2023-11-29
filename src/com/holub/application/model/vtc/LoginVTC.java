package com.holub.application.model.vtc;

public class LoginVTC implements VTC{

    private final String id;
    private final String password;

    public LoginVTC(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
