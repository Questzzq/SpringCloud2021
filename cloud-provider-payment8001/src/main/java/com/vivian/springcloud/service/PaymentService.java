package com.vivian.springcloud.service;

import com.vivian.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
