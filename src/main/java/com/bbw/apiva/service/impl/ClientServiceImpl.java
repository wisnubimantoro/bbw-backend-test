package com.bbw.apiva.service.impl;

import com.bbw.apiva.dao.ClientDAO;
import com.bbw.apiva.domain.Client;
import com.bbw.apiva.dto.ClientDTO;
import com.bbw.apiva.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    public Client saveClient(ClientDTO clientDTO){

        Client client = new Client();

        client.setVirtualAccount(clientDTO.getVirtualAccount());
        client.setAccountName(clientDTO.getAccountName());

        clientDAO.save(client);

        return client;
    }

    @Override
    public List<Client> getAllClient(){

        List<Client> clients = clientDAO.findAll();

        return clients;
    }

    @Override
    public Client getClientById(Integer id){

        Client client = clientDAO.getOne(id);

        return client;
    }
}
