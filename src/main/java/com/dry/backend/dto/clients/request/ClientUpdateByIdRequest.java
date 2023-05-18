package com.dry.backend.dto.clients.request;

/**
 * @author Bruno Ramirez
 **/
public class ClientUpdateByIdRequest {
    private String ci;

    private String lastName;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
