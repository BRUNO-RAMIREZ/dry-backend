package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.response.UserCreateResponse;
import com.dry.backend.usecases.users.UserCreateUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserCreateController {
    private final UserCreateUseCase userCreateUseCase;

    public UserCreateController(UserCreateUseCase userCreateUseCase) {
        this.userCreateUseCase = userCreateUseCase;
    }

    @PostMapping("/create")
    public UserCreateResponse createUser(@RequestBody UserCreateRequest request) {
        return userCreateUseCase.execute(request);
    }
}
