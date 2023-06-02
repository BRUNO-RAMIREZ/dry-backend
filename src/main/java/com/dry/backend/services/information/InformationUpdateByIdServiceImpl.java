package com.dry.backend.services.information;

import com.dry.backend.domain.information.Information;
import com.dry.backend.mapper.information.InformationMapper;
import com.dry.backend.repository.information.InformationRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class InformationUpdateByIdServiceImpl implements InformationUpdateByIdService {
    private InformationRepository informationRepository;

    public InformationUpdateByIdServiceImpl(InformationRepository informationRepository, InformationMapper informationMapper) {
        this.informationRepository = informationRepository;
    }

    @Override
    public void update(Information request) {
        informationRepository.save(request);
    }
}
