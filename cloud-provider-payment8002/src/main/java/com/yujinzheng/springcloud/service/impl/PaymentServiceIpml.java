package com.yujinzheng.springcloud.service.impl;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.yujinzheng.springcloud.dao.PaymentDao;
import com.yujinzheng.springcloud.entities.Payment;
import com.yujinzheng.springcloud.service.PaymentService;

/**
 * @author YU
 * @since 2020/9/19 1:30
 */
@Service
public class PaymentServiceIpml implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}
