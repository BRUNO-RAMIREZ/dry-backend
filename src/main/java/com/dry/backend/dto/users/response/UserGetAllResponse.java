package com.dry.backend.dto.users.response;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public class UserGetAllResponse {
    private List<UserResponse> users;

    public UserGetAllResponse() {
    }

    public List<UserResponse> getUsers() {
        return users;
    }

    public void setUsers(List<UserResponse> users) {
        this.users = users;
    }
}
