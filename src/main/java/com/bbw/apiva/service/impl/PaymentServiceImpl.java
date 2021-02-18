package com.bbw.apiva.service.impl;

import com.bbw.apiva.dao.PaymentDAO;
import com.bbw.apiva.domain.Payment;
import com.bbw.apiva.dto.PaymentsDTO;
import com.bbw.apiva.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDAO paymentDAO;

    @Override
    public Payment savePayments(PaymentsDTO paymentsDTO){

        Payment payment = new Payment();

        payment.setAmount(paymentsDTO.getAmount());
        payment.setNote(paymentsDTO.getNote());

        paymentDAO.save(payment);

        return payment;
    }

    @Override
    public List<Payment> getAllPayments(){

        List<Payment> payments = paymentDAO.findAll();

        return payments;
    }

    @Override
    public Payment getPaymentById(Integer id){

        Payment payment = paymentDAO.getOne(id);

        return payment;
    }
}
