package com.dry.backend.mapper.client;

import com.dry.backend.domain.client.Client;
import com.dry.backend.dto.clients.request.ClientCreateRequest;
import com.dry.backend.dto.clients.response.ClientCreateResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ClientMapper {

    public Client fromClientCreateRequestToClient(ClientCreateRequest clientCreateRequest) {
        Client client = new Client();
        client.setCi(clientCreateRequest.getCi());
        client.setLastName(clientCreateRequest.getLastName());
        return client;
    }

    public ClientCreateResponse fromClientToClientCreateResponse(Client client) {
        ClientCreateResponse clientCreateResponse = new ClientCreateResponse();
        clientCreateResponse.setId(client.getId());
        clientCreateResponse.setCi(client.getCi());
        clientCreateResponse.setLastName(client.getLastName());
        return clientCreateResponse;
    }
}
