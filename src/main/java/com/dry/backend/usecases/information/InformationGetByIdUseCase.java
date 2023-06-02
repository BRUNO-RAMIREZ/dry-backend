package com.dry.backend.usecases.information;

import com.dry.backend.dto.Information.response.InformationGetByIdResponse;
import com.dry.backend.mapper.information.InformationMapper;
import com.dry.backend.services.information.InformationGetByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class InformationGetByIdUseCase {

    private InformationGetByIdService informationGetByIdService;
    private InformationMapper informationMapper;

    public InformationGetByIdUseCase(InformationGetByIdService informationGetByIdService, InformationMapper informationMapper) {
        this.informationGetByIdService = informationGetByIdService;
        this.informationMapper = informationMapper;
    }

    public InformationGetByIdResponse execute(Long id) {
        return informationMapper.fromInformationToInformationGetByIdResponse(informationGetByIdService.findById(id));
    }
}
