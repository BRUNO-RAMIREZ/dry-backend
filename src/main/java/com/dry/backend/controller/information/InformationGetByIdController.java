package com.dry.backend.controller.information;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.Information.response.InformationGetByIdResponse;
import com.dry.backend.usecases.information.InformationGetByIdUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.INFORMATION)
public class InformationGetByIdController {

    private final InformationGetByIdUseCase informationGetByIdUseCase;

    public InformationGetByIdController(InformationGetByIdUseCase informationGetByIdUseCase) {
        this.informationGetByIdUseCase = informationGetByIdUseCase;
    }

    @GetMapping("/getById/{id}")
    public InformationGetByIdResponse getAll(@PathVariable("id") Long id) {
        return informationGetByIdUseCase.execute(id);
    }
}
