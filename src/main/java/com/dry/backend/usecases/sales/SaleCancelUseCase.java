package com.dry.backend.usecases.sales;

import com.dry.backend.services.sales.SaleCancelService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleCancelUseCase {
    private final SaleCancelService saleCancelService;

    public SaleCancelUseCase(SaleCancelService saleCancelService) {
        this.saleCancelService = saleCancelService;
    }

    public void execute(Long id) {
        saleCancelService.cancelSale(id);
    }

}
