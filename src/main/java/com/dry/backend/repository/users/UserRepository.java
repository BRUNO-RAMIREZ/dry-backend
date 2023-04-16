package com.dry.backend.repository.users;

import com.dry.backend.domain.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bruno Ramirez
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
