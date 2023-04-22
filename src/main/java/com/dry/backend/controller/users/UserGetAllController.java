package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.response.UserGetAllResponse;
import com.dry.backend.usecases.users.UserGetAllUseCase;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserGetAllController {
    private final UserGetAllUseCase userGetAllUseCase;

    public UserGetAllController(UserGetAllUseCase userGetAllUseCase) {
        this.userGetAllUseCase = userGetAllUseCase;
    }

    @GetMapping("/getAll")
    public UserGetAllResponse getAll() {
        return userGetAllUseCase.execute();
    }
}
