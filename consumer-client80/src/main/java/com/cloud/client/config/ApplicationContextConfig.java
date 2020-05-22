package com.cloud.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //必写，用RestTemplate发送get和post请求--本机测试负载均衡，不写前台界面
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
