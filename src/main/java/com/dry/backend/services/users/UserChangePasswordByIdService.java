package com.dry.backend.services.users;

/**
 * @author Bruno Ramirez
 **/
public interface UserChangePasswordByIdService {
    void changePasswordById(Long id, String password);
}
