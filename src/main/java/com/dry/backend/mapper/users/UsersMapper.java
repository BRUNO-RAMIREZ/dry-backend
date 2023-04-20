package com.dry.backend.mapper.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.dto.users.request.UserAuthRequest;
import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.response.UserAuthResponse;
import com.dry.backend.dto.users.response.UserCreateResponse;
import com.dry.backend.dto.users.response.UserGetByEmailResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UsersMapper {
    public User fromUserCreateRequestToUser(UserCreateRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        return user;
    }

    public UserCreateResponse fromUserToUserCreateResponse(User user) {
        UserCreateResponse response = new UserCreateResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }

    public UserAuthResponse fromUserToUserAuthResponse(User user) {
        UserAuthResponse response = new UserAuthResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }

    public UserGetByEmailResponse fromUserToUserGetByEmailResponse(User user) {
        UserGetByEmailResponse response = new UserGetByEmailResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }
}
