package com.bbw.apiva.controller;

import com.bbw.apiva.domain.Client;
import com.bbw.apiva.dto.ClientDTO;
import com.bbw.apiva.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("client/addClient")
    public ResponseEntity addClient(@RequestBody ClientDTO clientDTO){

        if(clientDTO != null){
            return new ResponseEntity(clientService.saveClient(clientDTO), HttpStatus.OK);
        }
        return new ResponseEntity("Please insert the data", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("client/getAllClient")
    public ResponseEntity getAllClient(){

        try {
            return new ResponseEntity(clientService.getAllClient(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("There's no data", HttpStatus.NOT_FOUND);
        }
    }

}
