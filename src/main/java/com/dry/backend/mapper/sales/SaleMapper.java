package com.dry.backend.mapper.sales;

import com.dry.backend.domain.client.Client;
import com.dry.backend.domain.products.Product;
import com.dry.backend.domain.sale.Sale;
import com.dry.backend.dto.clients.response.ClientCreateResponse;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.dto.products.response.ProductResponse;
import com.dry.backend.dto.sales.request.SaleCreateRequest;
import com.dry.backend.dto.sales.response.SaleCreateResponse;
import com.dry.backend.dto.sales.response.SaleListGetAllResponse;
import com.dry.backend.dto.sales.response.SaleResponse;
import com.dry.backend.mapper.client.ClientMapper;
import com.dry.backend.mapper.products.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleMapper {

    private ClientMapper clientMapper;
    private ProductMapper productMapper;

    public SaleMapper(ClientMapper clientMapper, ProductMapper productMapper) {
        this.clientMapper = clientMapper;
        this.productMapper = productMapper;
    }

    public Sale fromSaleCreateRequestToSale(SaleCreateRequest saleCreateRequest) {
        Sale sale = new Sale();
        sale.setCode(saleCreateRequest.getCode());
        sale.setSaleDate(saleCreateRequest.getSaleDate());
        sale.setTotal(saleCreateRequest.getTotal());
        sale.setState(saleCreateRequest.getState());
        Client client = clientMapper.fromClientCreateRequestToClient(saleCreateRequest.getClient());
        sale.setClient(client);
        List<Product> productsCreateRequestList = productMapper.fromProductCreateRequestListToProductList(saleCreateRequest.getProducts());
        sale.setProducts(productsCreateRequestList);
        return sale;
    }

    public SaleCreateResponse fromSaleToSaleCreateResponse(Sale sale) {
        SaleCreateResponse saleCreateResponse = new SaleCreateResponse();
        saleCreateResponse.setId(sale.getId());
        saleCreateResponse.setCode(sale.getCode());
        saleCreateResponse.setSaleDate(sale.getSaleDate());
        saleCreateResponse.setTotal(sale.getTotal());
        saleCreateResponse.setState(sale.getState());
        ClientCreateResponse clientCreateResponse = clientMapper.fromClientToClientCreateResponse(sale.getClient());
        saleCreateResponse.setClient(clientCreateResponse);
        List<ProductCreateResponse> productsCreateResponseList = productMapper.fromProductListToProductCreateResponseList(sale.getProducts());
        saleCreateResponse.setProducts(productsCreateResponseList);
        return saleCreateResponse;
    }

    public SaleListGetAllResponse fromSaleListToSaleListGetAllResponse(List<Sale> sales) {
        SaleListGetAllResponse response = new SaleListGetAllResponse();
        List<SaleResponse> saleResponses = new ArrayList<>();
        for (Sale sale : sales) {
            saleResponses.add(fromSaleToSaleResponse(sale));
        }
        response.setSales(saleResponses);
        return response;
    }

    public SaleResponse fromSaleToSaleResponse(Sale sale) {
        SaleResponse saleResponse = new SaleResponse();
        saleResponse.setId(sale.getId());
        saleResponse.setCode(sale.getCode());
        saleResponse.setSaleDate(sale.getSaleDate());
        saleResponse.setTotal(sale.getTotal());
        saleResponse.setState(sale.getState());
        ClientCreateResponse clientCreateResponse = clientMapper.fromClientToClientCreateResponse(sale.getClient());
        saleResponse.setClient(clientCreateResponse);
        List<ProductResponse> productsCreateResponseList = productMapper.fromProductListToProductResponseList(sale.getProducts());
        saleResponse.setProductsResponse(productsCreateResponseList);
        return saleResponse;
    }
}