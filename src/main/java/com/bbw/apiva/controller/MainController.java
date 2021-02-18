package com.bbw.apiva.controller;

import com.bbw.apiva.dao.RCAndMessageDAO;
import com.bbw.apiva.dto.*;
import com.bbw.apiva.response.InquiryResponse;
import com.bbw.apiva.response.PaymentResponse;
import com.bbw.apiva.service.ClientService;
import com.bbw.apiva.service.PaymentService;
import com.bbw.apiva.service.RCAndMessageService;
import com.bbw.apiva.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    ClientService clientService;

    @Autowired
    PaymentService paymentService;

    @Qualifier("RCAndMessageService")
    @Autowired
    RCAndMessageService rcAndMessageService;

    @Autowired
    RequestService requestService;

    @Autowired
    RCAndMessageDAO rcAndMessageDAO;

    @GetMapping("api/inquiry/va")
    public ResponseEntity getInquiryVA(@RequestBody InquiryDTO inquiryDTO){

        InquiryResponse inquiryResponse = new InquiryResponse();

        DataInquiry dataInquiry = new DataInquiry();
        dataInquiry.setAccountName(clientService.getClientById(inquiryDTO.clientId).getAccountName());

        if(inquiryDTO.clientId == null){
            inquiryResponse.rc = rcAndMessageDAO.getRCClientIDNotFound();
            inquiryResponse.message = rcAndMessageDAO.getMessageClientIDNotFound();

            return new ResponseEntity(inquiryResponse, HttpStatus.NOT_FOUND);
        }if(inquiryDTO.virtualNumber == null){
            inquiryResponse.rc = rcAndMessageDAO.getRCVANotFound();
            inquiryResponse.message = rcAndMessageDAO.getMessageVANotFound();

            return new ResponseEntity(inquiryResponse, HttpStatus.NOT_FOUND);
        }if(inquiryDTO.referenceNumber == null){
            inquiryResponse.rc = rcAndMessageDAO.getRCGeneralError();
            inquiryResponse.message = rcAndMessageDAO.getMessageGeneralError();

            return new ResponseEntity(inquiryResponse, HttpStatus.NOT_FOUND);
        }

        try {
            inquiryResponse.rc = rcAndMessageDAO.getRCSuccess();
            inquiryResponse.message = rcAndMessageDAO.getMessageSuccess();
            inquiryResponse.data = dataInquiry;
        }catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity(inquiryResponse, HttpStatus.OK);
    }

    @GetMapping("api/payment/va")
    public ResponseEntity getPaymentVA(@RequestBody PaymentRequestDTO paymentRequestDTO){

        PaymentResponse paymentResponse = new PaymentResponse();

        DataPayment payment = new DataPayment();
        payment.setTransactionNumber(paymentService.getPaymentById(paymentRequestDTO.clientId).getTransactionNumber());

        if(paymentRequestDTO.clientId == null){
            paymentResponse.rc = rcAndMessageDAO.getRCClientIDNotFound();
            paymentResponse.message = rcAndMessageDAO.getMessageClientIDNotFound();

            return new ResponseEntity(paymentResponse, HttpStatus.NOT_FOUND);
        }if(paymentRequestDTO.virtualNumber == null){
            paymentResponse.rc = rcAndMessageDAO.getRCVANotFound();
            paymentResponse.message = rcAndMessageDAO.getMessageVANotFound();

            return new ResponseEntity(paymentResponse, HttpStatus.NOT_FOUND);
        }if(paymentRequestDTO.referenceNumber == null || paymentRequestDTO.amount == null || paymentRequestDTO.note == null){
            paymentResponse.rc = rcAndMessageDAO.getRCGeneralError();
            paymentResponse.message = rcAndMessageDAO.getMessageGeneralError();

            return new ResponseEntity(paymentResponse, HttpStatus.NOT_FOUND);
        }

        try {
            paymentResponse.rc = rcAndMessageDAO.getRCSuccess();
            paymentResponse.message = rcAndMessageDAO.getMessageSuccess();
            paymentResponse.data = payment;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity(paymentResponse, HttpStatus.OK);
    }

}
