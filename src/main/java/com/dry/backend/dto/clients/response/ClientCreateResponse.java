package com.dry.backend.dto.clients.response;

/**
 * @author Bruno Ramirez
 **/
public class ClientCreateResponse {
    private Long id;
    private String ci;

    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
