package com.vivian.springcloud.service.impl;

import com.vivian.springcloud.dao.PaymentDao;
import com.vivian.springcloud.entities.Payment;
import com.vivian.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
