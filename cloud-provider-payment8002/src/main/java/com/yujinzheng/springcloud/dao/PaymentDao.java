package com.yujinzheng.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yujinzheng.springcloud.entities.Payment;

/**
 * @author YU
 * @since 2020/9/19 1:17
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
