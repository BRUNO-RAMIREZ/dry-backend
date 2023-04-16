package com.dry.backend.services.users;

import com.dry.backend.domain.users.Rol;
import com.dry.backend.domain.users.User;
import com.dry.backend.repository.users.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserCreateServiceImpl implements UserCreateService{
    private UserRepository userRepository;

    public UserCreateServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        User userCreate = new User();
        userCreate.setName(user.getName());
        userCreate.setLastName(user.getLastName());
        userCreate.setEmail(user.getEmail());
        userCreate.setPhone(user.getPhone());
        userCreate.setUsername(user.getUsername());
        userCreate.setPassword(user.getPassword());
        userCreate.setRol(Arrays.asList(new Rol("ROLE_USER")));
        return userRepository.save(userCreate);
    }
}
