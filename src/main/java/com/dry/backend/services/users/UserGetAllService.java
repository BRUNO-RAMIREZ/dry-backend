package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public interface UserGetAllService {
    List<User> getAll();
}
