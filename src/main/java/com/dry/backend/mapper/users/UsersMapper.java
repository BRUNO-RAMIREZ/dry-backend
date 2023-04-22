package com.dry.backend.mapper.users;

import com.dry.backend.domain.products.Product;
import com.dry.backend.domain.users.User;
import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductResponse;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.dto.users.request.UserCreateRequest;
import com.dry.backend.dto.users.request.UserUpdateRequest;
import com.dry.backend.dto.users.response.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public User fromOldUserToUserUpdate(User oldUser, User newUser) {
        oldUser.setName(newUser.getName());
        oldUser.setLastName(newUser.getLastName());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setPhone(newUser.getPhone());
        oldUser.setUsername(newUser.getUsername());
        oldUser.setPassword(newUser.getPassword());
        return oldUser;
    }

    public User fromUserUpdateRequestToUser(UserUpdateRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        return user;
    }

    public UserUpdateResponse fromUserToUserUpdateResponse(User user) {
        UserUpdateResponse response = new UserUpdateResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }

    public ProductResponse fromUserToUserResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setImage(product.getImage());
        response.setPurchasePrice(product.getPurchasePrice());
        response.setSalePrice(product.getSalePrice());
        response.setStock(product.getStock());
        return response;
    }

    public UserGetByIdResponse fromUserToUserGetByIdResponse(User user) {
        UserGetByIdResponse response = new UserGetByIdResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }

    public UserResponse fromUserToUserResponse(User user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setUsername(user.getUsername());
        response.setPassword(user.getPassword());
        return response;
    }

    public UserGetAllResponse fromUserListToUserGetAllResponse(List<User> users) {
        UserGetAllResponse response = new UserGetAllResponse();
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user : users) {
            userResponses.add(fromUserToUserResponse(user));
        }
        response.setUsers(userResponses);
        return response;
    }

}
