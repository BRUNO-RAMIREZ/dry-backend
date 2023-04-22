package com.dry.backend.usecases.users;

import com.dry.backend.dto.users.request.UserUpdateRequest;
import com.dry.backend.dto.users.response.UserUpdateResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserUpdateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserUpdateUseCase {
    private UserUpdateService userUpdateService;
    private UsersMapper usersMapper;


    public UserUpdateUseCase(UserUpdateService userUpdateService,
                             UsersMapper usersMapper) {
        this.userUpdateService = userUpdateService;
        this.usersMapper = usersMapper;
    }

    public UserUpdateResponse execute(Long id, UserUpdateRequest request) {
        return usersMapper.fromUserToUserUpdateResponse(
                userUpdateService.update(id, usersMapper.fromUserUpdateRequestToUser(request)));
    }
}
