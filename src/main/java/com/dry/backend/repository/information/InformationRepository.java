package com.dry.backend.repository.information;

import com.dry.backend.domain.information.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bruno Ramirez
 **/
@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {

}
