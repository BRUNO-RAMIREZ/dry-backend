package com.dry.backend.usecases.users;

import com.dry.backend.services.users.UserDeleteService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserDeleteUseCase {
    private UserDeleteService userDeleteService;

    public UserDeleteUseCase(UserDeleteService userDeleteService) {
        this.userDeleteService = userDeleteService;
    }

    public void execute(Long id) {
        userDeleteService.deleteById(id);
    }
}
