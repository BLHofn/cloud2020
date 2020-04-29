package com.atguigu.sqpringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/25 17:41
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients//开启feign
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
