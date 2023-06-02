package com.dry.backend.mapper.information;

import com.dry.backend.domain.information.Information;
import com.dry.backend.dto.Information.request.InformationUpdateByIdRequest;
import com.dry.backend.dto.Information.response.InformationGetByIdResponse;
import com.dry.backend.dto.Information.response.InformationUpdateByIdResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class InformationMapper {

    public InformationGetByIdResponse fromInformationToInformationGetByIdResponse(Information information) {
        InformationGetByIdResponse response = new InformationGetByIdResponse();
        response.setId(information.getId());
        response.setTitle(information.getTitle());
        response.setDescription(information.getDescription());
        response.setPhone(information.getPhone());
        response.setDirection(information.getDirection());
        response.setEmail(information.getEmail());
        response.setLinks(information.getLinks());
        return response;
    }

    public void fromInformationUpdateByIdRequestToInformation(Information information, InformationUpdateByIdRequest request) {
        information.setId(request.getId());
        information.setTitle(request.getTitle());
        information.setDescription(request.getDescription());
        information.setPhone(request.getPhone());
        information.setDirection(request.getDirection());
        information.setEmail(request.getEmail());
        information.setLinks(request.getLinks());
    }

    public InformationUpdateByIdResponse fromToInformationToInformationUpdateByIdResponse(Information information) {
        InformationUpdateByIdResponse response = new InformationUpdateByIdResponse();
        response.setId(information.getId());
        response.setTitle(information.getTitle());
        response.setDescription(information.getDescription());
        response.setPhone(information.getPhone());
        response.setDirection(information.getDirection());
        response.setEmail(information.getEmail());
        response.setLinks(information.getLinks());
        return response;
    }
}


