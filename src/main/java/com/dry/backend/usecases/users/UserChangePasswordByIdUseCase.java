package com.dry.backend.usecases.users;

import com.dry.backend.services.users.UserChangePasswordByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserChangePasswordByIdUseCase {
    private UserChangePasswordByIdService userChangePasswordByIdService;

    public UserChangePasswordByIdUseCase(UserChangePasswordByIdService userChangePasswordByIdService) {
        this.userChangePasswordByIdService = userChangePasswordByIdService;
    }

    public void execute(Long id, String password) {
        userChangePasswordByIdService.changePasswordById(id, password);
    }
}
