package com.dry.backend.usecases.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.dto.users.request.UserAuthRequest;
import com.dry.backend.dto.users.response.UserAuthResponse;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.services.users.UserGetByEmailAndPasswordService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserAuthUseCase {
    private UserGetByEmailAndPasswordService userGetByEmailAndPasswordService;
    private UsersMapper usersMapper;

    public UserAuthUseCase(UserGetByEmailAndPasswordService userGetByEmailAndPasswordService,
                           UsersMapper usersMapper) {
        this.userGetByEmailAndPasswordService = userGetByEmailAndPasswordService;
        this.usersMapper = usersMapper;
    }

    public UserAuthResponse execute(UserAuthRequest request) throws RuntimeException {
        String emailTemp = request.getEmail();
        String passwordTemp = request.getPassword();
        User user = null;
        if (emailTemp != null && passwordTemp != null) {
            user = userGetByEmailAndPasswordService.getUserByEmailAndPassword(emailTemp, passwordTemp);
        }
        if (user == null) {
            throw new RuntimeException("Bad credentials");
        }
        return usersMapper.fromUserToUserAuthResponse(user);
    }
}
