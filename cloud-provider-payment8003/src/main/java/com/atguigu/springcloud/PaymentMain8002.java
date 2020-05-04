package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/19 23:41
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient  //开启eurekaclient
@EnableDiscoveryClient//开启服务发现
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}