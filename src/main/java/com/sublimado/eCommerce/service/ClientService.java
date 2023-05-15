package com.sublimado.eCommerce.service;

import com.sublimado.eCommerce.model.Client;
import com.sublimado.eCommerce.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService{

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client getClient(Long idClient) throws Exception {
        return clientRepository.findById(idClient)
                .orElseThrow(() -> new Exception("El id no ha sido encontrado"));
    }

    @Override
    public List<Client> clients() {
        return clientRepository.findAll();
    }

    @Override
    public void updateClient(Client client, Long idClient) throws Exception {
        Client clientBD = this.getClient(idClient);
        clientBD = client;
        clientBD.setIdClient(idClient);
        clientRepository.save(clientBD);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }
}
