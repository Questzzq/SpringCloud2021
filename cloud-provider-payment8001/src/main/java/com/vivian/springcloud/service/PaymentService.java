package com.vivian.springcloud.service;

import com.vivian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
