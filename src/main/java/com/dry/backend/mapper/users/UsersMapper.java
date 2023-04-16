package com.dry.backend.mapper.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.response.UserCreateResponse;
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
        user.setRol(request.getRol());
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
        response.setRol(user.getRol());
        return response;
    }
}
