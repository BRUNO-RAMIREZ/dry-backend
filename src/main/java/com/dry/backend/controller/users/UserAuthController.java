package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.request.UserAuthRequest;
import com.dry.backend.dto.users.response.UserAuthResponse;
import com.dry.backend.usecases.users.UserAuthUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
public class UserAuthController {
    private UserAuthUseCase userAuthUseCase;

    public UserAuthController(UserAuthUseCase userAuthUseCase) {
        this.userAuthUseCase = userAuthUseCase;
    }

    @PostMapping("/auth")
    public UserAuthResponse login(@RequestBody UserAuthRequest request) throws RuntimeException{
       return userAuthUseCase.execute(request);
    }
}
