package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.repository.users.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserGetByEmailServiceImpl implements UserGetByEmailService {
    private UserRepository userRepository;

    public UserGetByEmailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
