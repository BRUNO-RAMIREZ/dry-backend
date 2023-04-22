package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.usecases.users.UserDeleteUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserDeleteController {
    private final UserDeleteUseCase userDeleteUseCase;

    public UserDeleteController(UserDeleteUseCase userDeleteUseCase) {
        this.userDeleteUseCase = userDeleteUseCase;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDeleteUseCase.execute(id);
    }
}
