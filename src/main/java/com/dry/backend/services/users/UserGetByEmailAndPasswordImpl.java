package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.repository.users.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserGetByEmailAndPasswordImpl implements UserGetByEmailAndPasswordService {
    private UserRepository userRepository;

    public UserGetByEmailAndPasswordImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}
