package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/20 22:57
 * @Version 1.0
 */
@RestController
@Slf4j
//服务调用 订单微服务80调用支付微服务提供者8001
//RestTemplate 提供了多种便捷访问远程Http服务的方法
//是一种简单便捷访问resful服务模板类，是spring提供访问rest服务的客户端模板工具集
public class OrderController {
//    单机版：public static String PAYMENT_URL = "http://localhost:8001";
    public static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";//eureka里面的提供服务的大名称即可
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
