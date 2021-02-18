package com.bbw.apiva.controller;

import com.bbw.apiva.dto.RcmDTO;
import com.bbw.apiva.service.RCAndMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RCMController {

    @Qualifier("RCAndMessageService")
    @Autowired
    RCAndMessageService rcAndMessageService;

    @PostMapping("rcm/makeRequest")
    public ResponseEntity makeRequest(@RequestBody RcmDTO rcmDTO){

        if(rcmDTO != null){
            return new ResponseEntity(rcAndMessageService.makeRequest(rcmDTO), HttpStatus.OK);
        }
        return new ResponseEntity("Please insert data", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("rcm/getRequest/{rcID}")
    public ResponseEntity getRequestByCondition(@PathVariable Integer rcID){

        try {
            return new ResponseEntity(rcAndMessageService.getRequestByCondition(rcID), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("There's no condition by rcID", HttpStatus.NOT_FOUND);
        }
    }
}
