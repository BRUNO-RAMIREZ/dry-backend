package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;

/**
 * @author Bruno Ramirez
 **/
public interface UserGetByEmailAndPasswordService {
    User getUserByEmailAndPassword(String email, String password);
}
