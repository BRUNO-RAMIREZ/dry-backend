package com.dry.backend.services.information;

import com.dry.backend.domain.information.Information;
import com.dry.backend.repository.information.InformationRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class InformationGetByIdServiceImpl implements InformationGetByIdService {

    private InformationRepository informationRepository;

    public InformationGetByIdServiceImpl(InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }

    @Override
    public Information findById(Long id) {
        Information informationFound = informationRepository.findById(id).orElseThrow(() -> new RuntimeException("Information with Id not FOUND"));
        return informationFound;
    }
}
