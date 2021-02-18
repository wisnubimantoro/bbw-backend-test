package com.bbw.apiva.controller;

import com.bbw.apiva.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    RequestService requestService;

    @PostMapping("request/makeRequest")
    public ResponseEntity makeRequest(){

        try {
            return new ResponseEntity(requestService.makeRequest(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("request/getAllRequest")
    public ResponseEntity getAllRequests(){

        try {
            return new ResponseEntity(requestService.getAllRequests(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("There's no data", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("request/getRequest/{id}")
    public ResponseEntity getRequestById(@PathVariable Integer id){

        try{
            return new ResponseEntity(requestService.getRequestById(id), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("There's no request by " + id, HttpStatus.NOT_FOUND);
        }
    }
}
