package com.dry.backend.usecases.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.dto.users.response.UserGetByEmailResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserGetByEmailService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserGetByEmailUseCase {
    private UserGetByEmailService userGetByEmailService;
    private UsersMapper usersMapper;

    public UserGetByEmailUseCase(UserGetByEmailService userGetByEmailService,
                                 UsersMapper usersMapper) {
        this.userGetByEmailService = userGetByEmailService;
        this.usersMapper = usersMapper;
    }

    public UserGetByEmailResponse execute(String email) throws RuntimeException {
        User userTemp = null;
        if (email != null && !"".equals(email)) {
            userTemp = userGetByEmailService.getByEmail(email);

            if (userTemp == null) {
                throw new RuntimeException("User with" + email + " not exist");
            }
        }
        return usersMapper.fromUserToUserGetByEmailResponse(userTemp);
    }
}
