package com.dry.backend.usecases.users;

import com.dry.backend.dto.users.response.UserGetByIdResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserGetByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserGetByIdUseCase {
    private UserGetByIdService userGetByIdService;
    private UsersMapper userMapper;

    public UserGetByIdUseCase(UserGetByIdService userGetByIdService,
                              UsersMapper userMapper) {
        this.userGetByIdService = userGetByIdService;
        this.userMapper = userMapper;
    }

    public UserGetByIdResponse execute(Long id) {
        return userMapper.fromUserToUserGetByIdResponse(userGetByIdService.getById(id));
    }
}
