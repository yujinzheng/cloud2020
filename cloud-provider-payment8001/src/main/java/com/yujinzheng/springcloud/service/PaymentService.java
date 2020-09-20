package com.yujinzheng.springcloud.service;

import com.yujinzheng.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author YU
 * @since 2020/9/19 1:28
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
