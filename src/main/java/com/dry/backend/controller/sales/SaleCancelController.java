package com.dry.backend.controller.sales;

import com.dry.backend.constant.Constants;
import com.dry.backend.usecases.sales.SaleCancelUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.SALES)
public class SaleCancelController {

    private final SaleCancelUseCase saleCancelUseCase;

    public SaleCancelController(SaleCancelUseCase saleCancelUseCase) {
        this.saleCancelUseCase = saleCancelUseCase;
    }

    @PutMapping("/cancelSale/{id}")
    public void cancelSale(@PathVariable("id") Long id) {
        saleCancelUseCase.execute(id);
    }
}
