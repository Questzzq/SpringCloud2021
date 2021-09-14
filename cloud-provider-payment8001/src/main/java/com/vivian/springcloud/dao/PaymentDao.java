package com.vivian.springcloud.dao;

import com.vivian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int create(@Param("payment") Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
