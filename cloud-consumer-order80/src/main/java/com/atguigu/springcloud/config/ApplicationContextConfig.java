package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/20 23:06
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {
    //    RestTemplate注入spring容器
    @Bean
    @LoadBalanced  //赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
