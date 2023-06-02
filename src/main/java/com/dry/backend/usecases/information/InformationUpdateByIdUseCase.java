package com.dry.backend.usecases.information;

import com.dry.backend.domain.information.Information;
import com.dry.backend.dto.Information.request.InformationUpdateByIdRequest;
import com.dry.backend.dto.Information.response.InformationUpdateByIdResponse;
import com.dry.backend.mapper.information.InformationMapper;
import com.dry.backend.repository.information.InformationRepository;
import com.dry.backend.services.information.InformationUpdateByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class InformationUpdateByIdUseCase {

    private InformationUpdateByIdService informationUpdateByIdService;
    private InformationMapper informationMapper;
    private InformationRepository informationRepository;

    public InformationUpdateByIdUseCase(InformationUpdateByIdService informationUpdateByIdService, InformationMapper informationMapper, InformationRepository repository) {
        this.informationUpdateByIdService = informationUpdateByIdService;
        this.informationMapper = informationMapper;
        this.informationRepository = repository;
    }

    public InformationUpdateByIdResponse execute(Long id, InformationUpdateByIdRequest request) {
        Information informationFound = informationRepository.findById(id).orElseThrow(() -> new RuntimeException("Information with Id not FOUND"));
        informationMapper.fromInformationUpdateByIdRequestToInformation(informationFound, request);
        informationUpdateByIdService.update(informationFound);
        return informationMapper.fromToInformationToInformationUpdateByIdResponse(informationFound);
    }
}
