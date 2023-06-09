package com.dry.backend.services.users;

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
        return userRepository.save(user);
    }
}
