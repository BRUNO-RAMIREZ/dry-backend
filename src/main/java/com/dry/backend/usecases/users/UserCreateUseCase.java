package com.dry.backend.usecases.users;

import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.response.UserCreateResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserCreateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserCreateUseCase {
    private UserCreateService userCreateService;
    private UsersMapper usersMapper;

    public UserCreateUseCase(UserCreateService userCreateService, UsersMapper usersMapper) {
        this.userCreateService = userCreateService;
        this.usersMapper = usersMapper;
    }

    public UserCreateResponse execute(UserCreateRequest request) {
        return usersMapper.fromUserToUserCreateResponse(
                userCreateService.save(
                        usersMapper.fromUserCreateRequestToUser(request)
                )
        );
    }

}
