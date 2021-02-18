package com.bbw.apiva.service;

import com.bbw.apiva.domain.Payment;
import com.bbw.apiva.dto.PaymentsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {
    Payment savePayments(PaymentsDTO paymentsDTO);

    List<Payment> getAllPayments();

    Payment getPaymentById(Integer id);
}
