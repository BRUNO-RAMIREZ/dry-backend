package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.response.UserGetByIdResponse;
import com.dry.backend.usecases.users.UserGetByIdUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserGetByIdController {
    private final UserGetByIdUseCase userGetByIdUseCase;

    public UserGetByIdController(UserGetByIdUseCase userGetByIdUseCase) {
        this.userGetByIdUseCase = userGetByIdUseCase;
    }

    @GetMapping("/{id}")
    public UserGetByIdResponse getUserById(@PathVariable Long id) {
        return userGetByIdUseCase.execute(id);
    }
}
