package com.yujibo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //支付服务是集群时，需要提供负载均衡策略
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
