package com.cloud.payment.service.impl;

import com.cloud.api.entities.Payment;
import com.cloud.payment.mapper.PaymentMapper;
import com.cloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    public int save(Payment payment) {
        return paymentMapper.save(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id).orElse(null);
    }

    @Override
    public List<Payment> getPaymentList() {
        return paymentMapper.getPaymentList();
    }
}
