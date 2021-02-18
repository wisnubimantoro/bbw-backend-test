package com.bbw.apiva.service;

import com.bbw.apiva.domain.Client;
import com.bbw.apiva.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(ClientDTO clientDTO);

    List<Client> getAllClient();

    Client getClientById(Integer id);
}
