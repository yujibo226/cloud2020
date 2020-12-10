package com.yujibo.springcloud.service.impl;

import com.yujibo.springcloud.dao.PaymentDao;
import com.yujibo.springcloud.entities.Payment;
import com.yujibo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource //java自带的 @Autowired是spring的
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
