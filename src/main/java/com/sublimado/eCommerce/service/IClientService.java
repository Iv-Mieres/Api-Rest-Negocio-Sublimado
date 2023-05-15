package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Client;

import java.util.List;

public interface IClientService {

    void saveClient(Client client);
    Client getClient(Long idClient) throws Exception;
    List<Client> clients();
    void updateClient(Client client, Long idClient) throws Exception;
    void deleteClient(Long idClient);
}
