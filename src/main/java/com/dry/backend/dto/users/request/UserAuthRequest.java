package com.dry.backend.dto.users.request;

/**
 * @author Bruno Ramirez
 **/
public class UserAuthRequest {
    private String email;
    private String password;

    public UserAuthRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
