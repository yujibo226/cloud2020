package com.yujibo.springcloud.dao;

import com.yujibo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //推荐使用Mapper 因为Repository插入有时候会出问题
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
