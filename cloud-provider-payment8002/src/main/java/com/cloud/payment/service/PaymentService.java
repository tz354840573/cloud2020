package com.cloud.payment.service;

import com.cloud.api.entities.Payment;

import java.util.List;

public interface PaymentService {

    int save(Payment payment);

    Payment getPaymentById(Long id);

    List<Payment> getPaymentList();
}
