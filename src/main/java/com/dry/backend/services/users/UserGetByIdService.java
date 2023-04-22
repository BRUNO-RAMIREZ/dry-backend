package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;

/**
 * @author Bruno Ramirez
 **/
public interface UserGetByIdService {
    User getById(Long id);
}
