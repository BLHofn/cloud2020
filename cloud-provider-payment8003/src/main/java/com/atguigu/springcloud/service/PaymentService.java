package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/20 0:27
 * @Version 1.0
 */
//这个接口应该和数据操作包dao的一致
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
