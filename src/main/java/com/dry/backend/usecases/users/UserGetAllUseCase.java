package com.dry.backend.usecases.users;

import com.dry.backend.dto.users.response.UserGetAllResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserGetAllService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserGetAllUseCase {
    private UserGetAllService userGetAllService;
    private UsersMapper usersMapper;

    public UserGetAllUseCase(UserGetAllService userGetAllService, UsersMapper usersMapper) {
        this.userGetAllService = userGetAllService;
        this.usersMapper = usersMapper;
    }

    public UserGetAllResponse execute() {
        return usersMapper.fromUserListToUserGetAllResponse(userGetAllService.getAll());
    }
}
