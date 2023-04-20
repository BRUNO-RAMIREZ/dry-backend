package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.response.UserGetByEmailResponse;
import com.dry.backend.usecases.users.UserGetByEmailUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/

@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserGetByEmailController {

    private UserGetByEmailUseCase userGetByEmailUseCase;

    public UserGetByEmailController(UserGetByEmailUseCase userGetByEmailUseCase) {
        this.userGetByEmailUseCase = userGetByEmailUseCase;
    }

    @GetMapping("/getByEmail/{email}")
    public UserGetByEmailResponse getUserByEmail(@RequestParam String email) {
        return userGetByEmailUseCase.execute(email);
    }
}
