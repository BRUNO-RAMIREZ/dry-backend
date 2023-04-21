package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.response.UserGetByEmailResponse;
import com.dry.backend.usecases.users.UserChangePasswordByIdUseCase;
import com.dry.backend.usecases.users.UserGetByEmailUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserChangePasswordByIdController {
    private UserChangePasswordByIdUseCase userChangePasswordByIdUseCase;

    public UserChangePasswordByIdController(UserChangePasswordByIdUseCase userChangePasswordByIdUseCase) {
        this.userChangePasswordByIdUseCase = userChangePasswordByIdUseCase;
    }

    @PutMapping("/{id}/changePassword/{password}")
    public void setNewPasswordToUser(@PathVariable Long id,
                                     @PathVariable String password) {
        return userChangePasswordByIdUseCase.execute(id, password);
    }
}
