package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;

/**
 * @author Bruno Ramirez
 **/
public interface UserCreateService {
    User save(User user);
}
