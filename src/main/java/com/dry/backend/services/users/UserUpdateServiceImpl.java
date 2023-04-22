package com.dry.backend.services.users;

import com.dry.backend.domain.users.User;
import com.dry.backend.mapper.users.UsersMapper;
import com.dry.backend.repository.users.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class UserUpdateServiceImpl implements UserUpdateService {
    private UserRepository userRepository;
    private UsersMapper usersMapper;

    public UserUpdateServiceImpl(UserRepository userRepository, UsersMapper usersMapper) {
        this.userRepository = userRepository;
        this.usersMapper = usersMapper;
    }
    @Override
    public User update(Long id, User request) {
        User userFound = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        return userRepository.save(
                usersMapper.fromOldUserToUserUpdate(userFound, request)
        );
    }
}
