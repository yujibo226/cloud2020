package com.yujibo.springcloud.service;

import com.yujibo.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
