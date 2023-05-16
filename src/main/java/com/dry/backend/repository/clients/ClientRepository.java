package com.dry.backend.repository.clients;

import com.dry.backend.domain.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bruno Ramirez
 **/
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findById(Long id);

    List<Client> findAllByCi(String ci);
}
