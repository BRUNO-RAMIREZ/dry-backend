package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.repository.users.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserChangePasswordByIdServiceImpl implements UserChangePasswordByIdService{

    private UserRepository userRepository;

    public UserChangePasswordByIdServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void changePasswordById(Long id, String password) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setPassword(password);
        userRepository.save(user);
    }
}
