package com.dry.backend.controller.users;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.users.request.UserUpdateRequest;
import com.dry.backend.dto.users.response.UserUpdateResponse;
import com.dry.backend.usecases.users.UserUpdateUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.USERS)
public class UserUpdateController {
    private final UserUpdateUseCase userUpdateUseCase;

    public UserUpdateController(UserUpdateUseCase userUpdateUseCase) {
        this.userUpdateUseCase = userUpdateUseCase;
    }

    @PutMapping("/{id}")
    public UserUpdateResponse updateProduct(@PathVariable Long id,
                                            @RequestBody UserUpdateRequest userUpdateRequest) {
        return userUpdateUseCase.execute(id, userUpdateRequest);
    }
}
