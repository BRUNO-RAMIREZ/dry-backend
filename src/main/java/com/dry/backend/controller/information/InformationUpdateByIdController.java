package com.dry.backend.controller.information;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.Information.request.InformationUpdateByIdRequest;
import com.dry.backend.dto.Information.response.InformationUpdateByIdResponse;
import com.dry.backend.usecases.information.InformationUpdateByIdUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.INFORMATION)
public class InformationUpdateByIdController {

    private final InformationUpdateByIdUseCase informationUpdateByIdUseCase;

    public InformationUpdateByIdController(InformationUpdateByIdUseCase informationUpdateByIdUseCase) {
        this.informationUpdateByIdUseCase = informationUpdateByIdUseCase;
    }

    @PutMapping("/updateById/{id}")
    public InformationUpdateByIdResponse getAll(@PathVariable("id") Long id, @RequestBody InformationUpdateByIdRequest request) {
        return informationUpdateByIdUseCase.execute(id, request);
    }
}
