package com.dry.backend.usecases.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.response.UserCreateResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserCreateService;
import com.dry.backend.services.users.UserGetByEmailService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserCreateUseCase {
    private UserCreateService userCreateService;
    private UserGetByEmailService userGetByEmailService;
    private UsersMapper usersMapper;

    public UserCreateUseCase(UserCreateService userCreateService,
                             UserGetByEmailService userGetByEmailService,
                             UsersMapper usersMapper) {
        this.userCreateService = userCreateService;
        this.userGetByEmailService = userGetByEmailService;
        this.usersMapper = usersMapper;
    }

    public UserCreateResponse execute(UserCreateRequest request) throws RuntimeException {
        String emailTemp = request.getEmail();
        if (emailTemp != null && !"".equals(emailTemp)) {
            User userTemp = userGetByEmailService.getByEmail(emailTemp);
            if (userTemp != null) {
                throw new RuntimeException("User with"+ emailTemp +" is already exists");
            }
        }
        return usersMapper.fromUserToUserCreateResponse(
                userCreateService.save(
                        usersMapper.fromUserCreateRequestToUser(request)
                )
        );
    }
}
