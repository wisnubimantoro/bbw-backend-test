package com.bbw.apiva.controller;

import com.bbw.apiva.dto.PaymentsDTO;
import com.bbw.apiva.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("payments/savePayments")
    public ResponseEntity savePayments(@RequestBody PaymentsDTO paymentsDTO){

        if (paymentsDTO != null) {
            return new ResponseEntity(paymentService.savePayments(paymentsDTO), HttpStatus.OK);
        }
        return new ResponseEntity("Please insert the data", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("payments/getAllPayments")
    public ResponseEntity getAllPayments(){

        try{
            return new ResponseEntity(paymentService.getAllPayments(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("There's no data", HttpStatus.NOT_FOUND);
        }
    }
}
