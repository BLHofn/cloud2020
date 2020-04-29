package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/22 2:18
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer  //表示开启Eureka server
public class EurekaMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class,args);
    }
}