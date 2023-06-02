package com.dry.backend.services.information;

import com.dry.backend.domain.information.Information;

/**
 * @author Bruno Ramirez
 **/
public interface InformationGetByIdService {

    Information findById(Long id);
}
